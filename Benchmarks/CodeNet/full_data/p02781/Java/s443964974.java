import java.util.*;
import java.io.*;
import java.math.BigInteger;
import java.text.*;

public class Main {

	static char[] arr;

	public static long solve(int idx, int less, int rem) {
		if (rem < 0)
			return 0;
		if (idx == arr.length)
			return rem == 0 ? 1 : 0;
		if (less == 1) {
			long ans = 0;
			ans += solve(idx + 1, less, rem);
			for (int i = 1; i <= 9; i++) {
				ans += solve(idx + 1, less, rem - 1);
			}
			return ans;
		} else {
			long ans = 0;
			ans += (solve(idx + 1, 1, rem));
			for (char i = '1'; i < arr[idx]; i++) {
				ans += (solve(idx + 1, 1, rem - 1));
			}
			ans += (solve(idx + 1, 0, rem - 1));
			return ans;
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		arr = sc.next().toCharArray();
		int k = sc.nextInt();
		pw.println(solve(0, 0, k));
		pw.close();
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(FileReader r) {
			br = new BufferedReader(r);
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

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public int[] nextIntArr(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++)
				arr[i] = nextInt();
			return arr;
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

	}
}
