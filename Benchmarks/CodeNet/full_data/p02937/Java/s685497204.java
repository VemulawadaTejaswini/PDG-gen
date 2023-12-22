import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		String s = sc.next();
		String t = sc.next();

		sc.close();

		String s2 = s + s;
		Map<Character, List<Integer>> m = new HashMap<>();
		for (char c = 'a'; c <= 'z'; c++) {
			m.put(c, new ArrayList<>());
		}
		for (int i = 0; i < s2.length(); i++) {
			char c = s2.charAt(i);
			m.get(c).add(i + 1);
		}

		long pos = 0;

		for (int i = 0; i < t.length(); i++) {
			char c = t.charAt(i);
			List<Integer> l = m.get(c);
			if (l.size() == 0) {
				out.println(-1);
				return;
			}
			int idx = upperBound(l, 0, l.size(), (int) (pos % s.length()));

			pos += (l.get(idx) - (int) (pos % s.length()));

		}

		out.println(pos);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private static int upperBound(List<Integer> a, int st, int ed, int k) {
		if (st == ed - 1) {
			if (a.get(st) <= k) {
				return st + 1;
			} else {
				return st;
			}
		}

		int m = (ed - st) / 2 + st;
		if (a.get(m) <= k) {
			//右側
			return upperBound(a, m, ed, k);
		} else {
			//左側
			return upperBound(a, st, m, k);
		}
	}
}
