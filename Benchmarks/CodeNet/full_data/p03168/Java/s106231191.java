import java.util.Scanner;

class Coins {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        double[] p = new double[N];
        for (int i=0; i<N; i++) p[i] = stdIn.nextDouble();
        double[][] DP= new double[N+1][N+1];
        for (int i=1; i<N+1; i++) DP[i][0] = 0;
        DP[0][0] = 1;
        double sum = 0;
        for (int i=1; i<N+1; i++) {
            for (int j=0; j<i+1; j++) {
                if (j == 0) DP[i][0] = DP[i-1][0] * (1 - p[i-1]);
                else if (i == 1 && j == 1) DP[i][j] = p[0];
                else DP[i][j] = DP[i-1][j] * (1 - p[i-1]) + DP[i-1][j-1] * p[i-1];
            }
        }
        for (int i=N/2+1; i<N+1; i++) sum += DP[N][i];
        System.out.println(sum);
    }
}