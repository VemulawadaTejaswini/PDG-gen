import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a == b) {
			pr.println("Draw");
		} else if (a == 1) {
			pr.println("Alice");
		} else if (b == 1) {
			pr.println("Bob");
		} else if (a > b) {
			pr.println("Alice");
		} else {
			pr.println("Bob");
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
