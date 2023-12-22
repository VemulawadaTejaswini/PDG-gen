import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
public class Main {
    private static final PrintStream ps     = System.out;
    private static final InputStream IS     = System.in;
    private static final byte[]      BUFFER = new byte[1024];
    private static int               ptr    = 0;
    private static int               buflen = 0;

    public static void main(String[] args) {
        int n = ni();
        boolean[] v = new boolean[n+1];
        int[] dFrom1 = new int[n+1];
        ArrayList<Integer>[] g = new ArrayList[n+1];
        for (int i = 0; i < n+1; i++) {
            g[i] = new ArrayList<Integer>();
        }
        
        for (int i = 0; i < n-1; i++) {
            int a = ni();
            int b = ni();
            g[a].add(b);
            g[b].add(a);
        }
        
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        v[1] = true;
        
        int fenec = 0;
        int snuke = 0;
        while (!q.isEmpty()) {
            int head = q.poll();
            for (int next: g[head]) {
                if (!v[next]) {
                    dFrom1[next] = dFrom1[head] + 1;
                    v[next] = true;
                    
                    if (next != n) {
                        fenec++;
                        q.add(next);
                    }
                }
            }
        }
        int mid = dFrom1[n] - 1;
        int midFenec = (mid + 1) / 2;
        fenec -= (mid - midFenec);
        snuke = n - (fenec + 1) - 1;
        
        ps.println(fenec > snuke ? "Fennec" : "Snuke");
    }

    private static boolean hasNextByte() {
        if (ptr < buflen)
            return true;
        else {
            ptr = 0;
            try {
                buflen = IS.read(BUFFER);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0)
                return false;
        }
        return true;
    }

    private static int readByte() {
        if (hasNextByte())
            return BUFFER[ptr++];
        else
            return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public static boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(BUFFER[ptr]))
            ptr++;
        return hasNextByte();
    }

    public static String n() {
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

    public static long nl() {
        if (!hasNext())
            throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b)
            throw new NumberFormatException();
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b))
                return minus ? -n : n;
            else
                throw new NumberFormatException();
            b = readByte();
        }
    }

    public static int ni() {
        long nl = nl();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public static double nextDouble() {
        return Double.parseDouble(n());
    }

    private static int[] nia(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = ni();
        return a;
    }
}
