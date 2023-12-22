import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.PriorityQueue;
import java.util.OptionalInt;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.util.AbstractCollection;
import java.util.regex.Matcher;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.OutputStreamWriter;
import java.nio.file.Path;
import java.io.OutputStream;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.stream.Collectors;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Objects;
import java.util.List;
import java.util.stream.Stream;
import java.nio.file.Paths;
import java.io.Writer;
import java.security.AccessControlException;
import java.util.Optional;
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
        GLongestPath solver = new GLongestPath();
        solver.solve(1, in, out);
        out.close();
    }

    static class GLongestPath {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            Debug.autoEnable();

            int n = in.ints(), m = in.ints();
            int[] depth = new int[n];
            List<List<Integer>> incoming = IntStream.range(0, n)
                    .mapToObj(unused -> new ArrayList<Integer>())
                    .collect(Collectors.toList());
            int[] outgoing = new int[n];
            for (int i = 0; i < m; i++) {
                int x = in.ints() - 1, y = in.ints() - 1;
                incoming.get(y).add(x);
                outgoing[x]++;
            }

            Debug.debug(outgoing);
            PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.comparing(i -> outgoing[i]));
            IntStream.range(0, n).forEach(q::add);
            while (!q.isEmpty()) {
                int to = q.poll();
                if (outgoing[to] != 0) {
                    q.add(to);
                    continue;
                }
                Debug.debug(to);
                Debug.debug(outgoing[to]);
                for (Integer from : incoming.get(to)) {
                    depth[from] = Math.max(depth[from], depth[to] + 1);
                    outgoing[from]--;
                }
            }
            Debug.debug(depth);
            out.ans(Arrays.stream(depth).max().orElse(-1)).ln();
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
        private static final int DEFAULT_DOUBLE_ACC = 9;
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new BufferedWriter(new OutputStreamWriter(out, Charset.defaultCharset())));
        }

        public void enableAutoFlush() {
            autoflush = true;
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

        public LightWriter ans(double x, int n) {
            if (!breaked) {
                print(' ');
            }
            if (x < 0) {
                print('-');
                x = -x;
            }
            x += Math.pow(10, -n) / 2;
            print(Long.toString((long) x)).print('.');
            x -= (long) x;
            for (int i = 0; i < n; i++) {
                x *= 10;
                print((char) ('0' + ((int) x)));
                x -= (int) x;
            }
            return this;
        }

        public LightWriter ans(double x) {
            return ans(x, DEFAULT_DOUBLE_ACC);
        }

        public LightWriter ans(BigDecimal x) {
            return ans(x == null ? "null" : x.toPlainString());
        }

        public LightWriter ans(int i) {
            return ans(Integer.toString(i));
        }

        public LightWriter ans(Object obj) {
            return ans(Objects.toString(obj));
        }

        public LightWriter ansSingle(Object obj) {
            if (obj.getClass() == Double.class) {
                return ans((double) obj);
            } else if (obj.getClass() == BigDecimal.class) {
                return ans((BigDecimal) obj);
            } else {
                return ans(obj);
            }
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

    static class Debug {
        private static final char ESC = 27;
        private static final String DEBUG_PREFIX = ESC + "[34;43;1m[DEBUG]" + ESC + "[m %key%=";
        private static final String DEBUG_PROPERTY = "debug";
        private static final String DEBUG_UNKNOWN_CALLER = "unknown";
        private static final String DEBUG_CALL_PATTERN = "^.+\\.debug\\((.+)\\);.*$";
        private static Pattern debugRegex;
        private static boolean enabled = false;
        private static String src;
        private static LightWriter out;

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

        public static void debug(String key, Object obj) {
            if (!enabled) {
                return;
            }
            if (obj == null) {
                out().ans("null").ln();
            } else if (obj.getClass().isArray()) {
                int len = Array.getLength(obj);
                if (obj.getClass().getComponentType().isArray()) {
                    for (int i = 0; i < len; i++) {
                        debug(key + "[" + i + "]", Array.get(obj, i));
                    }
                } else {
                    out().print(DEBUG_PREFIX.replace("%key%", key));
                    for (int i = 0; i < len; i++) {
                        Object elem = Array.get(obj, i);
                        out().ansSingle(elem);
                    }
                    out().ln();
                }
            } else {
                out().print(DEBUG_PREFIX.replace("%key%", key)).ansSingle(obj).ln();
            }
        }

        public static void debug(Object obj) {
            if (!enabled) {
                return;
            }
            StackTraceElement elem = Thread.currentThread().getStackTrace()[2];
            String caller = elem.getClassName().replace('.', '/');
            int di = caller.indexOf('$');
            if (di >= 0) {
                caller = caller.substring(0, di);
            }
            Path path = Paths.get(src, caller + ".java");
            try (Stream<String> lines = Files.lines(path)) {
                String line = lines.skip(elem.getLineNumber() - 1).findFirst().orElseThrow(IOException::new);
                Matcher match = debugRegex.matcher(line);
                if (match.matches() && match.groupCount() > 0) {
                    debug(match.group(1), obj);
                } else {
                    debug(DEBUG_UNKNOWN_CALLER, obj);
                }
            } catch (IOException e) {
                debug(DEBUG_UNKNOWN_CALLER, obj);
            }
        }

        public static LightWriter out() {
            if (out == null) {
                out = new LightWriter(System.out);
                out.enableAutoFlush();
            }
            return out;
        }

    }
}

