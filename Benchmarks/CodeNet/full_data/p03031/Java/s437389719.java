import java.util.*;

public class Main {
	private static int n;
	private static int m;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		Set<Integer>[] s = new HashSet[m];

		for (int i = 0; i < m; i++) {
			s[i] = new HashSet<>();

			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				s[i].add(sc.nextInt() - 1);
			}
		}

		int[] p = new int[m];
		for (int i = 0; i < m; i++) {
			p[i] = sc.nextInt();
		}

		int i = 1 << n;
		int a = 0;
		while (i > 0) {
			i -= 1;
			if (check(i, s, p)) a++;
		}

		System.out.println(a);
	}

	private static boolean check(int i, Set<Integer>[] s, int[] p) {
		for (int j = 0; j < s.length; j++) {
			Set<Integer> a = s[j];

			int on = 0;
			for (int k = 0; k < n; k++) {
				if (((i >> k) & 1) == 1 && a.contains(k)) on++;
			}

			if (p[j] != on % 2) return false;
		}

		return true;
	}
}
