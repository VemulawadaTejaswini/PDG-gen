import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;


public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int n = fsc.nextInt();
        ArrayList<Integer>[] edges = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            edges[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            int a = fsc.nextInt() - 1;
            int b = fsc.nextInt() - 1;
            edges[a].add(b);
            edges[b].add(a);
        }
        int[] ans = new int[n];
        if (n == 2) {
            ans[0] = 1;
            ans[1] = 2;
            ArrayUtil.println(ans, ' ');
            return;
        }
        Pair<Integer, Integer> u = bfs(edges, 0);
        Pair<Integer, Integer> v = bfs(edges, u.key);
        if (v.val < 3) {
            for (int i = 0 ; i < n; i++) {
                ans[i] = i + 1;
            }
            ArrayUtil.println(ans, ' ');
            return;
        }

        int[] color = new int[n];
        color[0] = 1;
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.add(0);
        int cnt1 = 0;
        int cnt2 = 0;
        while (dq.size() > 0) {
            int now = dq.pollFirst();
            if (color[now] == 1) {
                cnt1++;
            } else {
                cnt2++;
            }
            for (int next : edges[now]) {
                if (color[next] == 0) {
                    color[next] = -color[now];
                    dq.addLast(next);
                }
            }
        }
        int q0 = 3;
        int q1 = 1;
        int q2 = 2;
        int sign = cnt1 > cnt2 ? 1 : -1;
        for (int i = 0; i < n; i++) {
            if (color[i] == 1 * sign) {
                if (q1 <= n) {
                    ans[i] = q1;
                    q1 += 3;
                } else if (q0 <= n) {
                    ans[i] = q0;
                    q0 += 3;
                } else {
                    ans[i] = q2;
                    q2 += 3;
                }
            } else {
                if (q2 <= n) {
                    ans[i] = q2;
                    q2 += 3;
                } else if (q0 <= n) {
                    ans[i] = q0;
                    q0 += 3;
                } else {
                    ans[i] = q1;
                    q1 += 3;
                }
            }
        }
        ArrayUtil.println(ans, ' ');
    }

    public static Pair<Integer, Integer> bfs(ArrayList<Integer>[] nodes, int s) {
        int n = nodes.length;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.addLast(s);
        int[] d = new int[n];
        Arrays.fill(d, -1);
        d[s] = 0;
        int max = 0;
        int ret = 0;
        while(q.size() > 0){
            int now = q.pollFirst();
            for(int next: nodes[now]){
                if(d[next] < 0){
                    d[next] = d[now] + 1;
                    if (d[next] > max) {
                        max = d[next];
                        ret = next;
                    }
                    q.addLast(next);
                }
            }
        }
        return new Pair<>(ret, max);
    }
}


class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte()) {
            return buffer[ptr++];
        } else {
            return -1;
        }
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
            ptr++;
        }
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
            throw new NumberFormatException();
        }
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}


class Pair<K, V> {
    public K key;
    public V val;

    public Pair(K key, V val) {
        this.key = key;
        this.val = val;
    }

    @Override @SuppressWarnings("all")
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Pair)) {
            return false;
        } else {
            Pair p = (Pair) o;
            return this.key.equals(p.key) && this.val.equals(p.val);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.key, this.val);
    }

    @Override
    public String toString() {
        return "(" + this.key.toString() + ", " + this.val.toString() + ")";
    }
}


class ArrayUtil {
    private ArrayUtil(){}
    
    public static int[] map(IntUnaryOperator op, int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = op.applyAsInt(a[i]);
        }
        return b;
    }

    /**
     * s[i] is the sum of the range [0, i) in a.
     * 
     * @param a
     * @return cumulative sum array of a.
     */
    public static int[] cumsum(int[] a) {
        int n = a.length;
        int[] s = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            s[i] = s[i - 1] + a[i - 1];
        }
        return s;
    }

    public static int[][] cumsum(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        int[][] s = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++){
                s[i][j] = s[i - 1][j] + s[i][j - 1] - s[i - 1][j - 1] + a[i - 1][j - 1];
            }
        }
        return s;
    }

    public static void reverse(int[] a, int begin, int end) {
        for (int i = begin; i < begin + (end - begin) / 2; i++) {
            swap(a, i, begin + end - i - 1);
        }
    }

    public static void reverse(int[] a) {
        reverse(a, 0, a.length);
    }

    public static void revSort(int[] a) {
        Arrays.sort(a);
        reverse(a);
    }

    public static int[] nextPermutation(int[] a) {
        int[] ret = a.clone();
        int n = ret.length;
        for (int i = n - 1; i >= 1; i--) {
            if (ret[i] > ret[i - 1]) {
                int fail = n, pass = i;
                while (fail - pass > 1) {
                    int mid = pass + (fail - pass) / 2;
                    if (ret[mid] > ret[i - 1]) {
                        pass = mid;
                    } else {
                        fail = mid;
                    }
                }
                swap(ret, pass, i - 1);
                reverse(ret, i, n);
                return ret;
            }
        }
        return null;
    }

    public static int[] predPermutation(int[] a) {
        int[] ret = a.clone();
        int n = ret.length;
        for (int i = n - 1; i >= 1; i--) {
            if (ret[i] < ret[i - 1]) {
                int fail = n, pass = i;
                while (fail - pass > 1) {
                    int mid = pass + (fail - pass) / 2;
                    if (ret[mid] < ret[i - 1]) {
                        pass = mid;
                    } else {
                        fail = mid;
                    }
                }
                swap(ret, pass, i - 1);
                reverse(ret, i, n);
                return ret;
            }
        }
        return null;
    }

    public static void swap(int[] a, int u, int v) {
        int tmp = a[u];
        a[u] = a[v];
        a[v] = tmp;
    }

    public static int compare(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (i >= b.length) {
                return -1;
            } else if (a[i] > b[i]) {
                return 1;
            } else if (a[i] < b[i]) {
                return -1;
            }
        }
        if (a.length < b.length) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean equals(int[] a, int[] b) {
        return compare(a, b) == 0;
    }

    public static void println(int[] a, char sep) {
        StringBuilder sb = new StringBuilder();
        for (int e : a) {
            sb.append(e).append(sep);
        }
        System.out.println(sb);
    }

    public static void println(int[] a) {
        println(a, '\n');
    }

    /*
     * IntArray _________________________ LongArray
     */
    public static long[] map(LongUnaryOperator op, long[] a) {
        long[] b = new long[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = op.applyAsLong(a[i]);
        }
        return b;
    }

    /**
     * s[i] is the sum of the range [0, i) in a.
     * 
     * @param a
     * @return cumulative sum array of a.
     */
    public static long[] cumsum(long[] a) {
        int n = a.length;
        long[] s = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            s[i] = s[i - 1] + a[i - 1];
        }
        return s;
    }

    public static long[][] cumsum(long[][] a) {
        int n = a.length;
        int m = a[0].length;
        long[][] s = new long[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                s[i][j] = s[i - 1][j] + s[i][j - 1] - s[i - 1][j - 1] + a[i - 1][j - 1];
            }
        }
        return s;
    }

    public static void reverse(long[] a, int begin, int end) {
        for (int i = begin; i < begin + (end - begin) / 2; i++) {
            swap(a, i, begin + end - i - 1);
        }
    }

    public static void reverse(long[] a) {
        reverse(a, 0, a.length);
    }

    public static void revSort(long[] a) {
        Arrays.sort(a);
        reverse(a);
    }

    public static int[] compress(long[] a) {
        int n = a.length;
        long[] sorted = a.clone();
        int[] compress = new int[n];
        Arrays.sort(sorted);
        for (int i = 0; i < n; i++) {
            int l = 0, r = n;
            while (r - l > 1) {
                int m = l + (r - l) / 2;
                if (sorted[m] <= a[i]) {
                    l = m;
                } else {
                    r = m;
                }
            }
            compress[i] = l;
        }
        return compress;
    }

    public static void swap(long[] a, int u, int v) {
        long tmp = a[u];
        a[u] = a[v];
        a[v] = tmp;
    }

    public static int compare(long[] a, long[] b) {
        for (int i = 0; i < a.length; i++) {
            if (i >= b.length) {
                return -1;
            } else if (a[i] > b[i]) {
                return 1;
            } else if (a[i] < b[i]) {
                return -1;
            }
        }
        if (a.length < b.length) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean equals(long[] a, long[] b) {
        return compare(a, b) == 0;
    }

    public static void println(long[] a, char sep) {
        StringBuilder sb = new StringBuilder();
        for (long e : a) {
            sb.append(e).append(sep);
        }
        System.out.println(sb);
    }

    public static void println(long[] a) {
        println(a, '\n');
    }

    /*
     * other Array
     */
    public static void println(char[] s) {
        System.out.println(s);
    }

    public static void println(char[][] s) {
        StringBuilder sb = new StringBuilder();
        for (char[] c : s) {
            sb.append(c).append('\n');
        }
        System.out.print(sb);
    }

    public static boolean[][] inputGrid(FastScanner fsc, int h, int w, char t) {
        boolean[][] grid = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            char[] s = fsc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                grid[i][j] = s[j] == t;
            }
        }
        return grid;
    }

    public static boolean[][] inputGrid(FastScanner fsc, int h, int w) {
        return inputGrid(fsc, h, w, '#');
    }

    public static boolean[][] inputGrid(FastScanner fsc, int n) {
        return inputGrid(fsc, n, n, '#');
    }

    public static boolean[][] inputGrid(FastScanner fsc, int n, char t) {
        return inputGrid(fsc, n, n, t);
    }
}
