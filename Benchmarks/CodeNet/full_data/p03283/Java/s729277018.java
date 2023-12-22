import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();
		int[][] matrix = new int[n + 1][n + 1];
		for (int i = 0; i < m; i++) {
		    matrix[sc.nextInt()][sc.nextInt()]++;
		}
		for (int i = 1; i <= n; i++) {
		    for (int j = 1; j <= n; j++) {
		        matrix[i][j] += matrix[i - 1][j] + matrix[i][j - 1] - matrix[i - 1][j - 1];
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    int left = sc.nextInt();
		    int right = sc.nextInt();
		    int ans = matrix[right][right] - matrix[left - 1][right] - matrix[right][left - 1] + matrix[left - 1][left - 1];
		    sb.append(ans).append("\n");
		}
		System.out.print(sb);
    }
}

