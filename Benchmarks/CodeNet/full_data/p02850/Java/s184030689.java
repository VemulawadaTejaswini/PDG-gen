

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        try {
            //			solveA();
            //			solveB();
//			solveC();
            solveD();
            //			 solveE();
            //			 solveF();
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.flush();
                out.close();
            }
        }

    }

    private void solveA() {
        String s = next();
        List<String> days = Arrays.asList(new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"});

        out.println(7 - days.indexOf(s));
    }

    private void solveB() {
        int n = nextInt();
        char[] wk = next().toCharArray();
        for (int i = 0; i < wk.length; i++) {
            wk[i] = getRot(n, wk[i]);
        }

        out.println(new String(wk));
    }

    private char getRot(int n, char c) {
        int wk = c - 'A';
        wk += n;
        return (char) (wk % 26 + 'A');
    }

    private void solveC() {
        long a = nextLong();
        long b = nextLong();
        long x = nextLong();

        if (a + b > x) {
            out.println(0);
            return;
        }
        long left = 1;
        long right = (long) Math.pow(10, 9) + 1;
        while (right - left > 1) {
            long mid = left + (right - left) / 2;
            long tmp = a * mid + b * getDigit(mid);
            if (tmp > x) {
                right = mid;
            } else {
                left = mid;
            }
        }
        out.println(left);
    }

    private long getDigit(long n) {
        int cnt = 0;
        while (n > 0) {
            cnt++;
            n /= 10;
        }
        return cnt;
    }


    private static class Pair<K, V> {
        K key;
        V value;

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private static class Point {
        private int color;
        private List<Pair<Integer, Integer>> next;

        public Point() {
            next = new ArrayList<Pair<Integer, Integer>>();
            color = -1;
        }

    }

    private void solveD() {
        int n = nextInt();
        int[][] wk = Stream.generate(() -> new int[]{nextInt(), nextInt()}).limit(n - 1).toArray(int[][]::new);

        Point[] points = new Point[n];

        for (int i = 0; i < n - 1; i++) {
            int a = wk[i][0] - 1;
            int b = wk[i][1] - 1;
            if (points[a] == null) {
                points[a] = new Point();
            }
            points[a].next.add(new Pair<Integer, Integer>(b, i));
        }

        Queue<Point> queue = new ArrayDeque<Point>();
        queue.add(points[0]);
//        points[0].color = 1;
        int[] index = new int[n - 1];
        while (queue.size() > 0) {
            int cnt = queue.size();
            for (int i = 0; i < cnt; i++) {
                Point next = queue.poll();
                List<Pair<Integer, Integer>> childs = next.next;
                int color = 1;
                int pointColor = next.color;
                for (Pair<Integer, Integer> child : childs) {
                    if (color == pointColor)
                        color++;
                    int cIndex = child.getKey();
                    if (points[cIndex] == null)
                        points[cIndex] = new Point();
                    if (points[cIndex].color != -1)
                        continue;
                    points[cIndex].color = color;
                    index[child.value] = color;
                    color++;
                    queue.add(points[cIndex]);
                }
            }
        }

//        Set<Integer> res = new HashSet<Integer>();
//        for (Point item : points) {
//            res.add(item.color);
//            List<Pair<Integer, Integer>> childs = item.next;
//            for (Pair<Integer, Integer> child : childs) {
//                int cIndex = child.getValue();
//                index[cIndex] = points[child.getKey()].color;
//            }
//        }
        out.println(Arrays.stream(index).distinct().count());
        for (Integer item : index) {
            out.println(item);
        }
    }

    private void solveE() {
        int n = nextInt();

        out.println("");
    }

    private void solveF() {
        int n = nextInt();

        out.println("");
    }

    /*
     * 階乗計算の最大値
     * もっと大きいのが必要ならここを修正
     */
    private final int FACTORIAL_NUM = 111111;
    /*
     * 階乗の事前計算（mod 済）
     */
    private long[] factorial = new long[FACTORIAL_NUM];
    /*
     * 逆数の事前計算（mod 済）
     */
    private long[] reverseFactorial = new long[FACTORIAL_NUM];
    private boolean isInitFactorial = false;

    /**
     * 階乗計算の事前累積和
     * [1, 1, 2, 3, 4, 5, … FACTORIAL_NUM]
     * mod済
     */
    private void initFactorial(long mod) {
        factorial[0] = 1;
        for (int i = 1; i < FACTORIAL_NUM; i++) {
            factorial[i] = (factorial[i - 1] * i) % mod;
        }
    }

    /**
     * 逆数の事前計算
     * もっと速い方法があったので修正
     */
    private void initReverseFactorial(long mod) {

        reverseFactorial[FACTORIAL_NUM - 1] = modInverse(factorial[FACTORIAL_NUM - 1], mod);
        for (int i = FACTORIAL_NUM - 2; i >= 0; i++) {
            /*
             * 以下を利用する。
             * これにより毎回modInverseしなくてよくなる
             * (N!)^(-1) * N -> ((N - 1)!)^(-1)
             * (N-1!)^(-1) * N -> ((N - 2)!)^(-1)
             */
            reverseFactorial[i] = (reverseFactorial[i + 1] * (i + 1)) % mod;
        }
        //		reverseFactorial[0] = 1;
        //		for (int i = 0; i < FACTORIAL_NUM; i++) {
        //			reverseFactorial[i] = modInverse(factorial[i], mod);
        //		}
    }

    /**
     * フェルマーの小定理を用いて逆元を求める。
     * ある数xのmod p（pは素数）の逆数x'はx' = x^(p-2)
     * 繰り返し二乗法を用いて計算する。
     * http://satanic0258.hatenablog.com/entry/2016/04/29/004730
     * {@link BigInteger#modInverse(BigInteger)}とどちらが速いか？
     *
     * @param x
     * @return
     */
    private long modInverse(long x, long mod) {
        long res = 1L;
        long k = mod - 2L;
        long y = x;
        while (k != 0) {
            if (k % 2 != 0) {
                res = (res * y) % mod;
            }
            y = (y * y) % mod;
            k /= 2;
        }
        return res;
    }

    private void initFactorialCalc(long mod) {
        if (isInitFactorial) {
            //初期化済みならreturn
            return;
        }
        //階乗の事前計算
        initFactorial(mod);
        //逆数の計算もしておく
        initReverseFactorial(mod);
        isInitFactorial = true;
    }

    /**
     * 組み合わせ
     * nCk -> n! / k!・(n-k)!
     *
     * @param n
     * @param k
     * @param mod
     * @return
     */
    private long combination(int n, int k, long mod) {
        initFactorialCalc(mod);
        if (k < 0 || n < k) {
            return 0;
        }

        //分子の計算
        long calResN = factorial[n];

        //分母の計算
        long calResNK = reverseFactorial[n - k];
        long calcResK = reverseFactorial[k];
        long denominator = (calResNK * calcResK) % mod;

        return (calResN * denominator) % mod;

    }

    /**
     * 順列
     * nPk -> n! / (n-k)!
     *
     * @param n
     * @param k
     * @return
     */
    private long permutation(int n, int k, long mod) {
        initFactorialCalc(mod);
        if (k < 0 || n < k) {
            return 0;
        }
        long calResN = factorial[n];
        long calResNK = reverseFactorial[n - k];
        return (calResN * calResNK) % mod;
    }

    /**
     * 多項係数
     * 文字aをp個,bをq個,cをr個, dをs個 あわせてn個を1列に並べるときの並べ方
     * n! / p!・q!・r!・s!
     *
     * @param n
     * @param strNum
     * @param mod
     * @return
     */
    private long multinominalCoefficient(int n, List<Integer> strNum, int mod) {
        initFactorialCalc(mod);

        long calResN = factorial[n];
        long calResDenomi = 1;
        for (Integer num : strNum) {
            calResDenomi *= reverseFactorial[num];
        }
        return (calResN * calResDenomi) % mod;
    }

    /**
     * 重複組合せ nHr （同次積）
     * nHr = (n+r-1)Cr
     * 異なるn個のものから重複を許してr個取る組合せの総数
     * 例：
     * リンゴ，ミカン，牛肉の3種類の果物があります．これらの中から6個の食材を買って帰ります．
     * このとき，何通りの買い方がありますか？ただし，含まれない食材があってもよいものとします
     *
     * @param n
     * @param r
     * @param mod
     * @return
     */
    private long homogeneousProduct(int n, int r, long mod) {
        if (n == 0 && r == 0) {
            return 1;
        }
        return combination(n + r - 1, r, mod);
    }

    private final PrintWriter out = new PrintWriter(System.out);
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
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
    }

    public boolean hasNext() {
        skipUnprintable();
        return hasNextByte();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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
}