import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			int tmpA = a;
			a = b;
			b = tmpA;

			tmpA = a;
			a = c;
			c = tmpA;

			System.out.println(a + " " + b + " " + c);
		}
	}
}