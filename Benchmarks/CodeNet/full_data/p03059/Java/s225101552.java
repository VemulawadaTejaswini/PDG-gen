import java.util.Scanner;
public class Main {
	public static void main (String[]args) {
	Scanner teclado = new Scanner (System.in) ;
		
	int A, B, T;
	A = teclado.nextInt();
	B = teclado.nextInt();
	T = teclado.nextInt();
	
	if(A < B) {
		System.out.println(B+B);
	}else if (B < A) {
		System.out.println(A+A);
	}else {
		System.out.println(0);
	}
	
}}
