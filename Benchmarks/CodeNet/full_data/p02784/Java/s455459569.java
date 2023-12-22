import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int H = Integer.parseInt(in.next());//体力
            int N = Integer.parseInt(in.next());//種類
            Integer[] A = new Integer[N];//必殺
            for (int i = 0; i < N; i++) {
                A[i] = Integer.valueOf(in.next());
            }
            Arrays.sort(A, Collections.reverseOrder());

            for (int i = 0; i < N; i++) {
                H -= A[i];
                if (H <= 0) {
                    out.println("Yes");
                    return;
                }
            }
            out.println("No");

        }

    }
}

