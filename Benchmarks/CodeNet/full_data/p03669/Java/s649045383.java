import java.io.*;
import java.util.*;

public class Main {

	int[] deg;
	
	void addEdge(int v, int u) {
//		System.err.println(v + " " + u);
		deg[v]--;
		deg[u]++;
	}
	
	void submit() {
		int n = nextInt();
		int h = nextInt();
		
		deg = new int[2 * (h + 1)];
		
		
		for (int i = 0; i < n; i++) {
			int a = nextInt();
			int b = nextInt();
			int c = nextInt();
			int d = nextInt();
			
			int from;
			if (c == 0) {
				from = h + 1 + a;
			} else {
				from = c;
			}
			
			int to;
			if (d == 0) {
				to = b;
			} else {
				to = h + 1 + d;
			}
			
			addEdge(from, to);
		}
		
		boolean allZero = false;
		for (int x : deg) {
			allZero &= x == 0;
		}
		
		if (allZero) {
			out.println("NO");
			return;
		}
		
		for (int i = 0; i <= h; i++) {
			if (deg[i] < 0) {
				out.println("NO");
				return;
			}
		}
		
		for (int i = h + 1; i <= 2 * h + 1; i++) {
			if (deg[i] > 0) {
				out.println("NO");
				return;
			}
		}
		
		out.println("YES");
		
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
