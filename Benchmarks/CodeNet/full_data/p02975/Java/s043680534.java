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
        AGC035_a solver = new AGC035_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class AGC035_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int[] val = new int[N];


            for (int i = 0; i < N; i++) {
                val[i] = in.nextInt();

            }
            String ret = "Yes";
            for (int i = 0; i < N; i++) {
                if (i == 0) {
                    if ((val[N - 1] ^ val[i + 1]) != val[i]) {
                        ret = "No";
                        break;
                    }
                } else if (i == (N - 1)) {
                    if ((val[i - 1] ^ val[0]) != val[i]) {
                        ret = "No";
                        break;
                    }
                } else {
                    if ((val[i - 1] ^ val[i + 1]) != val[i]) {
                        ret = "No";
                        break;
                    }
                }

            }
            out.println(ret);

        }

    }
}

