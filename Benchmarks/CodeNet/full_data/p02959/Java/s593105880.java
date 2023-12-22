
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] A = new int[n + 1];
		int[] B = new int[n];
		int[] C;
		long count2 = 0;

		for (int i = 0; i < n + 1; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			B[i] = sc.nextInt();
		}

		C = A.clone();

		for (int i = n - 1; i >= 0; i--) {
			if (A[i + 1] < B[i]) {
				count2 += A[i + 1];
				B[i] -= A[i + 1];
				A[i + 1] = 0;
			} else if (A[i + 1] == B[i]) {
				count2 += B[i];
				A[i + 1] = 0;
				B[i] = 0;

			} else {
				count2 += B[i];
				A[i + 1] -= B[i];
				B[i] = 0;
			}

			if (A[i] < B[i]) {
				count2 += A[i];
				B[i] -= A[i];
				A[i] = 0;
			} else if (A[i] == B[i]) {
				count2 += A[i];
				A[i] = 0;
				B[i] = 0;
			} else {
				count2 += B[i];
				A[i] -= B[i];
				B[i] = 0;
			}
		}

		System.out.println(count2);

	}
}
