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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final int N = Integer.parseInt(in.next());
            final int K = Integer.parseInt(in.next());
            final int R = Integer.parseInt(in.next());
            final int S = Integer.parseInt(in.next());
            final int P = Integer.parseInt(in.next());
            final char[] T = in.next().toCharArray();

            int ret = 0;
            for (int i = 0; i < N; i++) {
                int next = i + K;
                if (next < N && T[i] == T[next]) {
                    T[next] = ' ';
                }

                switch (T[i]) {
                    case 'r':
                        ret += P;
                        break;
                    case 's':
                        ret += R;
                        break;
                    case 'p':
                        ret += S;
                        break;
                    default:
                        break;
                }
            }
            out.println(ret);

        }

    }
}

