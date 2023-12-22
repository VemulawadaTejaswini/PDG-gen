import java.util.*;

public class Main {

	private static int max = 0;
	private static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		boolean[][] arr01 = new boolean[n + 1][n + 1];
		for (int i = 1; i <= n + m - 1; i++) {
			arr01[scan.nextInt()][scan.nextInt()] = true;
		}
		int[][] ans = new int[n + 1][n + 1];
		for (int i = 1; i < arr01[0].length; i++) {
			for (int j = 1; j < arr01.length; j++) {
				if (arr01[j][i]) {
					ans[j][i] = max(arr01, i, j);
					max = 0;
					count = 0;
				}
			}
			System.out.println(maxPath(ans, i));
		}
		scan.close();
	}

	private static int max(boolean[][] arr01, int col, int row) {
		count++;
		for (int i = 1; i < arr01.length; i++) {
			if (arr01[i][row]) {
				max(arr01, row, i);
			}
		}
		if (count > max) {
			max = count;
		}
		count--;
		return max;
	}

	private static int maxPath(int ans[][], int col) {
		int ret = 0;
		for (int i = 1; i < ans.length; i++) {
			if (ans[i][col] > ans[ret][col]) {
				ret = i;
			}
		}
		return ret;
	}
}
