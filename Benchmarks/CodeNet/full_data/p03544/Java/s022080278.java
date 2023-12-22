import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		long[] l = new long[n + 1];
		l[0] = 2;
		l[1] = 1;
		for (int i = 2; i <= n; i++) {
			l[i] = l[i - 1] + l[i - 2];
		}

		pr.println(l[n]);
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
