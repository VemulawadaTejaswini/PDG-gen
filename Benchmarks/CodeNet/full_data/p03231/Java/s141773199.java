import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		char s[] = sc.next().toCharArray();
		char t[] = sc.next().toCharArray();
		HashMap<Long, Character> hm = new HashMap<>();
		long max = 0;
		long key;
		long lc = lcm(n, m);
		for (int i = 0; i < n; i++) {
			key = 1 + i * lc / n;
			hm.put(key, s[i]);
		}
		long ans = lc;
		for (int i = 0; i < m; i++) {
			key = 1 + i * lc / m;
			if (hm.containsKey(key)) {
				if (hm.get(key) == t[i]) {
					
				} else {
					ans = -1;
					break;
				}
			} else {
				hm.put(key, t[i]);
			}
		}
		System.out.println(ans);
	}

	private static long lcm(long m, long n) {
		return m * n / gcd(m, n);
	}

	private static long gcd(long m, long n) {
		if (m < n)
			return gcd(n, m);
		if (n == 0)
			return m;
		return gcd(n, m % n);
	}
}