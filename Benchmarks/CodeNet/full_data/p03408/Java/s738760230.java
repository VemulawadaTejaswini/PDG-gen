import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		Map<String, Integer> hms = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String s = sc.next();

			if (hms.containsKey(s)) {
				hms.put(s, hms.get(s) + 1);
			} else {
				hms.put(s, 1);
			}
		}

		int m = sc.nextInt();
		Map<String, Integer> hmt = new HashMap<>();
		for (int i = 0; i < m; i++) {
			String t = sc.next();

			if (hmt.containsKey(t)) {
				hmt.put(t, hmt.get(t) + 1);
			} else {
				hmt.put(t, 1);
			}
		}

		List<String> list = new ArrayList<>();
		list.addAll(hms.keySet());
		list.addAll(hmt.keySet());

		int ans = 0;
		for (String e : list) {
			int tmp = 0;
			if (hms.containsKey(e)) {
				tmp += hms.get(e);
			}
			if (hmt.containsKey(e)) {
				tmp -= hmt.get(e);
			}

			ans = Math.max(ans, tmp);
		}

		pr.println(ans);
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
