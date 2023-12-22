import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] A = new int[2][N];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < N; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		int[] sum = new int[N];
		for (int i = 0; i < N; i++) {
			int k = 0;
			for (int j = 0; j < N; j++) {
				sum[i] += A[k][j];
				if (j == i) {
					k++;
					sum[i] += A[k][j];
				}
			}
		}
		int ans = sum[0];
		for (int i = 0; i < N; i++) {
			if (ans < sum[i])
				ans = sum[i];
		}
		System.out.println(ans);
	}

}