import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner teclado = new Scanner (System.in);
		int a;
		int b;
		a=teclado.nextInt();
		b=teclado.nextInt();
		
		
		if(a+(b-1) > a*a && a+(b-1) > b*b) {
			System.out.println((a+(b-1)));
		}else if(a+(b-1) < a*a && a*a > b*b) {
			System.out.println(a*a);			
		}else {
			System.out.println(b*b);
		}
	}
	
}
