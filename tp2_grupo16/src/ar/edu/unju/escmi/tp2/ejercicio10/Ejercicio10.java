package ar.edu.unju.escmi.tp2.ejercicio10;

public class Ejercicio10 {

	public static void main(String[] args) {
		int a = 7;
		int b = 5;
		int c = -14;
		boolean exp1 = a > 3;
		boolean exp2 = a > c;
		boolean exp3 = a < c;
		boolean exp4 = b < c;
		boolean exp5 = b != c;
		boolean exp6 = a == 3;
		boolean exp7 =  a * b == 15;
		boolean exp8 = a * b == -30;
		boolean exp9 = c / b < a;
		boolean exp10 = c / b == -10;
		boolean exp11 = c / b == -4;
		boolean exp12 = a + b + c == 5;
		boolean exp13 = (a+b == 8 ) && (a-b == 2);
		boolean exp14 = (a+b == 8 ) || (a-b == 6);
		boolean exp15 = a > 3 && b > 3 && c < 3;
		boolean exp16 = a > 3 && b >= 3 && c < -3;


		
		System.out.println(exp1);
		System.out.println(exp2);
		System.out.println(exp3);
		System.out.println(exp4);
		System.out.println(exp5);
		System.out.println(exp6);
		System.out.println(exp7);
		System.out.println(exp8);
		System.out.println(exp9);
		System.out.println(exp10);
		System.out.println(exp11);
		System.out.println(exp12);
		System.out.println(exp13);
		System.out.println(exp14);
		System.out.println(exp15);
		System.out.println(exp16);

	}

}
