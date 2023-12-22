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
        TriangularRelationship solver = new TriangularRelationship();
        solver.solve(1, in, out);
        out.close();
    }

    static class TriangularRelationship {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();

            long result = 0;
            for (int a = 1; a <= n; a++) {
                int kk = 0;
                while (true) {
                    kk++;
                    int b = k * kk - a;
                    if (b <= 0) {
                        continue;
                    }
                    if (b > n) {
                        break;
                    }
                    int kkk = 0;
                    while (true) {
                        kkk++;
                        int c = k * kkk - a;
                        if (c <= 0) {
                            continue;
                        }
                        if (c > n) {
                            break;
                        }
                        if ((b + c) % k != 0) {
                            continue;
                        }
                        result++;
                    }
                }
            }
            out.print(result);
        }

    }
}

