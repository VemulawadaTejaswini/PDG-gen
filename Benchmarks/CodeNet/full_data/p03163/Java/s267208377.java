import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int W = s.nextInt();
		int[] wei = new int[N];
		int[] val = new int[N];
		for(int i = 0; i < N; i++) {
			wei[i] = s.nextInt();
			val[i] = s.nextInt();
		}
		
		int[][] dp = new int[N + 1][W + 1];
		for(int i = 1; i < N + 1; i++) {
			for(int w = 1; w < W + 1; w++) {
				if(w - wei[i-1] >= 0) {
					dp[i][w] = Math.max(dp[i-1][w - wei[i-1]] + val[i-1], dp[i-1][w]);
				}else {
					dp[i][w] = dp[i-1][w];
				}
			}
		}
		System.out.println(dp[N][W]);
    }
}