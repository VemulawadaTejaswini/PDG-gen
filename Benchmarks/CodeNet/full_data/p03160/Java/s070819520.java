import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public int minJumps(int[] heights) {
        int n = heights.length;
        int[] memo = new int[n];
        Arrays.fill(memo, -1);
		return dfs(heights, 0, memo);
	}
	private int dfs(int[] heights, int currPos, int[] memo) {
		int n = heights.length;
		if (currPos + 1 >= n) {
			return 0;
		}
        if (memo[currPos] != -1) {
            return memo[currPos];
        }
		int oneJump = Math.abs(heights[currPos] - heights[currPos + 1]) + dfs(heights, currPos + 1, memo);
		int twoJumps = Integer.MAX_VALUE;
		if (currPos + 2 < n) {
			twoJumps = Math.abs(heights[currPos] - heights[currPos + 2]) + dfs(heights, currPos + 2, memo);
		}
		return memo[currPos] = Math.min(oneJump, twoJumps);
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
