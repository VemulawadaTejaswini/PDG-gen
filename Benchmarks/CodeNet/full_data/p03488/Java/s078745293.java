import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {

    char[] s;
    int x,y,N;
    int[] dx = {1,0,-1,0};
    int[] dy = {0,-1,0,1};
    boolean[][][] xdp,ydp;

    private void xdfs(int n,int x,int dir) {
        if (xdp[n][x][dir]) {
            return;
        }

        xdp[n][x][dir] = true;
        if (n == N) {
            return;
        }

        if (s[n] == 'F') {
            if (dir % 2 == 0) {
                xdfs(n + 1,x + dx[dir] ,dir);
            } else {
                xdfs(n + 1,x,dir);
            }
        } else {
            xdfs(n + 1,x,(dir + 1 + dx.length) % dx.length);
            xdfs(n + 1,x,(dir - 1 + dx.length) % dx.length);
        }
    }

    private void ydfs(int n,int y,int dir) {
        if (ydp[n][y][dir]) {
            return;
        }

        ydp[n][y][dir] = true;

        if (n == N) {
            return;
        }

        if (s[n] == 'F') {
            if (dir % 2 == 1) {
                ydfs(n + 1,y + dy[dir],dir);
            } else {
                ydfs(n + 1,y,dir);
            }
        } else {
            ydfs(n + 1,y,(dir + 1 + dy.length) % dy.length);
            ydfs(n + 1,y,(dir - 1 + dy.length) % dy.length);
        }
    }

    private void solve() {
        s = next().toCharArray();
        N = s.length;
        x = nextInt();
        y = nextInt();

        xdp = new boolean[N + 1][8000 * 2 + 1][4];
        ydp = new boolean[N + 1][8000 * 2 + 1][4];

        xdfs(0,8000,0);
        ydfs(0,8000,0);

        for(int i = 0;i < 4;i++) {
            if (xdp[N][x + 8000][i] && ydp[N][y + 8000][i]) {
                out.println("Yes");
                return;
            }
        }
        out.println("No");
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