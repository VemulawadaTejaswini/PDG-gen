import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static int N;
    public static HashSet<Integer> hs;
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        N = sc.nextInt();
        double[] ps = new double[N+1];
        double[][] dp = new double[N+1][N+1];

        for(int i=1; i<=N; ++i) {
            ps[i] = sc.nextDouble();
        }

//        for(int ij=0; ij<=N; ++ij) {
//            dp[0][ij] = 1;
//            dp[ij][0] = 1;
//        }

        dp[0][0] = 1;

        // i동전까지 고려 했을 때, Head가 j번 나올 확률
        for(int i=1; i<=N; ++i) {
            for(int j=0; j<=i; ++j) {
                if(j-1>=0)
                    dp[i][j] += dp[i-1][j-1] * ps[i];
                dp[i][j] += dp[i-1][j] * (1-ps[i]);
            }
        }

        d0(dp);

        int k = (N>>1) + 1;
        double p = 0;
        for(int j=k; j<=N; ++j) {
            p += dp[N][j];
        }

        pw.println(p);
        pw.close();
    }

    public static void d0(double[][] dp) {
        System.out.print("    ");

        for(int j=0; j<dp[0].length; ++j){
            System.out.printf("%3d ", j);
        }
        System.out.println();

        for(int i=0; i<dp.length; ++i){
            System.out.printf("%d|", i);
            for(int j=0; j<dp[0].length; ++j){
                System.out.printf("%f ", dp[i][j]);
            }
            System.out.println();
        }
    }
}
