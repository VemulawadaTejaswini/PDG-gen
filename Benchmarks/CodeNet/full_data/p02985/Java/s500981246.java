import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    static int K;
    static boolean[] used;
    static ArrayList<Integer>[] edge;
    static ModOp modop = new ModOp();

    public static void main(String[] args) {
        int N = in.i();
        K = in.i();
        
        edge = new ArrayList[N];
        Arrays.setAll(edge, i -> new ArrayList<>());
        for (int i = 1; i < N; i++) {
            int a = in.i() - 1;
            int b = in.i() - 1;
            edge[a].add(b);
            edge[b].add(a);
        }
        
        used = new boolean[N];
        used[0] = true;
        long ans = solve(0);

        out.println(ans);
    }

    public static long solve(int parent) {
        int n = parent == 0 ? K : K - 2;
        int r = edge[parent].size() + n - K + 1;
        long ret = modop.nPr(n, r);
        for (int child : edge[parent]) {
            if (!used[child]) {
                used[child] = true;
                ret = ret * solve(child) % 1_000_000_007;
            }
        }
        return ret;
    }
}

class ModOp {
    private static final int MAX = 100001;
    private static final int MOD = 1_000_000_007;

    private long[] fact = new long[MAX];
    private long[] factInv = new long[MAX];
    private long[] inv = new long[MAX];

    ModOp() {
        fact[0] = fact[1] = 1;
        factInv[0] = factInv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < MAX; i++) {
            fact[i] = fact[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            factInv[i] = factInv[i - 1] * inv[i] % MOD;
        }
    }

    long nCr(int n, int k) {
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fact[n] * (factInv[k] * factInv[n - k] % MOD) % MOD;
    }

    long nPr(int n, int k) {
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fact[n] * factInv[n - k] % MOD;
    }

    long fact(int n) {
        return fact[n];
    }

    long pow(long a, long b) {
        long ret = 1;
        while(b > 0){
            if((b & 1) == 1) {
                ret = ret * a % MOD;
            }
            a = a * a % MOD;
            b >>= 1;
        }
        return ret;
    }
}

class MyReader extends BufferedReader {
    char[] cbuf = new char[1024];
    int head = 0;
    int tail = 0;

    MyReader() {
        super(new InputStreamReader(System.in));
    }

    char next() {
        if (head == tail) {
            try {
                tail = read(cbuf, 0, cbuf.length);
            } catch (IOException e) {}
            head = 0;
        }
        return cbuf[head++];
    }

    void back() {
        head--;
    }

    boolean minus() {
        boolean minus;
        while (true) {
            char c = next();
            if (c != ' ' && c != '\n' && c != '\r') {
                if (!(minus = c == '-')) back();
                return minus;
            }
        }
    }

    void skip() {
        while (true) {
            char c = next();
            if (c != ' ' && c != '\n' && c != '\r') {
                back();
                break;
            }
        }
    }

    char[] s(final int N) {
        skip();
        char[] s = new char[N];
        for (int i = 0; i < s.length; i++) {
            s[i] = next();
        }
        return s;
    }

    String s() {
        try {
            return readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    int i() {
        boolean minus = minus();
        int n = 0;
        while (true) {
            int k = next() - '0';
            if (k < 0 || 9 < k) break;
            n = 10 * n + k;
        }
        return minus ? -n : n;
    }

    int[] ii(final int N) {
        int[] a = new int[N];
        for (int j = 0; j < a.length; j++) a[j] = i();
        return a;
    }

    long l() {
        boolean minus = minus();
        long n = 0;
        while (true) {
            int k = next() - '0';
            if (k < 0 || 9 < k) break;
            n = 10 * n + k;
        }
        return minus ? -n : n;
    }
}
