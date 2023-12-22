import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main implements Runnable {
    public static void main(String[] args) {
        new Thread(null,new Main(), "" ,Runtime.getRuntime().maxMemory()).start();
    }

    public void run() {
        FastScanner sc = new FastScanner();
        long h = sc.nextLong();
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0;i < n;i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        long[][] dp = new long[20000][n + 2];
        long ans = Long.MAX_VALUE;
        for(int damage = 0;damage < 20000;damage++) {
            if(damage == 0) {
                dp[damage][n + 1] = 0;
                continue;
            }

            long minMP = -1;
            for(int i = 0;i <= n;i++) {
                if(i == 0) {
                    dp[damage][i] = -1;
                    continue;
                }

                if(damage - a[i - 1] < 0) dp[damage][i] = -1;
                else {
                    if(dp[damage - a[i - 1]][n + 1] == -1) dp[damage][i] = -1;
                    else {
                        dp[damage][i] = dp[damage - a[i - 1]][n + 1] + b[i - 1];
                        if(minMP == -1) minMP = dp[damage][i];
                        else minMP = minMP > dp[damage][i] ? dp[damage][i] : minMP;
                    }
                }
            }

            dp[damage][n + 1] = minMP;
            if(damage >= h && minMP != -1) {
                ans = ans > minMP ? minMP : ans;
            }
        }

        System.out.println(ans);
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
        }else{
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
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
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
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
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
    public double nextDouble() { return Double.parseDouble(next());}
}