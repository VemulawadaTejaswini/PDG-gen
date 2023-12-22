import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		long[] An = new long[n];
		long[] Bn = new long[n];
		int idx;
		for (idx = 0; idx < n; idx++) {
			An[idx] = Long.parseLong(sc.next());
		}

		int cnum = n;
		long min = 0;
		int minIdx = 0;
		while (cnum > 2) {
			// 1～n-2番目のカードの中から最少みつける
			// 但し端(1, n-2)以外は重み3倍で比較する
			min = An[1];
			minIdx = 1;
			for (idx = 2; idx <= cnum - 2; idx++) {
				if (idx == (cnum - 2)) {
					if (min > An[idx]) {
						min = An[idx];
						minIdx = idx;
					}
				} else {
					if (min > An[idx] * 3) {
						min = An[idx] * 3;
						minIdx = idx;
					}
				}
			}

			// Bn作成
			for (idx = 0; idx < cnum - 1; idx++) {
				if (idx < minIdx - 1) {
					Bn[idx] = An[idx];
				} else if (idx == minIdx - 1) {
					Bn[idx] = An[idx] + An[idx + 1];
				} else if (idx == minIdx) {
					Bn[idx] = An[idx] + An[idx + 1];
				} else {
					Bn[idx] = An[idx + 1];
				}
			}

			// BnをAnに移し替える
			for (idx = 0; idx < cnum - 1; idx++) {
				An[idx] = Bn[idx];
			}

			// 枚数減らす
			--cnum;
		}

		System.out.println(An[0] + An[1]);
	}

}
