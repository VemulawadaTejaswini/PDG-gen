
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int N;
		int[] A;
		int[] sortPattern1;
		int[] sortPattern2;
		int sa;
		int saGoukei1 = 0;
		int saGoukei2 = 0;

		try (Scanner sc = new Scanner(System.in)) {
			N = Integer.valueOf(sc.nextInt());
			A = new int[N];
			for (int i = 0; i < N; i++) {
				A[i] = Integer.valueOf(sc.nextInt());
				if (i >= 1) {
					for (int j = i; j > 0; j--) {
						if (A[j - 1] > A[j]) {
							int temp = A[j];
							A[j] = A[j - 1];
							A[j - 1] = temp;
						} else {
							break;
						}
					}
				}
			}

			int midIdx;
			if (N % 2 == 0)
				midIdx = N / 2 - 1;
			else
				midIdx = N / 2;

			sortPattern1 = new int[N];
			sortPattern1[0] = A[midIdx];

			boolean largeSideFlg = true;
			int counter1 = 1;
			int sortCounter = 1;
			// 差分が最大になるようにソート
			for (int i = N - counter1; i != midIdx;) {
				sortPattern1[sortCounter] = A[i];
				sa = sortPattern1[sortCounter - 1] - sortPattern1[sortCounter];
				if (sa < 0)
					sa = -sa;
				saGoukei1 += sa;
				sortCounter++;
				if (largeSideFlg) {
					i = counter1 - 1;
					largeSideFlg = false;
				} else {
					counter1++;
					largeSideFlg = true;
					i = N - counter1;
				}
			}

			//			sortPattern2 = new int[N];
			//			sortPattern2[0] = A[midIdx];
			//
			//			boolean smallSideFlg = true;
			//			int counter2 = 0;
			//			int sortCounter2 = 1;
			//			// 差分が最大になるようにソート
			//			for (int i = counter2; sortCounter2 != N;) {
			//				sortPattern2[sortCounter2] = A[i];
			//				sortCounter2++;
			//				if (smallSideFlg) {
			//					smallSideFlg = false;
			//					i = N - counter2 - 1;
			//				} else {
			//					counter2++;
			//					i = counter2;
			//					smallSideFlg = true;
			//				}
			//			}
			//
			//			for (int i = 0; i < N - 1; i++) {
			//				sa = sortPattern2[i] - sortPattern2[i + 1];
			//				if (sa < 0)
			//					sa = -sa;
			//				saGoukei2 += sa;
			//			}
			//
			//			if (saGoukei1 > saGoukei2)
			System.out.println(saGoukei1);
			//			else
			//				System.out.println(saGoukei2);

		} catch (Exception e) {
			System.out.println(e);

		} finally {

		}

	}

}
