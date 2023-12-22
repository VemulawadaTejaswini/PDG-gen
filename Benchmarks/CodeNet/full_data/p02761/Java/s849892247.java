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
        abc157_c solver = new abc157_c();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc157_c {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();
            int s[] = new int[M];
            int c[] = new int[M];
            int minn = 1;

            for (int i = 0; i < M; i++) {
                int inps = in.nextInt();
                int inpc = in.nextInt();
                //minn = Math.min(minn, inps);
                s[i] = inps;
                c[i] = inpc;
            }
            if (N == 1) {
                minn = 0;
            } else {
                for (int i = 0; i < N - 1; i++) {
                    minn *= 10;
                }
            }
            //minn *= 10;
            int res = -1;
            for (int i = minn; i < 999; i++) {
                //     int i = 700;
                boolean isthis = false;
                for (int j = 0; j < M; j++) {
                    char ci = String.valueOf(i).charAt(s[j] - 1);
                    char si = String.valueOf(c[j]).charAt(0);
                    if (ci == si) {
                        isthis = true;
                    } else {
                        isthis = false;
                        break;
                    }
                }
                if (isthis) {
                    out.println(i);
                    return;
                }
            }
            out.println("-1");

        }

    }
}

