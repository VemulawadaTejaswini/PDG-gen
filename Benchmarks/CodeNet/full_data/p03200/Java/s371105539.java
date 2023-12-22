import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		LScanner sc=new LScanner(System.in);
		String s=sc.next();
		long sum=0;
		long w_ks=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='W') {
				sum+=i;
				w_ks++;
			}
		}
		System.out.println(sum-w_ks*(w_ks-1)/2);
	}

	static class LScanner {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public LScanner(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
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
	}
}