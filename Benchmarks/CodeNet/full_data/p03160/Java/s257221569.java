import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public int minJumps(int[] heights) {
        int n = heights.length;
        int[] memo = new int[n];
        Arrays.fill(memo, -1);
		dfs(heights, 0, memo);
        // System.out.println(Arrays.toString(memo));
        return memo[0];
	}
	private int dfs(int[] heights, int position, int[] memo) {
		int n = heights.length;
		if (position >= n - 1) {
            return 0;
		}
        if (memo[position] != -1) {
            return memo[position];
        }
		int result = Math.abs(heights[position] - heights[position + 1]) + dfs(heights, position + 1, memo);
        if (position + 2 < n) {
            result = Math.min(result, Math.abs(heights[position] - heights[position + 2]) + dfs(heights, position + 2, memo)); 
        }
        return memo[position] = result;
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
