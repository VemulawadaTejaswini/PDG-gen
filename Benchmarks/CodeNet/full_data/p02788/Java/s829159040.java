import java.io.*;
import java.util.*;

public class Main {

	static int ceil(int x, int y) {

		return (x + y - 1) / y;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt(), d = sc.nextInt(), a = sc.nextInt();
		int[] x = new int[n], h = new int[n];
		Integer[] indices = new Integer[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			h[i] = sc.nextInt();
			indices[i] = i;
		}
		Arrays.sort(indices, Comparator.comparingInt(i -> x[i]));
		TreeMap<Long, Long> map = new TreeMap();
		long sum = 0, ans = 0;
		for (int i : indices) {
			while (!map.isEmpty()) {
				long before = map.firstKey();
				if (before > x[i])
					break;
				sum += map.get(before);
				map.remove(before);

			}
			h[i] = (int) Math.max(0, h[i] - sum);
			int add = ceil(h[i], a);
			long addVal = add * 1L * a;
			sum += addVal;
			ans += add;
			long r = x[i] + 0L + 2 * d;
			map.put(r + 1, map.getOrDefault(r + 1, (long) 0) - addVal);

		}
		out.println(ans);

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