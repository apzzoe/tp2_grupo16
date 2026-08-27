package ar.edu.unju.escmi.tp2.ejercicio6;
import java.util.Scanner;
public class Ejercicio6 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		byte radio= entrada.nextByte();
		double area= Math.PI*Math.pow(radio,2);
		System.out.println("Área del círculo: " + area);

	}

}
