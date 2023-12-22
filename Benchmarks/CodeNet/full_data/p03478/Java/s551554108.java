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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            long ans = 0;
            for (int i = 1; i <= n; i++) {
                String str = String.valueOf(i);
                int sum = 0;
                for (char c : str.toCharArray()) {
                    sum += Integer.valueOf(String.valueOf(c));
                }

                if (a <= sum && sum <= b) {
                    ans += i;
                }
            }

            out.print(ans);
        }

    }
}

