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
            int k = Integer.parseInt(in.next());
            int q = Integer.parseInt(in.next());
            int a[] = new int[n];
            for (int i = 0; i < q; i++) {
                int num = Integer.parseInt(in.next());
                a[num - 1]++;
            }
            // 出力
            for (int i = 0; i < n; i++) {
                if (q - a[i] < k) out.println("Yes");
                else out.println("No");
            }


        }

    }
}

