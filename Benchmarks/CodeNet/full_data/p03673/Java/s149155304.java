import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		FastScanner in = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n= in.nextInt();
		int [] a= new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]= in.nextInt();
		}
		int [] b= new int[n];
		int midodd= n/2;
		int midev= n/2;
		if(n%2==0){
			for (int i = 0; i < b.length; i++) {
				if(i%2!=0){
					midodd--;
					b[midodd]= a[i];
				}
				else{
					b[midev]= a[i];
					midev++;
				}
			}
		}
		else{
			for (int i = 0; i < b.length; i++) {
				if(i%2!=0){
					midev++;
					b[midev]= a[i];
				}
				else{
					b[midodd]= a[i];
					midodd--;
				}
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			out.print(b[i]+" ");
		}
		out.close();
		
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

