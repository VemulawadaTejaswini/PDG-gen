import javafx.util.Pair;

import javax.swing.*;
import java.io.*;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Map.Entry;

public class Main implements Runnable {
    static final int MOD = (int) 1e9 + 7;
    static final int MI = (int) 1e9;
    static final long ML = (long) 1e18;
    static final Reader in = new Reader();
    static final PrintWriter out = new PrintWriter(System.out);
    StringBuilder answer = new StringBuilder();
    Random random = new Random(751454315315L + System.currentTimeMillis());

    public static void main(String[] args) {
        new Thread(null, new Main(), "persefone", 1 << 28).start();
    }

    @Override
    public void run() {
        solve();
        printf();
        flush();
    }

    void solve() {

        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = in.nextIntArray(n);
        Arrays.sort(a);
        Pair[] pair = new Pair[m];
        for (int i = 0; i < m; i++) {
            pair[i] = new Pair(in.nextInt(), in.nextInt());
        }
        Arrays.sort(pair, (p1, p2) -> p1.c == p2.c ? p1.b - p2.b : p1.c - p2.c);
        int i = 0, j = n - 1, k = m - 1;
        long ans = 0;
        while (i <= j && k >= 0) {
            int c = pair[k].c;
            if (a[j] >= c) {
                ans += a[j];
                j--;
            } else {
                int b = pair[k].b;
                while (i <= j && b > 0) {
                    ans += c;
                    i++;
                    b--;
                }
                k--;
            }

        }
        while (i <= j) {
            ans += a[i];
            i++;
        }
        printf(ans);
    }
    static class Pair {
        private int b, c;

        public Pair(int b, int c) {
            this.b = b;
            this.c = c;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "b=" + b +
                    ", c=" + c +
                    '}';
        }
    }

    void printf() {
        out.print(answer);
    }

    void close() {
        out.close();
    }

    void flush() {
        out.flush();
    }

    void printf(Stream<?> str) {
        str.forEach(o -> add(o, " "));
        add("\n");
    }


    void printf(Object... obj) {
        printf(false, obj);
    }

    void printfWithDescription(Object... obj) {
        printf(true, obj);
    }


    private void printf(boolean b, Object... obj) {

        if (obj.length > 1) {
            for (int i = 0; i < obj.length; i++) {
                if (b) add(obj[i].getClass().getSimpleName(), " - ");
                if (obj[i] instanceof Collection<?>) {
                    printf((Collection<?>) obj[i]);
                } else if (obj[i] instanceof int[][]) {
                    printf((int[][]) obj[i]);
                } else if (obj[i] instanceof long[][]) {
                    printf((long[][]) obj[i]);
                } else if (obj[i] instanceof double[][]) {
                    printf((double[][]) obj[i]);
                } else printf(obj[i]);
            }
            return;
        }

        if (b) add(obj[0].getClass().getSimpleName(), " - ");
        printf(obj[0]);
    }

    void printf(Object o) {
        if (o instanceof int[])
            printf(Arrays.stream((int[]) o).boxed());
        else if (o instanceof char[])
            printf(new String((char[]) o));
        else if (o instanceof long[])
            printf(Arrays.stream((long[]) o).boxed());
        else if (o instanceof double[])
            printf(Arrays.stream((double[]) o).boxed());
        else if (o instanceof boolean[]) {
            for (boolean b : (boolean[]) o) add(b, " ");
            add("\n");
        } else
            add(o, "\n");
    }

    void printf(int[]... obj) {
        for (int i = 0; i < obj.length; i++) printf(obj[i]);
    }

    void printf(long[]... obj) {
        for (int i = 0; i < obj.length; i++) printf(obj[i]);
    }

    void printf(double[]... obj) {
        for (int i = 0; i < obj.length; i++) printf(obj[i]);
    }

    void printf(boolean[]... obj) {
        for (int i = 0; i < obj.length; i++) printf(obj[i]);
    }

    void printf(Collection<?> col) {
        printf(col.stream());
    }

    <T, K> void add(T t, K k) {
        if (t instanceof Collection<?>) {
            ((Collection<?>) t).forEach(i -> add(i, " "));
        } else if (t instanceof Object[]) {
            Arrays.stream((Object[]) t).forEach(i -> add(i, " "));
        } else
            add(t);
        add(k);
    }


    <T> void add(T t) {
        answer.append(t);
    }

    static class Reader {
        private BufferedReader br;
        private StringTokenizer st;

        Reader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        Reader(String fileName) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(fileName));
        }

        boolean isReady() throws IOException {
            return br.ready();
        }

        String next() {
            try {
                while (st == null || !st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = nextInt();
            return arr;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        String nextLine() {
            String s = "";
            try {
                s = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return s;
        }
    }
}