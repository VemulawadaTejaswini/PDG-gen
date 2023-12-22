import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		String[] ok = {"AKIHABARA",
				"KIHBR",
				"KIHBRA",
				"KIHBAR",
				"KIHBARA",
				"KIHABR",
				"KIHABRA",
				"KIHABAR",
				"KIHABARA",
				"AKIHBR",
				"AKIHBRA",
				"AKIHBAR",
				"AKIHBARA",
				"AKIHABR",
				"AKIHABRA",
				"AKIHABAR",
//				"AKIHABARA",
		};

		String s = sc.next();

		for (int i = 0; i < ok.length; i++) {
			if (s.equals(ok[i])) {
				pr.println("YES");
				return;
			}
		}

		pr.println("NO");
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
