package ar.edu.unju.escmi.tp2.ejercicio17;

public class Ejercicio17 {

	public static void main(String[] args) {

        System.out.println("-caso con valores iguales-");
        Integer num1 = 50;
        Integer num2 = 50;
        System.out.println("Referencia de num1 es :" + System.identityHashCode(num1));
        System.out.println("Referencia de num2 es :" + System.identityHashCode(num2));

        if (num1 == num2) {
            System.out.println("las referencias son iguales");
        } else { System.out.println("las referencias no son iguales");
        }
        if (num1.equals(num2)) {
            System.out.println("los valores son iguales");
        } else {
            System.out.println("Los valores no son iguales");
       }
       
       
        
        
        System.out.println("-caso con valores distintos-");
        Integer num3 = 50;
        Integer num4 = 80;

        System.out.println("Referencia de num3 es: " + System.identityHashCode(num3));
        System.out.println("Referencia de num4 es: " + System.identityHashCode(num4));

        if (num3 == num4) {
            System.out.println("las referencias son iguales");
        } else {
            System.out.println("las referencias no son iguales");
        }
        if (num3.equals(num4)) {
            System.out.println("los valores son iguales");
        } else {  System.out.println("los valores no son iguales");
        }
    }
}
