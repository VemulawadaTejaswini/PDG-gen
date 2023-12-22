import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Objects;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BPickingUp solver = new BPickingUp();
        solver.solve(1, in, out);
        out.close();
    }

    static class BPickingUp {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            BPickingUp.Point[] points = new BPickingUp.Point[n];

            for (int i = 0; i < n; i++) {
                points[i] = new BPickingUp.Point(in.nextInt(), in.nextInt());
            }

            HashSet<BPickingUp.Point> pointHashSet = new HashSet<>();
            for (BPickingUp.Point p : points) {
                pointHashSet.add(p);
            }

            int answer = n;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    long p = points[i].x - points[j].x;
                    long q = points[i].y - points[j].y;
                    int score = score(pointHashSet, p, q);
                    //System.out.println(l + "\t" + score);
                    answer = Math.min(answer, score);
                }
            }
            out.println(answer);
        }

        private int score(HashSet<BPickingUp.Point> points, long p, long q) {
            int score = 0;
            for (BPickingUp.Point point : points) {
                BPickingUp.Point prev = new BPickingUp.Point(point.x - p, point.y - q);
                if (!points.contains(prev)) {
                    score++;
                }
            }
            return score;
        }

        private static class Point {
            final long x;
            final long y;

            private Point(long x, long y) {
                this.x = x;
                this.y = y;
            }

            public boolean equals(Object o) {
                if (this == o)
                    return true;
                if (o == null || getClass() != o.getClass())
                    return false;
                BPickingUp.Point point = (BPickingUp.Point) o;
                return x == point.x && y == point.y;
            }

            public int hashCode() {
                return Objects.hash(x, y);
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

