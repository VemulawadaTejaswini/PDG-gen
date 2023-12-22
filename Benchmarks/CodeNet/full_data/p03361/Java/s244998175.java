import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {

    int H,W;
    char[][] s;
    int[] dx = {0, 1, 0, -1};
    int[] dy = {-1, 0, 1, 0};

    private void solve() {
        H = nextInt();
        W = nextInt();

        s = new char[H][];
        for(int i = 0;i < H;i++) {
            s[i] = next().toCharArray();
        }

        boolean[][] paint = new boolean[H][W];
        for(int i = 0;i < H;i++) {
            for(int j = 0;j < W;j++) {
                for(int k = 0;k < 4;k++) {
                    int ny = i + dy[k];
                    int nx = j + dx[k];

                    if (ny >= H || ny < 0 || nx >= W || nx < 0) {
                        continue;
                    }

                    if (s[i][j] == '#' && s[ny][nx] == '#') {
                        paint[i][j] = true;
                        paint[ny][nx] = true;
                    }
                }
            }
        }

        for(int i = 0;i < H;i++) {
            for(int j = 0;j < W;j++) {
                if (s[i][j] == '#' && paint[i][j]) {
                    continue;
                }

                if (s[i][j] == '.' && !paint[i][j]) {
                    continue;
                }
                out.println("No");
                return;
            }
        }
        out.println("Yes");
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
