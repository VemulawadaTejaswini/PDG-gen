import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		int[] t = new int[n];
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
			a[i] = sc.nextInt();
		}

		long total = 0;
		long ttmp = 0;
		long atmp = 0;
		for (int i = 0; i < n; i++) {
			long tmp = t[i] + a[i];
			if (tmp >= total && ttmp <= t[i] && atmp <= a[i]) {
				total = tmp;
				ttmp = t[i];
				atmp = a[i];
			} else {
				long max = (total + tmp - 1) / tmp;
				max = Math.max(max, (ttmp + t[i] - 1) / t[i]);
				max = Math.max(max, (atmp + a[i] - 1) / a[i]);
				total =  max * tmp;
				ttmp = total * t[i] / tmp;
				atmp = total * a[i] / tmp;
			}
		}

		pr.println(total);
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
