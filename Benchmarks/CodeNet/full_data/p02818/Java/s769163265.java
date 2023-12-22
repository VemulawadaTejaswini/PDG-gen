import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();

		while (k > 0) {

			if (a + b <= k) {
				System.out.println("0" + "0");
			} else if (a >= 1) {
				--a;
			} else if (b >= 1) {
				--b;
			}

			--k;

		}

		System.out.println(a + " " + b);

		sc.close();
	}
}