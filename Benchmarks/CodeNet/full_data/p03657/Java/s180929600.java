import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int c = a + b;

		if (c % 3 == 0) {
			System.out.println("Possible");
		} else {
			System.out.println("Impossible");
		}

	}
}