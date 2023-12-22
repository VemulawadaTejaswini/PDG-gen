import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int INF=1000000007;
		boolean[][] maps=new boolean[N+2][N+2];
		boolean[][] used=new boolean[N+2][N+2];
		int[][] cost=new int[N+1][N+1];
		int[][] moto=new int[N+1][N+1];
		for(int i=0; i<=N; i++) {
			for(int j=0; j<=N; j++) {
				cost[i][j]=INF;
				moto[i][j]=INF;
			}
		}
		for(int i=0; i<M; i++) {
			int from=sc.nextInt();
			int to=sc.nextInt();
			int cst=sc.nextInt();
			maps[from][to]=true;
			maps[to][from]=true;
			cost[from][to]=cst;
			cost[to][from]=cst;
			moto[from][to]=cst;
			moto[to][from]=cst;
		}
		for(int k=1; k<=N; k++) {
			for(int i=1; i<=N; i++) {
				for(int j=1; j<=N; j++) {
					if(cost[i][j]>cost[i][k]+cost[k][j]) {
						cost[i][j]=cost[i][k]+cost[k][j];
					}
				}
			}
		}
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				if(maps[i][j]) {
					if(moto[i][j]<=cost[i][j]) {
						used[i][j]=true;
						used[j][i]=true;
					}
				}
			}
		}
		int sum=0;
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				if(maps[i][j] && !used[i][j]) {
					sum++;
				}
			}
		}
		pl(sum/2);	//無向グラフなので
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
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
}
