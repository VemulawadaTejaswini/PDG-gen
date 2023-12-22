

import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int K = sc.nextInt();

		long[] A = new long[X];
		long[] B = new long[Y];
		long[] C = new long[Z];

		for (int i = 0; i < X; i++) {
			A[i] = sc.nextLong();
		}

		for (int i = 0; i < Y; i++) {
			B[i] = sc.nextLong();
		}

		for (int i = 0; i < Z; i++) {
			C[i] = sc.nextLong();
		}

		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);

		long[] result = new long[Math.min(3000, X * Y * Z)];
		int kk = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				for (int k = 0; k < C.length; k++) {
					result[kk] = A[A.length - 1 - i] + B[B.length - 1 - j] + C[C.length - 1 - k];
					kk++;
					if (kk == K) {
						break;
					}
				}
			}
		}

		Arrays.sort(result);

		for (int i = 0; i < K; i++) {
			System.out.println(result[result.length - i - 1]);
		}
	}
}
