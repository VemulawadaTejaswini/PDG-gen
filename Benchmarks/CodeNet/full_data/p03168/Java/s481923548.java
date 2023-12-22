import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static double moreHeads(double[] p_heads){
        double[] dp = new double[p_heads.length + 1];
        dp[0] = 1;
        for (int i = 0; i < p_heads.length; i++) {
            for (int j = i+1; j >= 0; j--) {
                dp[j] = j==0? dp[0]*(1-p_heads[i]) : dp[j-1]*p_heads[i] + dp[j]*(1-p_heads[i]);
            }
        }
        double ans = 0;
        for (int heads = 0; heads <= p_heads.length; heads++) {
            int tails = p_heads.length - heads;
            if (heads > tails){
                ans += dp[heads];
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        StringTokenizer st = new StringTokenizer(reader.readLine());
        double[] p_heads = new double[N];
        for (int i = 0; i < N; i++) {
            p_heads[i] = Double.parseDouble(st.nextToken());
        }
        System.out.println(moreHeads(p_heads));
    }
}
