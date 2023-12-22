import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int Q = sc.nextInt();

		int[][] C = new int[N + 1][N + 1];

		for(int i = 0; i < M; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			C[l][r]++;
		}

		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				C[i][j] += C[i][j - 1];
			}
		}
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				C[i][j] += C[i - 1][j];
			}
		}

		for(int i = 0; i < Q; i++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			System.out.println(C[q][q] - C[p - 1][q] - C[p][p - 1] + C[p - 1][p - 1]);
		}
	}
}