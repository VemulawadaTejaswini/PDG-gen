import java.util.*;
import java.lang.*;
public class Main{
    public static int calc(int arr[][],int n,int dp[][]){

        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                if(i==0)dp[i][j]=arr[i][j];
                else if(j==0){
                    dp[i][j]=Math.max(Math.max(dp[i][j],dp[i-1][j+1]+arr[i][j]),dp[i-1][j+2]+arr[i][j]);
                }
                else if(j==1){
                    dp[i][j]=Math.max(Math.max(dp[i][j],dp[i-1][j+1]+arr[i][j]),dp[i-1][j-1]+arr[i][j]);
                }
                else if(j==2){
                    dp[i][j]=Math.max(Math.max(dp[i][j],dp[i-1][j-1]+arr[i][j]),dp[i-1][j-2]+arr[i][j]);
                }
                
            }
        }

        return Math.max(Math.max(dp[n-1][2],dp[n-1][0]),dp[n-1][1]);

    }

    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[][]=new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int dp[][]=new int[n][3];
        int res=calc(arr,n,dp);
        System.out.println(res);
    }
    
}