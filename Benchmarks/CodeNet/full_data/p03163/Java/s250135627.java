

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
			FastScannerKnapsack sc = new FastScannerKnapsack(System.in);
			int N = sc.nextInt();
			int W = sc.nextInt();
			int[] w = new int[N];
			int[] v = new int[N];

			for(int i = 0; i < N;i++){
				w[i] = sc.nextInt();
				v[i] = sc.nextInt();
			}

			long[][] dp=new long[N+1][W+1];


			for(int i = 0; i < N; i++){
				for(int j = 0; j <= W; j++){
					if(j < w[i]){
						dp[i+1][j] = dp[i][j];
					}else{
						//System.out.println("i:"+i+" ,j:"+ j + " ,w[i]:"+w[i]+" , dp[i][j-w[i]] + v[i]:"+(dp[i][j - w[i]] + v[i]) + "  ,dp[i][j]:" + dp[i][j]);
						dp[i+1][j] = Math.max(dp[i][j - w[i]] + v[i], dp[i][j]);
					}
				}
			}
			
			/*
			for(int i = 0; i <= N;i++){
				System.out.println(Arrays.toString(dp[i]));
			}
			*/
			
			System.out.println(dp[N][W]);


			/*
			//Refer to https://qiita.com/drken/items/dc53c683d6de8aeacf5a
			int N = sc.nextInt();
			int W = sc.nextInt();
			int[] w = new int[N];
			int[] v = new int[N];
			long[][] dp = new long[N + 1][W + 1];

			for (int i = 0; i < N; i++) {
				w[i] = sc.nextInt();
				v[i] = sc.nextInt();
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j <= W; j++) {
					//System.out.println("w[i] = " + w[i] + " , i = " + i + " , j = " + j + " dp[i][j] = " + dp[i][j]
					//		+ " , v[i] = " + v[i]);
					if (j < w[i]) {
						dp[i + 1][j] = dp[i][j];
					} else {
						long left = dp[i][j];
						long right = dp[i][j - w[i]] + v[i];

						System.out.println(
								"i = " + i + " , j = " + j + " , dp[i][j] = " + dp[i][j]
										+ " , dp[i][j - w[i]] + v[i] = " + (dp[i][j - w[i]] + v[i]) + " ,w[i] = "
										+ (w[i]));
						if (left > right) {
							dp[i + 1][j] = left;
						} else {
							dp[i + 1][j] = right;
						}
					}
				}
				System.out.println(i + " " + Arrays.toString(dp[i]));
				System.out.println((i + 1) + " " + Arrays.toString(dp[i + 1]));
				System.out.println("-------------------------");
			}

			for (int i = 0; i <= N; i++) {
				System.out.println(i + " " + Arrays.toString(dp[i]));
			}

			System.out.println(dp[N][W]);
			*/

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

//高速なScanner
class FastScannerKnapsack {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerKnapsack(InputStream in) {
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
