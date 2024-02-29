package com.acme;

public class HolaMundo {
    public static void main(String[] args) {
        System.out.print("Hola Mundo!!!\n");
        Mensaje msg = new Mensaje();
        String nombre = msg.solicitaDatos("Entre su nombre: ");
        String apellido = msg.solicitaDatos("Entre su apellido: ");
        Persona p1 = new Persona(nombre, apellido);
        //System.out.println("Bienvenido " + nombre + " " + apellido);
        msg.saludar(p1);
    }
}
