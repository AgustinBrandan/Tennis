package com.tenis;

public class Jugador {
    private String nombre;
    private int skillPoints; // 0 to 100

    Jugador (String nombre, int skillPoints) {
        this.nombre = nombre;
        this.skillPoints = skillPoints;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSkillPoints() {
        return skillPoints;
    }

    public void setSkillPoints(int skillPoints) {
        this.skillPoints = skillPoints;
    }

    @Override
    public String toString() {
        return nombre ;
    }
}
