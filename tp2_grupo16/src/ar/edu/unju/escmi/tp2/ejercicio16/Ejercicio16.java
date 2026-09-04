package ar.edu.unju.escmi.tp2.ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);

	        System.out.println("Ingrese la cantidad de nombres entre 5 y 10:");
	        int tamaño = entrada.nextInt();

	        String[] nombres = new String[tamaño];

	        entrada.nextLine();

	        for (int i = 0; i < tamaño; i++) {

	            System.out.println("Ingrese un nombre:");
	            nombres[i] = entrada.nextLine();

	        }

	        System.out.println("Nombres desde el inicio:");

	        for (int i = 0; i < tamaño; i++) {

	            System.out.println(nombres[i]);

	        }

	        System.out.println("Nombres desde el final:");

	        for (int i = tamaño - 1; i >= 0; i--){

	            System.out.println(nombres[i]);

	        }
	  entrada.close();

	}

}
