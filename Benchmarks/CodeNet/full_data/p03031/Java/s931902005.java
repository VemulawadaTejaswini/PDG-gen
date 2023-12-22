import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int n, m;
	static int[][] swi;

	static int[] p = new int[10];//m個
	static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.next());
		m = Integer.parseInt(sc.next());
		swi = new int[m][n + 1];
		for (int i = 0; i < m; i++) {
			int k = Integer.parseInt(sc.next());
			swi[i][0] = k;
			for (int j = 1; j < k + 1; j++) {
				swi[i][j] = Integer.parseInt(sc.next());
			}
		}
		for (int i = 0; i < m; i++) {
			p[i] = Integer.parseInt(sc.next());
		}

		dfs(0, new int[n]);
		System.out.println(count);

	}

	static void dfs(int i, int[] onOff) {
		if (i == n) {
			if (isLightAll(onOff))
				count++;
			return;
		}

		dfs(i + 1, rtnArr(onOff, i, true));
		dfs(i + 1, rtnArr(onOff, i, false));
	}

	static int[] rtnArr(int[] a1, int i, boolean b) {
		int[] a2 = Arrays.copyOf(a1, n);
		a2[i] = b ? 1 : 0;
		return a2;
	}

	static boolean isLightAll(int[] onOff) {
		int sum = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 1; j < swi[i][0] + 1; j++) {
				sum += onOff[swi[i][j] - 1];
			}
			if (sum % 2 != p[i])
				return false;
		}
		return true;
	}

}
