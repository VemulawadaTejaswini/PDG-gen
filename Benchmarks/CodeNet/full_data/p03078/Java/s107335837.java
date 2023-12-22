import java.io.*;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
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

        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int k = in.nextInt();
        long[] a = new long[x];
        for (int i = 0; i < x; i++) {
            a[i] = in.nextLong();
        }
        long[] b = new long[y];
        for (int i = 0; i < y; i++) {
            b[i] = in.nextLong();
        }
        long[] c = new long[z];
        for (int i = 0; i < z; i++) {
            c[i] = in.nextLong();
        }

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        PriorityQueue<Item> queue = new PriorityQueue<>((it1, it2) -> Long.compare(it2.value, it1.value));
        queue.add(new Item(a[x - 1] + b[y - 1] + c[z - 1], x - 1, y - 1, z - 1));
        long[] ans = new long[k];
        int count = 0;
        Set<Index> set = new HashSet<>();
        set.add(new Index(x - 1, y - 1, z - 1));
        while (count < k) {
            Item item = queue.poll();
            ans[count] = item.value;
            int xi = item.xi;
            int yi = item.yi;
            int zi = item.zi;
            if (xi > 0 && set.add(new Index(xi - 1, yi, zi))) {
                queue.add(new Item(a[xi - 1] + b[yi] + c[zi], xi - 1, yi, zi));
            }
            if (yi > 0 && set.add(new Index(xi, yi - 1, zi))) {
                queue.add(new Item(a[xi] + b[yi - 1] + c[zi], xi, yi - 1, zi));
            }
            if (zi > 0 && set.add(new Index(xi, yi, zi - 1))) {
                queue.add(new Item(a[xi] + b[yi] + c[zi - 1], xi, yi, zi - 1));
            }
            count++;
        }
        for (long v : ans) {
            printf(v);
        }


    }

    static class Item {
        long value;
        int xi, yi, zi;

        public Item(long value, int xi, int yi, int zi) {
            this.value = value;
            this.xi = xi;
            this.yi = yi;
            this.zi = zi;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "value=" + value +
                    ", xi=" + xi +
                    ", yi=" + yi +
                    ", zi=" + zi +
                    '}';
        }
    }

    static class Index {
        int xi, yi, zi;

        public Index(int xi, int yi, int zi) {
            this.xi = xi;
            this.yi = yi;
            this.zi = zi;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Index index = (Index) o;
            return xi == index.xi &&
                    yi == index.yi &&
                    zi == index.zi;
        }

        @Override
        public int hashCode() {
            return Objects.hash(xi, yi, zi);
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

        double nextDouble() {
            return Double.parseDouble(next());
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