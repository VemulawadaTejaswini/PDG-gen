

import java.util.*;
import java.io.*;


public class Main {
	static FastReader in = new FastReader();

	public static void main(String[] args) {
		solve();
	}

	static int n;
	
	static void solve() {
		n = in.nextInt();
		int[][] arr = new int[n][3];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < 3; j++) arr[i][j] = in.nextInt();
		}
		
		int curr = 0;
		find(arr, -1, curr, 0);
		
		System.out.println(max);
	}
	
	static int max = 0;
	
	static void find(int[][] arr, int last, int curr, int x)
	{
		if(x == n) return; 
		for(int i = 0; i < 3; i++)
		{
			if(i == last) continue;
			max = Math.max(max, curr + arr[x][i]);
			find(arr, i, curr + arr[x][i], x + 1);
		}
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

		int[] readarr(int abc) {
			int[] a = new int[abc];
			for (int i = 0; i < abc; i++)
				a[i] = nextInt();
			return a;
		}
	}
}
