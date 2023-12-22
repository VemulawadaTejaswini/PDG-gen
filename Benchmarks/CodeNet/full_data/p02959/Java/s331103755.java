import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());
		String[] values = sc.nextLine().split(" ");
		int[] A = Arrays.stream(values).mapToInt(s -> Integer.parseInt(s)).toArray();
		int[] B = new int[N];
		int[][] chart = new int[N][N + 1];
		values = sc.nextLine().split(" ");
		for (int i = 0; i < N; i++) {
			B[i] = Integer.parseInt(values[i]);

			if (B[i] > A[i]) {
				chart[i][i] = A[i];
				B[i] -= A[i];

				if (B[i] > A[i + 1]) {
					chart[i][i + 1] = A[i + 1];
					A[i + 1] = 0;
				} else {
					chart[i][i + 1] = B[i];
					A[i + 1] -= B[i];
					B[i] = 0;
				}
			} else {
				chart[i][i] = B[i];
				A[i] -= B[i];
				B[i] -= 0;
			}

		}
		long cnt = 0;
		for (int[] row : chart) {
			cnt += Arrays.stream(row).sum();
		}
		System.out.println(cnt);
	}
}