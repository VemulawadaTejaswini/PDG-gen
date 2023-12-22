
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {

		int N;
		int[] A;
		int[] sortPattern1;
		int[] sortPattern2;
		int sa;
		int saGoukei1 = 0;
		int saGoukei2 = 0;

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			N = Integer.valueOf(reader.readLine());
			A = new int[N];
			for (int i = 0; i < N; i++) {
				A[i] = Integer.valueOf(reader.readLine());
			}

			// 昇順ソート
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N - 1; j++) {
					if (A[j] > A[j + 1]) {
						int temp = A[j];
						A[j] = A[j + 1];
						A[j + 1] = temp;
					}
				}
			}

			int midIdx;
			if (N % 2 == 0)
				midIdx = N / 2 - 1;
			else
				midIdx = new BigDecimal(N / 2).setScale(0, BigDecimal.ROUND_DOWN).intValue();

			sortPattern1 = new int[N];
			sortPattern1[0] = A[midIdx];

			boolean largeSideFlg = true;
			int counter1 = 1;
			int sortCounter = 1;
			// 差分が最大になるようにソート
			for (int i = N - counter1; i != midIdx;) {
				sortPattern1[sortCounter] = A[i];
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

			for (int i = 0; i < N - 1; i++) {
				sa = sortPattern1[i] - sortPattern1[i + 1];
				if (sa < 0)
					sa = -sa;
				saGoukei1 += sa;
			}

			sortPattern2 = new int[N];
			sortPattern2[0] = A[midIdx];

			boolean smallSideFlg = true;
			int counter2 = 0;
			int sortCounter2 = 1;
			// 差分が最大になるようにソート
			for (int i = counter2; sortCounter2 != N;) {
				sortPattern2[sortCounter2] = A[i];
				sortCounter2++;
				if (smallSideFlg) {
					smallSideFlg = false;
					i = N - counter2 - 1;
				} else {
					counter2++;
					i = counter2;
					smallSideFlg = true;
				}
			}

			for (int i = 0; i < N - 1; i++) {
				sa = sortPattern2[i] - sortPattern2[i + 1];
				if (sa < 0)
					sa = -sa;
				saGoukei2 += sa;
			}

			if (saGoukei1 > saGoukei2)
				System.out.println(saGoukei1);
			else
				System.out.println(saGoukei2);

		} catch (Exception e) {
			System.out.println(e);

		} finally {

		}

	}

}
