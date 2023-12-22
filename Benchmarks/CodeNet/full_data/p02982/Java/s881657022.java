import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;

	void doIt() {
		int n = sc.nextInt();
		int d = sc.nextInt();
		int x[][] = new int[n][d];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < d; j++) {
				x[i][j] = sc.nextInt();
			}
		}
		int cnt = 0;
		for(int l = 0; l < n; l++) {
			for(int r = l + 1; r < n; r++) {
				if(isInt(x, d, l, r))cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	boolean isInt(int[][] x, int d, int x1, int x2) {
		double sum = 0;
		for(int i = 0; i < d; i++) {
			sum += (x[x1][i] - x[x2][i]) * (x[x1][i] - x[x2][i]);
		}
		sum = Math.sqrt(sum);
		return (sum == (int)sum)?true:false;
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
}
