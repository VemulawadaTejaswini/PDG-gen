import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int[] a = new int[N];
		int idx;
		for (idx = 0; idx < N; idx++) {
			a[idx] = Integer.parseInt(sc.next());
		}

		boolean ansFlg = true;

		int i;
		int ballSum = 0;
		int ballNum = 0;
		int[] ballIdx = new int[N];

		int[] balls = new int[N];
		for (i = N; i >= 1; i--) {
			// 上から決める

			ballSum = 0;
			// 自分より上で倍数のボール総和
			for (idx = i * 2; idx <= N; idx += i) {
				ballSum += balls[idx - 1];
			}

			if (ballSum % 2 == 0) {
				// 自身と同じ数
				if (a[i - 1] == 1) {
					ballIdx[ballNum] = i; // 1始まり
					++ballNum;
					balls[i - 1] = 1;
				} else {
					balls[i - 1] = 0;
				}
			} else {
				if (a[i - 1] == 1) {
					// 自身が1なら解なし
//					ansFlg = false;
//					break;
					balls[i - 1] = 0;
				} else {
					// 自身が0なら入れる
					ballIdx[ballNum] = i; // 1始まり
					++ballNum;
					balls[i - 1] = 1;
				}
			}
		}

		if (ansFlg) {
			System.out.println(ballNum);
			if (ballNum > 0) {
				// 逆順に出力
				boolean initial = true;
				for (idx = ballNum - 1; idx >= 0; idx--) {
					if (!initial) {
						System.out.print(" ");
					} else {
						initial = false;
					}
					System.out.print(ballIdx[idx]);
				}
				System.out.println();
			}
		} else {
			System.out.println(-1);
		}

	}

}
