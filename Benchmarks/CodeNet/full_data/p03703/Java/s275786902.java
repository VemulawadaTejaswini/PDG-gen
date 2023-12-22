import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

class Main {
    static In in = new In();
    static Out out = new Out();
    static long mod = 1000000007;
    static long inf = 0xfffffffffffffffL;

    void solve() {
        int n = in.nextInt();
        long k = in.nextLong();
        long[] a = in.nextLongArray(n);
        long[] s = new long[n + 1];
        List<Pair<Long, Integer>> list = new ArrayList<>();
        list.add(new Pair<>(0L, 0));
        for (int i = 1; i <= n; i++) {
            s[i] = s[i - 1] + a[i - 1] - k;
            list.add(new Pair<>(s[i], i));
        }
        Comparator<Pair<Long, Integer>> comparator = Comparator.comparing((Pair<Long, Integer> pair) -> pair.first).thenComparing(pair -> pair.second);
        list.sort(comparator);
        SegmentTree segmentTree = new SegmentTree(n);
        long ans = 0;
        for (Pair<Long, Integer> pair : list) {
            ans += segmentTree.get(pair.second);
            segmentTree.addValue(pair.second, n + 1, 1);
        }
        out.println(ans);
    }

    static class Pair<F, S>  {
        F first;
        S second;

        Pair(F first, S second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return String.format("{%s, %s}", first, second);
        }
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class SegmentTree {
    private int n;
    private long[] min;
    private long[] secondMin;
    private long[] minCount;
    private long[] max;
    private long[] secondMax;
    private long[] maxCount;
    private long[] sum;
    private long[] len;
    private long[] ladd;
    private long[] lvalue;

    SegmentTree(int n) {
        this(n, null);
    }

    SegmentTree(long[] a) {
        this(a.length, a);
    }

    private SegmentTree(int m, long[] a) {
        this.n = m == 1 ? 1 : Integer.highestOneBit(m - 1) << 1;
        this.min = new long[n * 2];
        this.secondMin = new long[n * 2];
        this.minCount = new long[n * 2];
        this.max = new long[n * 2];
        this.secondMax = new long[n * 2];
        this.maxCount = new long[n * 2];
        this.sum = new long[n * 2];
        this.len = new long[n * 2];
        this.ladd = new long[n * 2];
        this.lvalue = new long[n * 2];
        for (int i = 0; i < n * 2; i++) {
            ladd[i] = 0;
            lvalue[i] = Main.inf;
        }
        len[0] = n;
        for (int i = 0; i < n - 1; i++) {
            len[i * 2 + 1] = len[i * 2 + 2] = len[i] >> 1;
        }
        for (int i = 0; i < n; i++) {
            if (i < m) {
                max[n - 1 + i] = min[n - 1 + i] = sum[n - 1 + i] = a == null ? 0 : a[i];
                secondMax[n - 1 + i] = -Main.inf;
                secondMin[n - 1 + i] = Main.inf;
                maxCount[n - 1 + i] = minCount[n - 1 + i] = 1;
            } else {
                max[n - 1 + i] = secondMax[n - 1 + i] = -Main.inf;
                min[n - 1 + i] = secondMin[n - 1 + i] = Main.inf;
                maxCount[n - 1 + i] = minCount[n - 1 + i] = 0;
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            update(i);
        }
    }

    void changeMin(int i, long x) {
        updateMin(x, i, i + 1, 0, 0, n);
    }

    void changeMax(int i, long x) {
        updateMax(x, i, i + 1, 0, 0, n);
    }

    void addValue(int i, long x) {
        addValue(x, i, i + 1, 0, 0, n);
    }

    void setValue(int i, long x) {
        updateValue(x, i, i + 1, 0, 0, n);
    }

    long getMin(int i) {
        return getMin(i, i + 1, 0, 0, n);
    }

    long getMax(int i) {
        return getMax(i, i + 1, 0, 0, n);
    }

    long get(int i) {
        return getSum(i, i + 1, 0, 0, n);
    }

    void changeMin(int l, int r, long x) {
        updateMin(x, l, r, 0, 0, n);
    }

    void changeMax(int l, int r, long x) {
        updateMax(x, l, r, 0, 0, n);
    }

    void addValue(int l, int r, long x) {
        addValue(x, l, r, 0, 0, n);
    }

    void setValue(int l, int r, long x) {
        updateValue(x, l, r, 0, 0, n);
    }

    long getMin(int l, int r) {
        return getMin(l, r, 0, 0, n);
    }

    long getMax(int l, int r) {
        return getMax(l, r, 0, 0, n);
    }

    long getSum(int l, int r) {
        return getSum(l, r, 0, 0, n);
    }

    private void updateNodeMin(int k, long x) {
        sum[k] += (x - min[k]) * minCount[k];
        if (min[k] == max[k]) {
            min[k] = max[k] = x;
        } else if (min[k] == secondMax[k]) {
            min[k] = secondMax[k] = x;
        } else {
            min[k] = x;
        }
        if (lvalue[k] != Main.inf && lvalue[k] < x) {
            lvalue[k] = x;
        }
    }

    private void updateNodeMax(int k, long x) {
        sum[k] += (x - max[k]) * maxCount[k];
        if (max[k] == min[k]) {
            max[k] = min[k] = x;
        } else if (max[k] == secondMin[k]) {
            max[k] = secondMin[k] = x;
        } else {
            max[k] = x;
        }
        if (lvalue[k] != Main.inf && x < lvalue[k]) {
            lvalue[k] = x;
        }
    }

    private void push(int k) {
        if (k < n - 1) {
            if (lvalue[k] != Main.inf) {
                updateAll(k * 2 + 1, lvalue[k]);
                updateAll(k * 2 + 2, lvalue[k]);
                lvalue[k] = Main.inf;
            } else {
                if (ladd[k] != 0) {
                    addAll(k * 2 + 1, ladd[k]);
                    addAll(k * 2 + 2, ladd[k]);
                    ladd[k] = 0;
                }
                if (max[k] < max[k * 2 + 1]) {
                    updateNodeMax(k * 2 + 1, max[k]);
                }
                if (min[k * 2 + 1] < min[k]) {
                    updateNodeMin(k * 2 + 1, min[k]);
                }
                if (max[k] < max[k * 2 + 2]) {
                    updateNodeMax(k * 2 + 2, max[k]);
                }
                if (min[k * 2 + 2] < min[k]) {
                    updateNodeMin(k * 2 + 2, min[k]);
                }
            }
        }
    }

    private void update(int k) {
        sum[k] = sum[k * 2 + 1] + sum[k * 2 + 2];
        if (max[k * 2 + 1] < max[k * 2 + 2]) {
            max[k] = max[k * 2 + 2];
            maxCount[k] = maxCount[k * 2 + 2];
            secondMax[k] = Math.max(max[k * 2 + 1], secondMax[k * 2 + 2]);
        } else if (max[k * 2 + 2] < max[k * 2 + 1]) {
            max[k] = max[k * 2 + 1];
            maxCount[k] = maxCount[k * 2 + 1];
            secondMax[k] = Math.max(secondMax[k * 2 + 1], max[k * 2 + 2]);
        } else {
            max[k] = max[k * 2 + 1];
            maxCount[k] = maxCount[k * 2 + 1] + maxCount[k * 2 + 2];
            secondMax[k] = Math.max(secondMax[k * 2 + 1], secondMax[k * 2 + 2]);
        }
        if (min[k * 2 + 1] < min[k * 2 + 2]) {
            min[k] = min[k * 2 + 1];
            minCount[k] = minCount[k * 2 + 1];
            secondMin[k] = Math.min(secondMax[k * 2 + 1], min[k * 2 + 2]);
        } else if (min[k * 2 + 2] < min[k * 2 + 1]) {
            min[k] = min[k * 2 + 2];
            minCount[k] = minCount[k * 2 + 2];
            secondMax[k] = Math.min(min[k * 2 + 1], secondMin[k * 2 + 2]);
        } else {
            min[k] = min[k * 2 + 1];
            minCount[k] = minCount[k * 2 + 1] + minCount[k * 2 + 2];
            secondMin[k] = Math.min(secondMin[k * 2 + 1], secondMin[k * 2 + 2]);
        }
    }

    private void updateMin(long x, int a, int b, int k, int l, int r) {
        if (l < b && a < r && x < max[k]) {
            if (a <= l && r <= b && secondMax[k] < x) {
                updateNodeMax(k, x);
            } else {
                push(k);
                updateMin(x, a, b, k * 2 + 1, l, (l + r) / 2);
                updateMin(x, a, b, k * 2 + 2, (l + r) / 2, r);
                update(k);
            }
        }
    }

    private void updateMax(long x, int a, int b, int k, int l, int r) {
        if (l < b && a < r && min[k] < x) {
            if (a <= l && r <= b && x < secondMin[k]) {
                updateNodeMin(k, x);
            } else {
                push(k);
                updateMax(x, a, b, k * 2 + 1, l, (l + r) / 2);
                updateMax(x, a, b, k * 2 + 2, (l + r) / 2, r);
                update(k);
            }
        }
    }

    private void addAll(int k, long x) {
        max[k] += x;
        if (secondMax[k] != -Main.inf) {
            secondMax[k] += x;
        }
        min[k] += x;
        if (secondMin[k] != Main.inf) {
            secondMin[k] += x;
        }
        sum[k] += len[k] * x;
        if (lvalue[k] != Main.inf) {
            lvalue[k] += x;
        } else {
            ladd[k] += x;
        }
    }

    private void updateAll(int k, long x) {
        max[k] = x;
        secondMax[k] = -Main.inf;
        min[k] = x;
        secondMin[k] = Main.inf;
        maxCount[k] = minCount[k] = len[k];
        sum[k] = x * len[k];
        lvalue[k] = x;
        ladd[k] = 0;
    }

    private void addValue(long x, int a, int b, int k, int l, int r) {
        if (l < b && a < r) {
            if (a <= l && r <= b) {
                addAll(k, x);
            } else {
                push(k);
                addValue(x, a, b, k * 2 + 1, l, (l + r) / 2);
                addValue(x, a, b, k * 2 + 2, (l + r) / 2, r);
                update(k);
            }
        }
    }

    private void updateValue(long x, int a, int b, int k, int l, int r) {
        if (l < b && a < r) {
            if (a <= l && r <= b) {
                updateAll(k, x);
            } else {
                push(k);
                updateValue(x, a, b, k * 2 + 1, l, (l + r) / 2);
                updateValue(x, a, b, k * 2 + 2, (l + r) / 2, r);
                update(k);
            }
        }
    }

    private long getMin(int a, int b, int k, int l, int r) {
        if (b <= l || r <= a) {
            return Main.inf;
        }
        if (a <= l && r <= b) {
            return min[k];
        }
        push(k);
        long lv = getMin(a, b, k * 2 + 1, l, (l + r) / 2);
        long rv = getMin(a, b, k * 2 + 2, (l + r) / 2, r);
        return Math.min(lv, rv);
    }

    private long getMax(int a, int b, int k, int l, int r) {
        if (b <= l || r <= a) {
            return -Main.inf;
        }
        if (a <= l && r <= b) {
            return max[k];
        }
        push(k);
        long lv = getMax(a, b, k * 2 + 1, l, (l + r) / 2);
        long rv = getMax(a, b, k * 2 + 2, (l + r) / 2, r);
        return Math.max(lv, rv);
    }

    private long getSum(int a, int b, int k, int l, int r) {
        if (b <= l || r <= a) {
            return 0;
        }
        if (a <= l && r <= b) {
            return sum[k];
        }
        push(k);
        long lv = getSum(a, b, k * 2 + 1, l, (l + r) / 2);
        long rv = getSum(a, b, k * 2 + 2, (l + r) / 2, r);
        return lv + rv;
    }
}

class In {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 0x10000);
    private StringTokenizer tokenizer;

    String next() {
        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
        } catch (IOException ignored) {
        }
        return tokenizer.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    char[][] nextCharArray(int n, int m) {
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = next().toCharArray();
        }
        return a;
    }

    int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    int[] nextIntArray(int n, IntUnaryOperator op) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsInt(nextInt());
        }
        return a;
    }

    long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }
        return a;
    }

    long[] nextLongArray(int n, LongUnaryOperator op) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsLong(nextLong());
        }
        return a;
    }
}

class Out {
    private PrintWriter out = new PrintWriter(System.out);
    boolean autoFlush = false;

    void println(Object... a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Object obj : a) {
            joiner.add(String.valueOf(obj));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(int[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i : a) {
            joiner.add(Integer.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(long[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (long i : a) {
            joiner.add(Long.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void flush() {
        out.flush();
    }
}
