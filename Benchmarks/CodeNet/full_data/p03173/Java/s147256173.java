import java.util.Scanner;

public class Main {
    static long[][] dp;
    static long calculate(int i, int j, int[] a, long[] s){
        if(i >= j)
            return 0;
        if(dp[i][j] != 0)
            return dp[i][j];
        long min = Long.MAX_VALUE;
        for(int k = i+1; k <= j; k++){
            min = Math.min(min,calculate(i,k-1,a,s)+calculate(k,j,a,s)+s[j]-((i-1<0)?0:s[i-1]));
        }
        dp[i][j] = min;
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new long[n][n];
        int[] a = new int[n];
        long[] s = new long[n];
        long total = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            total += a[i];
            s[i] = total;
        }
        System.out.println(calculate(0,n-1,a,s));
    }
}
