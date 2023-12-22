import java.util.*;

public class Main {
	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();

		long[] A = new long[N];

		for (int i = 0; i < N; i++) {
			long ai = sc.nextLong();
			A[i] = ai;
		}
		long cntA, cntB;
		long sumA, sumB;
		sumA = sumB = 0;
		cntA = cntB = 0;

		//
		for (int i = 0; i < N; i++) {
			sumA += A[i];
			sumB += A[i];
			if (i % 2 == 0) {
				if (sumA <= 0) {
					cntA += (Math.abs(sumA) + 1);
					sumA = 1;
				}
				if (sumB >= 0) {
					cntB += (Math.abs(sumB) + 1);
					sumB = -1;
				}
			} else {
				if (sumA >= 0) {
					cntA += (Math.abs(sumA) + 1);
					sumA = -1;
				}
				if (sumB <= 0) {
					cntB += (Math.abs(sumB) + 1);
					sumB = 1;
				}
			}
		}
		System.out.println(Math.min(cntA, cntB));
		sc.close();
	}

}
