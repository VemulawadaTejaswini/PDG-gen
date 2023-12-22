import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        LightWriter out = new LightWriter(outputStream);
        BDoNotDuplicate solver = new BDoNotDuplicate();
        solver.solve(1, in, out);
        out.close();
    }

    static class BDoNotDuplicate {
        private static final int MAX = 200_001;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int n = in.ints();
            long k = in.longs();
            int[] a = in.ints(n);

        /*if (n * k <= 50_000_000) {
            int[] array = new int[MAX];
            int len = 0;
            int[] index = new int[MAX];
            Arrays.fill(index, -1);
            for (long turn = 0; turn < k * n; turn++) {
                int j = (int) (turn % n);
                if (j == 0) System.out.println("=== " + turn / n);
                if (index[a[j]] >= 0 && index[a[j]] < len && array[index[a[j]]] == a[j]) {
                    //System.out.print("Add");
                    len = index[a[j]];
                } else {
                    //System.out.print("Rem");
                    array[len] = a[j];
                    index[a[j]] = len++;
                }
                if (len == 0) System.out.println(a[j] + " Done: " + turn);
                //System.out.println(a[j] + " " + Arrays.toString(Arrays.copyOf(array, len)));
            }
            out.ans(Arrays.copyOf(array, len)).ln();
            return;
        }*/

            int[] firstIndexOf = new int[MAX], lastIndexOf = new int[MAX], correspondsTo = new int[n];
            Arrays.fill(firstIndexOf, -1);
            Arrays.fill(lastIndexOf, -1);
            ArrayUtil.fill(correspondsTo, -1);
            for (int i = 0; i < n; i++) {
                if (firstIndexOf[a[i]] < 0) firstIndexOf[a[i]] = i;
                if (lastIndexOf[a[i]] >= 0) correspondsTo[lastIndexOf[a[i]]] = i;
                lastIndexOf[a[i]] = i;
            }
            for (int i = 0; i < n; i++) {
                if (correspondsTo[i] < 0) correspondsTo[i] = n + firstIndexOf[a[i]];
            }
            int[] next = new int[n], size = new int[n];
            for (int i = 0; i < n; i++) {
                next[i] = (correspondsTo[i] + 1) % n;
                size[i] = correspondsTo[i] - i + 1;
            }
            long totalSize = size[0];
            for (int cur = next[0]; cur != 0; cur = next[cur]) totalSize += size[cur];
            //System.out.println(Arrays.toString(next));
            //System.out.println(Arrays.toString(size));
            long remain = (n * k) % totalSize;
            int cur = 0;
            while (size[cur] <= remain) {
                remain -= size[cur];
                cur = next[cur];
            }

            int[] array = new int[MAX];
            int len = 0;
            int[] index = new int[MAX];
            Arrays.fill(index, -1);
            for (int turn = cur; turn < cur + remain; turn++) {
                int j = turn % n;
                if (index[a[j]] >= 0 && index[a[j]] < len && array[index[a[j]]] == a[j]) {
                    len = index[a[j]];
                } else {
                    array[len] = a[j];
                    index[a[j]] = len++;
                }
            }
            out.ans(Arrays.copyOf(array, len)).ln();
            out.ln();
        }

    }

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static void fill(int[] a, int v) {
            Arrays.fill(a, v);
        }

    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new BufferedWriter(new OutputStreamWriter(out, Charset.defaultCharset())));
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter ans(String s) {
            if (!breaked) {
                print(' ');
            }
            return print(s);
        }

        public LightWriter ans(int i) {
            return ans(Integer.toString(i));
        }

        public LightWriter ans(int... n) {
            for (int n1 : n) {
                ans(n1);
            }
            return this;
        }

        public LightWriter ln() {
            print(System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
                } catch (IOException ex) {
                    throw new UncheckedIOException(ex);
                }
            }
            return this;
        }

        public void close() {
            try {
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
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

        public int[] ints(int length) {
            return IntStream.range(0, length).map(x -> ints()).toArray();
        }

        public long longs() {
            return Long.parseLong(string());
        }

    }
}

