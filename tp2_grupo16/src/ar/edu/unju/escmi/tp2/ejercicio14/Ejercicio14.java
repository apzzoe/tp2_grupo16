package ar.edu.unju.escmi.tp2.ejercicio14;

import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeros[] = new int[8];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 8; i++) {
			System.out.println("Ingrese un número: ");
		    numeros[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 8; i++)
			System.out.println("["+ i +"]"+ "= " + numeros[i]);
		
		sc.close();
	}
	
}