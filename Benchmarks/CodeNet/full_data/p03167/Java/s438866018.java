import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		long[][] dp=new long[h][w];
		for(int i=0; i<h; i++) {
			String s=sc.next();
			for(int j=0; j<w; j++) {
				if(s.charAt(j)=='#') {
					dp[i][j]=-1;
				}
				else {
					dp[i][j]=0;
				}
			}
		}
		long mod=1000000007;
		for(int i=0; i<w; i++) {
			if(dp[0][i]>=0) {
				dp[0][i]=1;
			}
			else {
				break;
			}
		}
		for(int i=0; i<h; i++) {
			if(dp[i][0]>=0) {
				dp[i][0]=1;
			}
			else {
				break;
			}
		}
		for(int i=1; i<h; i++) {
			for(int j=1; j<w; j++) {
				if(dp[i][j]>=0) {
					if(dp[i][j-1]>=0) {
						dp[i][j]=(dp[i][j]+dp[i][j-1])%mod;
					}
					if(dp[i-1][j]>=0) {
						dp[i][j]=(dp[i][j]+dp[i-1][j])%mod;
					}
				}
			}
		}
		pl(dp[h-1][w-1]);
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