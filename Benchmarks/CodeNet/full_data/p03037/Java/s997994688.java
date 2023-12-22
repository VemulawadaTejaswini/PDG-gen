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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int m = Integer.parseInt(in.next());
            int lr[][] = new int[m][2];
            int min = 1;
            int max = n;
            for (int i = 0; i < m; i++) {
                lr[i][0] = Integer.parseInt(in.next());
                lr[i][1] = Integer.parseInt(in.next());
                min = Math.max(min, lr[i][0]);
                max = Math.min(max, lr[i][1]);
            }
            // 出力
            out.println(Math.max(0, max - min + 1));

        }

    }
}

