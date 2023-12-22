import java.util.Scanner;

public class Main {

    static int MOD = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int D = sc.nextInt();
        sc.close();
        int[] N = new int[s.length()+1];
        for(int i = 1; i <= s.length(); i++){
            N[i] = Integer.parseInt(s.substring(s.length() -i, s.length() -i +1));
        }
        // dp[i][j]：ｊ桁目までの正整数の各桁の総和をD割ったあまりがｉとなるものの個数
        int[][] dp = new int[D][s.length()+1];
        // dp2[i][j]：与えられたＮのｊ桁目までの正整数の各桁の総和をD割ったあまりがｉとなるものの個数
        int[][] dp2 = new int[D][s.length()+1];
        dp[0][0] = 1;
        dp2[0][0] = 1;
        for(int j = 1; j <= s.length(); j++){
            for(int i = 0; i < D; i++){
                for(int k = 0; k <= 9; k++){
                    dp[(i+k)%D][j] += dp[i][j-1];
                    dp[(i+k)%D][j] %= MOD;
                    if(k < N[j]) dp2[(i+k)%D][j] += dp[i][j-1];
                    else if(k == N[j]) dp2[(i+k)%D][j] += dp2[i][j-1];
                    dp2[(i+k)%D][j] %= MOD;                }
            }
        }
        System.out.println(dp2[0][s.length()] -1);

    }

}
