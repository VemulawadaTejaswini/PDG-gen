import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int dp[][] = new int[n+1][n+1];
        for(int i=n-1;i>=0;i--){
            for(int j=i;j<n;j++){
                if(i == j){
                    dp[i][j] = 0;
                }
                else{
                    dp[i][j] = Math.abs(arr[i+1]-arr[i])+dp[i+1][j];
                    if(i+2 < n){
                         dp[i][j] = Math.min(dp[i][j], Math.abs(arr[i+2]-arr[i])+dp[i+2][j] );
                    }
                }
            }
        }
        System.out.print(dp[0][n-1]);

    }
}