
package ar.edu.unju.escmi.tp2.ejercicio19;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto1 = "Hola";
		String texto2 = "Hola";
		
		System.out.println("texto1 == texto2:       " + (texto1==texto2));
		System.out.println("texto1.equals(texto2):  " + texto1.equals(texto2));
		
		
		String texto3 = new String("Hola");
		System.out.println("texto1 == texto3:       " + (texto1==texto3));
		System.out.println("texto1.equals(texto3):  " + texto1.equals(texto3));
		
	}

}

//¿Por qué texto1 == texto2 devuelve true? 
// - Devuelve true porque el operador == compara dos referencias, es decir, si ambos objetos ocupan la misma posición de memoria.
//   En este caso, al crearse los String texto1 y texto2 de esta manera, se está haciendo a través de un literal, pero en java 
//   existe el String Pool, un espacio de memoria reservado para almacenar las cadenas, y para optimizar esto, Java colecciona todas estas 
//   cadenas como literales y reutiliza los repetidos para optimizar el uso de la memoria.

   
//¿Por qué texto1 == texto3 devuelve false?  
// - A diferencia del String texto1, el String texto3 al no ser inicializado con un literal, sino como un objeto nuevo, no es almacenado 
//   en el String Pool, es decir, no tendrán la misma posición de memoria, haciendo que el operador == devuelva false.
//   si esto es así entonces la comparación resultara en false.

//¿Qué sucede cuando se utiliza el método equals() para comparar los valores?
// - El metodo .equals() compara la cadena por valor o carácter por carácter.