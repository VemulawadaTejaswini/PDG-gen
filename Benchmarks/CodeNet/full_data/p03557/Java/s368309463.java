import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		sc.nextLine();
		int A[] = new int[N];
		int B[] = new int[N];
		int C[] = new int[N];
		String[] a1An = sc.nextLine().split(" ");
		String[] b1Bn = sc.nextLine().split(" ");
		String[] c1Cn = sc.nextLine().split(" ");

		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(a1An[i]);
			B[i] = Integer.parseInt(b1Bn[i]);
			C[i] = Integer.parseInt(c1Cn[i]);
		}
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);

		int[] cntA = new int[N];
		int[] cntB = new int[N];
		int[] cntC = new int[N];
		cntA[0] = cntB[0] = cntC[0] = 1;
		for (int i = 1; i < N; i++) {
			cntA[i] = cntB[i] = cntC[i] = i + 1;
			if (A[i] == A[i - 1]) {
				A[i - 1] = A[i];
			}
			if (B[i] == B[i - 1]) {
				B[i - 1] = B[i];
			}
			if (C[i] == C[i - 1]) {
				C[i - 1] = C[i];
			}
		}

		int count = 0;
		int bIdx = N - 1;
		for (int i = N - 1; i >= 0; i--) {
			int c = C[i];
			while (bIdx >= 0 && c <= B[bIdx]) {
				--bIdx;
			}
			if (bIdx < 0) {
				continue;
			}
			int aIdx = N - 1;
			for (int j = bIdx; j >= 0; j--) {
				int b = B[j];
				while (aIdx >= 0 && b <= A[aIdx]) {
					--aIdx;
				}
				if (aIdx >= 0) {
					count += cntA[aIdx];
				}
			}
		}

		System.out.println(count);

		sc.close();
	}

}