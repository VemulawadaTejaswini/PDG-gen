import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[][] den=new int[11][11];
		int[] sw=new int[11];
		Arrays.fill(sw,0);
		for(int i=0; i<M; i++) {
			int k=sc.nextInt();
			sw[i+1]=k;
			for(int j=0; j<k; j++) {
				den[i+1][j]=sc.nextInt();
			}
		}
		int zenre=1;
		for(int i=0; i<N; i++) {
			zenre*=2;
		}
		int[] amari=new int[M+1];
		amari[0]=0;
		for(int i=1; i<=M; i++) {
			amari[i]=sc.nextInt();
		}
		int ans=0;
		int[] onoff=new int[N+1];
		for(int i=0; i<zenre; i++) {
			int tento=0;
			int tmp=i;
			for(int j=0; j<N; j++) {
				onoff[j+1]=tmp%2;
				tmp/=2;
			}

			for(int j=1; j<=M; j++) {
				int tuki=0;
				for(int k=0; k<sw[j]; k++) {
					tuki+=onoff[den[j][k]];
				}
				if(tuki%2==amari[j]) {
					tento++;
				}
			}
			if(tento==M) {
				ans++;
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