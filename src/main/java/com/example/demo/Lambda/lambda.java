package com.example.demo.Lambda;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class lambda implements PorDefecto{
	public static void main(String args[]){
		/*
		()->"minombre es";
		(n) -> n * n;
		(n) -> n==2;
		*/
	}
	MiNombre minombreAnonima= new MiNombre() {
		@Override
		public String MiNombre(){
			return "Alberto Anonimo";
		}

	};
		System.out.println (minombreAnonima.miNombre());
		MiNombre miNombreLambda = () -> ("Alberto Lambda");
		System.out.Println (miNombreLambda.miNombre());





@SpringBootApplication
public class DemoApplication {

	public static void main (String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	};
	Sumar suma = new Sumar(){
		@Override
		Public int suma(int a , int b);
		return a + b;
		System.out.println(suma.suma(2,3));
		Sumar suma1= (a,b) -> a+b;
		System.out.println(suma1.suma(2,3));
		Sumar suma2= (a,b) -> a+b;
			a = b* b;
			a= a + b;
					System.out.println("Lambda");
					return a;
		System.out.println(suma.suma(2,3));

		Lambda l = new lambda();
		
			System.out.println(l.nombrePorDefecto("Alberto"));
		}
	
	}
@Override
public void mostrarNombre(String nombre) {
	// TODO Auto-generated method stub
	
}
@Override
public void mostrarNombre(String nombre) {
	// TODO Auto-generated method stub
	
};



}
}
