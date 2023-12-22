import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int maxP(int[][] points){
        int[][] dp = new int[points.length][points[0].length];
        for (int i = 0; i < points[0].length; i++) {
            dp[0][i] = points[0][i];
        }
        for (int i = 1; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                for (int k = 0; k < points[0].length; k++) {
                    if (j != k){
                        dp[i][j] = Math.max(dp[i-1][k]+ points[i][j], dp[i][j]);
                    }
                }
            }
        }
        return max(dp[points.length-1]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[][] h = new int[N][3];
        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                h[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(maxP(h));
    }

    private static int max(int[] a){
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
}
