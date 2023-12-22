import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		char[] c = sc.next().toCharArray();

		if (c[0] == 'a' || c[0] == 'o' || c[0] == 'i' || c[0] == 'e' || c[0] == 'u') {
			pr.println("vowel");
		} else {
			pr.println("consonant");
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
