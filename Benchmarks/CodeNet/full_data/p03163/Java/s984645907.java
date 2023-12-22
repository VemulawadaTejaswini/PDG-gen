package Knapsack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Knapsack {
	static int n;
	static int w;
	static int[] value;
	static int[] weight;
	static long[][] dp;

	public static long knapsack(int idx, int rweight) {
		if (rweight < 0) {
			return -(int) 1e9;
		}
		if (idx == n) {
			return 0;
		}
		if (dp[idx][rweight] != -1) {
			return dp[idx][rweight];
		}
		long take = value[idx] + knapsack(idx + 1, rweight - weight[idx]);
		long leave = knapsack(idx + 1, rweight);
		return dp[idx][rweight] = Math.max(take, leave);
	}

	public static void main(String[] args) throws IOException {

		PrintWriter out = new PrintWriter(System.out);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		value = new int[n];
		weight = new int[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			weight[i] = Integer.parseInt(st.nextToken());
			value[i] = Integer.parseInt(st.nextToken());
		}
		dp = new long[n][w + 1];
		for (long[] i : dp) {
			Arrays.fill(i, -1);
		}
		out.println(knapsack(0, w));
		out.close();

	}
}
