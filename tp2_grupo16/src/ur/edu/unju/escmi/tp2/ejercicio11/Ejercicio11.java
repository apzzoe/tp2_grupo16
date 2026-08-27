package ur.edu.unju.escmi.tp2.ejercicio11;

import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	        int numero;
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Ingrese un numero: ");
	            numero = entrada.nextInt();
	            if (numero % 2 == 0) {
	                System.out.println("El numero es par: ");
	            } else {
	                System.out.println("El numero es impar: ");
	            }
	        }
	}
}
