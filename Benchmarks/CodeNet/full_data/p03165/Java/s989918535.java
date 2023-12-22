
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//System.out.println();
public class Main implements Runnable { //クラス名はMain

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		try {
			FastScannerLCS sc = new FastScannerLCS(System.in);

			//https://qiita.com/_rdtr/items/c49aa20f8d48fbea8bd2
			String S = sc.nextLine();
			String T = sc.nextLine();
			int[][] dp = new int[S.length() + 1][T.length() + 1];
			String ans = "";

			for (int s = 1; s <= S.length(); s++) {
				for (int t = 1; t <= T.length(); t++) {
					if(S.substring(s-1, s).equals(T.substring(t-1, t))){
						dp[s][t] = dp[s][t-1] +1;
					}else{
						dp[s][t] = Math.max(dp[s][t-1],dp[s-1][t]);
					}
				}
			}
			
			int count=0;
			for (int s = 1; s <= S.length(); s++) {
				if(count<dp[s][T.length()]){
					ans += S.substring(s-1, s);
					count++;
				}
			}

			//System.out.println(dp[S.length()][T.length()]);
			System.out.println(ans);








			/*
			String S = sc.nextLine();
			String T = sc.nextLine();
			int[][] dp = new int[S.length() + 1][T.length() + 1];
			String ans = "";

			//https://qiita.com/nomikura/items/f30686df3df0ddb4d338
			for (int s = 1; s <= S.length(); s++) {
				for (int t = 1; t <= T.length(); t++) {
					if (S.substring(s - 1, s).equals(T.substring(t - 1, t))) {
						dp[s][t] = dp[s - 1][t - 1] + 1;

					} else {
						int left = dp[s][t - 1];
						int right = dp[s - 1][t];
						if (left > right) {
							dp[s][t] = left;
						} else {
							dp[s][t] = right;
						}
					}
				}
			}
			for (int i = 0; i <= S.length(); i++) {
				System.out.println(i + " " + Arrays.toString(dp[i]));
			}

			System.out.println(dp[S.length()][T.length()]);
			System.out.println(ans);
			*/

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

//高速なScanner
class FastScannerLCS {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerLCS(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}
