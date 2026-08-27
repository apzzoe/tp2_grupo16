package ar.edu.unju.escmi.tp2.ejercicio9;

import java.util.Scanner;
public class Ejercicio9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor ingrese un anio (por ejemplo 2010): ");
		int anio = sc.nextInt();
		
		if( (anio%4 == 0 && anio%100 != 0) || anio%400 == 0)
			System.out.println("El anio ingresado es bisiesto ");
		else 
			System.out.println("El anio ingresado no es bisiesto ");
			
		sc.close();
		

	}

}
