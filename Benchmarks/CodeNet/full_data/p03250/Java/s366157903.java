import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		if (a>=b && a>=c) {
			System.out.println(a*10 + b + c);
			return;
		}
		if (b>=a && b>=c) {
			System.out.println(b*10 + c + a);
			return;
		}
		if (c>=a && c>=b) {
			System.out.println(c*10 + a + b);
			return;
		}
	
	}
	
}