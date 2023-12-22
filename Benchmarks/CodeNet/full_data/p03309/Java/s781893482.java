import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt() - (i+1); // 予めAi - i = a[i]としておく
		}
		// 中央値を取るためにソート
		Arrays.sort(a);
		// 数直線上にa[i]をプロットしたときに、bを動かしたときに影響を受けるa[i]が左右で同数ならOK
		// aが奇数個なら中央値は常にa[(N+1)/2 - 1]
		// aが偶数個の場合、中央の2つの値a[N/2 - 1],a[N/2]の間ならbはどこに取っても良い。
		// 公式の解説放送参照 https://www.youtube.com/watch?v=UX4AuiCVtN4
		int b = 0;
		if (N%2 != 0) {
			b = a[(N+1)/2 - 1];
		} else {
			b = (a[N/2 - 1] + a[N/2])/2;
		}
		int sadness = 0;
		for (int i = 0; i < N; i++) {
			sadness += Math.abs(a[i] - b);
		}
		System.out.println(sadness);
	}
}