package ar.edu.unju.escmi.tp2.ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		final int CODIGO_POSTAL_JUJUY = 4600;
		final double PI = 3.1415926535;
		final int DIAS_SEMANA = 7;
		final int MESES_ANIO = 12;
		
		System.out.println("codigo postal de la provincia de jujuy: " + CODIGO_POSTAL_JUJUY);
		System.out.println("valor matematico de  π: " + PI);
		System.out.println("cantidad de dias de la semana: " + DIAS_SEMANA);
		System.out.println("cantidad de meses que tiene un año: " + MESES_ANIO);
	}

}

/* ¿Es necesario utilizar la palabra reservada static? 
No hace falta usar static acá porque las constantes están declaradas adentro del main.
Como static se usa para que una variable sea de toda la clase y no de un objeto,
para las que están adentro de un método alcanza con usar solo final */