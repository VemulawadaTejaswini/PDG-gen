import java.util.*;
import java.lang.*;
public class Main{
    public static int calc(int dp[],int arr[],int n,int k){
        dp[0]=0;
        dp[1]=Math.abs(arr[0]-arr[1]);
        for(int i=2;i<n;i++){
            int min=9999;
            for(int j=1;j<=k;j++){
                if(i-j>=0){
                    min=Math.min(min,Math.abs(arr[i]-arr[i-j])+dp[i-j]);
                }
                
            }
            dp[i]=min;
        }
        // System.out.println(Arrays.toString(dp));
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