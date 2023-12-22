import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		int max = Math.max(Math.max(a, b), c);

		if (max == a) {
			System.out.println(10 * a + b + c);
		} else if (max == b) {
			System.out.println(10 * b + a + c);

		} else {
			System.out.print(10 * c + a + b);
		}

	}

}