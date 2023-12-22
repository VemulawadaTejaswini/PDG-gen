import java.util.*;

public class Main {
	static int[][] c;
	static boolean[] passed;
	static int maryoku;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), w = sc.nextInt();
		c = new int[10][10];
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				c[i][j] = sc.nextInt();
			}
		}
		int[][] a = new int[h][w];
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		passed = new boolean[10];
		int[] m = new int[10]; 
		for(int i = 0; i <= 9; i++) {
			Arrays.fill(passed, false);
			maryoku = 10000;
			dfs(i, 0);
			m[i] = maryoku;
		}
		int ans = 0;
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(a[i][j] != -1) ans += m[a[i][j]];
			}
		}
		System.out.println(ans);
	}
	
	public static void dfs(int now, int count) {
		if(now == 1) {
			maryoku = Math.min(maryoku, count);
			return;
		}
		passed[now] = true;
		for(int i = 0; i <= 9; i++) {
			if(!passed[i] && now != i) {
				dfs(i, count + c[now][i]);
				passed[i] = false;
			}
		}
		return;
	}
}
