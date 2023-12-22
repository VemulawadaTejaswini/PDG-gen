import java.util.*;
import java.lang.*;

class Main {

	static class RollingHash {
		private final int mod1 = 100000007;
		private final int mod2 = 100000009;
		private final int base1 = 1007;
		private final int base2 = 2009;
		private List<Long> hash1 = new ArrayList<>();
		private List<Long> hash2 = new ArrayList<>();
		private List<Long> power1 = new ArrayList<>();
		private List<Long> power2 = new ArrayList<>();

		public RollingHash(String s) {
			long h1 = 0;
			long h2 = 0;
			long p1 = 1;
			long p2 = 1;
			hash1.add(h1);
			hash2.add(h2);
			power1.add(p1);
			power2.add(p2);
			for (int i = 0; i < s.length(); i++) {
				h1 = (h1 * base1 + s.charAt(i)) % mod1;
				h2 = (h2 * base2 + s.charAt(i)) % mod2;
				p1 = (p1 * base1) % mod1;
				p2 = (p2 * base2) % mod2;
				hash1.add(h1);
				hash2.add(h2);
				power1.add(p1);
				power2.add(p2);
			}
		}

		// Get LH of S[l:r]
		public List<Long> get(int l, int r) {
			long r1 = hash1.get(r) - hash1.get(l) * power1.get(r - l) % mod1;
			if (r1 < 0) r1 += mod1;
			long r2 = hash2.get(r) - hash2.get(l) * power2.get(r - l) % mod2;
			if (r2 < 0) r2 += mod2;
			return Arrays.asList(r1, r2);
		}


		// lCP of S[a:] and S[b:]
		public int lcp(int a, int b) {
			int l = 0, r = Math.min(hash1.size() - a, hash1.size() - b);
			while (r - l > 1) {
				int m = (l + r) / 2;
				if (get(a, a + m).equals(get(b, b + m))) l = m;
				else r = m;
			}
			return l;
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		RollingHash rollingHash = new RollingHash(s);

		int answer = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int lcp = rollingHash.lcp(i, j);
				lcp = Math.min(lcp, j - i);
				answer = Math.max(answer, lcp);
			}
		}

		System.out.println(answer);
	}
}
