
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N - 1];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			int sum = 0;

			for (int j = 0; j < A.length; j++) {
				if (i + 1 == A[j]) {
					sum++;
				}
			}

			System.out.println(sum);
		}

	}
}
