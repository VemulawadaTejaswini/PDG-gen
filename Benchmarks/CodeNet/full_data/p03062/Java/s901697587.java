import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int N = s.nextInt();

			long ret = 0;
			long sum = 0;
			boolean plus = true;
			for (int i = 0; i < N - 1; i++) {
				long a = s.nextLong();
				if (a < 0) {
					plus = !plus;
				} else if (a == 0) {
					ret += sum;
					sum = 0;
					plus = true;
				}
				if (i != 0 && sum == 0 && a < 0) {
					plus = false;
				}
				sum += Math.abs(a);
			}
			long a = s.nextLong();
			long aa = Math.abs(a);
			if (a < 0 && sum < aa) {
				ret = ret - sum + aa;
			} else if (plus) {
				ret = ret + sum + a;
			} else {
				ret = ret + sum - a;
			}
			System.out.println(ret);
		}
	}
}
