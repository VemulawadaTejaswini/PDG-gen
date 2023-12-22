import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		int[][] matrix = new int[h][w];
		int[][] dp = new int[h][w];
		int k=0;
		while(k<h) {
			String nextString = sc.next();
			for (int i = 0; i < nextString.length(); i++) {
				if (nextString.charAt(i) == '#') {
					matrix[k][i] = 1;
				} else {
					matrix[k][i] = 0;
				}
			}
			k++;
		}

		dp[0][0] = matrix[0][0];
		for (int i = 1; i < h; i++) {
			if (matrix[i][0] == 1 && matrix[i-1][0]==1) {
				dp[i][0] = dp[i - 1][0];
			} else {
				dp[i][0] = dp[i - 1][0] + matrix[i][0];
			}
		}
		for (int i = 1; i < w; i++) {
			if (matrix[0][i] == 1 && matrix[0][i-1]==1) {
				dp[0][i] = dp[0][i - 1];
			} else {
				dp[0][i] = dp[0][i - 1] + matrix[0][i];
			}
		}
		for (int i = 1; i < h; i++) {
			for (int j = 1; j < w; j++) {
				if (matrix[i][j] == 1 &&  matrix[i][j-1]==1) {
					dp[i][j] = dp[i][j - 1];
				} else if (matrix[i][j] == 1 && matrix[i-1][j]==1 ) {
					dp[i][j] = dp[i-1][j];
				} else {
					dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + matrix[i][j];
				}
			}
		}
		System.out.println(dp[h - 1][w - 1]);
	}

}
