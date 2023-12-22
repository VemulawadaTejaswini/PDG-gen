import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Objects;
import java.util.List;
import java.io.Writer;
import java.security.AccessControlException;
import java.io.BufferedReader;
import java.util.regex.Pattern;
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
        LightWriter out = new LightWriter(outputStream);
        FJewels solver = new FJewels();
        solver.solve(1, in, out);
        out.close();
    }

    static class FJewels {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            Debug.autoEnable();
            int n = in.ints(), k = in.ints();
            FJewels.JewelSet[] jewels = new FJewels.JewelSet[k];
            for (int i = 0; i < k; i++) {
                jewels[i] = new FJewels.JewelSet(i);
            }
            boolean odd = false;
            for (int i = 0; i < n; i++) {
                int col = in.ints() - 1;
                jewels[col].values.add(in.longs());
                if (jewels[col].values.size() >= 3) {
                    odd = true;
                }
            }
            for (int i = 0; i < k; i++) {
                jewels[i].values.sort(Comparator.reverseOrder());
            }

            Arrays.sort(jewels, Comparator.comparing(j -> -j.top2()));
            PriorityQueue<Long> single = new PriorityQueue<>(Comparator.reverseOrder());
            long ans = jewels[0].top2();
            jewels[0].addRemain(single);

            List<Long> ansEven = new ArrayList<>(n);
            ansEven.add(ans);
            int c = 1;

            try {
                for (int i = 4; i <= n; i += 2) {
                    if (single.size() < 2) {
                        ans += jewels[c].top2();
                        ansEven.add(ans);
                        jewels[c].addRemain(single);
                        c++;
                        continue;
                    } else if (c == k) {
                        long s1 = single.poll(), s2 = single.poll();
                        ans += s1 + s2;
                        ansEven.add(ans);
                        continue;
                    }
                    long pair = jewels[c].top2();
                    long s1 = single.poll(), s2 = single.poll();
                    if (pair >= s1 + s2) {
                        ans += pair;
                        single.offer(s1);
                        single.offer(s2);
                        jewels[c].addRemain(single);
                        c++;
                    } else {
                        ans += s1 + s2;
                    }
                    ansEven.add(ans);
                }
            } catch (Throwable ex) {
                return;
            }


            if (!odd) {
                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 0) {
                        out.ans(ansEven.get((i - 1) / 2)).ln();
                    } else {
                        out.ans(-1).ln();
                    }
                }
                return;
            }

            ans = -1;
            int ansi = -1;
            for (int i = 0; i < k; i++) {
                if (ans < jewels[i].top3()) {
                    ans = jewels[i].top3();
                    ansi = i;
                }
            }
            List<Long> ansOdd = new ArrayList<>(n);
            ansOdd.add(-1L);
            ansOdd.add(ans);

            FJewels.JewelSet[] js2 = new FJewels.JewelSet[k - 1];
            int curt = 0;
            for (int i = 0; i < k; i++) {
                if (i != ansi) {
                    js2[curt++] = jewels[i];
                }
            }


            single.clear();
            jewels[ansi].addRemain(single);
            single.poll();


            c = 0;
            for (int i = 5; i <= n; i += 2) {
                if (single.size() < 2) {
                    ans += js2[c].top2();
                    ansOdd.add(ans);
                    js2[c].addRemain(single);
                    c++;
                    continue;
                } else if (c == k - 1) {
                    long s1 = single.poll(), s2 = single.poll();
                    ans += s1 + s2;
                    ansOdd.add(ans);
                    continue;
                }
                long pair = js2[c].top2();
                long s1 = single.poll(), s2 = single.poll();
                if (pair >= s1 + s2) {
                    ans += pair;
                    single.offer(s1);
                    single.offer(s2);
                    js2[c].addRemain(single);
                    c++;
                } else {
                    ans += s1 + s2;
                }
                ansOdd.add(ans);
            }

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    out.ans(ansEven.get((i - 1) / 2)).ln();
                } else {
                    out.ans(ansOdd.get(i / 2)).ln();
                }
            }

        }

        private static class JewelSet {
            int type;
            List<Long> values = new ArrayList<>();

            public JewelSet(int type) {
                this.type = type;
            }

            public long top2() {
                return values.get(0) + values.get(1);
            }

            public long top3() {
                if (values.size() < 3) {
                    return -1;
                }
                return values.get(0) + values.get(1) + values.get(2);
            }

            public void addRemain(PriorityQueue<Long> q) {
                for (int i = 2; i < values.size(); i++) {
                    q.offer(values.get(i));
                }
            }

        }

    }

    static class Debug {
        private static final String DEBUG_PROPERTY = "debug";
        private static final String DEBUG_CALL_PATTERN = "^.+\\.debug\\((.+)\\);.*$";
        private static Pattern debugRegex;
        private static boolean enabled = false;
        private static String src;

        public static void enable(String s) {
            enabled = true;
            src = s;
            if (debugRegex == null) {
                debugRegex = Pattern.compile(DEBUG_CALL_PATTERN);
            }
        }

        public static boolean autoEnable() {
            try {
                String s = System.getProperty(DEBUG_PROPERTY);
                if (s != null) {
                    enable(s);
                    return true;
                }
            } catch (AccessControlException ex) {
                src = null;
            }
            return false;
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

        public LightWriter ans(Object obj) {
            return ans(Objects.toString(obj));
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

        public long longs() {
            return Long.parseLong(string());
        }

    }
}

