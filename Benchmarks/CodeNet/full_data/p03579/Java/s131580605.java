import java.io.*;
import java.util.*;

public class Main {

	int[] next;
	int[] head;
	int[] to;
	
	int[] color;
	
	int c1, c2;
	
	void submit() {
		int n = nextInt();
		int m = nextInt();
		
		head = new int[n];
		Arrays.fill(head, -1);
		next = new int[2 * m];
		to = new int[2 * m];
		
		for (int i = 0; i < m;i++) {
			int v = nextInt() - 1;
			int u = nextInt() - 1;
			to[2 * i] = u;
			next[2 * i] = head[v];
			head[v] = 2 * i;
			
			to[2 * i + 1] = v;
			next[2 * i + 1] = head[u];
			head[u] = 2 * i + 1;
		}
		
		color = new int[n];
		
		long ans = -m;
		
		for (int i = 0; i < n; i++) {
			if (color[i] == 0) {
				c1 = c2 = 0;
				if (dfs(i, 1)) {
					ans += (long)c1 * c2;
				} else {
					ans += (long)(c1 + c2) * (c1 + c2 - 1) / 2;
				}
			}
		}
		out.println(ans);
	}
	
	boolean dfs(int v, int col) {
		if (col == 1) {
			c1++;
		} else {
			c2++;
		}
		color[v] = col;
		boolean ret = true;
		for (int e = head[v]; e >= 0; e = next[e]) {
			int u = to[e];
			if (color[u] == 0) {
				ret &= dfs(u, 3 - col);
			} else if (color[u] == col) {
				ret = false;
			}
		}
		return ret;
	}

	void preCalc() {

	}

	void stress() {

	}

	void test() {

	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		preCalc();
		submit();
		//stress();
		//test();
		out.close();
	}

	static final Random rng = new Random();

	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	int nextInt() {
		return Integer.parseInt(nextToken());
	}

	long nextLong() {
		return Long.parseLong(nextToken());
	}

	double nextDouble() {
		return Double.parseDouble(nextToken());
	}
}
