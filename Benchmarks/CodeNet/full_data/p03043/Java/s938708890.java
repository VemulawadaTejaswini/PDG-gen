import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    private static long n;

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            // 12:25-

            int n = sc.nextInt();
            int k = sc.nextInt();

            double prob = 0.0;
            for (int i = 1; i <= n; i++) {
                prob += chance(i, k) / ((double) n);
            }

            out.println(prob);
        }
    }

    private static double chance(int v, int k) {
        double p = 1.0;
        while (v < k) {
            v *= 2;
            p *= 0.5;
        }
        return p;
    }
}
