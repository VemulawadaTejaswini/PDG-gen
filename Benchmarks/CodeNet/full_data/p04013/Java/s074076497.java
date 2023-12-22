import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    int A,N;
    int[] xs;
    int[][][] dp;
    Main () {
    }
    public static void main(String[] args) {
        Main m = new Main();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] strs = br.readLine().split(" ");
            m.N = Integer.parseInt(strs[0]);
            m.A = Integer.parseInt(strs[1]);
            strs = br.readLine().split(" ");
            m.xs = new int[m.N];
            for (int i = 0; i < m.N; i++) {
                m.xs[i] = Integer.parseInt(strs[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        m.dp = new int[m.N+1][m.N+1][m.N*m.A+1];
        m.dp[0][0][0] = 1;
        m.update();
        System.out.println(m.result());
        //m.check();
    }

    void update () {
        for (int i = 1; i <= N; i++) {
            int trg = xs[i-1];
            for (int j = 0; j <= i; j++) {
                for (int k = 0; k < dp[0][0].length; k++) {
                    if (k < trg) {
                        dp[i][j][k] = dp[i-1][j][k];
                    }
                    else if (j >= 1){
                        dp[i][j][k] = dp[i-1][j][k] + dp[i-1][j-1][k-trg];
                    }
                }
            }
        }
    }

    long result () {
        long res = 0;
        for (int i = 1; i <= N; i++) {
            res += dp[N][i][i*A];
        }
        return res;
    }

    void check () {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                for (int k = 0; k < dp[0][0].length; k++) {
                    if (dp[i][j][k] != 0)
                        System.out.printf("%d, %d, %d: %d\n", i, j, k, dp[i][j][k]);
                }
            }
        }
    }
}
