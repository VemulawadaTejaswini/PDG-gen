import java.util.Scanner;

public class Main {
    public static boolean[][][] visited;

    public static double sushi(double[][][] dp, int i, int j, int k, int N) {
        if(i <=0 && j <= 0 && k <= 0) {
            return 0;
        }

        if(visited[i][j][k]) {
            return dp[i][j][k];
        }

        visited[i][j][k] = true;

        double sum = i+j+k;
        dp[i][j][k] = N/sum;
        if(i > 0) {
            double r1;
            r1 = sushi(dp, i-1, j, k, N);
            r1 = r1 * i / sum;
            dp[i][j][k] += r1;
        }
        if(j > 0) {
            double r2;
            r2 = sushi(dp, i+1, j-1, k, N);
            r2 = r2 * j / sum;
            dp[i][j][k] += r2;
        }
        if(k > 0) {
            double r3;
            r3 = sushi(dp, i, j+1, k-1, N);
            r3 = r3 * k / sum;
            dp[i][j][k] += r3;
        }

        return dp[i][j][k];
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        double[][][] dp;

        int[] a = new int[Math.max(N+1, 3+1)];

        for(int i=0; i<N; ++i) {
            int t = sc.nextInt();
            a[t]++;
        }

        int fromA3 = a[3];
        int fromA23 = a[2] + fromA3;
        dp = new double[a[1]+1+fromA23][a[2]+1+fromA3][a[3]+1];
        visited = new boolean[a[1]+1+fromA23][a[2]+1+fromA3][a[3]+1];

        double r = sushi(dp, a[1], a[2], a[3], N);
        System.out.printf("%.10f\n", r);
    }
}
