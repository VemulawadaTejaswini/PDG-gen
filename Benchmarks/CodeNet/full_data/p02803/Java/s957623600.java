import java.util.*;
import java.io.*;

public class Main {
	static final int MOD_PRIME = 1000000007;

	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Task solver = new Task();

		int i = 0;
		int t = 1;
		// t = in.nextInt();
		for (; i < t; i++)
			solver.solve(i, in, out);

		out.close();
	}

	static class Task {
		public void solve(int testNumber, InputReader in, PrintWriter out) {
			int h = in.nextInt();
			int w = in.nextInt();
			char[][] ar = new char[h][w];
			for (int i = 0; i < h; i++) {
				ar[i] = in.next().toCharArray();
			}
			int[] dir_x = { 1, 0, -1, 0 };
			int[] dir_y = { 0, 1, 0, -1 };

			int max_dist = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (available(ar, i, j)) {
						HashSet<Integer> vis = new HashSet<Integer>();
						vis.add(21 * i + j);

						LinkedList<Integer> queue = new LinkedList<Integer>();
						LinkedList<Integer> next = new LinkedList<Integer>();

						queue.add(21 * i + j);
						int dist = -1;
						while (!queue.isEmpty()) {
							while (!queue.isEmpty()) {
								int num = queue.remove();
								int x = num / 21;
								int y = num % 21;
								for (int dir = 0; dir < 4; dir++) {
									if (available(ar, x + dir_x[dir], y + dir_y[dir])
											&& !vis.contains(21 * (x + dir_x[dir]) + y + dir_y[dir])) {
										next.add(21 * (x + dir_x[dir]) + y + dir_y[dir]);
										vis.add(21 * (x + dir_x[dir]) + y + dir_y[dir]);
									}
								}
							}
							dist++;
							queue = next;
							next = new LinkedList<Integer>();
						}
						max_dist = Math.max(max_dist, dist);
					}
				}
			}
			
			out.println(max_dist);
		}

		boolean available(char[][] ar, int x, int y) {
			if (x < 0 || x >= ar.length)
				return false;
			if (y < 0 || y >= ar[0].length)
				return false;
			return ar[x][y] == '.';
		}
	}

// template code

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

	}

	static long modexp(long a, long b, long p) {
		// returns a to the power b mod p by modular exponentiation

		long res = 1;
		long mult = a % p;
		while (b > 0) {
			if (b % 2 == 1) {
				res = (res * mult) % p;
			}
			b /= 2;
			mult = (mult * mult) % p;
		}

		return res;
	}

	static double log(double arg, double base) {
		// returns log of a base b, contains floating point errors, dont use for exact
		// calculations.

		if (base < 0 || base == 1) {
			throw new ArithmeticException("base cant be 1 or negative");
		}
		if (arg < 0) {
			throw new ArithmeticException("log of negative number undefined");
		}
		return Math.log10(arg) / Math.log10(base);
	}

	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}

		return gcd(b, a % b);

	}

	static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}

		return gcd(b, a % b);

	}

	// scope for improvement
	static ArrayList<Integer> sieveOfEratosthenes(int n) {
		boolean[] check = new boolean[n + 1];
		ArrayList<Integer> prime = new ArrayList<Integer>();
		for (long i = 2; i <= n; i++) {
			if (!check[(int) i]) {
				prime.add((int) i);
				for (long j = i * i; j <= n; j += i) {
					check[(int) j] = true;
				}
			}
		}

		return prime;
	}

	static int modInverse(int a, int n) {
		// returns inverse of a mod n by extended euclidean algorithm
		int t = 0;
		int newt = 1;
		int r = n;
		int newr = a;
		int quotient;
		int tempr, tempt;
		while (newr != 0) {
			quotient = r / newr;
			tempt = newt;
			tempr = newr;
			newr = r - quotient * tempr;
			newt = t - quotient * tempt;
			t = tempt;
			r = tempr;
		}
		if (r > 1) {
			throw new ArithmeticException("inverse of " + a + " mod " + n + " does not exist");
		} else {
			if (t < 0) {
				t += n;
			}
			return t;
		}
	}

	static int primeModInverse(long a, long n) {
		// returns inverse of a mod n by mod exponentiation, use only if n is prime
		return (int) modexp(a, n - 2, n);
	}

	static void dfs(HashMap<Integer, ArrayList<Integer>> adj, Set<Integer> ans, Set<Integer> open,
			HashMap<String, Integer> edge, boolean[] vis, int i) {
		vis[i] = true;
		open.add(i);
		if (adj.get(i) != null) {
			for (int k : adj.get(i)) {
				if (!vis[k]) {
					dfs(adj, ans, open, edge, vis, k);
				} else if (open.contains(k)) {
					ans.add(edge.get(String.valueOf(i) + " " + String.valueOf(k)));
				}
			}
		}
		open.remove(i);
	}
}
