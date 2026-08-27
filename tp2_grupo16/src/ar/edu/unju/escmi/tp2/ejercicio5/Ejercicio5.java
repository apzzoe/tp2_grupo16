package ar.edu.unju.escmi.tp2.ejercicio5;

public class Ejercicio5 {

	public static void main(String[] args) {
		int a = 8;
		int b = 3;
		int c = -5;
		float nuevoA;
		float nuevoB;
		float nuevoC;
		int calc1 = a + b + c;
		int calc2 = 2 * b + 3 * (a - c);
		nuevoB = (float) b;
		float calc3 = a / nuevoB;
		int calc4 = a % b;
		nuevoC = (float) c;
		float calc5 = a / nuevoC;
		int calc6 = a % c;
		float calc7 = a * nuevoB / nuevoC;
		float calc8 = a * (nuevoB / nuevoC);
		int calc9 = (a * c) % b;
		int calc10 = a * (c % b);
		int calc11 = (3 * a - 2 * b) % (2 * a - c);
		nuevoA = (float) a;
		float calc12 = 2 * (nuevoA / 5 + (4 - b * 3)) % (a + c - 2);
		float calc13 = (nuevoA - 3 * nuevoB) % (nuevoC + 2 * nuevoA) / (nuevoA - nuevoC);
		int calc14 = a - b - c * 2;

		
		System.out.println(calc1);
		System.out.println(calc2);
		System.out.println(calc3);
		System.out.println(calc4);
		System.out.println(calc5);
		System.out.println(calc6);
		System.out.println(calc7);
		System.out.println(calc8);
		System.out.println(calc9);
		System.out.println(calc10);
		System.out.println(calc11);
		System.out.println(calc12);
		System.out.println(calc13);
		System.out.println(calc14);
	}

}
