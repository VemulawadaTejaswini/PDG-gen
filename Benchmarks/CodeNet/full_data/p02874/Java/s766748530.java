import java.io.*;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    final static long MOD07 = 1_000_000_007;
    final static long MOD09 = 1_000_000_009;

    public static void main(String[] args) {
        final FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = fs.nextInt();
        List<Pair<Long, Long>> lr = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            lr.add(new Pair(fs.nextLong(), fs.nextLong()));
        }
        long max = 0;
        Collections.sort(lr, (p1, p2) -> (int) ((-(p1.s - p1.f) + (p2.s - p2.f))));
        max = Math.max(max, getMax(lr));
        Collections.sort(lr, (p1, p2) -> (int) (((p1.s - p1.f) - (p2.s - p2.f))));
        max = Math.max(max, getMax(lr));
        Collections.sort(lr, (p1, p2) -> (int) (p1.f - p2.f));
        max = Math.max(max, getMax(lr));
        Collections.sort(lr, (p1, p2) -> (int) (-p1.f + p2.f));
        max = Math.max(max, getMax(lr));
        Collections.sort(lr, (p1, p2) -> (int) (p1.s - p2.s));
        max = Math.max(max, getMax(lr));
        Collections.sort(lr, (p1, p2) -> (int) (-p1.s + p2.s));
        max = Math.max(max, getMax(lr));

        out.println(max);
        out.flush();
    }

    public static long getMax(List<Pair<Long, Long>> lr) {
        long aLeft = lr.get(0).f;
        long aRight = lr.get(0).s;
        long bLeft = lr.get(1).f;
        long bRight = lr.get(1).s;

        for (int i = 2; i < lr.size(); i++) {
            // what if putting to a
            long li = lr.get(i).f;
            long ri = lr.get(i).s;
            long newALeft = Math.max(aLeft, li);
            long newARight = Math.min(aRight, ri);
            long scoreA = (newARight - newALeft) + (bRight - bLeft) + 2;

            long newBLeft = Math.max(bLeft, li);
            long newBRight = Math.min(bRight, ri);
            long scoreB = (aRight - aLeft) + (newBRight - newBLeft) + 2;

            if (scoreA >= scoreB) {
                aLeft = newALeft;
                aRight = newARight;
            } else {
                bLeft = newBLeft;
                bRight = newBRight;
            }
        }

        return (aRight - aLeft) + (bRight - bLeft) + 2;
    }



    static void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    // Execute func for all patterns can be represented with n bit.
    // O(n2^n)
    static void forAllBit(int n, Consumer<List<Boolean>> func) {
        for (int i = 0; i < (1 << n); i++) {
            List<Boolean> arg = new ArrayList();
            for (int j = 0; j < n; j++) {
                boolean isJthBitSet = ((i >> j) & 1) == 1;
                arg.add(isJthBitSet);
            }
            func.accept(arg);
        }
    }

    static class Pair<F extends Comparable<F>, S extends Comparable<S>> implements Comparable<Pair<F, S>> {
        F f;
        S s;

        Pair() {
        }

        Pair(F f, S s) {
            this.f = f;
            this.s = s;
        }

        Pair(Pair<F, S> p) {
            f = p.f;
            s = p.s;
        }

        @Override
        public int compareTo(Pair<F, S> p) {
            if (f.compareTo(p.f) != 0) {
                return f.compareTo(p.f);
            }
            return s.compareTo(p.s);
        }

        @Override
        public int hashCode() {
            return f.hashCode() ^ s.hashCode();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || this.f == null || this.s == null) {
                return false;
            }
            if (this.getClass() != o.getClass()) {
                return false;
            }
            Pair p = (Pair) o;
            return this.f.equals(p.f) && this.s.equals(p.s);
        }

        @Override
        public String toString() {
            return "{" + f.toString() + ", " + s.toString() + "}";
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= ((int) Math.sqrt(n)); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n != 1;
    }

    public static Map<Integer, Integer> primeFactor(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int num = n;
        for (int i = 2; i <= ((int) Math.sqrt(n)); i++) {
            while (num % i == 0) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
            num /= i;
        }
        if (num != 1) {
            map.put(num, 1);
        }

        return map;
    }

    public static List<Integer> divisors(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= ((int) Math.sqrt(n)); i++) {
            if (n % i == 0) {
                list.add(i);
                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }

        return list;
    }

    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    public static int nCk(int n, int k, int M) {
        long ret = 1;
        int min = Math.min(k, n - k);
        for (int i = 1; i <= min; i++) {
            ret = (ret * pow(i, M - 2, M)) % M;
        }
        for (int i = n - min + 1; i <= n; i++) {
            ret = (ret * i) % M;
        }
        return (int) ret;
    }

    //return a^b mod M O(logB)
    public static long pow(long a, long b, int M) {
        long ret = 1;
        long tmp = a;
        while (b > 0) {
            if ((b & 1) == 1) ret = (ret * tmp) % M;
            tmp = (tmp * tmp) % M;
            b = b >> 1;
        }
        return ret;
    }


    public static int find(int[] tree, int idx) {
        if (tree[idx] == idx) return idx;
        else return tree[idx] = find(tree, tree[idx]);
    }

    public static void union(int[] tree, int idx1, int idx2) {
        int root1 = find(tree, idx1);
        int root2 = find(tree, idx2);
        tree[root2] = root1;
    }

    public static int lowerBound(int[] list, int target) {
        int ok = list.length;
        int ng = -1;
        while (Math.abs(ok - ng) > 1) {
            int mid = (ok + ng) / 2;
            if (list[mid] >= target) {
                ok = mid;
            } else {
                ng = mid;
            }
        }
        return ok;
    }

    public static int lowerBound(long[] list, long target) {
        int ok = list.length;
        int ng = -1;
        while (Math.abs(ok - ng) > 1) {
            int mid = (ok + ng) / 2;
            if (list[mid] >= target) {
                ok = mid;
            } else {
                ng = mid;
            }
        }
        return ok;
    }

    public static <T extends Comparable<? super T>> int lowerBound(List<T> list, T target) {
        return ~Collections.binarySearch(list, target, (x, y) -> (x.compareTo(y) >= 0) ? 1 : -1);
    }

    public static <T extends Comparable<? super T>> int upperBound(List<T> list, T target) {
        return ~Collections.binarySearch(list, target, (x, y) -> (x.compareTo(y) > 0) ? 1 : -1);
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
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }

    private boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
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
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}