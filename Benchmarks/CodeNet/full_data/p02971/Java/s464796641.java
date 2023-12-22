import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];

		for (int i = 0; i < N; i++)
			A[i] = sc.nextInt();

		int max0 = Math.max(A[0], A[1]);
		int max1 = Math.min(A[0], A[1]);

		for (int i = 0; i < N; i++) {

			if (max0 < A[i]) {
				max0 = A[i];
			}
		}

		for (int i = 0; i < N; i++) {

			if (max1 < A[i] && A[i] != max0)
				max1 = A[i];
		}

		for (int i = 0; i < N; i++) {

			if (A[i] != max0)
				System.out.println(max0);
			else
				System.out.println(max1);
		}
	}
}