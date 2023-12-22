import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();

		int max = 0;
		for (int i = 1; i < n; i++) {
			int tmp = 0;
			for (char c = 'a'; c <= 'z'; c++) {
				boolean flag = false;
				for (int j = 0; j < i; j++) {
					if (s[j] == c) {
						flag = true;
					}
				}

				if (!flag) {
					continue;
				}
				flag = false;
				for (int j = i; j < n; j++) {
					if (s[j] == c) {
						flag = true;
					}
				}
				if (flag) {
					tmp++;
				}
			}

			max = Math.max(max, tmp);
		}

		pr.println(max);
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
