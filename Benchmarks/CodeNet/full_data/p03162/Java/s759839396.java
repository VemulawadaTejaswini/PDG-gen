import java.awt.*;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][3];
        for (int i=0;i<n;i++){
            for (int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int dp[][]=new int[n][3];
        dp[0]=arr[0];
        for (int i=1;i<n;i++){
            dp[i][0]=Math.max(dp[i-1][1],dp[i-1][2])+arr[i][0];
            dp[i][1]=Math.max(dp[i-1][0],dp[i-1][2])+arr[i][1];
            dp[i][2]=Math.max(dp[i-1][1],dp[i-1][0])+arr[i][2];
        }
        System.out.println(Math.max(Math.max(dp[n-1][0],dp[n-1][1]),dp[n-1][2]));
    }
}