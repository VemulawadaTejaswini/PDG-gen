import java.util.*;

public class Main {

	static int d[][];
	static int col[][];
	static int cnt[][];
	static boolean color[];

	public static long discomfort(int k, int c) {
		long ans = 0;
		for(int i = 1; i < cnt[k].length; ++i) {
			long tmp = d[i][c] * cnt[k][i];
			ans += tmp;
		}
		return ans;
	}
	
	public static long solve(int k) {
		long ans = 1000000001;
		if(k == 3)return 0;
		int n = col[0].length;
		int c = d[0].length - 1;
		for (int i = 1; i <= c; ++i) {
			if (!color[i]) {
				color[i] = true;
				long tmp = discomfort(k, i) + solve(k + 1);
				ans = Math.min(ans,  tmp);
				color[i] = false;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), c = sc.nextInt();
		d = new int[c + 1][c + 1];
		col = new int[n][n];
		color = new boolean[c + 1];
		for (int i = 1; i <= c; ++i) {
			for (int j = 1; j <= c; ++j)
				d[i][j] = sc.nextInt();
		}
		cnt = new int[3][c + 1];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				col[i][j] = sc.nextInt();
				cnt[(i + j) % 3][col[i][j]]++;
			}
		}
		sc.close();
		long ans = solve(0);
		System.out.println(ans);
	}

}
