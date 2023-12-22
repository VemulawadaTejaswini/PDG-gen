import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int bag=sc.nextInt();
        int n=sc.nextInt();
        int dp[][]=new int[n+1][bag+1];
        int sh[]=new int[n+1];
        int xs[]=new int[n+1];
        for(int i=1;i<=n;i++){
            sh[i]=sc.nextInt();
            xs[i]=sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=bag;j++){
                int c=j/sh[i];
                if(j%sh[i]!=0&&i==1)
                    c++;
                if(dp[i][j]==0) {
                    if(i==1)
                        dp[i][j] = c * xs[i];
                    else
                        if(j<=sh[i])
                            dp[i][j]=Math.min(dp[i-1][j],xs[i]);
                        else
                            dp[i][j]=dp[i-1][j];
                }
                if(i>1&&j>=sh[i]) {
                    for (int k = 1; k <= c; k++)
                        dp[i][j] = Math.min(dp[i][j], dp[i][j - k * sh[i]] + k * xs[i]);
                }
            }
        }
        int min=dp[n][bag];
        System.out.println(min);
    }
}