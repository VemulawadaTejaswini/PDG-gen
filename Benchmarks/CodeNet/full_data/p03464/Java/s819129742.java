import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = Integer.parseInt(sc.next());
		int[] A = new int[K];
		for (int i = 0; i < K; i++) {
			A[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		if (A[K - 1] != 2) {
			System.out.println(-1);
		} else {
			calc(K, A);
		}
	}

	static int calc(int K, int[] A) {
		int min = 2;
		int max = 2;
		for (int i = K - 1; i >= 0; i--) {
			if(i != 0) {
				if (A[i] * 2 <= A[i - 1]) {
					System.out.println(-1);
					return 0;
				}
			}

			// Min
			if (A[i] < min) {
				min += A[i] - min % A[i];
			} else {
				min = A[i];
			}

			// Max
			if (A[i] > max) {
				max = A[i];
			} else {
				max += (A[i] - 1) - max % A[i];
			}

		}

		System.out.println(min + " " + max);
		return 0;
	}

}
