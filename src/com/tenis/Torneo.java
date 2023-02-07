package com.tenis;

public class Torneo {
    String nombre;
    Punto puntos;
    public Torneo(String nombre) {
        this.nombre = nombre;
        this.puntos= new Punto();
    }

    public String getNombre() {
        return nombre;
    }

    public void jugarPartido(float sets, Jugador j1, Jugador j2) {


        int juegosJug1 = 0;
        int juegosJug2 = 0;
        int setJug1 = 0;
        int setJug2 = 0;

        double set = (sets/2) + 0.5;   // Los set que necesito para ganar el set , si es 3 seria 2 y si es 5 seria 3.
        boolean finPartido = false;

        while (!finPartido) {
            boolean resultadoJuego = puntos.jugarJuego(j1, j2);
            if (resultadoJuego) {
                juegosJug1 = juegosJug1 + 1;
            }else {
                juegosJug2 = juegosJug2 + 1;
            }

            if (juegosJug1 == 6 && juegosJug2 == 6) {
                System.out.println("Tie Break");
            }

            if (juegosJug1 >= 6 && (Math.abs(juegosJug1 - juegosJug2) > 1) || juegosJug1 == 7 && juegosJug2 == 6) {
                setJug1 = setJug1 + 1;
                System.out.println(j1.getNombre() + " gano el set ");
                System.out.println(j1.getNombre() + " " + juegosJug1);
                System.out.println(j2.getNombre() + " " + juegosJug2);
                System.out.println();

                juegosJug1 = 0;
                juegosJug2 = 0;
                if (setJug1 == set && setJug1 > setJug2) {
                    System.out.println(j1.getNombre() + " gano la copa " + nombre);
                    System.out.println(j1.getNombre() + " "+ setJug1 );
                    System.out.println(j2.getNombre() + " "+ setJug2 );
                    finPartido = true;
                }
            }
            if (juegosJug2 >= 6 && (Math.abs(juegosJug2 - juegosJug1) > 1) || juegosJug2 == 7 && juegosJug1 == 6) {
                setJug2 = setJug2 + 1;
                System.out.println(j2.getNombre() + " gano el set ");
                System.out.println(j1.getNombre() + " " + juegosJug1);
                System.out.println(j2.getNombre() + " " + juegosJug1);
                System.out.println();
                juegosJug1 = 0;
                juegosJug2 = 0;
                if (setJug2 == set && setJug2 > setJug1) {
                    System.out.println(j2.getNombre() + " gano la copa " + nombre);
                    System.out.println(j1.getNombre() + " "+ setJug1 );
                    System.out.println(j2.getNombre() + " "+ setJug2 );

                    finPartido = true;
                }
            }
        }
    }
}
