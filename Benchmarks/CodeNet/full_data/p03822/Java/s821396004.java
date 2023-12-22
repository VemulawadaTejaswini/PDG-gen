import java.util.*;
import java.io.*;

public class Main {
    
    static int n;
    static int[] a;
    static int[] index;
    static int[] dp;
    static int[] times;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        a=new int[n-1];
        index=new int[n];
        dp=new int[n+1];
        times=new int[n];
        index[0]=1;
        Arrays.fill(dp,-1);
        for(int i=0;i<n-1;i++){
            a[i]=Integer.parseInt(br.readLine());
        }System.out.println(dfs(1));
    }
    
    static int dfs(int target){
        //System.out.println("target="+target);
        if(dp[target]!=-1){ return dp[target]; }
        int count=0;
        int ret=0;
        for(int i=0;i<n-1;i++){
            if(a[i]==target){
                count++;
                ret=Math.max(ret,dfs(i+2)+count);
            }
        }dp[target]=ret;
        return dp[target];
    }
}