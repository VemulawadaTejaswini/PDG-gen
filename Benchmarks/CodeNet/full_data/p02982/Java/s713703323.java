import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            // 10:16-

            int n = sc.nextInt();
            int d = sc.nextInt();
            int[][] vs = new int[n][d];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < d; j++) {
                    vs[i][j] = sc.nextInt();
                }
            }

            int pairs = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (iseven(dist(vs[i], vs[j]))) {
                        pairs++;
                    }
                }
            }

            out.println(pairs);
        }
    }

    private static boolean iseven(double val) {
        return val - (int) val == 0;
    }

    private static double dist(int[] a, int[] b) {
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            int t = a[i] - b[i];
            sum += t * t;
        }
        return Math.sqrt(sum);
    }
}
