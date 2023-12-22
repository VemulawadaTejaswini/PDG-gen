import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.io.UncheckedIOException;
import java.util.Objects;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
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
        C2DPlane2NPoints solver = new C2DPlane2NPoints();
        solver.solve(1, in, out);
        out.close();
    }

    static class C2DPlane2NPoints {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints();
            Vec2i[] red = new Vec2i[n];
            Vec2i[] blue = new Vec2i[n];
            List<Pair<Vec2i, Vec2i>> comb = new ArrayList<>(n * n);
            for (int i = 0; i < n; i++) {
                red[i] = new Vec2i(in.ints(), in.ints());
            }
            for (int i = 0; i < n; i++) {
                blue[i] = new Vec2i(in.ints(), in.ints());
            }
            for (int r = 0; r < n; r++) {
                for (int b = 0; b < n; b++) {
                    if (red[r].getX() < blue[b].getX() && red[r].getY() < blue[b].getY()) {
                        comb.add(new Pair<>(red[r], blue[b]));
                    }
                }
            }
            comb.sort(Comparator.comparing(p -> (p.key.getX() - p.value.getX()) * (p.key.getY() - p.value.getY())));
            Set<Vec2i> usedRed = new HashSet<>(n);
            Set<Vec2i> userBlue = new HashSet<>(n);
            int ans = 0;
            for (Pair<Vec2i, Vec2i> p : comb) {
                if (!usedRed.contains(p.key) && !userBlue.contains(p.value)) {
                    usedRed.add(p.key);
                    userBlue.add(p.value);
                    ans++;
                }
            }
            out.println(ans);
        }

    }

    static final class Pair<K, V> {
        public K key;
        public V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(key, pair.key) &&
                    Objects.equals(value, pair.value);
        }

        public int hashCode() {
            return Objects.hash(key, value);
        }

        public String toString() {
            return "Pair{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }

    }

    static class Vec2i {
        private final int x;
        private final int y;

        public Vec2i(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec2i vec2i = (Vec2i) o;
            return x == vec2i.x &&
                    y == vec2i.y;
        }

        public int hashCode() {
            return Objects.hash(x, y);
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

