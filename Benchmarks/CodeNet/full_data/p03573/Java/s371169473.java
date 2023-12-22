import java.util.Scanner;

class a {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int a,b,c;
		a = stdIn.nextInt();
		b = stdIn.nextInt();
		c = stdIn.nextInt();

		if (a == b) {
			System.out.print(c);
		} else if (b == c) {
			System.out.print(a);
		} else {
			System.out.print(b);
		}
	}
}