import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		long a = 0;

		boolean[] sorted = new boolean[n];
		for (int from = 0, i = 1; from + k <= n; i++) {
			if (p[i - 1] < p[i]) {
				if (i + 1 != from + k) {
					continue;
				}
				sorted[from] = true;
				from++;
				if (a == 0) a = 1;
			} else {
				from = i;
			}
		}

		NavigableSet<Integer> s = new TreeSet<>();
		for (int i = 0; i < k; i++) {
			s.add(p[i]);
		}

		if (!sorted[0]) a++;
		for (int i = 0, j = k; j < n; i++, j++) {
			if (!sorted[i + 1] && !(p[i] == s.first() && p[j] > s.last())) a++;
			s.remove(p[i]);
			s.add(p[j]);
		}
		System.out.println(a);
	}
}
