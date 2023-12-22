import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[3][n];
		for (int i = 0; i < n; i++) {
			arr[0][i] = sc.nextInt();
			arr[1][i] = sc.nextInt();
			arr[2][i] = sc.nextInt();
		}
		int[][] ans = new int[3][n];
		ans[0][0] = arr[0][0];
		ans[1][0] = arr[1][0];
		ans[2][0] = arr[2][0];
		for (int i = 1; i < n; i++) {
			ans[0][i] = Math.max(ans[1][i - 1], ans[2][i - 1]) + arr[0][i];
			ans[1][i] = Math.max(ans[2][i - 1], ans[0][i - 1]) + arr[1][i];
			ans[2][i] = Math.max(ans[0][i - 1], ans[1][i - 1]) + arr[2][i];
		}
		System.out.println(Math.max(Math.max(ans[0][n - 1], ans[1][n - 1]), ans[2][n - 1]));
	}
}
