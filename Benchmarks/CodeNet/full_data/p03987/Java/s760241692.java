import java.io.*;
import java.util.*;

public class Main {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;

	void solve() throws IOException {
		int n = nextInt();
		
		int[] pos = new int[n];
		
		for (int i = 1; i <= n; i++) {
			pos[nextInt() - 1] = i;
		}
		
		int[] left = new int[n + 2];
		int[] right = new int[n + 2];
		Arrays.fill(left, -1);
		Arrays.fill(right, -1);
		
		long ans = 0;
		
		for (int i = n - 1; i >= 0; i--) {
			int x = pos[i];
			int newLeft = (left[x - 1] == -1 ? x : left[x - 1]);
			int newRight = (right[x + 1] == -1 ? x : right[x + 1]);
			
//			System.err.println(newLeft + " " + newRight);
			
			
			
			ans += (long)(i + 1) * (newRight - x + 1) * (x - newLeft + 1);
			left[newRight] = newLeft;
			right[newLeft] = newRight;
		}
		
		out.println(ans);
	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (Exception e) {
				eof = true;
				return null;
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			eof = true;
			return null;
		}
	}

	int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}
}