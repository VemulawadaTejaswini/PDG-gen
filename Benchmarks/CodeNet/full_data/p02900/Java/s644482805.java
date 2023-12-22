import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = gcd(a, b);
		ArrayList<Integer> sosu = new ArrayList<Integer>();
		sosu.add(1);
		long d = (long) Math.sqrt(c) + 2;

		for (int i = 2; i <= d;) {
			if (c % i == 0) {

				sosu.add(i);
				while (c % i == 0) {
					c /= i;
				}
			} else
				i++;
		}
		System.out.println(sosu.size());

	}

	static long gcd(long a, long b) {
		long temp;
		while ((temp = a % b) != 0) {
			a = b;
			b = temp;
		}
		return b;
	}

}
