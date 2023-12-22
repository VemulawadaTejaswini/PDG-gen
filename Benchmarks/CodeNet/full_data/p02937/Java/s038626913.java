import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();

		int[][] next = new int[s.length()]['z' - 'a' + 1];
		for (int i = 0; i < next.length; i++) {
			Arrays.fill(next[i], -1);
		}

		String ss = s.concat(s);

		List<Integer>[] cis = new ArrayList[26];
		for (int i = 0; i < cis.length; i++) {
			cis[i] = new ArrayList<>();
		}

		for (int i = 0; i < ss.length(); i++) {
			cis[ss.charAt(i) - 'a'].add(i);
		}

		for (int i = 0; i < cis.length; i++) {
			Collections.sort(cis[i]);
		}

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < 26; j++) {
				next[i][j] = lowerBound(cis[j], i);
			}
		}

		//for (int i = 0; i < next.length; i++) {
		//	for (int j = 0; j < next[i].length; j++) {
		//		System.out.print(next[i][j]);
		//		System.out.print(" ");
		//	}
		//	System.out.println();
		//}

		long a = 0;
		int current = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == t.charAt(0)) {
				current = i;
				a += i;
				break;
			}
		}

		if (current == 0 && s.charAt(0) != t.charAt(0)) {
			System.out.println(-1);
			return;
		}

		for (int i = 1; i < t.length(); i++) {
			int nx = next[current][t.charAt(i) - 'a'];
			if (nx == -1) {
				System.out.println(-1);
				return;
			}

			a += nx - current;
			current = nx % s.length();
		}

		System.out.println(a + 1);
	}

	private static int lowerBound(List<Integer> a, int x) {
		if (a == null || a.size() == 0) return -1;

		int l = -1, r = a.size() - 1;
		while (r - l > 1) {
			int m = (l + r) / 2;
			if (a.get(m) <= x) {
				l = m;
			} else {
				r = m;
			}
		}

		if (r == a.size() - 1 && a.get(r) < x) return -1;
		return a.get(r);
	}
}
