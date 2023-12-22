
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A[] = new int[N + 1];
		int B[] = new int[N];

		int count[] = new int[N];
		int count1[] = new int[N];

		int sum = 0;

		for (int i = 0; i <= N; i++) {
			A[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {

			if (i == 0) {
				count[i] += Math.min(A[i], B[i]);
				count1[i] += Math.min(A[i + 1], B[i] - count[i]);
				continue;
			}

			count[i] += Math.min(A[i] - count1[i - 1], B[i]);
			count1[i] += Math.min(A[i + 1], B[i] - count[i]);

		}

		for (int i = 0; i < N; i++) {
			sum += count[i];
			sum += count1[i];
		}

		System.out.print(sum);

	}
}