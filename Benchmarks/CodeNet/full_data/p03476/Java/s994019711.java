

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.*;

public class Main {

	static long tree[];
	static long arr[];

	public static void buildtree(int ss, int se, int idx) {
		// System.out.println(ss+" "+se+" "+idx);
		if (ss == se) {

			if (isPrime(arr[ss]) && isPrime((arr[ss]+1)/2))
				tree[idx] = 1;
			else
				tree[idx] = 0;
			return;
		}
		int mid = (ss + se) / 2;
		buildtree(ss, mid, idx * 2);
		buildtree(mid + 1, se, idx * 2 + 1);

		tree[idx] = tree[idx * 2] + tree[idx * 2 + 1];

	}

	public static void update(int ss, int se, int i, int inc, int idx) {
		if (ss > se || ss > i || se < i) {
			return;
		}
		if (ss == se) {

			tree[idx] = inc;
			return;
		}
		int mid = (ss + se) / 2;
		update(ss, mid, i, inc, idx * 2);
		update(mid + 1, se, i, inc, idx * 2 + 1);

		tree[idx] = tree[idx * 2] + tree[idx * 2 + 1];

	}

	static int max(int node, int start, int end, int l, int r) {

		if (r < start || end < l) {
			return 0;
		}
		if (l <= start && end <= r) {
			// range represented by a node is completely inside the given range
			return (int) tree[node];
		}
		// range represented by a node is partially inside and partially outside
		// the given range
		int mid = (start + end) / 2;
		int p1 = max(2 * node, start, mid, l, r);
		int p2 = max(2 * node + 1, mid + 1, end, l, r);
		return p1 + p2;

	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int n = 100008;
		arr = new long[n];
		tree = new long[n << 2];
		for (int i = 0; i < n; i++) {
			arr[i] = i;
		}
		buildtree(0, n - 1, 1);
		int q = sc.nextInt();
		while (q-- > 0) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			pr.println(max(1, 0, n - 1, l, r));
		}
		for(int i=1;i<n;i++)
		{
	//		System.out.println(i+" "+tree[i]);
		}
		pr.close();
		pr.flush();
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

	static boolean isPrime(long arr2) {
		// Corner cases
		if (arr2 <= 1)
			return false;
		if (arr2 <= 3)
			return true;

		// This is checked so that we can skip
		// middle five numbers in below loop
		if (arr2 % 2 == 0 || arr2 % 3 == 0)
			return false;

		for (int i = 5; i * i <= arr2; i = i + 6)
			if (arr2 % i == 0 || arr2 % (i + 2) == 0)
				return false;

		return true;
	}
}
