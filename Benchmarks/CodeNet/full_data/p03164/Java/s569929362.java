import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(f.readLine());


        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        long[][] items = new long[N][2];

        int sumValues = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(f.readLine());
            items[i][0] = Long.parseLong(st.nextToken());
            items[i][1] = Long.parseLong(st.nextToken());
            sumValues += items[i][1];
        }
        // System.out.println(sumValues);

        // long[][] dp = new long[N + 1][W + 1]; // default 0ed out

        long[] dp = new long[sumValues + 1];
        Arrays.fill(dp, Long.MAX_VALUE);
        dp[0] = 0;

        long curSubsetValueSum = 0;
        for (int i = 1; i < N + 1; i++) {
            curSubsetValueSum += items[i-1][1];
            for (int j = sumValues; j >= 1; j--) {
                if (curSubsetValueSum < j) {

                } else if (items[i-1][1] > j) {

                } else {
                    long previousMin = dp[(int) (j - items[i - 1][1])];
                    if (previousMin == Long.MAX_VALUE) {

                    } else {previousMin += items[i-1][0];}
                    dp[j] = Math.min(previousMin, dp[j]);
                    if (dp[j] <= W && i == N) {System.out.println(j); break;}
                }
            }
        }

        /*for (long l : dp){
            System.out.print(String.valueOf(l) + " ");
        }*/
        // System.out.println();

    }
}