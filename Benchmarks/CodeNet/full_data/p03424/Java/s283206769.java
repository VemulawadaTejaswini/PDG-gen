import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		Set<Character> hs = new HashSet<>();
		for (int i = 0; i < n; i++) {
			char a = sc.next().toCharArray()[0];
			hs.add(a);
		}

		if (hs.size() == 3) {
			pr.println("Three");
		} else if (hs.size() == 4) {
			pr.println("Four");
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
