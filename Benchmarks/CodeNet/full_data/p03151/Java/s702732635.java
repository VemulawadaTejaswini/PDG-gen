import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

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
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
            }
            for (int i = 0; i < n; i++) {
                b[i] = Integer.parseInt(in.next());
            }

            List<Long> plus = new ArrayList<>();
            long sum = 0;
            long num = 0;
            for (int i = 0; i < n; i++) {
                long diff = a[i] - b[i];
                if (diff < 0) {
                    sum -= diff;
                    ++num;
                } else {
                    plus.add(diff);
                }
            }

            if (num == 0) {
                out.println(0);
                return;
            } else {
                long ans = num;
                Collections.sort(plus, Collections.reverseOrder());
                long ptr = 0;
                for (int i = 0; i < plus.size(); i++) {
                    ptr += plus.get(i);
                    ++ans;
                    if (ptr >= sum) {
//                    ++ans;
                        break;
                    }
                }

                // 出力
                if (ptr >= sum) out.println(ans);
                else out.println(-1);
            }

        }

    }
}

