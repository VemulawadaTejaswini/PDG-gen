import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int D = sc.nextInt();
        int[][] X = new int[N][D];
        for (int i=0; i<N; i++) {
            for (int j=0; j<D; j++) {
                X[i][j] = sc.nextInt();
            }
        }

        System.out.println(solve(N, D, X));
    }

    private static int solve(int N, int D, int[][] X) {
        int count = 0;

        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {
                double dist = 0;
                for (int k=0; k<D; k++) {
                    dist += Math.pow(X[i][k] - X[j][k], 2);
                }
                dist = Math.sqrt(dist);

                if (Math.abs(dist - (int)dist) == 0) count++;
            }
        }

        return count;
    }
}
