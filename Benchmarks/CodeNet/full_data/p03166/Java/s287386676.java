import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Built using CHelper plug-in Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputReader in = new InputReader(System.in);
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), true);
		TaskB solver = new TaskB();
		solver.solve(1, in, out);
		out.flush();
		out.close();
	}
}

class Pair<A, B> {
	A first;
	B second;

	Pair(A first, B second) {
		this.first = first;
		this.second = second;
	}

}

class TaskB {
	static int MAX_N = (int) 1e5 + 5;
	boolean visited[];
	ArrayList<Integer> edges[];
	int in_degree[];
	int dp[];

	void dfs(int s) {
		visited[s] = true;
		for (int i : edges[s]) {
			in_degree[i]--;
			dp[i] = Math.max(dp[i], dp[s] + 1);
			if (in_degree[i] == 0) {
				dfs(i);
			}
		}
	}

	public void solve(int testNumber, InputReader in, PrintWriter pw) {
		int N = in.nextInt();
		int M = in.nextInt();
		dp = new int[MAX_N];
		Arrays.fill(dp, 0);
		edges = new ArrayList[MAX_N];
		Arrays.setAll(edges, i -> new ArrayList<Integer>());
		visited = new boolean[MAX_N];
		in_degree = new int[MAX_N];
		for (int i = 0; i < M; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			edges[a].add(b);
			in_degree[b]++;
		}
		for (int i = 1; i <= N; i++) {
			if (!visited[i] && in_degree[i] == 0) {
				dfs(i);
			}
		}
		int ans = -1;
		for (int i = 1; i <= N; i++) {
			ans = Math.max(dp[i], ans);
		}
		pw.println(ans);
	}

	boolean FirstRow_Col(Pair<Integer, Integer> pair) {
		return pair.first == 0 || pair.second == 0;
	}

	int __gcd(int a, int b) {
		if (b == 0)
			return a;
		return __gcd(b, a % b);

	}

	public int getInt(int num) {
		int ret = -1;
		switch (num) {
		case 0:
			ret = 6;
			break;
		case 1:
			ret = 2;
			break;
		case 2:
			ret = 5;
			break;
		case 3:
			ret = 5;
			break;
		case 4:
			ret = 4;
			break;
		case 5:
			ret = 5;
			break;
		case 6:
			ret = 6;
			break;
		case 7:
			ret = 3;
			break;
		case 8:
			ret = 7;
			break;
		case 9:
			ret = 6;
			break;
		}
		return ret;
	}

	public int isPow(long num) {
		int count = 0;
		while (num > 0) {
			num /= 2;
			count++;
		}
		return count;
	}
}

class InputReader {
	BufferedReader br;
	StringTokenizer st;

	public InputReader(InputStream in) {
		br = new BufferedReader(new InputStreamReader(in));
		st = null;
	}

	public String next() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
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
