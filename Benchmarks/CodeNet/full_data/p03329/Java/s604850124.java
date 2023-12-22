import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int[] A = new int[12];
        A[1] = 1;
        int cnt = 1;
        int idx = 0;
        while(true){
            idx++;
            if(Math.pow(6, idx) > N) break;
            else {
                cnt++;
                A[cnt] = (int) Math.pow(6, idx);
            }
        }
        idx = 0;
        while(true){
            idx++;
            if(Math.pow(9, idx) > N) break;
            else {
                cnt++;
                A[cnt] = (int) Math.pow(9, idx);
            }
        }

        //dp[i][j]:ｉパターン目までの引き落とし金額でj円ちょうど引き出すのに少なくとも必要な回数
        int[][] dp = new int[cnt+1][N+1];
        Arrays.fill(dp[0], Integer.MAX_VALUE);
        dp[0][0] = 0;
        for(int i = 1; i < cnt+1; i++){
            dp[i][0] = 0;
            for(int j = 1; j < N+1; j++){
                if(A[i] > j) dp[i][j] = dp[i-1][j];
                else dp[i][j] = Math.min(dp[i-1][j], dp[i][j - A[i]] + 1);
            }
        }
        System.out.println(dp[cnt][N]);

    }

}
