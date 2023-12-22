import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.TreeSet;
import java.util.ArrayList;
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
        OutputWriter out = new OutputWriter(outputStream);
        FullTournament solver = new FullTournament();
        solver.solve(1, in, out);
        out.close();
    }

    static class FullTournament {
        public int[] arr;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            arr = in.readIntArray(1 << n);
            ArrayList<Integer> avail = new ArrayList<>();
            for (int i = 1; i <= 1 << n; i++) avail.add(i);
            ArrayList<Integer> res = solve(avail, 0, (1 << n) - 1);
            if (res == null) {
                out.println("NO");
            } else {
                out.println("YES");
                boolean first = true;
                for (int k : res) {
                    if (!first) out.print(" ");
                    out.print(k);
                    first = false;
                }
                out.println();
            }
        }

        public ArrayList<Integer> solve(ArrayList<Integer> avail, int from, int to) {
            if (from == to) {
                if (arr[from] != 0 && avail.get(0) != arr[from]) {
                    return null;
                } else {
                    return new ArrayList<>(avail);
                }
            }
            int mid = (from + to) / 2;
            TreeSet<Integer> lh = new TreeSet<>(), rh = new TreeSet<>();
            for (int i = from; i <= mid; i++) if (arr[i] != 0) lh.add(arr[i]);
            for (int i = mid + 1; i <= to; i++) if (arr[i] != 0) rh.add(arr[i]);

            int lpos = from, rpos = mid + 1;
            ArrayList<Integer> al = new ArrayList<>(), ar = new ArrayList<>();
            for (int k : avail) {
                if (lpos == mid + 1) {
                    ar.add(k);
                    rpos++;
                    continue;
                }
                if (rpos == to + 1) {
                    al.add(k);
                    lpos++;
                    continue;
                }

                if (rh.size() > 0 && rh.first() == k) {
                    rh.pollFirst();
                    ar.add(k);
                    rpos++;
                    continue;
                }
                if (lh.size() > 0 && lh.first() == k) {
                    lh.pollFirst();
                    al.add(k);
                    lpos++;
                    continue;
                }
                if (al.size() == ar.size()) {
                    al.add(k);
                    lpos++;
                    continue;
                }
                ar.add(k);
                rpos++;
            }

            ArrayList<Integer> r1 = solve(al, from, mid), r2 = solve(ar, mid + 1, to);
            if (r1 == null || r2 == null) return null;
            ArrayList<Integer> ret = new ArrayList<>();
            for (int i = 0; i < r1.size(); i++) {
                int a = r1.get(i), b = r2.get(i);
                ret.add(a);
                ret.add(b);
            }
            return ret;
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void println() {
            writer.println();
        }

        public void println(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

        public void print(int i) {
            writer.print(i);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1 << 16];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int[] readIntArray(int tokens) {
            int[] ret = new int[tokens];
            for (int i = 0; i < tokens; i++) {
                ret[i] = nextInt();
            }
            return ret;
        }

        public int read() {
            if (this.numChars == -1) {
                throw new InputMismatchException();
            } else {
                if (this.curChar >= this.numChars) {
                    this.curChar = 0;

                    try {
                        this.numChars = this.stream.read(this.buf);
                    } catch (IOException var2) {
                        throw new InputMismatchException();
                    }

                    if (this.numChars <= 0) {
                        return -1;
                    }
                }

                return this.buf[this.curChar++];
            }
        }

        public int nextInt() {
            int c;
            for (c = this.read(); isSpaceChar(c); c = this.read()) {
                ;
            }

            byte sgn = 1;
            if (c == 45) {
                sgn = -1;
                c = this.read();
            }

            int res = 0;

            while (c >= 48 && c <= 57) {
                res *= 10;
                res += c - 48;
                c = this.read();
                if (isSpaceChar(c)) {
                    return res * sgn;
                }
            }

            throw new InputMismatchException();
        }

        public static boolean isSpaceChar(int c) {
            return c == 32 || c == 10 || c == 13 || c == 9 || c == -1;
        }

    }
}

