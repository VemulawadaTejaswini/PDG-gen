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
		int A=sc.nextInt();
		int[] cards=new int[N];
		int sum=0;
		for(int i=0; i<N; i++) {
			cards[i]=sc.nextInt();
			sum+=cards[i];
		}
		long[][][] dp=new long[N+1][sum+1][N+1];	//dp[今までに見たカードの枚数][部分和][部分和が達成できる枚数]
		//部分和が達成できる枚数とは 7が[1,2,4]でつくれるなら 3。 7が[1,1,1,1,1,1,1]で作れるなら7。
		//dp[i][j][k]にはいっているのは,今までに見たカードの枚数i枚の中で、部分和jをk枚で達成できる場合の数である
		for(int i=0; i<=N; i++) {
			for(int j=0; j<=sum; j++) {
				for(int k=0; k<=N; k++) {
					dp[i][j][k]=0;		//クソみたいな3重ループから繰り出される初期化
				}
			}
		}
		dp[0][0][0]=1;		//何もなくても総和0は達成できるためdp[0][0][0]は1
		for(int i=0; i<N; i++) {
			for(int j=0; j<sum; j++) {
				for(int k=0; k<=i; k++) {
					if(dp[i][j][k]>0) {
						dp[i+1][j][k]+=dp[i][j][k];	//いま見ているカードを使わない 総和はそのまま 部分和を達成する枚数もそのまま
						dp[i+1][j+cards[i]][k+1]+=dp[i][j][k];	//いま見ているカードを使う 総和は増える　部分和を達成する枚数も増える
					}
				}
			}
		}
		long SOUWA=0;		//求める場合の数の総和
		for(int i=1; i<=Math.min((sum/A),N); i++) {
			SOUWA+=dp[N][i*A][i];		//平均がAになる　つまり i枚で合計がiAになるので dp[N][i*A][i]を足す。
			//dp[N][hoge][hoge]は最後のカードまで見た状態を見ている
		}
		pl(SOUWA);
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