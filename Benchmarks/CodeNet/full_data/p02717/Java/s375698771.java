import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a, b, c;
		int temp;
		Scanner scan = new Scanner(System.in);

		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		temp = a;
		a = b;
		b = temp;

		temp = a;
		a = c;
		c = temp;

		System.out.println(a + " " + b + " " + c);
	}
}
