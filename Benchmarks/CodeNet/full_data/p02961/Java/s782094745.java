import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int K = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		int Y = Integer.parseInt(sc.next());
		int negativeX = 1;
		int negativeY = 1;
		if (X < 0) {
			negativeX = -1;
			X = -X;
		}
		if (Y < 0) {
			negativeY = -1;
			Y = -Y;
		}

		int m = getManhattan(0, 0, X, Y);
		if (m % 2 != 0 && K % 2 == 0) {
			System.out.println(-1);
			return;
		}

		// 手数
		int dist = 0;
		int moves = 0;
		int over = 0;
		while(true) {
			dist += K;
			++moves;
			if (dist >= m) {
				over = dist - m;
				if (over == 0) {
					break;
				} else if (over % 2 == 0) {
					if (moves == 1) {
						moves += 2;
						// 半分にする
						over = over / 2 + K;
					}
					break;
				}
			}
		}
		System.out.println(moves);

		// 経路
		int[] mX = new int[moves];
		int[] mY = new int[moves];
		if (m == K) {
			// 1手
			mX[0] = X;
			mY[0] = Y;
		} else if (m < K) {
			// 1手でオーバーするようなとき
			if (moves == 2) {
				// 2手
				mX[0] = 0;
				mY[0] = K;
				mX[1] = X;
				mY[1] = Y;
			} else {
				// 3手
				mX[0] = K - (over / 2);
				mY[0] = -(over / 2);
				mX[1] = X + (over / 2) + (over % 2);
				mY[1] = mY[0] + K - (mX[1] - mX[0]);
				mX[2] = X;
				mY[2] = Y;
			}
		} else {
			// 1手目
			mX[0] = K - (over / 2);
			mY[0] = -(over / 2);
			int idx = 0;
			while(mX[idx] + K < X) {
				mX[idx + 1] = mX[idx] + K;
				mY[idx + 1] = mY[idx];
				++idx;
			}
			mX[idx + 1] = X;
			mY[idx + 1] = mY[idx] + K - (X - mX[idx]);
			++idx;
			while(mY[idx] + K <= Y) {
				mX[idx + 1] = X;
				mY[idx + 1] = mY[idx] + K;
				++idx;
			}
		}

		int idx = 0;
		for (idx = 0; idx < moves; idx++) {
			System.out.print(mX[idx] * negativeX);
			System.out.print(" ");
			System.out.print(mY[idx] * negativeY);
			System.out.println();
		}

	}

	public static int getManhattan(int x1, int y1, int x2, int y2) {
		int m = 0;
		m += (x1 < x2) ? x2 - x1 : x1 - x2;
		m += (y1 < y2) ? y2 - y1 : y1 - y2;
		return m;
	}
}
