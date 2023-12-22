import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int k = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		double answer = 1.0;

		if (b - a < 2) {
			System.out.println((k + 1));
			return;
		}

		k -= (a - 1);
		answer = a;
		if (k % 2 == 1) {
			k--;
			answer += 1.0;
		}

		for (int i = k / 2; i > 0; i--) {
			if (i >= k / 2 - 10) {
				System.out.println("answer = " + answer);
			}

			double yen = Math.floor(answer/a);
			answer -= yen * a;
			answer += yen * b;
		}

		System.out.println(answer);
	}
}
