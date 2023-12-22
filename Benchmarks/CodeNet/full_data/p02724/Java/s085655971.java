/*
 *created by Kraken on 28-03-2020 at 17:05
 */
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		long in = sc.nextLong();
		long c500 = in / 500;
		long c5 = (in % 500) / 5;
		System.out.println((c500 * 1000) + (c5 * 5));
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
