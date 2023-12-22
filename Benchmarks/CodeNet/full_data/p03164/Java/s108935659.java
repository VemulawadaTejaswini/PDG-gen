import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int[][] wav = new int[n][2];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                wav[i][j] = scanner.nextInt();
            }
        }
        System.out.println(new Main().f(wav, n, w));
    }

    public long f(int[][] wav, int n, int w) {
        long[][] dp = new long[n][100001];
        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i], 100000000001l);
        }
        for(int i = 0; i < n; i++){
            dp[i][0] = 0;
        }
        dp[0][wav[0][1]] = wav[0][0];
        long ans = wav[0][0] > w ? 0 : wav[0][1];
        for(int i = 1; i < n; i++){
            for(int j = 0; j < 100001; j++){
                if(j >= wav[i][1]){
                    dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j-wav[i][1]] + wav[i][0]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
                if(dp[i][j] <= w){
                    ans = Math.max(ans, j);
                }
            }
        }
        return ans;
    }
}
