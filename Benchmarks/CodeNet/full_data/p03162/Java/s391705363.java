
import java.util.Scanner;

public class Main {
    static int profit;
    public static int dpSolution(int a[][],int n){
        int dp[][] = new int[n][3];
        for(int i=0;i<3;i++){
            dp[0][i] = a[0][i];
        }
        int ans=0;
        for(int i=1;i<n;i++){

            dp[i][0]=a[i][0]+Math.max(dp[i-1][1],dp[i-1][2]);
            dp[i][1]=a[i][1]+Math.max(dp[i-1][0],dp[i-1][2]);
            dp[i][2]=a[i][2]+Math.max(dp[i-1][0],dp[i-1][1]);
            if(i==n-1){
                ans = Math.max(dp[i][0],Math.max(dp[i][1],dp[i][2]));
            }
        }
        return ans;
    }
    public static void recSol(int a[][],int i,int j,int p,int n){
        if(i>=n){
            if(profit<p){
                profit = p;
            }
            return;
        }
        if(j==0){
            recSol(a,i+1,1,p+a[i][j],n);
            recSol(a,i+1,2,p+a[i][j],n);
        }
        else if(j==1){
            recSol(a,i+1,0,p+a[i][j],n);
            recSol(a,i+1,2,p+a[i][j],n);
        }
        else{
            recSol(a,i+1,0,p+a[i][j],n);
            recSol(a,i+1,1,p+a[i][j],n);
        }
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                a[i][j] = sc.nextInt();
            }
        }
//        recSol(a,0,0,0,n);
//        recSol(a,0,1,0,n);
//        recSol(a,0,2,0,n);
        System.out.println(dpSolution(a,n));


    }
}
