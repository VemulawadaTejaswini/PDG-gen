import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.AbstractCollection;
import java.util.Scanner;
import java.util.ArrayDeque;

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
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
            }
            int ans = 0;
            boolean flg = true;
            ArrayDeque<String> deq = new ArrayDeque<>();
            for (int i = 0; i < n; i++) {
                if (flg) {
                    deq.offerLast(String.valueOf(a[i]));
                    flg = !flg;
                } else {
                    deq.offerFirst(String.valueOf(a[i]));
                    flg = !flg;
                }
            }

            StringBuilder tmp = new StringBuilder();
            tmp.append(deq.toString().replaceAll(",", ""));
            if (n != 1 && !flg) tmp.reverse();
            out.println(tmp.substring(1, tmp.length() - 1));

        }

    }
}

