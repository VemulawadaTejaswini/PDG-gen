import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();

		print('U', ty - sy, pr);
		print('R', tx - sx, pr);
		print('D', ty - sy, pr);
		print('L', tx - sx, pr);

		print('L', 1, pr);
		print('U', ty - sy + 1, pr);
		print('R', tx - sx + 1, pr);
		print('D', 1, pr);

		print('R', 1, pr);
		print('D', ty - sy + 1, pr);
		print('L', tx - sx + 1, pr);
		print('U', 1, pr);

		pr.println();
	}

	private static void print(char c, int n, Printer pr) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			sb.append(c);
		}

		pr.print(sb);
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
