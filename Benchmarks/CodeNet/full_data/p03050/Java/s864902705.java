import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		long N=sc.nextLong();
		long max=0;
		for(long i=0; i*i<=N; i++) {
			max++;
		}
		long ans=0;
		for(long i=max; i>=1; i--) {
			if(N-i>0) {
				if((N-i)%i==0 && N%((N-i)/i)!=0 && (N/((N-i)/i)==N%((N-i)/i))) {
					ans+=((N-i)/i);
					//pl((N-i)/i);
				}
			}
		}
		//pl("");
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