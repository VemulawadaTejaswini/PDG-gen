import java.util.Scanner;

public class Main{
    public static int minCostDp(int a[],int n){
        int dp[] = new int[n+1];
        dp[1] = 0;
        dp[2] = Math.abs(a[2]-a[1]);
        for(int i=3;i<=n;i++){
            dp[i] = Math.min(dp[i-1]+Math.abs(a[i]-a[i-1]),dp[i-2]+Math.abs(a[i]-a[i-2]));
        }
        return dp[n];
    }
    public static int minCostRecursive(int a[],int n,int i,int j,int minSum){
        if(j==n)
            return minSum+Math.abs(a[j]-a[i]);

        if(j>n)
            return Integer.MAX_VALUE;

        minSum = minSum+Math.abs(a[i]-a[j]);
        i=j;
        int ans1 = minCostRecursive(a,n,i,j+1,minSum);
        int ans2 = minCostRecursive(a,n,i,j+2,minSum);
        return Math.min(ans1,ans2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n+1];
        for(int i=1;i<=n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(minCostDp(a,n));

    }
}