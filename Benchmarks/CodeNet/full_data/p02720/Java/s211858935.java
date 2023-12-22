import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;

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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int k = Integer.parseInt(in.next());

            LinkedList<Long> A = new LinkedList<>();

            for (long i = 1; i < 10; i++) {
                dfs(1, i, A);
            }

            Collections.sort(A);
            // 出力
            out.println(A.get(k - 1));

        }

        public static void dfs(Integer keta, Long val, LinkedList<Long> A) {
            A.offerLast(val);
            if (keta == 10) {

                return;
            }

            for (int i = -1; i <= 1; i++) {
                long add = (val % 10) + i;
                if (0 <= add && add <= 9) dfs(keta + 1, val * 10 + add, A);
            }
        }

    }
}

