import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.TreeSet;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inclass in = new inclass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DLazyFaith solver = new DLazyFaith();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLazyFaith {
        public void solve(int testNumber, inclass in, PrintWriter out) {
            int shrines = in.nextInt(), temples = in.nextInt();
            int queries = in.nextInt();
            TreeSet<Long> s = new TreeSet<>();
            TreeSet<Long> t = new TreeSet<>();
            for (int i = 0; i < shrines; i++) {
                s.add(in.nextLong());
            }
            for (int i = 0; i < temples; i++) {
                t.add(in.nextLong());
            }
            while (queries-- > 0) {
                long x = in.nextLong();
                long ans = 0;
                //Case 1
                long c1 = (long) 1e17;
                Long s1 = s.ceiling(x);
                if (s1 != null) {
                    Long t1 = t.ceiling(s1);
                    Long t2 = t.floor(s1);
                    if (t1 != null && t2 == null) {
                        c1 = (s1 - x) + (t1 - s1);
                    } else if (t1 == null && t2 != null) {
                        c1 = (s1 - x) + (s1 - t2);
                    } else if (t1 != null && t2 != null) {
                        c1 = Math.min((s1 - x) + (t1 - s1), (s1 - x) + (s1 - t2));
                    }
                }
                //Case 2
                long c2 = (long) 1e17;
                Long s2 = s.floor(x);
                if (s2 != null) {
                    Long t1 = t.ceiling(s2);
                    Long t2 = t.floor(s2);
                    if (t1 != null && t2 == null) {
                        c2 = (x - s2) + (t1 - s2);
                    } else if (t1 == null && t2 != null) {
                        c2 = (x - s2) + (s2 - t2);
                    } else if (t1 != null && t2 != null) {
                        c2 = Math.min((x - s2) + (t1 - s2), (x - s2) + (s2 - t2));
                    }
                }
                //Case 3
                long c3 = (long) 1e17;
                Long s3 = t.ceiling(x);
                if (s3 != null) {
                    Long t1 = s.ceiling(s3);
                    Long t2 = s.floor(s3);
                    if (t1 != null && t2 == null) {
                        c3 = (s3 - x) + (t1 - s3);
                    } else if (t1 == null && t2 != null) {
                        c3 = (s3 - x) + (s3 - t2);
                    } else if (t1 != null && t2 != null) {
                        c3 = Math.min((s3 - x) + (t1 - s3), (s3 - x) + (s3 - t2));
                    }
                }
                //Case 4
                long c4 = (long) 1e17;
                Long s4 = t.floor(x);
                if (s4 != null) {
                    Long t1 = s.ceiling(s4);
                    Long t2 = s.floor(s4);
                    if (t1 != null && t2 == null) {
                        c4 = (x - s4) + (t1 - s4);
                    } else if (t1 == null && t2 != null) {
                        c4 = (x - s4) + (s4 - t2);
                    } else if (t1 != null && t2 != null) {
                        c4 = Math.min((x - s4) + (t1 - s4), (x - s4) + (s4 - t2));
                    }
                }
                long xxx[] = {c1, c2, c3, c4};
                Arrays.sort(xxx);
                out.println(xxx[0]);
            }
        }

    }

    static class inclass {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private inclass.SpaceCharFilter filter;

        public inclass(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

