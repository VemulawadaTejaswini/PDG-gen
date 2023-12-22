import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    long[] as = new long[N+1];
        long[][] dp = new long[N+1][N+1];
	    long[] prefixSum = new long[N+1];

	    for(int i=1; i<=N; ++i) {
	        as[i] = sc.nextLong();
	        prefixSum[i] = prefixSum[i-1] + as[i];
        }

//        d1(dp);

        for(int ij_d=1; ij_d<=N; ++ij_d) {
            for(int i=1; i+ij_d<=N; ++i) {
                int j = i+ij_d;
                dp[i][j] = Long.MAX_VALUE;
//                System.out.printf("%dx%d \n", i, j);
                for(int k=i; k<j; ++k) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k+1][j] + (prefixSum[j] - prefixSum[i-1]));
//                    System.out.printf("i,k %d,%d k+1,j %d,%d\n", i, k, k+1, j);
//                    System.out.printf("%d %d+%d\n", dp[i][j], dp[i][k], dp[k+1][j]);
                }
//                dp[i][j] += (prefixSum[j] - prefixSum[i-1]);
//                    System.out.printf("prefixSum %d,%d k+1,j %d,%d\n", i, k, k+1, j);

            }
        }

//        Util.<Long>d0(dp);
//        d1(dp);

	    System.out.println(dp[1][N]);
    }

    public static void d1(long[][] dp) {
        System.out.print("    ");

        for(int j=0; j<dp[0].length; ++j){
            System.out.printf("%3d ", j);
        }
        System.out.println();

        for(int i=0; i<dp.length; ++i){
            System.out.printf("%3d|", i);
            for(int j=0; j<dp[0].length; ++j){
                if(10000 < dp[i][j])
                    System.out.printf("%3d ", -1);
                else
                    System.out.printf("%3d ", dp[i][j]);
            }
            System.out.println();
        }
    }
}
