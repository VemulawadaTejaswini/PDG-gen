import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int s = sc.nextInt();

		Set<Integer> hs = new HashSet<>();
		hs.add(s);
		for (int i = 2, prev = s; true; i++) {
			int a = prev % 2 == 0 ? prev / 2 : 3 * prev + 1;
			if (!hs.add(a)) {
				pr.println(i);
				break;
			}
			
			prev = a;
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

	static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
