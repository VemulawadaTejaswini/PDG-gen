import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int n = s.nextInt();
			final int k = s.nextInt();

			double ans = 0;
			double a = 1 / (double) n;
			for (int i = 0; i < n; i++) {
				int count = count(i + 1, k);
				ans += a * Math.pow(0.5d, count);
			}
			System.out.println(ans);
		}
	}

	private static int count(int start, int max) {
		int count = 0;
		for (int i = start; i < max; i = i * 2) {
			count++;
		}
		return count;
	}

}