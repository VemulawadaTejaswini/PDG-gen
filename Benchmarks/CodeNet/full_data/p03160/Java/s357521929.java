import java.io.*;
import java.util.*;

public class Main {
    static int[] height;
    static int[] dp;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        height = new int[n+1];
        dp = new int[n+1];
        for(int x = 1; x<=n; x++){
            height[x] = sc.nextInt();
        }
        Arrays.fill(dp, Integer.MAX_VALUE);
        System.out.println(frog(n));
        //System.out.println(Arrays.toString(dp));


    }

    public static int frog(int i){
        if(dp[i] != Integer.MAX_VALUE)
            return dp[i];
        if(i == 2){
            return dp[i] = Math.abs(height[2] - height[1]);
        }
        if(i == 1)
            return dp[i] = 0;
        return dp[i] = Math.min(frog(i-1) + Math.abs(height[i] - height[i-1]), frog(i-2)+ Math.abs(height[i] - height[i-2]));

    }
}
