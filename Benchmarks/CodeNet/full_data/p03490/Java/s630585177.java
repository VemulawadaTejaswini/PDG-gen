import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {

    char[] s;
    int x,y,N;
    int[] dx = {1,0,-1,0};
    int[] dy = {0,-1,0,1};
    int[][] dp;

    public boolean dfs(int n,int nowx,int nowy,int dir) {

        if (n >= N) {
            return  (nowx == x && nowy == y) || (nowx == -x && nowy == -y) || (nowx == x && nowy == -y) || (nowx == -x && nowy == y) ;
        }
        int absx = Math.abs(nowx);
        int absy = Math.abs(nowy);
        if (dp[dir][absx + absy] == 1) {
            return false;
        }

        if (s[n] == 'T') {
            if (dfs(n + 1,nowx,nowy,(dir + 1) % dx.length)) {
                return true;
            }
            if (dfs(n + 1,nowx,nowy,(dir - 1 + dx.length) % dx.length)) {
                return true;
            }
        } else {
            if (dfs(n + 1,nowx + dx[dir],nowy + dy[dir], dir)) {
                return true;
            }
        }
        dp[dir][n] = 1;
        return false;
    }

    private void solve() {
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0;i < 8000;i++) {
//            if (i % 2 == 0) sb.append("T");
//            else sb.append("F");
//        }
//        s = sb.toString().toCharArray();
        s = next().toCharArray();
        N = s.length;
        x = nextInt();
        y = nextInt();
//        x = 1000;
//        y = 1000;
        dp = new int[4][N + 1];

        if (dfs(0,0,0,0)) {
            out.println("Yes");
        } else {
            out.println("No");
        }
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