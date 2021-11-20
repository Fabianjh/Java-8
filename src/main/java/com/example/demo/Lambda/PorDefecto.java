package com.example.demo.Lambda;
Public interface PorDefecto{
    void mostrarNombre(String nombre);
    default String nombrePorDefecto(String nombre){
        return nombre + "Default";
    }
}