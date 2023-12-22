import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {

    int N,K;
    int[] A;

    private void solve() {
       N = nextInt();
       K = nextInt();
       A = new int[N];
       for(int i = 0;i < N;i++) {
           A[i] = nextInt();
       }
       
//       各整数ごとに個数をカウント
       int[] a = new int[200000 + 1];
       for(int i = 0;i < N;i++) {
           a[A[i]]++;
       }

//       各個数ごとにカウント
       int[] b = new int[N + 1];
       for(int i = 0;i < 200000 + 1;i++) {
           if (a[i] > 0){
               b[a[i]]++;
           }
       }

//       整数の種類数を求める
       int count = 0;
       for(int i = 0;i < 200000 + 1;i++) {
           if (a[i] > 0) {
               count++;
           }
       }

       int M = count;
       int ans = 0;
       for(int i = 0;i < M + 1;i++) {
           int min = Math.min(count - K, b[i]);

           ans += min * i;
           count -= min;
       }

       out.println(ans);
    }

    public static void main(String[] args) {
        out.flush();
        new Main().solve();
        out.close();
    }

    /* Input */
    private static final InputStream in = System.in;
    private static final PrintWriter out = new PrintWriter(System.out);
    private final byte[] buffer = new byte[2048];
    private int p = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (p < buflen)
            return true;
        p = 0;
        try {
            buflen = in.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (buflen <= 0)
            return false;
        return true;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrint(buffer[p])) {
            p++;
        }
        return hasNextByte();
    }

    private boolean isPrint(int ch) {
        if (ch >= '!' && ch <= '~')
            return true;
        return false;
    }

    private int nextByte() {
        if (!hasNextByte())
            return -1;
        return buffer[p++];
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = -1;
        while (isPrint((b = nextByte()))) {
            sb.appendCodePoint(b);
        }
        return sb.toString();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}