import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.BufferedOutputStream;
import java.io.UncheckedIOException;
import java.util.List;
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
        B123Triangle solver = new B123Triangle();
        solver.solve(1, in, out);
        out.close();
    }

    static class B123Triangle {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int n = in.ints();
            int[] s = in.string().chars().map(c -> c - '0').toArray();

            for (int i = 1; i <= 100 && n > 1; i++) {
                n--;
                for (int j = 0; j < n; j++) s[j] = Math.abs(s[j] - s[j + 1]);
            }
            s = Arrays.copyOf(s, n);
            //System.out.println(Arrays.toString(s));

            List<Integer> a = new ArrayList<>(), t = new ArrayList<>();
            {
                int len = 0;
                for (int i = 0; i < n; i++) {
                    if (i != n - 1 && s[i] == 0 && s[i + 1] == 0) len++;
                    else if (s[i] == 0) {
                        a.add(-(++len));
                        len = 0;
                    } else a.add(s[i]);
                }
            }

            while (a.size() > 1) {
                //System.out.println(a);

                int m = a.size();
                for (int i = 0; i < m; i++) {
                    int now = a.get(i);
                    if (now < 0) {
                        if (now < -1) t.add(now + 1);
                    }
                    if (i == m - 1) continue;
                    int next = a.get(i + 1);
                    if (next < 0) next = 0;
                    if (now < 0) t.add(next);
                    else if (now == next) t.add(-1);
                    else t.add(Math.abs(now - next));
                }
                a.clear();
                m = t.size();
                int len = 0;
                for (int i = 0; i < m; i++) {
                    int now = t.get(i);
                    if (now >= 0) a.add(now);
                    else if (i != m - 1 && t.get(i + 1) < 0) len += now;
                    else {
                        a.add(len + now);
                        len = 0;
                    }
                }
                t.clear();
            }


            int ans = a.get(0);
            out.ans(ans < 0 ? 0 : ans).ln();
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

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new OutputStreamWriter(new BufferedOutputStream(out), Charset.defaultCharset()));
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
}

