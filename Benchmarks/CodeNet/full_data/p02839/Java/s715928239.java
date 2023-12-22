import java.util.*;

class Main {
	Scanner sc;
	int H, W;
	boolean[][][] dp;
	int[][] A, B;
	
	private void calc() {
		sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		A = new int[H][W];
		B = new int[H][W];
		for (int i = 0; i < H; i++)
			for (int j = 0; j < W; j++)
				A[i][j] = sc.nextInt();
		for (int i = 0; i < H; i++)
			for (int j = 0; j < W; j++)
				B[i][j] = sc.nextInt();
		
		int n = 80*(H+W-1)+1;
		dp = new boolean[H][W][n];
		dp[0][0][Math.abs(A[0][0]-B[0][0])] = true;
		
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				for (int k = 0; k < n; k++) {
					if (!dp[i][j][k]) continue;
					if (i < H-1) {
						int v = A[i+1][j] - B[i+1][j];
						dp[i+1][j][Math.abs(k+v)] = true;
						dp[i+1][j][Math.abs(k-v)] = true;
					}
					if (j < W-1) {
						int v = A[i][j+1] - B[i][j+1];
						dp[i][j+1][Math.abs(k+v)] = true;
						dp[i][j+1][Math.abs(k-v)] = true;
					}
				}
			}
		}
		int min = Integer.MAX_VALUE;
		for (int k = 0; k < n; k++) {
			if (!dp[H-1][W-1][k]) continue;
			min = Math.min(min, k);
		}
				
		System.out.println(min);
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
