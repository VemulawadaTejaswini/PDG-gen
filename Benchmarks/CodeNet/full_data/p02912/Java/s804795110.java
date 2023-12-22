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

		Arrays.sort(A);


		while (M != 0) {
			boolean changeFlg = false;
			A[N - 1] = A[N - 1] / 2;
			if (1 < N && A[N - 1] < A[N - 2]) changeFlg = true;
			int now = N - 1;
			while (changeFlg) {
				int tmp = A[now];
				if (A[now] < A[now - 1]) {
					A[now] = A[now - 1];
					A[now - 1] = tmp;
				} else {
					changeFlg = false;
				}
				now--;
			}
			M--;
		}

		long answer = 0;
		for (int i = 0; i < N; i++) {
			answer += A[i];
		}

		System.out.println(answer);

	}
}