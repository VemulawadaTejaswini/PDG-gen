import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author CodeMonk
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt(), e = in.nextInt(), f = in.nextInt();
            int[] ok = new int[50];
            ok[0] = 1;
            for (int i = 1; i < 50; i++) {
                if (i - a >= 0) ok[i] |= ok[i - a];
                if (i - b >= 0) ok[i] |= ok[i - b];
            }
            int[] ok2 = new int[4000];
            ok2[0] = 1;
            for (int i = 1; i < 4000; i++) {
                if (i - c >= 0) ok2[i] |= ok2[i - c];
                if (i - d >= 0) ok2[i] |= ok2[i - d];
            }
            long mw = 1, ms = -1;
            for (int i = 1; 100 * i <= f && i < 50; i++) {
                for (int j = 0; 100 * i + j <= f && j < 4000; j++) {
                    if (j > i * e) continue;
                    if (ok[i] == 0) continue;
                    if (ok2[j] == 0) continue;
                    if (ms * (100 * i + j) < (100 * mw + ms) * j) {
                        mw = i;
                        ms = j;
                    }
                }
            }
            out.println(mw * 100 + ms + " " + ms);
        }

    }
}

