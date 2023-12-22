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
        int[][] input = new int[n][3];
        for (int i = 0; i < n; i++) {
            input[i][0] = ms.nextInt();
            input[i][1] = ms.nextInt();
            input[i][2] = ms.nextInt();
        }
        int[][] dp = new int[n][3];
        dp[0][0] = input[0][0];
        dp[0][1] = input[0][1];
        dp[0][2] = input[0][2];
        for (int i = 1; i < n; i++) {
            dp[i][0] = input[i][0] + Math.max(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = input[i][1] + Math.max(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = input[i][2] + Math.max(dp[i - 1][0], dp[i - 1][1]);
        }
        out.println(Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2])));
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
