import java.util.*;
import java.io.*;

public class Main {

	long mod = 1000000007;
	int MAX = 600000;
	long[] fact = new long[MAX];

	void precalc() {
		fact[0] = 1;
		for (int i = 1; i < MAX; i++) {
			fact[i] = fact[i - 1] * i % mod;
		}
	}

	void solve() {
		precalc();
		int n = in.nextInt();
		int[] p = new int[n];
		TreeSet<Integer> free = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			free.add(i);
		}
		for (int i = 0; i < n; i++) {
			p[i] = in.nextInt() - 1;
			if (p[i] != -1) {
				free.remove(p[i]);
			}
		}

		int[] all = new int[free.size()];
		int numFree = 0;
		for (int i : free) {
			all[numFree++] = i;
		}
		
		long result = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (p[i] == -1 && p[j] == -1) {
					long add = 1L * numFree * (numFree - 1) / 2 % mod * fact[n - i - 1] % mod * fact[numFree - 2] % mod;
					result = (result + add) % mod;
				} else if (p[i] == -1) {
					long add = 1L * (numFree - findLess(all, p[j])) * fact[n - i - 1] * fact[numFree - 1] % mod;
					result = (result + add) % mod;
				} else if (p[j] == -1) {
					long add = 1L * findLess(all, p[i]) * fact[n - i - 1] % mod * fact[numFree - 1] % mod;
					result = (result + add) % mod;
				} else {
					if (p[i] > p[j]) {
						result = (result + fact[n - i - 1] * fact[numFree]) % mod;
					}
				}
			}
		}
		out.println((result + fact[numFree]) % mod);
	}

	int findLess(int[] a, int i) {
		int pos = Arrays.binarySearch(a, i);
//		System.err.println(i + " " + pos);
		return -pos - 1;
	}

	FastScanner in;
	PrintWriter out;

	void run() {
		in = new FastScanner();
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public String nextToken() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
