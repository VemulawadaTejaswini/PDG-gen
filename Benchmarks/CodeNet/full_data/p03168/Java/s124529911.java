import java.util.Scanner;

class Main {


    public static double prob(int N, double[] proba) {

        double[][] dp = new double[N + 1][N + 1];


        dp[0][0] = 1;

        for(int coin = 1; coin <= N; coin++) {
            dp[coin][0] = dp[coin - 1][0] * (1- proba[coin-1]);
        }

        for(int coin = 1; coin <= N; coin++) {
            dp[coin][coin] = dp[coin-1][coin-1] * (proba[coin-1]);
        }

        for(int coin=1; coin<=N; coin++) {
            for(int heads = 1; heads <= coin; heads++) {
                dp[coin][heads] = dp[coin - 1][heads - 1] * proba[coin - 1] + dp[coin - 1][heads] * (1 - proba[coin - 1]);
            }
        }

        double totalProba = 0.0;

        for(int heads=N/2+1; heads<=N; heads++) {
            totalProba = totalProba + dp[N][heads];
        }
        return totalProba;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        double[] p = new double[N];

        for(int i=0; i<N; i++)
            p[i] = scanner.nextDouble();

        System.out.println(prob(N, p));

    }
}
