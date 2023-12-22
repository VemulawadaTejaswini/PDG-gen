import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[][] A = new int[H][W];
		int[][] diff = new int[H][W];
		for(int i = 0; i < H; i++)
			for(int j = 0; j < W; j++)
				A[i][j] = sc.nextInt();
		for(int i = 0; i < H; i++)
			for(int j = 0; j < W; j++)
				diff[i][j] = Math.abs(A[i][j]-sc.nextInt());
		int M = 80*2*(H+W);
		boolean[][][] dp = new boolean[H][W][M];
		dp[0][0][diff[0][0]] = true;
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				for(int k = 0; k < M; k++) {
					if(dp[i][j][k]) {
						if(i+1 < H) {
							dp[i+1][j][k+diff[i+1][j]] = true;
							dp[i+1][j][Math.abs(k-diff[i+1][j])] = true;
						}
						if(j+1 < W) {
							dp[i][j+1][k+diff[i][j+1]] = true;
							dp[i][j+1][Math.abs(k-diff[i][j+1])] = true;
						}
					}
				}
			}
		}
		for(int i = 0; i < M; i++) {
			if(dp[H-1][W-1][i]) {
				System.out.println(i);
				break;
			}
		}

	}

}