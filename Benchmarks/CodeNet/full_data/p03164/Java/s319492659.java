import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        ModScanner ms = new ModScanner();
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        int n = ms.nextInt();
        int w = ms.nextInt();
        int[] wt = new int[n];
        int[] val = new int[n];
        int totVal = 0;
        for (int i = 0; i < n; i++) {
            wt[i] = ms.nextInt();
            val[i] = ms.nextInt();
            totVal += val[i];
        }

        long[] dp = new long[totVal + 1];

        for (int i = 1; i <= totVal; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        long maxProfit = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = totVal; j >= val[i - 1]; j--) {
                dp[j] = Math.min(dp[j], dp[j - val[i - 1]] + wt[i - 1]);
            }
        }
        for (int i = totVal; i >= 0; i--) {
            if (dp[i] <= w) {
                maxProfit = Math.max(maxProfit, i);
                break;
            }
        }

        out.println(maxProfit);
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
