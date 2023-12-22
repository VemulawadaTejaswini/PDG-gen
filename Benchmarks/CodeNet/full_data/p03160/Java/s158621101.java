import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] h = new int[n];
		for ( int i = 0; i < h.length; i++ ) {
			h[i] = in.nextInt();
		}

		// 各番目までの累積コストを格納する配列
		int[] cumulativeCost = new int[n];
		cumulativeCost[0] = 0;
		cumulativeCost[1] = Math.abs(h[1] - h[0]);

		// ある杭に飛び移るには、一本前か二本前から飛び移るしかない → コストの小さいほうから飛んでくる
		for ( int i = 2; i < cumulativeCost.length; i++ ) {
			int cum1 = cumulativeCost[i - 1] + Math.abs(h[i] - h[i - 1]);	// 一歩前からくる場合
			int cum2 = cumulativeCost[i - 2] + Math.abs(h[i] - h[i - 2]);	// 二歩前からくる場合

			cumulativeCost[i] = Math.min(cum1, cum2);
		}

		System.out.println(cumulativeCost[n - 1]);
		in.close();
	}
}