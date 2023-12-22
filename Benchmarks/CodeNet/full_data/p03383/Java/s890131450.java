import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int h = sc.nextInt(), w = sc.nextInt();
		int[] cnt = new int[26];
		for (int i = 0; i < h; i++)
			for (char c : sc.next().toCharArray()) {
				cnt[c - 'a']++;
			}

		int[] par = new int[2];
		for (int x : cnt) {
			par[x % 2]++;
		}
		if ((h * w) % 2 == 1) {
			if (par[1] == 1) {
				pw.println("YES");
			} else {
				pw.println("NO");
			}
		} else {
			if (par[1] == 0) {
				pw.println("YES");
			} else {
				pw.println("NO");
			}
		}
		pw.close();

	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(FileReader f) {
			br = new BufferedReader(f);
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public int[] nextIntArr(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(next());
			}
			return arr;
		}

	}

}
