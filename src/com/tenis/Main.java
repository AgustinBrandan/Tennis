package com.tenis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Datos Torneo
        System.out.print("Ingrese el nombre del torneo: ");
        String nombreTorneo = scanner.nextLine();

        //    Datos jugador 1
        System.out.print("Ingrese el nombre del jugador 1: ");
        String nombreJugador1 = scanner.nextLine();
        System.out.print("Ingrese el nombre del jugador 2: ");
        String nombreJugador2 = scanner.nextLine();


        System.out.print("Ingrese la habilidad del jugador 1 (1-100): ");
        int habilidadJugador1 = scanner.nextInt();
        System.out.print("Ingrese la habilidad del jugador 2 (1-100): ");
        int habilidadJugador2 = scanner.nextInt();



        System.out.print("¿Cuántos sets jugarán? (3 o 5): ");
        int setsAJugar = scanner.nextInt();
        scanner.close();

        Jugador jugador1 = new Jugador(nombreJugador1, habilidadJugador1);
        Jugador jugador2= new Jugador(nombreJugador2,habilidadJugador2);

        Torneo t = new Torneo(nombreTorneo);



        //Jugar un partido
        t.jugarPartido(setsAJugar, jugador1, jugador2);

    }
}
