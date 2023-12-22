import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        ModScanner ms = new ModScanner();
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        int n = ms.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = ms.nextInt();
        }
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        out.println(findTotalJumpCost(heights, 0, dp));
        out.close();
    }

    private static int findTotalJumpCost(int[] heights, int ind, int[] dp) {
        if (ind >= heights.length) {
            return 0;
        }
        if (dp[ind] != Integer.MAX_VALUE) {
            return dp[ind];
        }
        int next = findTotalJumpCost(heights, ind+1, dp);
        if (ind + 1 < heights.length) {
            dp[ind] = Math.min(next + Math.abs(heights[ind] - heights[ind+1]), dp[ind]);
        }
        int next_to_next = findTotalJumpCost(heights, ind+2, dp);
        if (ind + 2 < heights.length) {
            dp[ind] = Math.min(next_to_next + Math.abs(heights[ind] - heights[ind+2]), dp[ind]);
        }

        return dp[ind] != Integer.MAX_VALUE ? dp[ind] : 0;
    }

}

class ModScanner {

    BufferedReader br;
    StringTokenizer st;

    public ModScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String nextToken() throws Exception {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine());

        }
        return st.nextToken();
    }

    String nextString() throws Exception {
        return br.readLine();
    }


    int nextInt() throws Exception, Exception {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws Exception {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws Exception {
        return Double.parseDouble(nextToken());
    }

}
