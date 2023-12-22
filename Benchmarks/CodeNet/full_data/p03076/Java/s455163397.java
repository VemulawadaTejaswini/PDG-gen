import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int c[] = new int[5];
            int sum[] = new int[5];
            for (int i = 0; i < 5; i++) {
                c[i] = Integer.parseInt(in.next());
            }


            for (int i = 0; i < 5; i++) {
                sum[i] = c[i];
                for (int j = 0; j < 5; j++) {
                    if (j != i) {
                        if (c[j] % 10 == 0) {
                            sum[i] += c[j];
                        } else {
                            sum[i] += c[j] + 10 - c[j] % 10;
                        }
                    }
                }
            }
            // 出力
            Arrays.sort(sum);
            out.println(sum[0]);

        }

    }
}

