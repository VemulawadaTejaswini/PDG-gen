import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public int minJumps(int[] heights) {
        int n = heights.length;
        int[] dp = new int[n];
        for (int i = 1; i < n; i++) {
            int oneJump = Math.abs(heights[i] - heights[i - 1]) + dp[i - 1];
            int twoJumps = 1_000_000_000;
            if (i > 1) {
                twoJumps = Math.abs(heights[i] - heights[i - 2]) + dp[i - 2];
            }
            dp[i] = Math.min(oneJump, twoJumps);
        }
        return dp[n - 1];
    }
	

    public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            String heightsStr = br.readLine();
            String[] split = heightsStr.split(" ");
          	int[] heights = new int[n];
            for (int i = 0; i < n; i++) {
              	heights[i] = Integer.parseInt(split[i]);
            }
          	Main app = new Main();
            int result = app.minJumps(heights);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
