import java.util.Scanner;

public class Main {
	/**
	 * Traveling
	 * @param 1 ≤ N ≤ 10^5
	 * @param 0 ≤ xi ≤ 10^5
	 * @param 0 ≤ yi ≤ 10^5
	 * @param 1 ≤ ti ≤ 10^5
	 * @param ti < t(i+1) (1 ≤ i ≤ N−1)
	 */
	public static void main(String...args) {
		try (Scanner sc = new Scanner(System.in)) {
			String ans = "Yes";
			int n = sc.nextInt();
			int[] t = new int[n + 1];
			int[] x = new int[n + 1];
			int[] y = new int[n + 1];
			t[0] = 0;
			x[0] = 0;
			y[0] = 0;
			for (int i = 1; i < n + 1; i++) {
				t[i] = sc.nextInt();
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();

				int T = t[i] - t[i - 1];
				int X = Math.abs(x[i] - x[i - 1]);
				int Y = Math.abs(y[i] - y[i - 1]);
				if (T >= X + Y && T % 2 == (X + Y) % 2) {
					// pass
				} else {
					ans = "No";
					break;
				}
			}
			System.out.println(ans);
		}
	}
}