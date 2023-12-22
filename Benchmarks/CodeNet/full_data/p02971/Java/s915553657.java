import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A[] = new int[N];
		int maxA = 0;
		int maxAIndex = -1;
		int max = 0;

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();

			if (maxA <= A[i]) {
				maxA = A[i];
				maxAIndex = i;
			}
		}

		for (int j = 0; j < N; j++) {

			max = 0;

			for (int i = 0; i < N; i++) {

				if (i == j) {
					continue;
				}

				if (!(j == maxAIndex)) {
					break;
				}

				if (max <= A[i]) {
					max = A[i];
				}
			}

			if (max == 0) {
				System.out.println(maxA);
			} else {
				System.out.println(max);
			}

		}
	}
}
