import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static long mod = 1000000007;
	static long INF = Long.MAX_VALUE;

	public static void main(String[] args) {
		// AtCoder_A
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int H[] = new int[N+1];
		long cost[] = new long[N];

		Arrays.fill(H, 0);
		Arrays.fill(cost, INF);

		for(int i=0; i<N; i++) {
			H[i] = sc.nextInt();
		}
	    // Scannerクラスのインスタンスをクローズ
		sc.close();

		cost[0] = 0;
		cost[1] = Math.abs(H[0]-H[1]);

		for(int now=2; now<N; now++) {
			cost[now] = Math.min(Math.abs(H[now]-H[now-2])+cost[now-2], Math.abs(H[now]-H[now-1])+cost[now-1]);
		}

		// 出力
		System.out.println(cost[N-1]);
	}
}
