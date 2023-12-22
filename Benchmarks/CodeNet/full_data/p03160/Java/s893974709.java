import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main2 {
    public int minJumps(int[] heights) {
		return dfs(heights, 0);
	}
	private int dfs(int[] heights, int currPos) {
		int n = heights.length;
		if (currPos + 1 >= n) {
			return 0;
		}
		int oneJump = Math.abs(heights[currPos] - heights[currPos + 1]) + dfs(heights, currPos + 1);
		int twoJumps = Integer.MAX_VALUE;
		if (currPos + 2 < n) {
			twoJumps = Math.abs(heights[currPos] - heights[currPos + 2]) + dfs(heights, currPos + 2);
		}
		return Math.min(oneJump, twoJumps);
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
