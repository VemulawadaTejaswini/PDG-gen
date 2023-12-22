import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		
		int n = s.length;

		for (int i = 0; i < n; i++) {
			if (s[i] != t[i]) {
				char ss = s[i];
				char dd = t[i];
				for (int j = 0; j < n; j++) {
					if (s[j] == ss) {
						s[j] = dd;
					} else if (s[j] == dd) {
						s[j] = ss;
					}
				}
			}
		}

		for (int i = 0; i < n; i++) {
			if (s[i] != t[i]) {
				pr.println("No");
				return;
			}
		}
		
		pr.println("Yes");
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
