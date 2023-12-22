import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(input.readLine());
        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int[] weights = new int[N];
        long[] values = new long[N];
        for(int n = 0; n<N; n++){
            st = new StringTokenizer(input.readLine());
            weights[n] = Integer.parseInt(st.nextToken());
            values[n] = Integer.parseInt(st.nextToken());
        }
        long[] dp = new long[W+1];
        for(int i = 0; i<N; i++){
            for(int j = W; j>=0; j--){
                if(j+weights[i]<=W) dp[j+weights[i]] = Math.max(dp[j] + values[i], dp[j+weights[i]]);
            }
        }
        
        output.println(dp[W]);
        output.close();
    }
}