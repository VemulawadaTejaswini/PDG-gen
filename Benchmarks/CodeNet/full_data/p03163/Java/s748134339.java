import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(f.readLine());

        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        long[][] dp = new long[N + 1][W + 1]; // default 0ed out

        long[][] items = new long[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(f.readLine());
            items[i][0] = Long.parseLong(st.nextToken());
            items[i][1] = Long.parseLong(st.nextToken());
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                if (j < items[i-1][0] ) { // first item indexing
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][ (int) (j - items[i-1][0])] + items[i-1][1]);
                }
            }
        }

        /* for (long[] i : dp){
            for (long j : i){
                System.out.print(String.valueOf(j) + " ");
            }
            System.out.println();
        } */

        System.out.println(dp[N][W]);
    }
}