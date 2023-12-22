
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static class Reader {

		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public Reader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

	}

	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Reader sn = new Reader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		int n = sn.nextInt();
		int a[] = new int[n];
		int s=0;
		for(int i=0; i<n; i++){
			a[i] = sn.nextInt();
			s+=a[i];
		}
		if(n!=2){
			for(int i=1; i<n; i++){
				a[i] = a[i]+a[i-1];
			}
			int res=Integer.MAX_VALUE;
			for(int i=0; i<n; i++){
				
				int aux = Math.abs(s-a[i]);
				res = Math.min(res,Math.abs(aux-a[i]));
			}
			out.println(res);
		}
		else{
			out.println(Math.abs(a[0]-a[1]));
		}
		
		out.close();
	}

}