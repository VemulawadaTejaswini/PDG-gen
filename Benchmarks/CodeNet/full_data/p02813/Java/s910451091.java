import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		int[] q = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			q[i] = sc.nextInt();
		}

		int a = dfs(0, p, new HashSet<>(), false);
		int b = dfs(0, q, new HashSet<>(), false);
		System.out.println(Math.abs(a - b));
	}

	private static int dfs(int current, int[] a, Set<Integer> s, boolean smaller) {
		if (s.size() == a.length) return 1;
		int n = a.length;

		int x = 0;
		for (int i = 1; i <= n; i++) {
			if (a[current] < i && !smaller) continue;
			if (s.contains(i)) continue;
			s.add(i);
			x += dfs(current + 1, a, s, smaller || (a[current] > i));
			s.remove(i);
		}

		return x;
	}

}
