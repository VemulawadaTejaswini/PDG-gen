import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		execute5_3();
	}
	
	private static void execute5_3() {
		try (Scanner sc = new Scanner(System.in)) {
			int H = sc.nextInt()+1;
			int N = sc.nextInt();
			
			int[][] a = new int[N][2];
			int[] dp = new int[H];
			for(int i=0;i<N;i++) {
				int A = sc.nextInt();
				int B = sc.nextInt();
				a[i][0] = A;
				a[i][1] = B;
			}
			
			dp[0]=0;
			for(int i=1;i<H;i++) {
				dp[i] = Integer.MAX_VALUE;
			}
			for(int i =1;i<H;i++) {
				for(int x=0;x<N;x++) {
					int y=Math.max(0, i-a[x][0]);
					dp[i] = Math.min(dp[i],dp[y]+a[x][1]);
				}
			}
			
			
			System.out.println(dp[H-1]);
		}
	}
}