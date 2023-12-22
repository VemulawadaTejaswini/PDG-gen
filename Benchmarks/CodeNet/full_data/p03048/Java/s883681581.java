import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BRGBBoxes solver = new BRGBBoxes();
        solver.solve(1, in, out);
        out.close();
    }

    static class BRGBBoxes {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int r = in.nextInt();
            int g = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int ans = 0;
            for (int i = 0; i * r <= n; i++) {
                for (int j = 0; j * g <= n; j++) {
                    int rest = n - i * r - j * g;
                    if (rest >= 0 && rest % b == 0) ans++;
                }
            }
            out.println(ans);

        }

    }
}

