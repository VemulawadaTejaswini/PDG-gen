import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		// 2 <= K <= N
		final int K = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		// どこに1があってもAi間の境界の数(N-1)をまとまった要素K間の境界(K-1)で割ればいい（場合分けは必要なし
		int ans = (N-1)/(K-1);
		System.out.println(ans);
	}
}