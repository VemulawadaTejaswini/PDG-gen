import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.io.IOException;
import java.util.OptionalInt;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DSquareRotation solver = new DSquareRotation();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSquareRotation {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints(), d = in.ints();
            int[][] c = new int[d][d];
            int[][] max = new int[d][d];
            for (int i = 0; i < n; i++) {
                int x = in.ints() % d, y = in.ints() % d;
                int p = ++c[x][y];
                int w = (int) Math.ceil(Math.sqrt(p));
                max[x][y] = Math.max(max[x][y], w);
            }
            //Arrays.stream(c).map(Arrays::toString).forEach(System.out::println);
            //System.out.println("then");
            //Arrays.stream(max).map(Arrays::toString).forEach(System.out::println);

            int[] xmax = IntStream.range(0, d)
                    .map(x -> Arrays.stream(max[x], 0, d).max().orElse(0))
                    .toArray();
            int[] ymax = IntStream.range(0, d)
                    .map(y -> IntStream.range(0, d).map(x -> max[x][y]).max().orElse(0))
                    .toArray();

            //System.out.println("Here");
            //System.out.println(Arrays.toString(xmax));
            //System.out.println(Arrays.toString(ymax));
            Vec2i vx = dist(xmax);
            Vec2i vy = dist(ymax);
            //System.out.println("Vx");
            //System.out.println(vx);
            long ans = Math.min(d * (vx.x - 1) + vx.y, d * (vy.x - 1) + vy.y);
            out.println(ans);
        }

        private Vec2i dist(int[] a) {
            int max = -1;
            int minIndexOfMax = -1;
            int maxIndexOfMax = -1;
            for (int i = 0; i < a.length; i++) {
                if (max < a[i]) {
                    minIndexOfMax = i;
                    maxIndexOfMax = i;
                    max = a[i];
                } else if (max == a[i]) {
                    maxIndexOfMax = i;
                }
            }
            return new Vec2i(max, Math.min(maxIndexOfMax - minIndexOfMax, minIndexOfMax - maxIndexOfMax + a.length));
        }

    }

    static class Vec2i {
        public final int x;
        public final int y;

        public Vec2i(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec2i vec2i = (Vec2i) o;
            return x == vec2i.x && y == vec2i.y;
        }

        public int hashCode() {
            return 31 * x + y;
        }

        public String toString() {
            return "(" + x + ", " + y + ")";
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

    }
}

