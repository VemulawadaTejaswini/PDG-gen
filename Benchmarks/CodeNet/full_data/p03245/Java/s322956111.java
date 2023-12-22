import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author __shangu__
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DRobotArms solver = new DRobotArms();
        solver.solve(1, in, out);
        out.close();
    }

    static class DRobotArms {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), x[] = new int[n], y[] = new int[n];
            for (int i = 0; i < n; ++i) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
            }

            int mod2 = Math.abs(x[0]) + Math.abs(y[0]), maxdist = 0;
            mod2 %= 2;
            boolean ok = true;
            for (int i = 1; i < n && ok; ++i) {
                int curdist = Math.abs(x[i]) + Math.abs(y[i]);
                if (curdist % 2 != mod2) ok = false;
                maxdist = Math.max(curdist, maxdist);
            }
            if (!ok) {
                out.println(-1);
                return;
            }
            mod2 = 1 - mod2;

            int dn = 0;
            if (mod2 == 1) maxdist--;
            for (; ((long) 1 << dn) - 1 < maxdist; ++dn) ;
            out.println((mod2 == 1 ? dn + 1 : dn));
            assert (dn > 35);
            if (mod2 == 1) {
                out.print("1 ");
            }
            for (int i = dn - 1; i > 0; --i) out.printf("%d ", (long) 1 << i);
            out.println(1);

            char ans[] = new char[dn + 10];
            for (int i = 0; i < n; ++i) {
                int curx = x[i], cury = y[i], qt = 0;

                if (mod2 == 1) {
                    if (Math.abs(curx - 1) + Math.abs(cury) <= ((long) 1 << dn) - 1) {
                        ans[qt++] = 'R';
                        --curx;
                    } else if (Math.abs(curx + 1) + Math.abs(cury) <= ((long) 1 << dn) - 1) {
                        ans[qt++] = 'L';
                        ++curx;
                    } else if (Math.abs(curx) + Math.abs(cury - 1) <= ((long) 1 << dn) - 1) {
                        ans[qt++] = 'U';
                        --cury;
                    } else {
                        ans[qt++] = 'P';
                        ++cury;
                    }
                }

                for (int j = dn - 1; j >= 0; --j) {
                    if (Math.abs(curx + ((long) 1 << j)) + Math.abs(cury) <= ((long) 1 << j) - 1) {
                        ans[qt++] = 'L';
                        curx += (long) 1 << j;
                    } else if (Math.abs(curx - ((long) 1 << j)) + Math.abs(cury) <= ((long) 1 << j) - 1) {
                        ans[qt++] = 'R';
                        curx -= (long) 1 << j;
                    } else if (Math.abs(curx) + Math.abs(cury + ((long) 1 << j)) <= ((long) 1 << j) - 1) {
                        ans[qt++] = 'D';
                        cury += (long) 1 << j;
                    } else {
                        ans[qt++] = 'U';
                        cury -= (long) 1 << j;
                    }
                }
                for (int j = 0; j < qt; ++j) out.print(ans[j]);
                out.println();
            }
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

