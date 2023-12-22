import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {


	static long f(long b,long[] arr) {
		long sum = 0;
		for (int i = 0 ; i < arr.length ; ++i) {
			sum += Math.abs(arr[i] - (b + i + 1));
		}
		return sum;
	}
	public static void main(String[]args) throws Throwable {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();

		long arr[] = new long[n];
		for (int i = 0 ; i < n ; ++i) {
			arr[i] = sc.nextLong();
		}
		
		long left = -1L << 35, right = 1L << 35; // set your range
		while (right-left > 3) { // We need 4 different positions
			long g = left + (right - left) / 3, h = left + 2 * (right - left) / 3;

			if (f(g,arr) < f(h,arr)) // use > if f increase then decrease
				right = h;
			else
				left = g;
		}

		long solIdx = left, answer = f(left++,arr);
		for (long i = left; i <= right; ++i)	// iterate on the remaining
			if(answer > f(i,arr)) {
				answer = f(i,arr);
			}

		out.println(answer);
		out.flush();
		out.close();
	}
	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(String s) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(new File(s)));
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

		public boolean ready() throws IOException {
			return br.ready();
		}
	}
}