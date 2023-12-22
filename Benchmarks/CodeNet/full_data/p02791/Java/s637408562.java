import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int[] dp =  new int[n];
        for(int i  = 0 ; i  < n ;i ++){
            arr[i] = scn.nextInt();
        }
        dp[0]=arr[0];
        int max = 0 ;
        for(int i =0;i<n;i++){
            int curr = arr[i];
            dp[i] = 1;
            for(int  j = i-1;j>=0;j--){
                if(arr[j]>curr){
                    dp[i] = Math.max(dp[j]+1,dp[i]);
                }
            }
            max = Math.max(dp[i],max);
        }

        System.out.println(max);
    }
}
