import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();

		boolean[][] wh = new boolean[h + 1][w + 1];

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();

			for (int xx = 0; xx <= w; xx++) {
				for (int yy = 0; yy <= h; yy++) {
					if (a == 1 && xx < x) {
						wh[yy][xx] = true;
					} else if (a == 2 && xx >= x) {
						wh[yy][xx] = true;
					} else if (a == 3 && yy < y) {
						wh[yy][xx] = true;
					} else if (a == 4 && yy >= y) {
						wh[yy][xx] = true;
					}
				}
			}
		}

		int ret = 0;
		for (int xx = 0; xx < w; xx++) {
			for (int yy = 0; yy < h; yy++) {
				if (!wh[yy][xx]) {
					ret++;
				}
			}
		}

		pr.println(ret);
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
