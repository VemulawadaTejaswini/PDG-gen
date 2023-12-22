import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[M];
        int[] c = new int[M];
        for(int i = 0; i < M; i++) {
            a[i] = sc.nextInt();
            int b = sc.nextInt();
            for(int j = 0; j < b; j++) {
                int v = sc.nextInt();
                c[i] += pow(2, v-1);
            }
        }

        long dp[][] = new long[M+1][pow(2,N)];
        for(int i = 0; i <= M; i++) {
            for(int j = 0; j < pow(2,N); j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        dp[0][0] = 0;

        for(int i = 1; i <= M; i++) {
            for(int j = 0; j < pow(2,N);j++) {
                dp[i][j] = dp[i-1][j];
            }
            for(int j = 0; j < pow(2,N); j++) {
                dp[i][j|c[i-1]] = Math.min(dp[i][j | c[i-1]], dp[i-1][j] + a[i-1]);
            }
        }
        long ans = dp[M][pow(2,N) - 1] == Integer.MAX_VALUE ? -1: dp[M][pow(2,N) - 1];

        System.out.println(ans);
    }

    static int pow (int a, int b)
    {
        if ( b == 0)        return 1;
        if ( b == 1)        return a;
        if (b % 2 == 0)    return     pow ( a * a, b/2); //even a=(a^2)^b/2
        else                return a * pow ( a * a, b/2); //odd  a=a*(a^2)^b/2

    }
}