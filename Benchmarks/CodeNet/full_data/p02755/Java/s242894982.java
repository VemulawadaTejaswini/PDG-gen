import java.util.*;

import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken());
		long a = Long.parseLong(st.nextToken());

		int x = (int) (n * 100 / 8);
		int y = (int) (a * 10);
		int ans = -1;
		for (int i = Math.min(x, y); i < 10000; i++) {
			if (i / 10 == a && (int) (i * .08) == n) {
				ans = i;
				break;
			}
		}
		pw.println(ans);

		pw.println();
		pw.flush();

	}

	static class triple implements Comparable<triple> {
		int x;
		int y;
		int z;

		public triple(int a, int b, int c) {
			x = a;
			y = b;
			z = c;
		}

		@Override
		public int compareTo(triple o) {
			// TODO Auto-generated method stub
			return x - o.x;
		}
	}

	static long gcd(long a, long b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	static long lcm(long a, long b) {
		return a / gcd(a, b) * b;
	}

	static class SegmentTree { // 1-based DS, OOP

		int N; // the number of elements in the array as a power of 2 (i.e. after padding)
		long[] array, sTree, lazy;

		SegmentTree(long[] in) {
			array = in;
			N = in.length - 1;
			sTree = new long[N << 1];
			Arrays.fill(sTree, 1);// no. of nodes = 2*N - 1, we add one to cross out index zero
			lazy = new long[N << 1];
			build(1, 1, N);
		}

		void build(int node, int b, int e) // O(n)
		{
			if (b == e)
				sTree[node] = array[b];
			else {
				int mid = b + e >> 1;
				build(node << 1, b, mid);
				build(node << 1 | 1, mid + 1, e);
				sTree[node] = lcm(sTree[node << 1], sTree[node << 1 | 1]);
			}
		}

		void update_point(int index, int val) // O(log n)
		{
			index += N - 1;
			sTree[index] += val;
			while (index > 1) {
				index >>= 1;
				sTree[index] = sTree[index << 1] + sTree[index << 1 | 1];
			}
		}

		void update_range(int i, int j, int val) // O(log n)
		{
			update_range(1, 1, N, i, j, val);
		}

		void update_range(int node, int b, int e, int i, int j, int val) {
			if (i > e || j < b)
				return;
			if (b >= i && e <= j) {
				sTree[node] += (e - b + 1) * val;
				lazy[node] += val;
			} else {
				int mid = b + e >> 1;
				propagate(node, b, mid, e);
				update_range(node << 1, b, mid, i, j, val);
				update_range(node << 1 | 1, mid + 1, e, i, j, val);
				sTree[node] = sTree[node << 1] + sTree[node << 1 | 1];
			}

		}

		void propagate(int node, int b, int mid, int e) {
			lazy[node << 1] += lazy[node];
			lazy[node << 1 | 1] += lazy[node];
			sTree[node << 1] += (mid - b + 1) * lazy[node];
			sTree[node << 1 | 1] += (e - mid) * lazy[node];
			lazy[node] = 0;
		}

		long query(int i, int j) {
			return query(1, 1, N, i, j);
		}

		long query(int node, int b, int e, int i, int j) // O(log n)
		{
			if (i > e || j < b)
				return 1;
			if (b >= i && e <= j)
				return sTree[node];
			int mid = b + e >> 1;
			long q1 = query(node << 1, b, mid, i, j);
			long q2 = query(node << 1 | 1, mid + 1, e, i, j);
			return lcm(q1, q2);

		}

	}

	static int[][] z;
	static int[] memo;

	static int dp(int s) {
		if (s == z.length)
			return 0;
		if (memo[s] != -1)
			return memo[s];
		int max = 0;
		for (int i = s; i < z.length; i++) {
			if (z[s][i] == 1) {
				if (i == z.length - 1)
					max = Math.max(max, 1 + dp(i + 1));
				else if (z[i + 1][z.length - 1] == 1)
					max = Math.max(max, 1 + dp(i + 1));
			}
		}
		return memo[s] = max;
	}

	static class pair implements Comparable<pair> {
		int x;
		int y;

		public pair(int d, int u) {
			x = d;
			y = u;
		}

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			return o.x - x;
		}

	}

}
