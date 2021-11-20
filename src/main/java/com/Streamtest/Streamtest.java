package com.Streamtest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streamtest {
    private static List<User> users;
    public static void main(String[] args) {
        setUpUser();
        Stream.of(users);
        users.stream();
        users.stream().forEach(e->e.setName(e.getName() + "Apellido"));
        printList();

                
    }
        private static void setUpUser(){
            users= new ArrayList<>();
            users.add(new User(1, "Ruben"));
            users.add(new User(1, "Maria"));
            users.add(new User(1, "Marta"));
            users.add(new User(1, "Raul"));
            users.add(new User(1, "Tomas"));
            users.add(new User(1, "Ruben"));
            
        }
        private static void printList(){
            users.stream().forEach(e->System.out.println(e.getId() + " " + e.getName()));
        }
    }
