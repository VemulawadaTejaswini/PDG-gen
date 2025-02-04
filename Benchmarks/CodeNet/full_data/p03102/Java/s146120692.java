import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		int B[] = new int[M];
		int A[][] = new int[N][M];
		int answer = 0;
		int sum = 0;

		for (int i = 0; i < M; i++) {
			B[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			sum = 0;
			for (int j = 0; j < M; j++) {
				A[i][j] = sc.nextInt();
				sum += A[i][j] * B[j];
			}
			if (sum + C > 0) answer++;
		}

		System.out.println(answer);
	}
}
