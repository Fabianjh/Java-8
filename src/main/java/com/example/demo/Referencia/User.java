package com.example.demo.Referencia;

public class User{

    private String nombre;

    public User (String nombre) {
        this.nombre = nombre;
    }

    public static void referenciaAMetodoEstatico(){
        System.out.println("Probando referencia a metodo estatico");

    }
    public void referenciaAMetodoParticular(){
        System.out.println("Probando referencia a metodo particular");

    }
    public void mostrarNombre(){
        System.out.println(nombre);
    }
}