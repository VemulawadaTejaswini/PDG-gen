import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		FastScanner in = new FastScanner(System.in);
		int n= in.nextInt();
		long [] a= new long [n];
		long sum=0;
		for (int i = 0; i < a.length; i++) {
			a[i]= in.nextInt();
			sum+= a[i];
		}
		Arrays.sort(a);
		if(sum%10!=0){
			System.out.println(sum);
			return;
		}
		for (int i = 0; i < a.length; i++) {
			sum-=a[i];
			if(sum%10!=0){
				System.out.println(sum);
				return;
			}
			sum+= a[i];
		}
		System.out.println(0);
		
	}
	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
			st = new StringTokenizer("");
		}

		public double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		public String next() throws IOException {
			if (!st.hasMoreTokens()) {
				st = new StringTokenizer(br.readLine());
				return next();
			}
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
	}
}
