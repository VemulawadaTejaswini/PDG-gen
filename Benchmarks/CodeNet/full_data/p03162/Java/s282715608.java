import java.util.Arrays;
import java.util.Scanner;

public class Main{
    private static int n;
    public static int a[] = new int[(int) (1e5 + 1)];
    public static int b[] = new int[(int) (1e5 + 1)];
    public static int c[] = new int[(int) (1e5 + 1)];
    public static int dp[][] = new int[(int) (1e5 + 1)][4];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0;i < n;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        for (int i = 0;i < n;i++)
            for (int j = 0;j < 4;j++)
                dp[i][j] = Integer.MIN_VALUE;
            System.out.println(dp(0,3));
    }
    private static int dp(int idx,int last){
        if(idx == n)
            return 0;
        if(dp[idx][last] != Integer.MIN_VALUE)
            return dp[idx][last];
        if(last != 0)
            dp[idx][last] = Math.max(dp[idx][last], a[idx] + dp(idx + 1,0));
        if(last != 1)
            dp[idx][last] = Math.max(dp[idx][last], b[idx] + dp(idx + 1,1));
        if(last != 2)
            dp[idx][last] = Math.max(dp[idx][last], c[idx] + dp(idx + 1,2));
        return dp[idx][last];

    }
}