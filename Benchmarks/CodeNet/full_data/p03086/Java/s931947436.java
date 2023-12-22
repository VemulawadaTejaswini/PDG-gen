import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		String s = sc.next();
		int n = s.length();

		int max = 0;
		for (int i = 0; i < n; i++) {
			out:
			for (int j = i + 1; j <= n; j++) {
				String tmp = s.substring(i, j);
				for (int k = 0, size = tmp.length(); k < size; k++) {
					char c = tmp.charAt(k);
					if (c != 'A' && c != 'C' && c != 'G' && c != 'T') {
						continue out;
					}
				}
				max = Math.max(max, tmp.length());
			}
		}

		pr.println(max);
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);
			
		solve();
			
		pr.close();
		sc.close();
	}

	static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
