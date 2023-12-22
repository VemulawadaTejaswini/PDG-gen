import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		Set<String> hs = new HashSet<>();
		String[] w = new String[n];
		for (int i = 0; i < n; i++) {
			w[i] = sc.next();
			
			if (hs.contains(w[i])) {
				pr.println("No");
				return;
			}

			hs.add(w[i]);
		}
		
		for (int i = 1; i < n; i++) {
			if (w[i - 1].charAt(w[i - 1].length() - 1) != w[i].charAt(0)) {
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
