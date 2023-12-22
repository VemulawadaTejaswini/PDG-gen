import java.io.*;
import java.util.*;

public class Main {

	static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	static int MOD = (int) 1e9 + 7;

	static int pow(long b, int e) {
		long ans = 1;
		while (e > 0) {
			if (e % 2 == 1)
				ans = ans * b % MOD;
			e >>= 1;
			b = b * b % MOD;
		}
		return (int) ans;
	}

	static int N = (int) 1e6 + 2;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int[] cnt = new int[N];
		for (int x : a) {

			for (int d = 2; d * d <= x; d++) {
				int c = 0;
				while (x % d == 0) {
					x /= d;
					c++;
				}
				cnt[d] = Math.max(cnt[d], c);
			}
			if (x > 1 && cnt[x] == 0)
				cnt[x] = 1;
		}
		long lcm = 1;
		for (int i = 1; i < N; i++)
			lcm = lcm * pow(i, cnt[i]) % MOD;
		int ans = 0;
		for (int x : a) {
			ans += lcm * pow(x, MOD - 2) % MOD;
			ans %= MOD;
		}
		System.out.println(ans);
		out.close();

	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		Scanner(String fileName) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(fileName));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		String nextLine() throws IOException {
			return br.readLine();
		}

		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		boolean ready() throws IOException {
			return br.ready();
		}

	}

	static void sort(int[] a) {
		shuffle(a);
		Arrays.sort(a);
	}

	static void shuffle(int[] a) {
		int n = a.length;
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			int tmpIdx = rand.nextInt(n);
			int tmp = a[i];
			a[i] = a[tmpIdx];
			a[tmpIdx] = tmp;
		}
	}

}