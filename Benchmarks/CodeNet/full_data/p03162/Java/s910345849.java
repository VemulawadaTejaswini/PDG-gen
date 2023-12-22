import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	static int last;
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();//1日目から最大を取っていくのはありがちな貪欲の嘘解法っぽい	→　やっぱりそうだった1WA
		int[][] vc=new int[N][3];
		for(int i=0; i<N; i++) {
			for(int j=0; j<3; j++) {
				vc[i][j]=sc.nextInt();
			}
		}
		int[][] dp=new int[N][3];
		dp[0][0]=vc[0][0];
		dp[0][1]=vc[0][1];
		dp[0][2]=vc[0][2];
		for(int i=1; i<N; i++) {
			dp[i][0]=Math.max(dp[i][0], Math.max(dp[i-1][1]+vc[i][0],dp[i-1][2]+vc[i][0]));
			dp[i][1]=Math.max(dp[i][1], Math.max(dp[i-1][0]+vc[i][1],dp[i-1][2]+vc[i][1]));
			dp[i][2]=Math.max(dp[i][2], Math.max(dp[i-1][0]+vc[i][2],dp[i-1][1]+vc[i][2]));
		}
		pl(Math.max(Math.max(dp[N-1][0], dp[N-1][1]), Math.max(dp[N-1][1], dp[N-1][2])));
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