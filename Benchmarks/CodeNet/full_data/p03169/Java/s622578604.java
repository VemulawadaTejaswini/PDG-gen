import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int one = 0;
        int two = 0;
        int three = 0;

        double[][][] dp = new double[n+2][n+2][n+2];

        for (int i=0; i<n; i++) {
            int t = sc.nextInt();
            if (t == 1) one++;
            if (t == 2) two++;
            if (t == 3) three++;
        }

        for (int i=0; i<=n; i++) {
            for (int j=0; j<=n; j++) {
                for (int k=0; k<=n; k++) {
                    if (i == 0 && j == 0 && k == 0) continue;
                    if (i + j + k > n) continue;
                    double sum = i + j + k, p = n / sum;
                    if (0 < k) dp[k][j][i] += dp[k-1][j][i] * k / sum;
                    if (0 < j) dp[k][j][i] += dp[k+1][j-1][i] * j / sum;
                    if (0 < i) dp[k][j][i] += dp[k][j+1][i-1] * i / sum;
                    dp[k][j][i] += p;
//                    dp[i][j][k] += n;
//                    dp[i][j][k] /= (double) (i + j + k);
                }
            }
        }

//        for (int i=0; i<=n; i++) {
//            for (int j=0; j<n; j++) {
//                for (int k=0; k<n; k++) {
//                    if (i == 0 && j == 0 && k == 0) continue;
//                    double sum = i + j + k, p = n / sum;
//                    if (0 < i) dp[i][j][k] += dp[i-1][j+1][k] * i / sum;
//                    if (0 < j) dp[i][j][k] += dp[i][j-1][k+1] * j / sum;
//                    if (0 < k) dp[i][j][k] += dp[i][j][k-1] * k / sum;
//                    dp[i][j][k] += p;
//                }
//            }
//        }




//        System.out.println(res);

//        System.out.println(dp[three][two][one]);
        System.out.println(dp[one][two][three]);



    }

}

