package com.example.demo.Referencia;
public class ReferenciaMetodo{

    public static void main (String arg[]){

        Trabajo trabajo = new Trabajo(){
            @Override
            public void accion(){
                User.referenciaAMetodoEstatico();

            }
        };
        Trabajo trabajoL = ()-> User.referenciaAMetodoEstatico();
        Trabajo trabajoMR = User::referenciaAMetodoEstatico;
        trabajoMR.accion();
    
        User user = new User("Alberto");
        Trabajo trabajoL2 = () -> user.referenciaAMetodoParticular();
        Trabajo trabajoMR2 = user::referenciaAMetodoParticular;
        trabajoMR2.accion();

        TrabajoString trabajoString  (palabra) -> palabra.toUpperCase();
        TrabajoString trabajoStringRM = String::toUpperCase;
        System.out.println(trabajoStringRM.accion("alberto"));

        List<User> users = new ArrayList<>();
        users.add(new User("Alberto"));
        users.add(new User("Maria"));
        users.add(new User("Marta"));
        users.add(new User("Pablo"));
        users.forEach(nombre -> nombre.mostrarNombre());
        users.forEach(User::mostrarNombre);

        IUser user1 0 new IUser(){
            @Override
            public User crear (String nombre){

            }
        };
        IUser user2 = (nombre -> new User(nombre));
        IUser user3 = User::new;
        

    }



}

