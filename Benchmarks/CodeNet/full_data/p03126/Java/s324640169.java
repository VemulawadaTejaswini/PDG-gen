import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int answerArr[] = new int[M];
		int answer = 0;
		Arrays.fill(answerArr, 0);


		for (int i = 0; i < N; i++) {
			int K = sc.nextInt();
			for (int j = 0; j < K; j++) {
				int Ki = sc.nextInt();
				answerArr[Ki - 1]++;
			}
		}

		for (int i = 0; i < M; i++) {
			if (answerArr[i] == N) {
				answer++;
			}
		}

		System.out.println(answer);
	}
}
