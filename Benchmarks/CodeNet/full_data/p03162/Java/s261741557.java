/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class Main {
    static int[][] a;
    static int[][] dp;
    static int n;
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=new int[n][3];
        dp=new int[n][3];
        for(int[] i:dp)Arrays.fill(i,-1);
        for(int i=0;i<n;i++){
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
            a[i][2]=sc.nextInt();
        }
        int ans=0;
        ans=a[0][0]+solve(1,0);
        ans=Math.max(ans,a[0][1]+solve(1,1));
        ans=Math.max(ans,a[0][2]+solve(1,2));
        System.out.println(ans);
    }
    static int solve(int day,int flag){
        if(day==n)return 0;
        if(dp[day][flag]!=-1)return dp[day][flag];
        int ans=0;
        if(flag==0){
            ans=Math.max(ans,a[day][1]+solve(day+1,1));
            ans=Math.max(ans,a[day][2]+solve(day+1,2));
        }
        else if(flag==1){
            ans=Math.max(ans,a[day][0]+solve(day+1,0));
            ans=Math.max(ans,a[day][2]+solve(day+1,2));
        }
        else{
            ans=Math.max(ans,a[day][0]+solve(day+1,0));
            ans=Math.max(ans,a[day][1]+solve(day+1,1));
        }
        dp[day][flag]=ans;
        return dp[day][flag];
    }
}
