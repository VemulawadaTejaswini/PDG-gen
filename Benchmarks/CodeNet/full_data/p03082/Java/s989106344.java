import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static int n = 0;
	static int[] s;
	static int min = Integer.MAX_VALUE;
	static long[] p = new long[200];
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int x = sc.nextInt();
		s = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
			min = Math.min(min, s[i]);
		}
		sc.close();

		p[0] = 1L;
		for (int i = 1; i < 200; i++) {
			p[i] = p[i - 1] * i % 1000000007;
		}
		System.out.println(calc(new HashSet<Integer>(), x));
	}

	static long calc(Set<Integer> set, int x) {
		long ret = 0L;
		for (int i = 0; i < n; i++) {
			if (!set.contains(s[i])) {
				int nextX = x % s[i];
				if (nextX <= min) {
					ret += nextX % min * p[n - set.size() - 1];
					ret %= 1000000007;
				} else {
					Set<Integer> set2 = new HashSet<Integer>(set);
					set2.add(s[i]);
					ret += calc(set2, nextX);
					ret %= 1000000007;
				}
			}
		}
		return ret;
	}
}
