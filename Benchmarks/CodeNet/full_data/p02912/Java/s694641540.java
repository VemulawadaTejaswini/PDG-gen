import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[] = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		while (M != 0) {
			Arrays.sort(A);
			A[N - 1] = A[N - 1] / 2;
			M--;
		}

		long answer = 0;
		for (int i = 0; i < N; i++) {
			answer += A[i];
		}

		System.out.println(answer);

	}
}