import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int h = sc.nextInt();
		int w = sc.nextInt();

		char[][] a = new char[h][];
		for (int i = 0; i < h; i++) {
			a[i] = sc.next().toCharArray();
		}

		for (int i = 0; i < h + 2; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append('#');
			if (i == 0 || i == h + 1) {
				for (int j = 0; j < w; j++) {
					sb.append('#');
				}
			} else {
				sb.append(a[i - 1]);
			}
			sb.append('#');

			pr.println(sb);
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
