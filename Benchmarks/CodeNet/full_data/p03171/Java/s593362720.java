import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        String[] lo =reader.readLine().split(" ");
        int[] list = new int[N];
        for (int i = 0; i <N ; i++) {
            list[i] = Integer.parseInt(lo[i]);
        }
        long[][] dp = new long[N][N];
        for (int i = N-1; i>=0 ; i--) {
            for (int j =i; j <N ; j++) {
                dp[i][j] = i==j?list[j]:Math.max(list[j]-dp[i][j-1],list[i]-dp[i+1][j]);
            }
        }

        System.out.println(dp[0][N-1]);
    }
}
