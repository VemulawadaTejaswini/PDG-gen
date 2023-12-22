import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N + 1];
		int B[] = new int[N];

		long jizenSum = 0;
		for (int i = 0; i < N + 1; i++) {
			A[i] = sc.nextInt();
			jizenSum += A[i];
		}

		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}

		int tmp = 0;
		for (int i = 0; i < N; i++) {
			tmp = A[i] - B[i];
			if (tmp < 0) {
				if (B[i] - A[i] > A[i + 1]) {
					A[i + 1] = 0;
				} else {
					A[i + 1] = A[i + 1] - (B[i] - A[i]);
				}
				A[i] = 0;
			} else {
				A[i] = tmp;
			}
		}

		long sum = 0;
		for (int i = 0; i < N + 1; i++) {
			sum += A[i];
		}

		System.out.println(jizenSum - sum);
	}
}
