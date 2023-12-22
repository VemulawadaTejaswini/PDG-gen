import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int mod = 1_000_000_007;
        int[][] sum = new int[7+1][2]; // sum[:][0] not sen sum[:][1] sen
        sum[0][0]=1;
        for (int i=0;i<7;i++) {
            sum[i+1][0] = sum[i][0]+sum[i][1];
            sum[i+1][1] = sum[i][0];
        }
        int[] sum_2 = new int[8];
        for (int i=0;i<8;i++) {
            sum_2[i] = sum[i][0]+sum[i][1];
        }

        int[][] dp = new int[H+1][W];
        // for (int i=0;i<W;i++) {
        //     dp[0][i]=1;
        // }
        dp[0][0]=1;
        for (int i=0;i<H;i++) {
            for (int j=0;j<W;j++) {
                if (j==0) {
                    // System.out.println("kk" + (W-2<0));
                    // System.out.println("ww" + (W-3<0));
                    // System.out.println(dp[i][j]*sum_2[W-2]);
                    // System.out.println(dp[i][j+1]*sum_2[W-3]);
                    dp[i+1][j] = (((W-2<0)?dp[i][j]:(dp[i][j]*sum_2[W-2]))%mod + ((W-3<0)?dp[i][j+1]:(dp[i][j+1]*sum_2[W-3]))%mod)%mod;
                    System.out.println("i: " + i + " j: " + j + " dp: " + dp[i+1][j]);
                } else if (1<=j && j<W-1) {
                    dp[i+1][j] = (((((j-2<0)||(W-1-j-1<0))?dp[i][j-1]:(dp[i][j-1]*sum_2[j-2]*sum_2[W-1-j-1]))%mod + ((W-1-j-1<0)?dp[i][j]:(dp[i][j]*sum_2[j-1]*sum_2[W-1-j-1]))%mod)%mod + ((W-1-j-2<0)?dp[i][j+1]:(dp[i][j+1]*sum_2[j-1]*sum_2[W-1-j-2]))%mod)%mod;
                } else if (j==W-1) {
                    dp[i+1][j] = (((W-2<0)?dp[i][j]:(dp[i][j]*sum_2[W-2]))%mod + ((W-3<0)?dp[i][j-1]:(dp[i][j-1]*sum_2[W-3]))%mod)%mod;
                }
            }
        }
        System.out.println(dp[H][K-1]%mod);
        System.out.println(Arrays.toString(sum_2));
        System.out.println(Arrays.deepToString(dp));
    }
}