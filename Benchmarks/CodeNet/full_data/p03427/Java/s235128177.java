import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		long n = sc.nextLong();

		int max = cnt(n);

		for (int i = 1; true; i++) {
			long tmp = n + 1;
			for (int j = 0; j < i; j++) {
				tmp /= 10;
			}
			tmp -= 1;
			if (tmp <= 0) {
				break;
			}
			for (int j = 0; j < i; j++) {
				tmp *= 10;
				tmp += 9;
			}

			max = Math.max(max, cnt(tmp));
		}

		pr.println(max);
	}

	private static int cnt(long n) {
		int cnt = 0;
		long tmp = n;
		while (tmp > 0) {
			cnt += tmp % 10;
			tmp /= 10;
		}

		return cnt;
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
