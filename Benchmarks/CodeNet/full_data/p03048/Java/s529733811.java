import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int R=sc.nextInt();
		int G=sc.nextInt();
		int B=sc.nextInt();
		int N=sc.nextInt();
		long ans=0;
		for(int i=0; i<=3000; i++) {
			for(int j=0; j<=3000; j++) {
				int rest=N-R*i-G*j;
				if(rest>=0&& rest%B==0) {
					ans++;
				}
			}
		}
		pl(ans);
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
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
	public static void pl(Object o) {
		System.out.println(o);
	}
}