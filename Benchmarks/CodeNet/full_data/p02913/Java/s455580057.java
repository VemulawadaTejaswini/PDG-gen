import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static int[] hash;

    private static void init(String str) {
        int n = str.length();
        hash = new int[n * (n+1)];
        // int time = 0;
        // long start = System.nanoTime();
        char[] ch = str.toCharArray();
        for (int i=0; i < n; i++) {
            int temp = 0;
            for (int j=0; i+j < n; j++) {
                temp = temp * 31 + ch[i+j];
                hash[i * n + (i+j+1)] = temp;
                time++;
            }
        }

        // out.println("init for loops " + time + " times, took " + (System.nanoTime() - start) / 1000000d + " ms");
    }

    private static void solve() {
        int n = in.nextInt();
        String s = in.next();
        init(s);

        // Hash, how many times it appears
        Map<Integer, AtomicInteger> m = new HashMap<>();
        // Map<Integer, Integer> length = new HashMap<>();
        int ans = 0;
        // int time = 0;
        // long start = System.nanoTime();
        // long[] inside = new long[4];
        for (int i=1; i <= n/2; i++) {
            for (int j=0; j+i <= n; j++) {
                // long s1 = System.nanoTime();
                // blank test
                // inside[0] += System.nanoTime() - s1;

                // s1 = System.nanoTime();
                Integer h = hash[j * n + (j+i)];
                // out.println(s.substring(j, j+i) + " " + h);
                // inside[1] += System.nanoTime() - s1;

                // s1 = System.nanoTime();
                if (!m.containsKey(h))
                    m.put(h, new AtomicInteger(0));
                // inside[2] += System.nanoTime() - s1;

                // s1 = System.nanoTime();
                int current = m.get(h).incrementAndGet();
                // inside[3] += System.nanoTime() - s1;

                if (current >= 2) {
                    ans = Math.max(ans, i);
                }
                // time++;
                /*
                if (time % 100000 == 0) {
                    out.println("Looped " + time + " times");
                    out.flush();
                }
                 */
            }
        }

        // out.println("Main for loops " + time + " times, took " + (System.nanoTime() - start) / 1000000d + " ms");
        // out.println("operations inside each took " + Arrays.stream(inside).mapToObj(l -> String.valueOf(l / 1000000d)).collect(Collectors.joining(", ")) + "ms.");
        // out.println("Final array size: " + m.mSize + ", " + length.mSize);

        out.println(ans);
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        // https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
