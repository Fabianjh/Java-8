package com.example.demo.Referencia.Optional;

import java.util.Optional;

public class OptionalPrueba {
    public static void main(String arg[]){
        //probarOptional(null);
        //orElseOptional(null);
        orElseThrow("null");
        isPresent(null);

    }
    public static void probarOptional(String name){
        System.out.println(name.length());
    }
    public static void crearOptional(){
        Optional<String> optional = Optional.empty();
        optional.get();
    }
    public static void orElseOptional(String name){
        Optional<String> optional = Optional.ofNullable(name);
        //Optional<String> optional1 = Optional.of(name);
        String nameOfNullable = optional.orElse("Vacio");
        //String nameOf = optional1.orElse("Vacio");
        System.out.println(nameOfNullable);
        //System.out.println(nameOf);
        

    }

    public static void orElseThrow (String name){
        Optional<String> optional = Optional.ofNullable(name);
        optional.orElseThrow(NullPointerException::new);
        String name1 = optional.get();
        System.out.println(name1);

                                    }
    public static void isPresent(String name){
        Optional<String> optional = Optional.ofNullable(name);
        System.out.println(optional.isPresent());
    }
}
