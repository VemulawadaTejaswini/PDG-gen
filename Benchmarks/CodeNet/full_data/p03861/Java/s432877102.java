import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();

		long ret1 = b / x;
		long ret2 = (a - 1) / x;

		if (a == 0) {
			pr.println(ret1 + 1);
		} else {
			pr.println(ret1 - ret2);
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
