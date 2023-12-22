import java.io.*;
import java.math.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		String a = sc.next();
		String b = sc.next();

		BigInteger ba = new BigInteger(a);
		BigInteger bb = new BigInteger(b);

		if (ba.compareTo(bb) == 0) {
			pr.println("EQUAL");
		} else if (ba.compareTo(bb) > 0) {
			pr.println("GREATER");
		} else {
			pr.println("LESS");
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
