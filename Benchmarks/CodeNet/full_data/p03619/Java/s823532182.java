import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            double x1 = in.nextInt();
            double y1 = in.nextInt();
            double x2 = in.nextInt();
            double y2 = in.nextInt();

            double maxX = Math.max(x1, x2);
            double minX = Math.min(x1, x2);
            double maxY = Math.max(y1, y2);
            double minY = Math.min(y1, y2);

            int n = in.nextInt();
            if (x1 == x2) {
                int count = 0;
                for (int i = 0; i < n; i++) {
                    int x = in.nextInt();
                    int y = in.nextInt();

                    if (x == x1 && minY < y && y < maxY) {
                        count++;
                    }
                }

                double ans = (maxY - minY) * 100 + Math.PI * 10 * count;
                out.println(ans);
                return;
            }

            if (y1 == y2) {
                int count = 0;
                for (int i = 0; i < n; i++) {
                    int x = in.nextInt();
                    int y = in.nextInt();

                    if (y == y1 && minX < x && x < maxX) {
                        count++;
                    }
                }

                double ans = (maxX - minX) * 100 + Math.PI * 10 * count;
                out.println(ans);
                return;
            }

            boolean flg = (x2 - x1) * (y2 - y1) < 0;

            List<Point> points = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                int y = in.nextInt();

                if (minX < x && x < maxX && minY < y && y < maxY) {
                    points.add(new Point(x, y));
                }
            }
            points.sort((p1, p2) -> {
                int compareX = Double.compare(p1.x, p2.x);
                return compareX != 0 ? compareX : Double.compare(p2.y, p1.y);
            });

            int[] array = new int[points.size()];
            for (int i = 0; i < points.size(); i++) {
                array[i] = (flg ? -1 : 1) * (int) points.get(i).y;
            }

            int len = array.length == 0 ? 0 : Lis.getLis(array).length;
            double ans = 100 * (maxY - minY + maxX - minX) + len * (2 * Math.PI * 10 / 4 - 20);

            out.println(ans);
        }

    }

    static class Point {
        public double x;
        public double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

    }

    static class Lis {
        public static int[] getLis(int[] x) {
            int n = x.length;
            int[] len = new int[n];
            Arrays.fill(len, 1);
            int[] pred = new int[n];
            Arrays.fill(pred, -1);
            int bi = 0;
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (x[j] < x[i] && len[i] < len[j] + 1) {
                        len[i] = len[j] + 1;
                        pred[i] = j;
                    }
                }
                if (len[bi] < len[i]) {
                    bi = i;
                }
            }
            int cnt = len[bi];
            int[] res = new int[cnt];
            for (int i = bi; i != -1; i = pred[i]) {
                res[--cnt] = x[i];
            }
            return res;
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

