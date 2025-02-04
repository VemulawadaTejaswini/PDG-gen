import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        if(n==0){
            System.out.println(0);
            return;
        }
        int []arr = new int[n];
        for(int i=0;i<n;i++)arr[i] = in.nextInt();
        int []dp = new int[n];
        Arrays.fill(dp,-1);
        int ans = recur(0,dp,arr);
        System.out.println(ans);
    }
    public static int recur(int index,int []dp,int []arr){
        if(index==dp.length)return 0;
        if(index==dp.length-1)return 0;
        if(dp[index]!=-1)return dp[index];
        int ret = Math.abs(arr[index]-arr[index+1])+recur(index+1,dp,arr);
        if(index+2<arr.length){
            ret = Math.min(ret,Math.abs(arr[index]-arr[index+2])+recur(index+2,dp,arr));
        }
        return dp[index] = ret;
    }
}
