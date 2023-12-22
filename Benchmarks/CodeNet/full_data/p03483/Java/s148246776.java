
import java.io.*;
import java.util.*;;

public class Main{
	static int N = 200200;
	static int F[];
	static List<Integer> g[];
	static int a[], b[];
	static int n;

	public static int sum(int x) {
		int res = 0;
		for (; x > 0; x -= x & -x) {

			res += b[x];
		}
		return res;
	}

	public static void update(int x) {
		for (; x <= n; x += x & -x) {
			b[x]++;
		}
	}

	public static void main(String args[]) throws Exception {
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		String s = sc.next();
		n = s.length();
		F = new int[N];
		a = new int[N];
		b = new int[N];
		g = new LinkedList[26];
		for (int i = 0; i < 26; i++) {
			g[i] = new LinkedList<>();
		}

		for (int i = 0; i < s.length(); i++) {
			g[s.charAt(i) - 'a'].add(i);
		}
		int id = -1;
		for (int i = 0; i < 26; i++) {
			if (g[i].size() % 2 == 1) {
				if (id != -1) {
					System.out.println(-1);
					return;
				}
				id = i;
			}
		}
		for (int c = 0; c < 26; c++) {
			for (int i = 0; i < g[c].size(); ++i) {
				a[g[c].get(i)] = g[c].get(g[c].size() - i - 1);
			}
		}
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			a[i]++;
			ans += sum(a[i]);
			update(a[i]);
		}
		out.println(ans / 2);
		out.close();

	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
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

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
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
