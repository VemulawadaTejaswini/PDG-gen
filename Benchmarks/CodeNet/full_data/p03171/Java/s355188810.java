import java.util.*;
 
public class Main {

    public static long dp[][] = new long[3001][3001];

    public static long solve(int i,int j,int arr[],int turn){
        if(i > j) return 0;
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(turn == 1) dp[i][j] = Math.max( arr[i]+solve(i+1,j,arr,0), arr[j]+solve(i,j-1,arr,0) );
        else dp[i][j] = Math.min(solve(i+1,j,arr,1),solve(i,j-1,arr,1));
        return dp[i][j];
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        long sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        for(int i=0;i<=3000;i++){
            for(int j=0;j<=3000;j++){
                dp[i][j] = -1;
            }
        }

        long x = solve(0,n-1,arr,1);
        long y = sum - x;

        System.out.println(x - y);
    }
}