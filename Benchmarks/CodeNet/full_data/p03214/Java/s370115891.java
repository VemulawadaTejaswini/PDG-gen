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
        Dowango_A solver = new Dowango_A();
        solver.solve(1, in, out);
        out.close();
    }

    static class Dowango_A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            float ave = 0;
            float[] frame = new float[n];
            for (int i = 0; i < n; i++) {
                int tmp = in.nextInt();
                frame[i] = tmp;
                ave += tmp;
            }
            ave /= n;

            for (int i = 0; i < n; i++) {
                frame[i] = Math.abs(frame[i] - ave);
            }
            float min = 10000;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (frame[i] < min) {
                    ans = i;
                    min = frame[i];
                }
            }

            out.print(ans);
        }

    }
}

