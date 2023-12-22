import java.util.*;

public class Main {

    public static long sum[][] = new long[401][401];
    public static long dp[][] = new long[401][401];

    public static long solve(int s,int e,int arr[]){
        if(s >= e) return 0;
        if(dp[s][e] != -1) return dp[s][e];
        long minCost = (long)(10e12);
        for(int k=s;k<e;k++){
            minCost = Math.min(minCost,sum[s][e] + solve(s,k,arr) + solve(k+1,e,arr));
        }
        return dp[s][e] = minCost;
    }

    public static void preprocess(int n,int arr[]){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                sum[i][j] = arr[j] + ((i == j) ? 0 : sum[i][j-1]); 
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        for(int i=1;i<=n;i++) arr[i] = sc.nextInt();
        for(int i=0;i<=400;i++){
            for(int j=0;j<=400;j++){
                dp[i][j] = -1;
            }
        }
        preprocess(n,arr);
        System.out.println(solve(1,n,arr));
    }

}