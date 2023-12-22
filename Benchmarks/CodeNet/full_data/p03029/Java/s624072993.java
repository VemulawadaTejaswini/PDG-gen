import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, p;
		a=teclado.nextInt();
		p=teclado.nextInt();
		if(a >=0 && p >= 0 && a <=100 && p <= 100) {
			if(p > a && a !=0) {
				System.out.println(p);
			}else if( a==0 && p ==1) {
				System.out.println(0);
			}else {
				System.out.println(((a*3)+p)/2);
			}
		}
		}
	}