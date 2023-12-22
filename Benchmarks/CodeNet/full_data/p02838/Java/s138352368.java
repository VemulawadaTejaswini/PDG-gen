import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		long[] A = new long[N];
		for(int i=0;i<N;i++) {
			A[i] = sc.nextLong();
		}

		sc.close();


		int mod = 1000000007;

		int[][] bitCntSum = new int[N+1][63]; // iより前のbitの立ってる数

		for(int i=1;i<=N;i++) {
			long n = A[i-1];

			for(int j=0;j<63;j++) {
				bitCntSum[i][j] = (int)(bitCntSum[i-1][j] + ((n>>j)&1));
			}
		}

		long ans = 0;

		for(int j=0;j<63;j++) {
			// bitごとにみる
			for(int i=0;i<N;i++) {
				long c;
				if((A[i]>>j &0x1) == 1) {
					// 1なら、それより右の0の数を数える
					c = (N-i) - (bitCntSum[N][j] - bitCntSum[i][j]);
				}else {
					// 0なら、それより右の1の数を数える
					c = bitCntSum[N][j] - bitCntSum[i][j];
				}
				ans += ((c<<j)%mod);
				ans %= mod;
			}
		}

		ans %= mod;

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
