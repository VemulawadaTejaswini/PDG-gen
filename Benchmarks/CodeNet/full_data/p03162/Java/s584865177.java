import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]po=new int[n][3];
        for(int i=0;i<n;i++)
            for(int j=0;j<3;j++)
                po[i][j]=sc.nextInt();
        int[][]dp=new int[n+1][3];
        for(int i=0;i<n;i++)
            for(int j=0;j<3;j++)
                dp[i+1][j]=Math.max(dp[i][(j+1)%3],dp[i][(j+2)%3])+po[i][j];
        System.out.println(Math.max(dp[n][0],Math.max(dp[n][1],dp[n][2])));
    }
}
