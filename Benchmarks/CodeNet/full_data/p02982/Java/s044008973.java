import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int[][] x = new int[N][D];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < D; j++) {
				x[i][j] = sc.nextInt();
			}
		}
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				int sum = 0;
				for (int k = 0; k < D; k++) {
					sum += (x[i][k] - x[j][k]) * (x[i][k] - x[j][k]); 
				}
				for (int k = 0; k * k <= sum; k++) {
					if (k * k == sum) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
