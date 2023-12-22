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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int h = Integer.parseInt(in.next());
            int w = Integer.parseInt(in.next());
            int hc = 0;
            int wc = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if ("snuke".equals(in.next())) {
                        hc = i;
                        wc = j;
                    }
                }
            }

            // 出力
            out.println(String.valueOf((char) (wc + 'A')) + Integer.toString(hc + 1));

        }

    }
}

