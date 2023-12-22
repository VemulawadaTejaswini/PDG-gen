import java.io.OutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.InputStream;
 
/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 * @author George Marcus
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		ExpectedGreatestCommonDivisor solver = new ExpectedGreatestCommonDivisor();
		int testCount = Integer.parseInt(in.next());
		for (int i = 1; i <= testCount; i++)
			solver.solve(i, in, out);
		out.close();
	}
}
 
class ExpectedGreatestCommonDivisor {
    private static final int MOD = 1000000007;
 
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int N = in.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
            B[i] = in.nextInt();
            max = Math.max(max, A[i]);
            max = Math.max(max, B[i]);
        }
 
        int[] cnt = new int[max + 1];
        long P = 0;
        for (int k = max; k > 0; k--) {
            long crt = 1;
            for (int i = 0; i < N; i++) {
                crt = crt * calcNumDivisible(A[i], B[i], k) % MOD;
            }
            for (int i = k + k; i <= max; i += k) {
                crt -= cnt[i];
                if (crt < 0) {
                    crt += MOD;
                }
            }
            cnt[k] = (int) crt;
            P = (P + crt * k) % MOD;
        }
 
        long Q = 1;
        for (int i = 0; i < N; i++) {
            Q = Q * (B[i] - A[i] + 1) % MOD;
        }
 
        long ans = MOD - P;
        ans = ans * fastPow(Q, MOD - 2) % MOD;
 
        out.println(ans);
    }
 
    private long fastPow(long a, int p) {
        long ret = 1;
        while (p > 0) {
            if ((p & 1) > 0) {
                ret = ret * a % MOD;
            }
            a = a * a % MOD;
            p >>= 1;
        }
        return ret;
    }
 
    private long calcNumDivisible(int a, int b, int k) {
        return b / k - (a - 1) / k;
    }
}
 
class InputReader {
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;
 
    public InputReader(InputStream stream) {
        this.stream = stream;
    }
 
    public String next() {
        return nextString();
    }
 
    public int read() {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }
 
    public int nextInt() {
        return Integer.parseInt(nextString());
    }
 
    public String nextString() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuffer res = new StringBuffer();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isSpaceChar(c));
 
        return res.toString();
    }
 
    private boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
 
}