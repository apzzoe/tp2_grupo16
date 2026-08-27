package ar.edu.unju.escmi.tp2.ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamano = 0;

        do {
            System.out.print("Ingrese un número entero para el tamaño del array: ");
            tamano = sc.nextInt();
            
            if (tamano < 3 || tamano > 10) {
                System.out.println("Error: El número debe estar estrictamente entre 3 y 10.");
            }
        } while (tamano < 3 || tamano > 10);

        int[] numeros = new int[tamano];

        System.out.println("\n--- Carga de datos en el Array ---");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el valor para la posición [" + i + "]: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\n--- Resultados del Array ---");
        int sumaTotal = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición [" + i + "] = " + numeros[i]);
            sumaTotal += numeros[i];
        }

        System.out.println("\nLa suma de todos los valores ingresados es: " + sumaTotal);

        sc.close();
        
        
    }
}
