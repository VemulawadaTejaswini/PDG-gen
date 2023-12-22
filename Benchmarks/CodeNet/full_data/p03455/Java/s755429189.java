import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		if (a * b % 2 == 0) {
			System.out.println("Even");
			System.out.println("As " + a + " * " + b + " = " + a * b + " is even, print Even.");
		}
		else {
			System.out.println("Odd");
			System.out.println("As " + a + " * " + b + " = " + a * b + " is odd, print Odd.");
		}
	}

}
