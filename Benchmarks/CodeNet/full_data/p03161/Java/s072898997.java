/**
 *
 * @author Daipayan Mukherjee
 * @Jadavpur University,Information Technology
 *
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
        int k = Integer.parseInt(st[1]);
        String[] s = br.readLine().split(" ");
        int[] heights = new int[n];
        for(int i=0;i<n;i++){
            heights[i] = Integer.parseInt(s[i]);
        }
        int[] dp = new int[n];
        Arrays.fill(dp,Integer.MAX_VALUE);
        
        dp[0] = 0;
        
        for(int i=1;i<n;i++){
            for(int j=i-1;j>=i-k && j>=0;j--){
                dp[i] = Math.min(dp[i],dp[j]+Math.abs(heights[j]-heights[i]));
            }
        }
        System.out.println(dp[n-1]);
    }
}
