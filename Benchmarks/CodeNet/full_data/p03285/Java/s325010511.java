import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		for (int i = 0; 4 * i <= 100; i++) {
			for (int j = 0; 4 * i + 7 * j <= 100; j++) {
				if (4 * i + 7 * j == n) {
					pr.println("Yes");
					return;
				}
			}
		}
		
		pr.println("No");
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
