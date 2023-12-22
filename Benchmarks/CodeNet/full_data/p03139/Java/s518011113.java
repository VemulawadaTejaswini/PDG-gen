import java.util.Scanner;
import java.util.Stack;

public class Restore_the_Tree {

	private static int max = 0;
	private static int count = 0;
	static Stack<Integer> list = new Stack<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] arr01 = new int[n + 1][n + 1];
		for (int i = 1; i <= n + m - 1; i++) {
			arr01[scan.nextInt()][scan.nextInt()] = 1;
		}
		int[][] ans = new int[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (arr01[j][i] != 0) {
					ans[j][i] = max(arr01, i, j);
					max = 0;
					count = 0;
				}
			}
		}
		for (int i = 1; i <= n; i++) {
			System.out.println(maxPath(ans, i));
		}
		scan.close();
	}

	private static int max(int[][] arr01, int col, int row) {

		count++;
		list.add(row);
		for (int i = 1; i < arr01.length; i++) {
			if (arr01[i][row] != 0) {
				max(arr01, row, i);
			}
		}

		if (count > max) {
			max = count;
		}
		count--;
		list.pop();

		return max;

	}

	private static int maxPath(int ans[][], int col) {
		int max = 0;
		int ret = 0;
		for (int i = 1; i < ans.length; i++) {
			if (ans[i][col] > max) {
				max = ans[i][col];
				ret = i;
			}
		}
		return ret;
	}
}
