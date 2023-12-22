import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        AGC029_B solver = new AGC029_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class AGC029_B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            ArrayList<Long> balls = new ArrayList<Long>();

            for (int i = 0; i < n; i++) {
                balls.add(in.nextLong());
            }

            Collections.sort(balls);

            long tmp;
            long sub;
            long ans = 0;
            ArrayList<Long> already = new ArrayList<Long>();
            for (int i = balls.size() - 1; i > 0; i--) {
                tmp = balls.get(i);
                long binary = (long) Math.floor(Math.log(tmp * 2) / Math.log(2));
                binary = (long) Math.pow(2, binary);
                sub = binary - tmp;
                if (balls.contains(sub) && sub != tmp && !already.contains(sub)) {
                    already.add(sub);
                    ans++;
                    balls.set(i, Long.MAX_VALUE);
                }
            }

            out.print(ans);


        }

    }
}

