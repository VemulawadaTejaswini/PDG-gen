import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        List<D.Point> getCircle(int sqDist) {
            List<D.Point> list = new ArrayList<>();
            for (int x = floorSqrt(sqDist); x >= 0; x--) {
                int sqY = sqDist - x * x;
                int y = ceilSqrt(sqY);
                if (y * y == sqY) {
                    list.add(new D.Point(x, y));
                    if (y > 0) list.add(new D.Point(x, -y));
                    if (x > 0) list.add(new D.Point(-x, y));
                    if (x > 0 && y > 0) list.add(new D.Point(-x, -y));
                }
            }
            return list;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            int d1 = in.readInt();
            int d2 = in.readInt();
            List<D.Point> list1 = getCircle(d1);
            List<D.Point> list2 = getCircle(d2);
//        System.err.println(list1);
//        System.err.println(list2);

            int[] deg = new int[4 * n * n];
            int[][] g = new int[4 * n * n][300];
            for (int i = 0; i < 2 * n; i++) {
                for (int j = 0; j < 2 * n; j++) {
                    int v1 = i * 2 * n + j;
                    for (D.Point p : list1) {
                        int x = i + p.x;
                        int y = j + p.y;
                        if (0 <= x && x < 2 * n && 0 <= y && y < 2 * n) {
//                        System.err.println(new Point(i, j) + " <-> " + new Point(x, y));
                            int v2 = x * 2 * n + y;
                            g[v1][deg[v1]++] = v2;
                            g[v2][deg[v2]++] = v1;
                        }
                    }
//                for (Point p : list2) {
//                    int x = i + p.x;
//                    int y = j + p.y;
//                    if (0 <= x && x < 2 * n && 0 <= y && y < 2 * n) {
////                        System.err.println(new Point(i, j) + " <-> " + new Point(x, y));
//                        int v2 = x * 2 * n + y;
//                        g[v1][deg[v1]++] = v2;
//                        g[v2][deg[v2]++] = v1;
//                    }
//                }
                }
            }

            int[] color1 = new int[g.length];
            for (int i = 0; i < g.length; i++) {
                if (color1[i] == 0) {
                    dfs(g, deg, i, color1, 1);
                }
            }
            int[] cnts1 = new int[3];
            for (int i = 0; i < g.length; i++) {
                cnts1[color1[i]]++;
            }
            int bestColor1 = cnts1[1] > cnts1[2] ? 1 : 2;

            // part 2
            Arrays.fill(deg, 0);
            for (int i = 0; i < 2 * n; i++) {
                for (int j = 0; j < 2 * n; j++) {
                    int v1 = i * 2 * n + j;
//                for (Point p : list1) {
//                    int x = i + p.x;
//                    int y = j + p.y;
//                    if (0 <= x && x < 2 * n && 0 <= y && y < 2 * n) {
////                        System.err.println(new Point(i, j) + " <-> " + new Point(x, y));
//                        int v2 = x * 2 * n + y;
//                        g[v1][deg[v1]++] = v2;
//                        g[v2][deg[v2]++] = v1;
//                    }
//                }
                    for (D.Point p : list2) {
                        int x = i + p.x;
                        int y = j + p.y;
                        if (0 <= x && x < 2 * n && 0 <= y && y < 2 * n) {
//                        System.err.println(new Point(i, j) + " <-> " + new Point(x, y));
                            int v2 = x * 2 * n + y;
                            g[v1][deg[v1]++] = v2;
                            g[v2][deg[v2]++] = v1;
                        }
                    }
                }
            }

            int[] color2 = new int[g.length];
            for (int i = 0; i < g.length; i++) {
                if (color1[i] == bestColor1) {
                    if (color2[i] == 0) {
                        dfs(g, deg, i, color2, color1[i]);
                    }
                }
            }
            int[] cnts2 = new int[3];
            for (int i = 0; i < g.length; i++) {
                cnts2[color2[i]]++;
            }
            int bestColor2 = cnts2[1] > cnts2[2] ? 1 : 2;
            int cntRes = 0;
            finish:
            for (int i = 0; i < 2 * n; i++) {
                for (int j = 0; j < 2 * n; j++) {
                    int v = i * 2 * n + j;
//                System.err.println(color1[v] + " " + color2[v]);
                    if (color1[v] == bestColor1 && color2[v] == bestColor2) {
                        out.printLine(i + " " + j);
                        cntRes++;
                        if (cntRes == n * n) {
                            break finish;
                        }
                    }
                }
            }
        }

        private void dfs(int[][] g, int[] deg, int x, int[] color, int curColor) {
            if (color[x] != 0) {
                return;
            }
            color[x] = curColor;
            for (int i = 0; i < deg[x]; i++) {
                int y = g[x][i];
                if (color[y] == 0) {
                    dfs(g, deg, y, color, 3 - curColor);
                }
            }
        }

        private int ceilSqrt(int square) {
            int root = (int) Math.sqrt(square);
            while (root * root > square) root--;
            while (root * root < square) root++;
            return root;
        }

        private int floorSqrt(int square) {
            int root = (int) Math.sqrt(square);
            while (root * root < square) root++;
            while (root * root > square) root--;
            return root;
        }

        static class Point {
            int x;
            int y;

            public Point(int x, int y) {
                this.x = x;
                this.y = y;
            }


            public String toString() {
                return "(" + x + " " + y + ")";
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

        public int readInt() {
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

        public void printLine(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }
}

