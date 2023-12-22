

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner in;

    private static int n;
    private static int[] a;
    private static long[][] dp;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n];
        
        dp = new long[n][n];
        
        for(int i=0; i<n; i++) {
        	for(int j=0; j<n; j++) {
        		dp[i][j]=dp[i][j]=-1;
        	}
        }

        for(int i=0; i<n; i++) a[i] = in.nextInt();

        
//        for(int left=0; left<n; left++) {
//    		dp[left][left] = new long[] {a[left], -1*a[left]};
//        }
        
//        for(int length=2; length<=n; length++) {
//        	for(int left=0; left<n; left++) {
//            	for(int who=0; who<=1; who++) {
//                	int right = left+length-1;
//                	if (right>=n) continue;
//                	if (who==0) {
//                        dp[left][right][who]=Math.max(a[left]+dp[left+1][right][1-who], a[right]+dp[left][right-1][1-who]);
//                    } else {
//                        dp[left][right][who]=Math.min(-1*a[left]+dp[left+1][right][1-who], -1*a[right]+dp[left][right-1][1-who]);
//                    }
//            	}
//            }
//        }
        
//        System.out.println(dp[0][n-1][0]);
        
        System.out.println(solve(0, n-1, 0));

    }
    
    private static long solve(int left, int right, int who) {
        if (left==right) {
            if (who==0) return a[left];
            else return -1*a[left];
        } 
        
        if (dp[left][right]!=-1) return dp[left][right];

        if (who==0) {
            return dp[left][right]=Math.max(a[left]+solve(left+1, right, 1-who), a[right]+solve(left, right-1, 1-who));
        } else {
            return dp[left][right]=Math.min(-1*a[left]+solve(left+1, right, 1-who), -1*a[right]+solve(left, right-1, 1-who));
        }

    }

}
