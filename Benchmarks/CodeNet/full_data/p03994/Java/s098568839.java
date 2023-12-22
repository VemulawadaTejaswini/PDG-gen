import java.io.*;
import java.util.*;

public class Main {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;
	
	char getChar(int k) {
		return (char)('a' + k);
	}

	void solve() throws IOException {
		String s = nextToken();
		int k = nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < s.length() - 1; i++) {
			int cur = s.charAt(i) - 'a';
			if (cur == 0) {
				sb.append('a');
				continue;
			}
			int toA = 26 - cur;
			if (k >= toA) {
				k -= toA;
				sb.append('a');
			} else {
				sb.append(getChar(cur));
			}
		}
		
		k %= 26;
		int cur = s.charAt(s.length() - 1) - 'a';
		cur = (cur + k) % 26;
		sb.append(getChar(cur));
		out.println(sb.toString());
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