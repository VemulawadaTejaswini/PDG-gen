import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DiceandCoin solver = new DiceandCoin();
        solver.solve(1, in, out);
        out.close();
    }

    static class DiceandCoin {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            double result = 0;
            double n1 = (double) 1 / n;
            for (int i = 1; i <= n; i++) {
                if (i >= k) {
                    result += n1;
                } else {
                    double kk = (double) k / i;
                    int num = (int) Math.floor(Math.log(kk) / Math.log(2.0) + 1);
                    result += n1 * Math.pow((double) 1 / 2, num);
                }
            }
            out.println(result);
        }

    }
}

