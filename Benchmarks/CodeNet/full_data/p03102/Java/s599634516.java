import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		int[] b = new int[M];

		for (int i = 0; i < M; i++) {
			b[i] = sc.nextInt();
		}

		int cnt = 0;
		int[][] a = new int[N][M];
		for (int i = 0; i < N; i++) {
			int sum = 0;
			for (int j = 0; j < M; j++) {
				a[i][j] = sc.nextInt();
				sum += a[i][j] * b[j];
			}
			if (sum + C > 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
