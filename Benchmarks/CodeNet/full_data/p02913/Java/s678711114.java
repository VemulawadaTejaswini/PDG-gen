import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        EWhoSaysAPun solver = new EWhoSaysAPun();
        solver.solve(1, in, out);
        out.close();
    }

    static class EWhoSaysAPun {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int n = in.ints();
            String s = in.string();

            int maxlen = 0, curlen = 1;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i - 1) != s.charAt(i)) {
                    if (curlen > maxlen) {
                        maxlen = curlen;
                    }
                    curlen = 1;
                } else {
                    curlen++;
                }
            }
            if (curlen > maxlen) {
                maxlen = curlen;
            }
            if (2 * maxlen >= n) {
                out.ans(maxlen / 2).ln();
                return;
            }


            EWhoSaysAPun.Substring substr = new EWhoSaysAPun.Substring(s);
            List<Integer> bucket = new ArrayList<>();
            for (int i = 0; i <= n; i++) bucket.add(i);
            bucket.sort(substr::compare);
            int max = 0;
            for (int t = 0; t < 10; t++) {
                for (int i = t; i < n; i++) {
                    int cnt = 0;
                    int x = bucket.get(i - t), y = bucket.get(i + 1);
                    int len = n - Math.max(x, y);
                    for (int j = 0; j < Math.min(len, Math.abs(x - y)); j++) {
                        if (s.charAt(x + j) != s.charAt(y + j)) break;
                        cnt++;
                    }
                    if (cnt > max) {
                        max = cnt;
                    }
                }
            }
            if (max == 0) {
                out.ans(0).ln();
            } else {
                out.ans(max).ln();
            }
        }

        private static class Substring {
            private int n;
            private String base;

            Substring(String base) {
                this.n = base.length();
                this.base = base;
            }

            private int compare(int i, int j) {
                if (i == n && j == n) {
                    return 0;
                } else if (i == n) {
                    return -1;
                } else if (j == n) {
                    return 1;
                } else if (base.charAt(i) == base.charAt(j)) {
                    return compare(i + 1, j + 1);
                } else if (base.charAt(i) < base.charAt(j)) {
                    return -1;
                } else {
                    return 1;
                }
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

