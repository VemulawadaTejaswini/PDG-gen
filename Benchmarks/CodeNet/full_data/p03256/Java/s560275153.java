import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

import static java.lang.Math.*;

public class Main {

    void solve() throws Throwable {
        int n = readInt();
        int m = readInt();
        char[] s = readString().toCharArray();

        List<Integer>[] ag = new List[n];
        List<Integer>[] bg = new List[n];
        for (int i = 0; i < n; i++) {
            ag[i] = new ArrayList<>();
            bg[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int x = readInt() - 1;
            int y = readInt() - 1;
            if (s[y] == 'A') {
                ag[x].add(y);
            } else {
                bg[x].add(y);
            }
            if (s[x] == 'A') {
                ag[y].add(x);
            } else {
                bg[y].add(x);
            }
        }

        Random rnd = new Random();

        for (int dummy = 0; dummy < 3; dummy++) {
            int len = 25;
            char[] testS = randomString(rnd, len);
            Set<Integer> cur = new HashSet<>();
            Set<Integer> next = new HashSet<>();
            for (int i = 0; i < n; i++) {
                if (s[i] == testS[0]) {
                    cur.add(i);
                }
            }
            for (int i = 0; i < len - 1; i++) {
                for (int v : cur) {
                    List<Integer> tos = testS[i + 1] == 'A' ? ag[v] : bg[v];
                    next.addAll(tos);
                }
                Set<Integer> tmp = cur;
                cur = next;
                next = tmp;
                next.clear();
            }
            if (cur.isEmpty()) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    private char[] randomString(Random rnd, int len) {
        char[] s = new char[len];
        for (int i = 0; i < len; i++) {
            if (rnd.nextBoolean()) {
                s[i] = 'A';
            } else {
                s[i] = 'B';
            }
        }
        return s;
    }

    //-------------------------------------------------

    final boolean ONLINE_JUDGE = !new File("input.txt").exists();

    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok;

    public void run() {
        Runnable run = () -> {
            try {
                long startTime = System.currentTimeMillis();
                Locale.setDefault(Locale.US);
                if (ONLINE_JUDGE) {
                    in = new BufferedReader(new InputStreamReader(System.in));
                    out = new PrintWriter(System.out);
                } else {
                    in = new BufferedReader(new FileReader("input.txt"));
                    out = new PrintWriter("output.txt");
                }
                tok = new StringTokenizer("");
                solve();
                in.close();
                out.close();
                long endTime = System.currentTimeMillis();
                long totalMemory = Runtime.getRuntime().totalMemory();
                long freeMemory = Runtime.getRuntime().freeMemory();
                System.err.println();
                System.err.println("Time = " + (endTime - startTime) + " ms");
                //System.err.println("Memory = " + ((totalMemory - freeMemory) / 1024) + " KB");
            } catch (Throwable e) {
                e.printStackTrace(System.err);
                System.exit(-1);
            }
        };
        new Thread(null, run, "run", 256 * 1024 * 1024).start();
        min(0, 0);
    }

    String readString() {
        while (!tok.hasMoreTokens()) {
            String line;
            try {
                line = in.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (line == null) return null;
            tok = new StringTokenizer(line);
        }
        return tok.nextToken();
    }

    int readInt() {
        return Integer.parseInt(readString());
    }

    long readLong() throws IOException {
        return Long.parseLong(readString());
    }

    double readDouble() throws IOException {
        return Double.parseDouble(readString());
    }

    void debug(Object... o) {
        if (!ONLINE_JUDGE) {
            System.err.println(Arrays.deepToString(o));
        }
    }

    /*long binpow(long a, long n) {
        long r = 1;
        while (n > 0) {
            if ((n & 1) > 0) {
                r *= a;
            }
            a *= a;
            n /= 2;
        }
        return r;
    }/**/

    long binpow(long a, long n, long mod) {
        long r = 1;
        while (n > 0) {
            if ((n & 1) > 0) {
                r = (r * a) % mod;
            }
            a = (a * a) % mod;
            n /= 2;
        }
        return r;
    }/**/

    static long gcd(long x, long y) {
        return y == 0 ? x : gcd(y, x % y);
    }

    private long[] readLongArray(int n) throws IOException {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = readLong();
        }
        return a;
    }

    private int[] readIntArray(int n) throws IOException {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = readInt();
        }
        return a;
    }

    public static void main(String[] args) {
        new Main().run();
    }
}