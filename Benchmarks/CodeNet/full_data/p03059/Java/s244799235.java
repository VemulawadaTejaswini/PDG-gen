import java.util.Scanner;
public class Main {
	public static void main (String[]args) {
	Scanner teclado = new Scanner (System.in) ;
		
	int A, B, T;
	A = teclado.nextInt();
	B = teclado.nextInt();
	T = teclado.nextInt();
	
	if(A < B && T+0.5 <=20 && A <=1 && B <=1) {
		System.out.println(B+B);
	}else if (B < A && T+0.5 <=20 && A <=1 && B <=1) {
		System.out.println(A+A);
	}else {
		System.out.println(0);
	}
	
}}
