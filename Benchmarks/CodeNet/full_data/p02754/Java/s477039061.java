import java.util.*;

import java.io.*;

public class Main {

	static int n;
	static long memo[][];
	static int p;
	static int pl[][];
	static pair[] a;
	static int k;

	public static long dp(int msk, int idx) {
		if (idx == n)
			return 0;
		if (memo[msk][idx] != -1)
			return memo[msk][idx];
		long max = k - (idx - Integer.bitCount(msk)) > 0 ? dp(msk, idx + 1) + a[idx].x : dp(msk, idx + 1);

		for (int i = 0; i < p; i++) {
			if (((msk >> i) & 1) == 0) {
				max = Math.max(max, pl[a[idx].y][i] + dp(msk | 1 << i, idx + 1));
			}
		}
		return memo[msk][idx] = max;

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n=Long.parseLong(st.nextToken());
		long a=Long.parseLong(st.nextToken());
		long b=Long.parseLong(st.nextToken());
		long g=n/(a+b);
		long x=n%(a+b);
		System.out.println(g*a+Math.min(a,x));		
	}
	

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	static class pair {
		int x;
		int y;

		pair(int r, int t) {
			x = r;
			y = t;
		}

		public String toString() {
			return "(" + x + "," + y + ")";
		}

	}
}