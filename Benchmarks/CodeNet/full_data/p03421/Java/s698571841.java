
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();

        LinkedList<Long> ans = new LinkedList<>();
        PrintWriter out = new PrintWriter(System.out);

        if (a == 1 || b == 1) {
            if (a + b == n + 1) {
                if (b == 1) {
                    out.print(1);
                    for (long i = 2; i <= n; i++) out.print(" " + i);
                } else {
                    out.print(n);
                    for (;n > 0; n--) out.print(" " + n);
                }
            } else {
                out.print(-1);
            }
        } else if ((a - 1) * b + 1 >= n && n >= a + b - 1) {
            for (long i = 0; i < b; i++) {
                for (long j = Math.min(a - 1, n + i - b) - 1; j >= 0; j--)
                    ans.addLast(n - j);
                n -= Math.min(a - 1, n + i - b);
//                debug(n, i, ans);
            }
            ans.addFirst(1L);
            boolean isFirst = true;
            for (long x : ans) {
                if (isFirst) {
                    isFirst = false;
                    out.print(x);
                } else {
                    out.print(" " + x);
                }
            }
        } else {
            out.println(-1);
        }
        out.println();
        out.flush();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
