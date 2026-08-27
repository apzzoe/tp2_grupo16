package ar.edu.unju.escmi.tp2.ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese la cantidad de nombres entre 5 y 10:");
	        int tamaño = scanner.nextInt();

	        String[] nombres = new String[tamaño];

	        scanner.nextLine();

	        for (int i = 0; i < tamaño; i++) {

	            System.out.println("Ingrese un nombre:");
	            nombres[i] = scanner.nextLine();

	        }

	        System.out.println("Nombres desde el inicio:");

	        for (int i = 0; i < tamaño; i++) {

	            System.out.println(nombres[i]);

	        }

	        System.out.println("Nombres desde el final:");

	        for (int i = tamaño - 1; i >= 0; i--){

	            System.out.println(nombres[i]);

	        }

	}

}
