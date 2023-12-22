import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();

        int[] W = new int[N];
        int[] V = new int[N];
        for(int i = 0; i < N; i++) {
            W[i] = sc.nextInt();
            V[i] = sc.nextInt();
        }

        int[][][] dp = new int[N+1][T+1][2];

        for(int i = 0; i < T+1; i++) {
            for(int flag = 0; flag < 2; flag++) {
                dp[0][i][flag] = 0;
            }
        }

        for(int i = 1; i < N + 1; i++) {
            for(int j = 0; j < T+1; j++) {
                for(int flag = 0; flag < 2; flag++) {
                    if(W[i-1] > j) {
                        if(flag == 0) {
                            dp[i][j][flag] = dp[i-1][j][flag];
                        } else {
                            dp[i][j][1] = Math.max(dp[i-1][j][0] + V[i-1], dp[i-1][j][1]); //use the flag as a joker here or pass it on
                        }
                    } else {
                        if(flag == 0) {
                            dp[i][j][flag] = Math.max(dp[i-1][j][flag], dp[i-1][j - W[i-1]][flag] + V[i-1]);
                        } else {
                            dp[i][j][flag] = Math.max(dp[i-1][j][0] + V[i-1], dp[i-1][j][1]);
                        }
                    }
                }
            }
        }
        System.out.println(dp[N][T-1][1]);
    }
}
