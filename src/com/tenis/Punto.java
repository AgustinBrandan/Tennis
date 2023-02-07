package com.tenis;

import java.util.Random;

public class Punto {
    public Punto() {
    }

    public boolean jugarJuego(Jugador j1, Jugador j2) {
        Random rnd = new Random();
        int marcadorJug1 = 0;
        int marcadorJug2 = 0;
        String puntosJug1 = "0";
        String puntosJug2 = "0";
        boolean ganador = true;
        boolean finJuego = false;

        while (finJuego != true) {

            int randomGolpe = rnd.nextInt(100);
            String marcadorPuntos = "";

            if (randomGolpe < j1.getSkillPoints()) {
                marcadorJug1 = marcadorJug1 + 1;

                if ((marcadorJug1 > 3) && (Math.abs(marcadorJug1 - marcadorJug2) > 1)) {
                    System.out.println();
                    System.out.println(j1 + " gana el juego");
                    System.out.println();
                    marcadorJug1 = 0;
                    marcadorJug2 = 0;
                    ganador = true;
                    finJuego = true;
                }
            }

            if (randomGolpe >= j1.getSkillPoints() && randomGolpe < j1.getSkillPoints() + j2.getSkillPoints()) {
                marcadorJug2 = marcadorJug2 + 1;

                if ((marcadorJug2 > 3) && (Math.abs(marcadorJug2 - marcadorJug1) > 1)) {
                    System.out.println();
                    System.out.println(j2 + " gana el juego");
                    System.out.println();
                    marcadorJug1 = 0;
                    marcadorJug2 = 0;
                    ganador = false;
                    finJuego = true;
                }
            }

            if (marcadorJug1 == 1) {
                puntosJug1 = "15";
                marcadorPuntos = puntosJug1 + " - " + puntosJug2;
            }
            if (marcadorJug1 == 2) {
                puntosJug1 = "30";
                marcadorPuntos = puntosJug1 + " - " + puntosJug2;
            }
            if (marcadorJug1 == 3) {
                puntosJug1 = "40";
                marcadorPuntos = puntosJug1 + " - " + puntosJug2;
            }
            if (marcadorJug2 == 1) {
                puntosJug2 = "15";
                marcadorPuntos = puntosJug1 + " - " + puntosJug2;
            }
            if (marcadorJug2 == 2) {
                puntosJug2 = "30";
                marcadorPuntos = puntosJug1 + " - " + puntosJug2;
            }
            if (marcadorJug2 == 3) {
                puntosJug2 = "40";
                marcadorPuntos = puntosJug1 + " - " + puntosJug2;
            }
            if (marcadorJug1 > 3 && marcadorJug2 > 3 && marcadorJug1 == marcadorJug2) {
                marcadorPuntos = "deuce";
            }
            if (marcadorJug1 > 3 && marcadorJug1 > marcadorJug2) {
                puntosJug1 = "";
                puntosJug2 = "";
                marcadorPuntos = "ventaja " + j1.getNombre();
            }
            if (marcadorJug2 > 3 && marcadorJug2 > marcadorJug1) {
                puntosJug1 = "";
                puntosJug2 = "";
                marcadorPuntos = "ventaja " + j2.getNombre();
            }
            // Retorno el marcador
            System.out.println(marcadorPuntos);
        }
        return ganador;
    }
}
