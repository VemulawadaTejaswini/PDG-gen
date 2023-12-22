import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();

		a -= k;
		if (a + b <= k) {
			System.out.println("0 0");
		} else if (a < 0) {
			b += a;
			a = 0;
		} else if (b < 0) {
			b = 0;
		}

		--k;

		System.out.println(a + " " + b);

		sc.close();
	}
}