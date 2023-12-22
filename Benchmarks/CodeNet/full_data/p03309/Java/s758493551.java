
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];
		int b = 0;
		int sum = 0;

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			B[i] = A[i] - i -1 ;
		}
		sc.close();

		Arrays.sort(B);

		if (N % 2 == 0) {
			b = B[N / 2];
		} else if (N % 2 == 1) {
			b = (B[N / 2] + B[N / 2 - 1]) / 2;
		}

		for (int i = 0; i < N; i++) {
			sum += Math.abs(B[i] - b);
		}

		System.out.print(sum);

	}
}