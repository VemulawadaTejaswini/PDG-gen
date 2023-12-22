/*
 *created by Kraken on 04-04-2020 at 17:23
 */

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
		System.out.printf("%d %d %d\n", z, x, y);
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
				}
				catch (IOException e) {
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
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
