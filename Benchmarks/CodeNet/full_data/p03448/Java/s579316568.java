import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();

		int[] dp = new int[x + 1];
		dp[0] = 1;
		for (int i = x; i >= 0; i--) {
			for (int j = 1; j <= a && i + j * 500 <= x; j++) {
				dp[i + j * 500] += dp[i];
			}
		}
		for (int i = x; i >= 0; i--) {
			for (int j = 1; j <= b && i + j * 100 <= x; j++) {
				dp[i + j * 100] += dp[i];
			}
		}
		for (int i = x; i >= 0; i--) {
			for (int j = 1; j <= c && i + j * 50 <= x; j++) {
				dp[i + j * 50] += dp[i];
			}
		}

		pr.println(dp[x]);
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);

		solve();

		pr.close();
		sc.close();
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}
