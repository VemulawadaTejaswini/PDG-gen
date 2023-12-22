import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		String a = sc.next();
		String b = sc.next();

		int ab = Integer.parseInt(a + b);

		int sqrt = (int)Math.sqrt(ab);

		if (ab == sqrt * sqrt) {
			pr.println("Yes");
		} else {
			pr.println("No");
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
