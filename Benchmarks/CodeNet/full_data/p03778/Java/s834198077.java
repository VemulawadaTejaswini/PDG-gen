import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (b > a + w) {
			pr.println(b - (a + w));
		} else if (b + w < a) {
			pr.println(a - (b + w));
		} else {
			pr.println(0);
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
