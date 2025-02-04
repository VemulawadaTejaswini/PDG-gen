import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
   public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.readLine();
            String[] split = br.readLine().split(" ");
            int n = split.length;
            double[] prob = new double[n];
            for (int i = 0; i < n; i++) {
               prob[i] = Double.parseDouble(split[i]); 
            }
            double[] dp = new double[n + 1];
            dp[0] = 1.0;
            for (int i = 1; i <= n; i++) {
                for (int j = Math.min(i + 1, n); j >= Math.max((i - 1)/2, 0); j--) {
                    dp[j] = (j == 0 ? 0 : dp[j - 1])*prob[i - 1] +  dp[j]*(1 - prob[i - 1]);
                }
            }
            double result = 0.0;
            for (int i = (n + 1) / 2 ; i <= n; i++) {
                result += dp[i];
            }
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
