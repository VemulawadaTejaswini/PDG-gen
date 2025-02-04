
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        try {
//            solveA();
//            solveB();
//            solveC();
            solveD();
//            solveD2();
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
        int k = nextInt();
        int x = nextInt();
        if (500 * k >= x)
            out.println("Yes");
        else
            out.println("No");

    }

    private void solveB() {
        int n = nextInt();
        char[] s = next().toCharArray();
        int cnt = 0;
        for (int i = 0; i < s.length - 2; i++) {
            if (s[i] == 'A' && s[i + 1] == 'B' && s[i + 2] == 'C')
                cnt++;
        }
        out.println(cnt);
    }

    private void solveC() {
        int n = nextInt();
        int[] p = IntStream.range(0, n).map(i -> nextInt()).toArray();
        int wkP = 0;
        for (int item : p) {
            wkP *= 10;
            wkP += item;
        }
        int[] q = IntStream.range(0, n).map(i -> nextInt()).toArray();
        int wkQ = 0;
        for (int item : q) {
            wkQ *= 10;
            wkQ += item;
        }
        helperC(wkP, wkQ, n, 0, 0, new boolean[n]);
        Collections.sort(set);
        int index1 = set.indexOf(wkP);
        int index2 = set.indexOf(wkQ);
        out.println(Math.abs(index1 - index2));
    }

    private List<Integer> set = new ArrayList<Integer>();
    private int complete;

    private void helperC(int p, int q, int n, int index, int curr, boolean[] visited) {
        if (complete == 2)
            return;

        if (index >= n) {
            set.add(curr);
            if (curr == p || curr == q)
                complete++;
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (visited[i - 1])
                continue;
            visited[i - 1] = true;
            int wkCurr = curr * 10 + i;
            helperC(p, q, n, index + 1, wkCurr, visited);
            visited[i - 1] = false;
        }
    }

    /**
     * TLE
     */
    private void solveD2() {
        int n = nextInt();
        int m = nextInt();
        int[] wk = IntStream.range(0, n).map(i -> nextInt()).toArray();
        Map<Integer, Long> memo = new HashMap<Integer, Long>();
        for (int item : wk) {
            int cnt = 1;
            int tmp = m + 1;
            do {
                tmp = item * cnt + (item >> 1);
                memo.put(tmp, memo.getOrDefault(tmp, 0L) + 1);
                cnt++;
            } while (tmp <= m);
        }
        int size = wk.length;
        long res = 0;
        for (long item : memo.values()) {
            if (item == size)
                res++;
        }
        out.println(res);
    }

    /**
     * x=a_k * (p+0.5)
     * 2x = 2*a_k*p + 1
     * x = (a_k/2)*(p + 1)
     * xはa_kの奇数倍=奇数（偶数/2）の奇数倍なので奇数->x/2の回数=a_k/2の回数？
     */
    private void solveD() {
        int n = nextInt();
        long m = nextLong();
        int[] wk = IntStream.range(0, n).map(i -> nextInt()).toArray();

        int cnt = 0;
        for (int i = 0; i < wk.length; i++) {
            int wkItem = wk[i];
            int wkCnt = 0;
            while (wkItem % 2 != 0) {
                wkItem >>= 1;
                wkCnt++;
            }
            if (i == 0) {
                cnt = wkCnt;
            } else if (cnt != wkCnt) {
                out.println(0);
                return;
            }
            wk[i] = wkItem;
        }

        int lcm = wk[0];
        for (int item : wk) {
            lcm = getLcm(lcm, item);
        }
        long res = 1;
        while (lcm * res <= m) {
            res += 2;
        }
        out.println(res);
//        out.println(m / lcm + 1);
    }

    private int getLcm(int a, int b) {
        return a * b / getGCD(a, b);
    }

    private int getGCD(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int amari = max % min;
        while (amari != 0) {
            max = min;
            min = amari;
            amari = max % min;
        }
        return min;
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