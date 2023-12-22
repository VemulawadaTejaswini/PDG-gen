import java.io.*;
import java.util.*;
@SuppressWarnings("unused")
public class Main{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String s[] = br.readLine().trim().split(" ");
        int n = Integer.parseInt(s[0]);
        int w = Integer.parseInt(s[1]);
        int[] val = new int[n];
        long[] wt = new long[n];
        for(int i=0;i<n;i++) {
            String st[] = br.readLine().trim().split(" ");
            wt[i] = Integer.parseInt(st[0]);
            val[i] = Integer.parseInt(st[1]);
        }
        int maxval = (int) 1e4+10;
        long[] dp = new long[maxval];
        long INF = (long) 1e18;
        Arrays.fill(dp, INF);
        dp[0] = 0;
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=maxval-1;j >= val[i];--j){
                dp[j] = Math.min(dp[j], dp[j-val[i]] + wt[i]);
                if(dp[j]<=w) ans = Math.max(ans, j);
            }
        }
        
        out.println(ans);
        out.flush();
    }
}