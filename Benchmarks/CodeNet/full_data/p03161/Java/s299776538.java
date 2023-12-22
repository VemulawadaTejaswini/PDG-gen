import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public int minJumps(int[] heights, int K) {
        return dfs(heights, 0, K);
    }
    private int dfs(int[] heights, int currPosition, int K) {
        int n = heights.length;
        if (currPosition >= n - 1) {
            return 0;
        }
        int result = Integer.MAX_VALUE;
        for (int i = 1; i <= K; i++) {
            if (currPosition + i >= n) {
                break;
            }
            result = Math.min(result, Math.abs(heights[currPosition] - heights[currPosition + i]) + dfs(heights, currPosition + i, K));
        }
        return result;
    }


    public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] strs = br.readLine().split(" ");
            int n = Integer.parseInt(strs[0]);
            int K = Integer.parseInt(strs[1]);
            String heightsStr = br.readLine();
            String[] split = heightsStr.split(" ");
          	int[] heights = new int[n];
            for (int i = 0; i < n; i++) {
              	heights[i] = Integer.parseInt(split[i]);
            }
          	Main app = new Main();
            int result = app.minJumps(heights, K);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
