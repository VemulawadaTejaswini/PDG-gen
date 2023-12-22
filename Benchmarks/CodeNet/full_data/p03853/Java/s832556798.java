import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int h = sc.nextInt();
		@SuppressWarnings("unused")
		int w = sc.nextInt();

		char[][] c = new char[h][];
		for (int i = 0; i < h; i++) {
			c[i] = sc.next().toCharArray();

			pr.println(c[i]);
			pr.println(c[i]);
		}

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
