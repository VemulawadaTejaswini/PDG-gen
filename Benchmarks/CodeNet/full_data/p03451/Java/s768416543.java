import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] map = new int[2][N];
		int tmpSum;
		int maxSum = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < N; i++) {
			tmpSum = 0;
			for (int j = 0; j < N; j++) {
				if (i <= j) {
					tmpSum += map[0][j];
				}
				if (i >= j) {
					tmpSum += map[1][j];
				}
			}
			maxSum = Math.max(tmpSum,  maxSum);
		}
		System.out.print(maxSum);
	}
}
