import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N = sc.nextInt();
		int[][] mise = new int[N][10];
		int[][] profit = new int[N][11];
		int[] kaiten=new int[N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 10; j++) {
				mise[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 11; j++) {
				profit[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<10; j++) {
				kaiten[i]+=mise[i][j];
			}
		}
		long ans = -114514810;
		for (int i = 1; i < 1024; i++) {
			long ruikei_bene = 0;
			int tmp=i;
			for(int j=0; j<10; j++) {
				if(tmp%2==1) {
					ruikei_bene+=profit[j][kaiten[j]];
				}
				tmp/=2;
			}
			ans = Math.max(ans, ruikei_bene);
		}
		System.out.println(ans);
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
}
