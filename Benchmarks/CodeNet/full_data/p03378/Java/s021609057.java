import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		@SuppressWarnings("unused")
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();

		int[] a = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
		}

		int c1 = 0;
		int c2 = 0;
		for (int e : a) {
			if (e < x) {
				c1++;
			} else {
				c2++;
			}
		}

		pr.println(Math.min(c1, c2));
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(INPUT == null ? System.in : new ByteArrayInputStream(INPUT.getBytes()));
		pr = new Printer(System.out);

		solve();

//		pr.close();
		pr.flush();
//		sc.close();
	}

	static String INPUT = null;

	private static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
