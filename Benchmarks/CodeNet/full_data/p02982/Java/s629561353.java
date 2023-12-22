import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());
        int[][] X = new int[N][D];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < D; j++) {
                X[i][j] = Integer.parseInt(sc.next());
            }
        }

        int res = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (diff(X[i], X[j])) {
                    res++;
                }
            }
        }

        System.out.println(res);

    }

    private static boolean diff(int[] X, int[] Y) {
        int tmp = 0;
        for (int i = 0; i < X.length; i++) {
            tmp += Math.pow(Math.abs(X[i] - Y[i]), 2);
        }

        double d = Math.sqrt(tmp);
        return d == (int) d;
    }
}
