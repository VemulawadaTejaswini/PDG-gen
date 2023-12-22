import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
   	public int maxHappiness(int[][] plan) {
        int n = plan.length;
        int[][] dp = new int[n + 1][3];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 3; j++) {
                int act1 = plan[i - 1][(j + 1) % 3] + dp[i - 1][(j + 1) % 3];
                int act2 = plan[i - 1][(j + 2) % 3] + dp[i - 1][(j + 2) % 3];
                dp[i][j] = Math.max(act1, act2);
            }
        }
        return Math.max(dp[n][0], Math.max(dp[n][1], dp[n][2])); 
	}
    public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
          	int[][] plan = new int[n][3];
            for (int i = 0; i < n; i++) {
                String[] split = br.readLine().split(" ");
                for (int j = 0; j < 3; j++) {
                    plan[i][j] = Integer.parseInt(split[j]);
                }
            }
          	Main app = new Main();
            int result = app.maxHappiness(plan);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
