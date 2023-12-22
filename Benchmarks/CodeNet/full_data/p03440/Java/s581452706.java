import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.AbstractCollection;
import java.util.Vector;
import java.util.PriorityQueue;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Comparator;
import java.util.Stack;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            if (n == 1) {
                out.println(0);
                return;
            }
            Stack<Integer> gp[] = (Stack<Integer>[]) new Stack[n];
            for (int i = 0; i < n; i++) {
                gp[i] = new Stack<Integer>();
            }
            int b[] = new int[n];
            for (int i = 0; i < m; i++) {
                int l = in.nextInt(), r = in.nextInt();
                gp[l].push(r);
                gp[r].push(l);
                b[l] = 1;
                b[r] = 1;
            }
            int ct = 0;
            for (int i = 0; i < n; i++) {
                if (b[i] == 1) {
                    ct++;
                }
            }
            if (ct != n) {
                out.println("Impossible");
                return;
            }
            PriorityQueue<tp> minp = new PriorityQueue<tp>(new tp());
            Stack<Integer> s = new Stack<Integer>();
            boolean v[] = new boolean[n];
            int ccom = 0;
            for (int i = 0; i < n; i++) {
                if (!v[i]) {
                    v[i] = true;
                    s.add(i);
                    minp.add(new tp(a[i], ccom));
                    while (!s.isEmpty()) {
                        int curr = s.peek();
                        if (gp[curr].isEmpty()) {
                            s.pop();
                        } else {
                            int next = gp[curr].pop();
                            if (!v[next]) {
                                v[next] = true;
                                s.push(next);
                                minp.add(new tp(a[next], ccom));
                            }
                        }
                    }
                    ccom++;
                }
            }
            long ans = 0;
            boolean us[] = new boolean[n];
            ct = 0;
            PriorityQueue<tp> minn = new PriorityQueue<tp>(new tp());
            while (ct != ccom - 1) {
                tp curr = null, next = null;
                if (minn.isEmpty()) {
                    curr = minp.poll();
                } else {
                    curr = minn.poll();
                }
                if (minp.isEmpty()) {
                    break;
                }
                while (!minp.isEmpty()) {
                    next = minp.poll();
                    if (curr.c != next.c) {
                        break;
                    }
                    minn.add(next);
                }
                if (!us[(int) curr.c] || !us[(int) next.c]) {
                    ans += curr.v + next.v;
                    us[(int) curr.c] = true;
                    us[(int) next.c] = true;
                    ct++;
                }
            }
            if (ct == ccom - 1) {
                out.println(ans);
            } else {
                out.println("Impossible");
            }
        }

        class tp implements Comparator<tp> {
            long v;
            long c;

            tp() {
            }

            tp(int val, int com) {
                v = val;
                c = com;
            }


            public int compare(tp t1, tp t2) {
                return (int) (t1.v - t2.v);
            }

        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

