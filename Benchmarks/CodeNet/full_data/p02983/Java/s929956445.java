import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		InputReader in = new InputReader();
		int l = in.nextInt();
		int r = in.nextInt();
		int n = r-l+1;
		if (n > 2020) {
			System.out.println(0);
			return;
		}
		int[] arr = new int[n];
		for (int i=l; i<=r; i++)
			arr[i-l] = i;
		long res = Long.MAX_VALUE;
		for (int i=l; i<r; i++) {
			for (int j=i+1; j<=r; j++) {
				res = Math.min(res, ((long)i*j)%2019);
			}
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