import java.util.*;
import java.lang.*;
public class Main{
    public static int calc(int dp[],int arr[],int n,int k){
        dp[0]=0;
        for(int i=1;i<n;i++){
            dp[i]=999999;
            for(int j=i-1; j >= 0 && (i-j)<=k;j--){
                dp[i]=Math.min(dp[i],Math.abs(arr[i]-arr[j])+dp[j]);
            }
        }
        return dp[n-1];
    }
    public static void main(String[] args){
        int test;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        int dp[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=calc(dp,arr,n,k);
        System.out.println(res);
        }

    
}