import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int k = sc.nextInt();

		NavigableSet<Long> hs = new TreeSet<>();
		hs.add(1L);
		for (int i = 0; i < n; i++) {
			NavigableSet<Long> tmp = new TreeSet<>();

			for (long e : hs) {
				tmp.add(e * 2);
				tmp.add(e + k);
			}

			hs = tmp;
		}

		pr.println(hs.first());
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
