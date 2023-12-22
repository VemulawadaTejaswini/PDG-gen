import java.io.*;
import java.util.*;

public class Main {
	static FastReader scan;
	static PrintWriter out;

	public static void main(String[] args) throws FileNotFoundException {
		Solver solver = new Solver();
		scan = new FastReader();
		out = new PrintWriter(System.out);
		int testCases = 1;
		for(int i = 1; i <= testCases; i++) {
//			out.print("Case #" + i + ": ");
			solver.solve();	
		}
		out.close();
	}

	static class Solver {
		
		void solve() {
			String s = scan.next();
			int[] c = new int[s.length()];
			Arrays.fill(c, 1);
			for(int i = 0; i < 10; i++) {
				int[] temp = Arrays.copyOf(c, c.length);
				for(int j = 0; j < s.length(); j++) {
					if(s.charAt(j) == 'R') temp[j+1] += c[j];
					else temp[j-1] += c[j];
					temp[j]-=c[j];
				}
				c = Arrays.copyOf(temp, temp.length);
			}
			for(int i : c) out.print(i + " ");
		}
		
	}

	// Sathvik's Template Stuff BELOW!!!!!!!!!!!!!!!!!!!!!!

	static class DSU {
		int[] root, size;
		int n;

		DSU(int n) {
			this.n = n;
			root = new int[n];
			size = new int[n];
			for (int i = 0; i < n; i++) {
				root[i] = i;
				size[i] = 1;
			}
		}

		int findParent(int idx) {
			while (root[idx] != idx) {
				root[idx] = root[root[idx]];
				idx = root[idx];
			}
			return idx;
		}

		boolean union(int x, int y) {
			int parX = findParent(x);
			int parY = findParent(y);
			if (parX == parY)
				return false;
			if (size[parX] < size[parY]) {
				root[parY] = parX;
				size[parX] += size[parY];
			} else {
				root[parX] = parY;
				size[parY] += size[parX];
			}
			return true;
		}
	}

	static class Extra {
		static void sort(int[] a) {
			Integer[] aa = new Integer[a.length];
			for (int i = 0; i < aa.length; i++)
				aa[i] = a[i];
			Arrays.sort(aa);
			for (int i = 0; i < aa.length; i++)
				a[i] = aa[i];
		}

		static void sort(long[] a) {
			Long[] aa = new Long[a.length];
			for (int i = 0; i < aa.length; i++)
				aa[i] = a[i];
			Arrays.sort(aa);
			for (int i = 0; i < aa.length; i++)
				a[i] = aa[i];
		}

		static void sort(double[] a) {
			Double[] aa = new Double[a.length];
			for (int i = 0; i < aa.length; i++)
				aa[i] = a[i];
			Arrays.sort(aa);
			for (int i = 0; i < aa.length; i++)
				a[i] = aa[i];
		}

		static void sort(char[] a) {
			Character[] aa = new Character[a.length];
			for (int i = 0; i < aa.length; i++)
				aa[i] = a[i];
			Arrays.sort(aa);
			for (int i = 0; i < aa.length; i++)
				a[i] = aa[i];
		}

		static long gcd(long a, long b) {
			while (b > 0) {
				long temp = b;
				b = a % b;
				a = temp;
			}
			return a;
		}

		static long lcm(long a, long b) {
			return a * (b / gcd(a, b));
		}

		static boolean isPrime(long n) {
			if (n <= 1)
				return false;
			if (n <= 3)
				return true;
			if (n % 2 == 0 || n % 3 == 0)
				return false;
			for (long i = 5; i * i <= n; i = i + 6) {
				if (n % i == 0 || n % (i + 2) == 0)
					return false;
			}
			return true;
		}
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		public FastReader(String s) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(new File(s)));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] a = new double[n];
			for (int i = 0; i < n; i++)
				a[i] = nextDouble();
			return a;
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

}