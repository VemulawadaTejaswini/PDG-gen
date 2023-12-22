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
			arr[i-l] = i % 2019;
		
		Arrays.sort(arr);
		System.out.println((arr[0]*arr[1])%2019);
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