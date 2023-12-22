import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		int[] d = new int[n];
		Set<Integer> hs = new HashSet<>();
		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
			hs.add(d[i]);
		}

		pr.println(hs.size());
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
