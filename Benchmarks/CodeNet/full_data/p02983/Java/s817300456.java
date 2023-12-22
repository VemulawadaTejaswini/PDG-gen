
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        try {
            //			solveA();
            //			solveB();
            solveC();
            //			solveD();
//			solveE();
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
        int n = nextInt();
        int a = nextInt();
        int b = nextInt();

        out.println(n * a > b ? b : n * a);
    }

    private void solveB() {
        int n = nextInt();
        int d = nextInt();
        int[][] wk = Stream.generate(() -> IntStream.range(0, d).map(i -> nextInt()).toArray()).limit(n)
                .toArray(int[][]::new);

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long tmp = 0;
                for (int k = 0; k < d; k++) {
                    tmp += Math.pow(wk[i][k] - wk[j][k], 2);
                }
                long tmpRes = (long) Math.sqrt(tmp);
                if (Math.pow(tmpRes, 2) == tmp) {
                    res++;
                }
            }
        }

        out.println(res);
    }

    private void solveC() {
        final int CONST_MOD = 2019;
        int l = nextInt();
        int r = nextInt();
        /*
         * とりあえず最大を減らさないと何もできない。
         * l+2019かrかどちらか小さいほうを最大値として採用（MODなので）
         * l+2019で1周期。ただ、これだと最小値が1回しか出てこない。
         * +(2019*2)2周しておけば1が2回出てくる。
         *
         */
        int res = 2020;
        for (int i = l; i <= Integer.min(l + 2019, r); i++) {
            for (int j = i + 1; j <= Integer.min(i + 1 + 2019, r); j++) {
                res = Math.min(((i % CONST_MOD) * (j % CONST_MOD)) % CONST_MOD, res);
            }
        }

//        int wkR = Math.min(l + (CONST_MOD * 2), r);
//        int res = 2020;
//        for (int i = l; i <= wkR; i++) {
//            for (int j = i + 1; j <= wkR; j++) {
//                res = Math.min(((i % CONST_MOD) * (j % CONST_MOD)) % CONST_MOD, res);
//            }
//        }

        out.println(res);
    }

    /*
     * ダム   3 8 7 5 5
     * やま  A B C D E
     *       2 4 12 2 8
     *
     * ダム1 = 山A/2 + 山B/2
     * ダム2 = 山B/2 + 山C/2
     * ダム3 = 山C/2 + 山D/2
     * ダム4 = 山D/2 + 山E/2
     * ダム5 = 山E/2 + 山A/2
     *
     * ダム1*2 = 山A + 山B
     * ダム2*2 = 山B + 山C
     * ダム3*2 = 山C + 山D
     * ダム4*2 = 山D + 山E
     * ダム5*2 = 山E + 山A
     *
     * まず山Aを求める
     * 山A = ダム1 - ダム2 + ダム3 - ダム4 + ダム5
     *
     * 山Aが決まれば山B以降は決まる
     * 山B = ダム1*2 - 山A
     * 山C = ダム2*2 - 山B
     * 山D = ダム3*2 - 山C
     * 山E = ダム4*2 - 山D
     */
    private void solveD() {
        int n = nextInt();
        int[] wk = IntStream.range(0, n).map(i -> nextInt()).toArray();

        long a = 0;

        for (int i = 0; i < wk.length; i++) {
            if (i % 2 == 0) {
                a += wk[i];
            } else {
                a -= wk[i];
            }
        }
        long[] mountain = new long[n];
        mountain[0] = a;
        //最後のヤマは山Aのことなので除外
        for (int i = 0; i < mountain.length - 1; i++) {
            mountain[i + 1] = wk[i] * 2 - mountain[i];
        }
        StringBuilder builder = new StringBuilder();
        for (long l : mountain) {
            builder.append(l + " ");
        }
        out.println(builder.toString().trim());
    }

    private void solveE() {
        int n = nextInt();
        int k = nextInt();
        int[][] wk = Stream.generate(() -> new int[]{nextInt(), nextInt()}).limit(n - 1).toArray(int[][]::new);

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