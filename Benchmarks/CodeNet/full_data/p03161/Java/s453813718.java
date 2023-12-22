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
        int k = ms.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = ms.nextInt();
        }
        int[] dp = new int[n];
        Arrays.fill(dp, 10001);
        dp[0] = 0;
        for (int i = 1; i < k; i++) {
            //dp[i] = Math.min(Math.abs(heights[0] - heights[i]), dp[i - 1] + Math.abs(heights[i] - heights[i - 1]));
            dp[i] = Math.abs(heights[0] - heights[i]);
        }
        for (int i = k; i < n; i++) {
            for (int j = i - 1, cnt = k; j >= 0 && cnt > 0; j--, cnt--) {
                dp[i] = Math.min(dp[i], dp[j] + Math.abs(heights[i] - heights[j]));
            }
        }
        out.println(dp[n - 1]);
        out.close();
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
