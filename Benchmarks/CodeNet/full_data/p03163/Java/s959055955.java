import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w= scanner.nextInt();
        int[][] arr = new int[n+1][2];
        for(int i = 1 ;i<=n ;++i){
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        long[][] dp = new long[n+1][w+1];
        for(int i = 1 ; i<=n ; ++i){
            for(int j = 0 ; j<=w ; ++j){
                if(arr[i][0]<=j){
                    dp[i][j] = Math.max(dp[i-1][j],arr[i][1]+dp[i-1][j-arr[i][0]]);
                }else{
                    dp[i][j] =dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][w]);
    }
}
