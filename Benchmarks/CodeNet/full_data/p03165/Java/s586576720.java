
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

			/*
			axyb
			abyxb

			dpテーブル
			0  a  b  y  x  b
			0 [0, 0, 0, 0, 0, 0]
			a [0, 1, 1, 1, 1, 1]
			x [0, 1, 1, 1, 2, 2]
			y [0, 1, 1, 2, 2, 2]
			b [0, 1, 2, 2, 2, 3]
			*/
			//https://qiita.com/_rdtr/items/c49aa20f8d48fbea8bd2
			String S = sc.nextLine();
			String T = sc.nextLine();
			int[][] dp = new int[S.length() + 1][T.length() + 1];

			for (int s = 1; s <= S.length(); s++) {
				for (int t = 1; t <= T.length(); t++) {
					if(S.substring(s-1, s).equals(T.substring(t-1, t))){
						dp[s][t] = dp[s-1][t-1] +1;
					}else{
						dp[s][t] = Math.max(dp[s][t-1],dp[s-1][t]);
					}
				}
			}
			
			
			StringBuffer sb=new StringBuffer();
			int i=S.length(),j=T.length();
			while(i>0 && j>0)
			{
				if(S.charAt(i-1)==T.charAt(j-1))
				{
					sb.append(S.charAt(i-1));
					i--;
					j--;
				}
				else if(dp[i-1][j]>dp[i][j-1])
					i--;
				else
					j--;
			}
			String s=new String(sb.reverse());
			System.out.println(s);

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
