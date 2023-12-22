/*
 *created by Kraken on 28-03-2020 at 17:05
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int x = sc.nextInt(), y = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		Long[] red = new Long[a], green = new Long[b], cless = new Long[c];
		for (int i = 0; i < a; i++) red[i] = sc.nextLong();
		for (int i = 0; i < b; i++) green[i] = sc.nextLong();
		for (int i = 0; i < c; i++) cless[i] = sc.nextLong();
		Arrays.sort(red, Comparator.reverseOrder()); Arrays.sort(green, Comparator.reverseOrder());
		ArrayList<Long> arr = new ArrayList<>();
		arr.addAll(Arrays.asList(red).subList(0, x));
		arr.addAll(Arrays.asList(green).subList(0, y));
		arr.addAll(Arrays.asList(cless));
		arr.sort(Comparator.reverseOrder());
		long res = 0;
		for (int i = 0; i < x + y; i++) res += arr.get(i);
		System.out.println(res);
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
