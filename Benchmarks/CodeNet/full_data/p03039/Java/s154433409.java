
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
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
//			solveD();
            solveE();
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
        int a = nextInt();
        int b = nextInt();

        if (a <= 5) {
            out.println(0);
        } else if (a <= 12) {
            out.println(b / 2);
        } else {
            out.println(b);
        }
    }

    private void solveB() {
        int r = nextInt();
        int d = nextInt();
        int x2000 = nextInt();

        int pre = x2000;
        //		for (int i = 1; i <= 10; i++) {
        //			out.println(r * pre - d);
        //			pre = r * pre - d;
        //		}
        for (int i = 1; i <= 10; i++) {
            pre = r * pre - d;
            out.println(pre);
        }

    }

    private void solveC() {
        int n = nextInt();
        int m = nextInt();

        //各ゲートで何番のキーが必要かのmemo用
        int[] wk = new int[n];

        for (int i = 0; i < m; i++) {
            int l = nextInt() - 1;
            int r = nextInt() - 1;
            wk[l] += 1;
            if (r + 1 < n) {
                wk[r + 1] -= 1;
            }
        }

        //
        for (int i = 1; i < n; i++) {
            wk[i] += wk[i - 1];
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (wk[i] == m) {
                cnt++;
            }
        }

        out.println(cnt);
    }

    private void solveD() {
        int n = nextInt();
        int m = nextInt();
        Map<Long, Long> wk = IntStream.range(0, n).mapToObj(i -> nextLong())
                .collect(Collectors.groupingBy(s -> s, TreeMap::new, Collectors.counting()));

        long[][] bc = Stream.generate(() -> new long[]{nextLong(), nextLong()}).limit(m)
                .sorted((x, y) -> -Long.compare(x[1], y[1]))
                .toArray(long[][]::new);

        for (int j = 0; j < m; j++) {
            long rewriteCnt = bc[j][0];
            Map<Long, Long> temporaryMap = new TreeMap<Long, Long>();
            for (Entry<Long, Long> entry : wk.entrySet()) {
                //valueが0なのでその値は消去扱い
                if (entry.getValue() == 0) {
                    break;
                }
                //bc[][]をまだ利用可能か
                if (rewriteCnt == 0) {
                    break;
                }
                if (bc[j][1] > entry.getKey()) {
                    /*
                     * a[i]の方が小さいのは書き換え
                     * Iteratorの中での追記方法ちょっとわからないので
                     * 削除処理のみ行い、追記対象は一旦temporaryに退避
                     */
                    for (int i = 0; i < entry.getValue() && rewriteCnt > 0; i++, rewriteCnt--) {
                        temporaryMap.merge(entry.getKey(), -1l, (oldV, newV) -> oldV + newV);
                        temporaryMap.merge(bc[j][1], 1l, (oldV, newV) -> oldV + newV);
                        //書き換え可能回数を更新
                    }
                } else {
                    //既にソート済みなので、a[i]の方が大きいならこれ以上比較する必要なし
                    break;
                }
            }
            //Mapをマージ
            wk = Stream.of(wk, temporaryMap)
                    .flatMap(map -> map.entrySet().stream())
                    .collect(Collectors.toMap(Entry::getKey, Entry::getValue, Long::sum, TreeMap::new));

        }
        long res = wk.entrySet().stream().mapToLong(entry -> entry.getKey() * entry.getValue()).sum();
        out.println(res);
    }

    private void solveD2() {
        int n = nextInt();
        int m = nextInt();
        long[] a = LongStream.range(0, n).map(i -> nextLong()).toArray();

        //小さい順に並べ替え
        Arrays.sort(a);

        int[][] bc = IntStream.range(0, m).collect(() -> new int[m][2],
                (t, i) -> {
                    t[i][0] = nextInt();
                    t[i][1] = nextInt();
                },
                (t, u) -> {
                    Stream.concat(Arrays.stream(t), Arrays.stream(u));
                });

        //Cが大きい順に並べ替え
        Arrays.sort(bc, (x, y) -> -Integer.compare(x[1], y[1]));
        //同じところを書き換える（比較する）意味はないのでstartをずらしていく
        int start = 0;
        for (int j = 0; j < m; j++) {
            int max = Integer.min((start + bc[j][0]), n);
            for (int k = start; k < max; k++) {
                if (bc[j][1] > a[k]) {
                    //a[i]の方が小さいのは書き換え
                    a[k] = bc[j][1];
                    //次のstartをずらす準備
                    start = k + 1;
                } else {
                    //既にソート済みなので、a[i]の方が大きいならこれ以上比較する必要なし
                    break;
                }
            }

        }
        //合計
        long res = Arrays.stream(a).sum();

        out.println(res);
    }

    /**
     * 距離 |a - b| はM個のマスから a, b を除いた M-2個に残りの K-2個のコマを置く場合の数だけ重複する。
     * 重複度は C(M-2, K-2) となる。
     */
    private void solveE() {
        int n = nextInt();
        int m = nextInt();
        int k = nextInt();

        final long CONST_MOD = (long) (Math.pow(10, 9) + 7);
		/*
		まず、1次元で考える。
		1次元では距離dの駒のペアはM-d個
		上記ペアの距離の総和はd(M-d)と表せる。
		距離dを1からM-1まで動かして総和を計算する。
		 */
        long dx = 0;
        for (int i = 1; i < m; i++) {
            dx += n * n % CONST_MOD * i % CONST_MOD * (m - i) % CONST_MOD;
        }
        long dy = 0;
        for (int i = 1; i < n; i++) {
            dy += m * m % CONST_MOD * i % CONST_MOD * (n - i) % CONST_MOD;
        }
        Combination combination = new Combination(n * m);
        long res = combination.combination(n * m - 2, k - 2);
        res *= dx + dy % CONST_MOD;
        res %= CONST_MOD;

        out.println(res);
    }

    private void solveF() {
        int n = nextInt();

        out.println("");
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

class Combination {
    static final int MOD = (int) (Math.pow(10, 9) + 7);
    long[] fact;
    long[] invFact;
    long[] inv;

    public Combination(int n) {
        fact = new long[n + 1];
        invFact = new long[n + 1];
        inv = new long[n + 1];
        fact[0] = 1;
        fact[1] = 1;
        invFact[0] = 1;
        invFact[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            fact[i] = fact[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            invFact[i] = invFact[i - 1] * inv[i] % MOD;
        }
    }

    public long combination(int n, int k) {
        if (n < k || n < 0 || k < 0) {
            return 0;
        }
        return fact[n] * (invFact[k] * invFact[n - k] % MOD) % MOD;
    }
}