import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		InputReader in = new InputReader();
		int n = in.nextInt();
		
		int[] arr = new int[n];
		for (int i=0; i<n; i++)
			arr[i] = in.nextInt();
		
		long res = Long.MAX_VALUE;
		for (int i=-100; i<=100; i++) {
			long cost = 0;
			for (int j=0; j<n; j++)
				cost += (arr[j]-i)*(arr[j]-i);
			res = Math.min(res, cost);
		}
		System.out.println(res);
	}

	static class InputReader {
		public BufferedReader br;
		public StringTokenizer st;
		
		public InputReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = null;
		}
		
		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
	}
}