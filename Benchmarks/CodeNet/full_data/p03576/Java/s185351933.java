import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {

    int N,K;
    int[] x,y;

    private int cnt(int minx,int maxx,int miny,int maxy) {
        int ret = 0;
        for(int i = 0;i < N;i++) {

            if (minx <= x[i] && x[i] <= maxx && miny <= y[i] && y[i] <= maxy) {
                ret++;
            }
        }

        return ret;
    }

    private long calc(int minx,int maxx,int miny,int maxy) {
        return (long)(maxx - minx) * (long)(maxy - miny);
    }

    private void solve() {
        N = nextInt();
        K = nextInt();
        x = new int[N];
        y = new int[N];
        for(int i = 0;i < N;i++) {
            x[i] = nextInt();
            y[i] = nextInt();
        }

        long ans = Long.MAX_VALUE;

        for(int i = 0;i < N;i++) {
            for(int j = i + 1;j < N;j++) {
                int minx = Math.min(x[i],x[j]);
                int maxx = Math.max(x[i],x[j]);
                int miny = Math.min(y[i],y[j]);
                int maxy = Math.max(y[i],y[j]);

                if (cnt(minx,maxx,miny,maxy) >= K) {
                    ans = Math.min(ans,calc(minx,maxx,miny,maxy));
                }
            }
        }

        for(int i = 0;i < N;i++) {
            for(int j = i + 1;j < N;j++) {
                for(int k = j + 1;k < N;k++) {
                    int minx = Math.min(x[i],Math.min(x[j],x[k]));
                    int maxx = Math.max(x[i],Math.max(x[j],x[k]));
                    int miny = Math.min(y[i],Math.min(y[j],y[k]));
                    int maxy = Math.max(y[i],Math.max(y[j],y[k]));

                    if (cnt(minx,maxx,miny,maxy) >= K) {
                        ans = Math.min(ans,calc(minx,maxx,miny,maxy));
                    }
                }
            }
        }

        for(int i = 0;i < N;i++) {
            for(int j = i + 1;j < N;j++) {
                for(int k = j + 1;k < N;k++) {
                    for(int l = k + 1;l < N;l++) {
                        int minx = Math.min(Math.min(x[i],x[j]), Math.min(x[k],x[l]));
                        int maxx = Math.max(Math.max(x[i],x[j]), Math.max(x[k],x[l]));
                        int miny = Math.min(Math.min(y[i],y[j]), Math.min(y[k],y[l]));
                        int maxy = Math.max(Math.max(y[i],y[j]), Math.max(y[k],y[l]));

                        if (cnt(minx, maxx, miny, maxy) >= K) {
                            ans = Math.min(ans, calc(minx, maxx, miny, maxy));
                        }
                    }
                }
            }
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
    private final byte[] buffer = new byte[4096];
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
