
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		Arrays.sort(A);

		int tmp = 0;
		for (int i = 0; i < A.length - 1; i++) {
			if (tmp == 0 && A[i+1] % A[i] != 0) {
				tmp = A[i+1] % A[i];
				A[i+1] = tmp;
				if (A[0] % tmp != 0) {
					tmp =A[0] % tmp;
					A[0] = tmp;
				}
				i = 0;
				Arrays.sort(A);

			} else if (tmp != 0 && (A[i+1] % tmp != 0)) {
				tmp = A[i+1] % tmp;
				A[i+1] = tmp;
				if (A[0] % tmp != 0) {
					tmp =A[0] % tmp;
					A[0] = tmp;
				}
				i = 0;
				Arrays.sort(A);

			}
		}

		if (tmp != 0) {
			System.out.println(tmp);
		} else {
			System.out.println(A[0]);
		}
	}
}