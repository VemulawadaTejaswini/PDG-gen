import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.Vector;
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
        DHandstand solver = new DHandstand();
        solver.solve(1, in, out);
        out.close();
    }

    static class DHandstand {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int n = in.ints(), k = in.ints();
            String s = in.string();
            if (s.matches("^1+$")) {
                out.ansln(s.length());
                return;
            }

            Stack<DHandstand.Token> stack = new Stack<>();
            stack.push(new DHandstand.Token(s.charAt(0) == '1', 1));
            for (int i = 1; i < n; i++) {
                if ((s.charAt(i) == '1') == stack.peek().v) {
                    stack.peek().l++;
                } else {
                    stack.push(new DHandstand.Token(s.charAt(i) == '1', 1));
                }
            }

            List<DHandstand.Segment> segs = new ArrayList<>();
            DHandstand.Token prev = new DHandstand.Token(true, 0);
            while (!stack.isEmpty()) {
                DHandstand.Token t = stack.pop();
                if (t.v) {
                    prev = t;
                } else {
                    if (!stack.isEmpty()) {
                        segs.add(new DHandstand.Segment(prev.l, t.l, stack.peek().l));
                    } else {
                        segs.add(new DHandstand.Segment(prev.l, t.l, 0));
                    }
                }
            }

            int l = 0;
            int v = segs.get(0).sum();
            int ans = 0;
            for (int r = 1; r < segs.size(); r++) {
                if (r - l + 1 > k) {
                    v -= segs.get(l).left;
                    v -= segs.get(l).middle;
                    l++;
                }
                v += segs.get(r).middle;
                v += segs.get(r).right;
                ans = Math.max(ans, v);
            }
            out.ansln(ans);
        }

        private static class Token {
            boolean v;
            int l;

            public Token(boolean v, int l) {
                this.v = v;
                this.l = l;
            }

        }

        private static class Segment {
            int left;
            int middle;
            int right;

            public Segment(int left, int middle, int right) {
                this.left = left;
                this.middle = middle;
                this.right = right;
            }

            int sum() {
                return left + middle + right;
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

        public LightWriter ansln(int... n) {
            for (int n1 : n) {
                ans(n1).ln();
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
}

