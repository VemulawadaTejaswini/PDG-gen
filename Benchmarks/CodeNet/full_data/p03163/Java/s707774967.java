import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        long[][] dp = new long[N+1][W+1];

        for(int i = 1; i < N + 1; i++) {

            String[] input_array = br.readLine().split(" ");
            int weight = Integer.parseInt(input_array[0]);
            long value = Long.parseLong(input_array[1]);
            
            for(int j = 0; j <= W; j++) {
                if(j - weight >= 0) {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j - weight] + value);
                }
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j]);
            }
        }
        
        pw.println( dp[N][W]);
        pw.close();
        br.close();
    }
}
