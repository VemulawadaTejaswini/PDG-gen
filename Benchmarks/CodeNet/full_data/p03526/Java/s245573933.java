import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] hp = new int[n][];
        for(int i=0;i<n;i++) hp[i]=new int[]{sc.nextInt(),sc.nextInt()};
        Arrays.sort(hp,new myC());
        long inf = Long.MAX_VALUE/10;
        long[] dp = new long[n+1];
        Arrays.fill(dp,inf);
        dp[0]=0;
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                if(dp[j-1]<=hp[i-1][0]) dp[j]=Math.min(dp[j],dp[j-1]+hp[i-1][1]);
            }
        }
        int ans = 0;
        for(int i=1;i<=n;i++){
            if(dp[i]<inf) ans = Math.max(ans,i);
        }
        System.out.println(ans);
    }
    static class myC implements Comparator<int[]>{
        public int compare(int[] a, int[] b){
            if(a[0]+a[1]-b[0]-b[1]!=0) return a[0]+a[1]-b[0]-b[1];
            else return a[0]-b[0];
        }
    }
}
