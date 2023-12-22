import java.util.*;
import java.io.*;

public class Darker {
	static BufferedReader br;
	static StringTokenizer tokenizer;
	static int[] xOff = {0, 0, 1, -1};
	static int[] yOff = {1, -1, 0, 0};
	public static void main(String[] args) throws Exception {
		br = new BufferedReader(new InputStreamReader(System.in));
		int n = nextInt();
		int m = nextInt();
		boolean[][] black = new boolean[n][m];
		Queue<Integer> rQ = new ArrayDeque<Integer>();
		Queue<Integer> cQ = new ArrayDeque<Integer>();
		int curr = 0, next = 0, ans = 0;
		for(int i = 0; i < n; i++) {
			String t = next();
			for(int k = 0; k < m; k++) {
				black[i][k] = t.charAt(k) == '#';
				if(black[i][k]) {
					curr++;
					rQ.add(i);
					cQ.add(k);
				}
			}
		}
		while(!rQ.isEmpty()) {
			if(curr == 0) {
				curr = next;
				next = 0;
				ans++;
			}
			curr--;
			int r = rQ.poll();
			int c = cQ.poll();
			for(int i = 0; i < 4; i++) {
				if(r + xOff[i] >= 0 && r + xOff[i] < n && c + yOff[i] >= 0 && c + yOff[i] < m && !black[r + xOff[i]][c + yOff[i]]) {
					next++;
					black[r + xOff[i]][c + yOff[i]] = true;
					rQ.add(r + xOff[i]);
					cQ.add(c + yOff[i]);
				}
			}
		}
		System.out.println(ans);

	}

	public static String next() throws IOException {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			String line = br.readLine();
			if (line == null)
				throw new IOException();
			tokenizer = new StringTokenizer(line);
		}
		return tokenizer.nextToken();
	}

	public static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public static long nextLong() throws IOException {
		return Long.parseLong(next());
	}

	public static double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}
}
