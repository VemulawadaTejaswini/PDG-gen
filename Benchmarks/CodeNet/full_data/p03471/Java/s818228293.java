import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int y = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			for (int j = 0; i + j <= n; j++) {
				int k = n - i - j;

				int sum = 10000 * i + 5000 * j + 1000 * k;

				if (sum == y) {
					pr.printf("%d %d %d\n", i, j, k);
					return;
				}
			}
		}

		pr.println("-1 -1 -1");
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
