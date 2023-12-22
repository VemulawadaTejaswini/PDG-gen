import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		int i = 0;
		int a = 1;

		for (i = 0; i < n; i++) {

			a = a * (k - 1);

			System.out.println(a);
		}

		if (n > 1) {
			System.out.println(k * a);

		} else {
			System.out.println(a + 1);

		}

	}

}
