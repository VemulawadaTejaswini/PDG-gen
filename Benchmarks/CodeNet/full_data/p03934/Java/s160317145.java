import java.util.Arrays;
import java.util.Scanner;

public class Main {
    MyScanner sc    = new MyScanner();
    Scanner   sc2   = new Scanner(System.in);
    long      start = System.currentTimeMillis();
    long      fin   = System.currentTimeMillis();
    final int MOD   = 1000000007;
    int[]     dx    = { 1, 0, 0, -1 };
    int[]     dy    = { 0, 1, -1, 0 };

    int       n, q;
    Pair      dat[];

    void init() {
        dat = new Pair[n * 2 - 1];
        for (int i = 0; i < n * 2 - 1; i++) {
            dat[i] = new Pair(0, 100);
        }
    }

    Pair query(int a, int b, int k, int l, int r) {
        if (a <= l && r <= b) return dat[k];
        if (r <= a || b <= l) return new Pair(100000000, 100000000);
        Pair vl = query(a, b, k * 2 + 1, l, (l + r) / 2);
        Pair vr = query(a, b, k * 2 + 2, (l + r) / 2, r);

        return compare(vl, vr);
    }

    void update(int i, int x, int id) {
        i += n - 1;
        dat[i].cnt += x;
        dat[i].id = id;
        while (i > 0) {
            i = (i - 1) / 2;
            dat[i] = compare(dat[i * 2 + 1], dat[i * 2 + 2]);
        }
    }

    Pair compare(Pair a, Pair b) {
        if (a.cnt < b.cnt) return a;
        else if (b.cnt < a.cnt) return b;
        else if (a.id < b.id) return a;
        else return b;
    }

    void display() {
        StringBuilder sb = new StringBuilder();
        System.out.println("-------dump-------");
        int h = 0;
        int index = 0;
        while (index < dat.length) {
            for (int i = 0; i < Math.pow(2, h); i++)
                sb.append(dat[index].cnt + "."+dat[index++].id+" ");
            sb.append("\n");
            h++;
        }
        System.out.print(sb);
    }

    void run() {
        // nn : 要素数
        // q : クエリ
        // n : 用意するノードの数
        int nn = sc.nextInt();
        q = sc.nextInt();
        n = 1;
        while (n < nn)
            n *= 2;

        init();
        for(int i=0;i<nn;i++) update(i, 0, i);
        //display();
        while (q-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (b != 1) return;
            
            Pair min = query(0, a, 0, 0, n);
            update(min.id, 1, min.id);
        }
        for(int i=0;i<nn;i++) {
            System.out.println(dat[i+n-1].cnt);
        }
    }

    class Pair implements Comparable<Pair> {

        int cnt;
        int id;

        public Pair() {
            super();
            this.cnt = 0;
            this.id = 0;
        }

        public Pair(int cnt, int id) {
            super();
            this.cnt = cnt;
            this.id = id;
        }

        @Override
        public int compareTo(Pair arg0) {
            if (this.cnt == arg0.cnt) {
                return this.id - arg0.id;
            }
            return this.cnt - arg0.cnt;
        }

        void show() {
            System.out.println("cnt = " + this.cnt + " id = " + this.id);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }

    void debug(Object... o) {
        System.out.println(Arrays.deepToString(o));
    }

    void debug2(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    boolean inner(int h, int w, int limH, int limW) {
        return 0 <= h && h < limH && 0 <= w && w < limW;
    }

    void swap(int[] x, int a, int b) {
        int tmp = x[a];
        x[a] = x[b];
        x[b] = tmp;
    }

    // find minimum i (k <= a[i])
    int lower_bound(int a[], int k) {
        int l = -1;
        int r = a.length;
        while (r - l > 1) {
            int mid = (l + r) / 2;
            if (k <= a[mid])
                r = mid;
            else
                l = mid;
        }
        // r = l + 1
        return r;
    }

    // find minimum i (k < a[i])
    int upper_bound(int a[], int k) {
        int l = -1;
        int r = a.length;
        while (r - l > 1) {
            int mid = (l + r) / 2;
            if (k < a[mid])
                r = mid;
            else
                l = mid;
        }
        // r = l + 1
        return r;
    }

    long gcd(long a, long b) {
        return a % b == 0 ? b : gcd(b, a % b);
    }

    long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    boolean palindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    class MyScanner {
        int nextInt() {
            try {
                int c = System.in.read();
                while (c != '-' && (c < '0' || '9' < c))
                    c = System.in.read();
                if (c == '-')
                    return -nextInt();
                int res = 0;
                do {
                    res *= 10;
                    res += c - '0';
                    c = System.in.read();
                } while ('0' <= c && c <= '9');
                return res;
            } catch (Exception e) {
                return -1;
            }
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        String next() {
            try {
                StringBuilder res = new StringBuilder("");
                int c = System.in.read();
                while (Character.isWhitespace(c))
                    c = System.in.read();
                do {
                    res.append((char) c);
                } while (!Character.isWhitespace(c = System.in.read()));
                return res.toString();
            } catch (Exception e) {
                return null;
            }
        }

        int[] nextIntArray(int n) {
            int[] in = new int[n];
            for (int i = 0; i < n; i++) {
                in[i] = nextInt();
            }
            return in;
        }

        int[][] nextInt2dArray(int n, int m) {
            int[][] in = new int[n][m];
            for (int i = 0; i < n; i++) {
                in[i] = nextIntArray(m);
            }
            return in;
        }

        double[] nextDoubleArray(int n) {
            double[] in = new double[n];
            for (int i = 0; i < n; i++) {
                in[i] = nextDouble();
            }
            return in;
        }

        long[] nextLongArray(int n) {
            long[] in = new long[n];
            for (int i = 0; i < n; i++) {
                in[i] = nextLong();
            }
            return in;
        }

        char[][] nextCharField(int n, int m) {
            char[][] in = new char[n][m];
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                for (int j = 0; j < m; j++) {
                    in[i][j] = s.charAt(j);
                }
            }
            return in;
        }
    }
}