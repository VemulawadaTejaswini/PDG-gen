import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		double[] dp=new double[N+1];
		for(int i=0; i<=N; i++) {
			dp[i]=0;
		}
		//ここでのDPは確率的なところ
		dp[0]=1;
		double[] kakuritu=new double[N];
		for(int i=0; i<N; i++) {
			kakuritu[i]=sc.nextDouble();
		}

		for(int i=0; i<N; i++) {
			for(int j=i; j>=0; j--) {
				dp[j+1]+=dp[j]*kakuritu[i];
				dp[j]*=(1.000d-kakuritu[i]);
			}
		}
		double sum=0;
		for(int i=(N+1)/2; i<=N; i++) {
			sum+=dp[i];
		}
		pl(sum);
	}

	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
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
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
	}
}