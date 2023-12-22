import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {
    int H, W;
    char[][] S;
    private class Cell {
        int top, bottom, left, right;
    }
    private void solve() {
        H = nextInt();
        W = nextInt();
        S = new char[H][];
        for(int i = 0;i < H;i++) {
            S[i] = next().toCharArray();
        }

        Cell[][] cells = new Cell[H][W];
        for(int i = 0;i < H;i++) {
            for(int j = 0;j < W;j++) {
                cells[i][j] = new Cell();
            }
        }

        for(int i = 0;i < H;i++) {
            int count = 0;
            for(int j = 0;j < W;j++) {
                if (S[i][j] == '#') {
                    count = 0;
                } else {
                    cells[i][j].left += count;
                    count++;
                }
            }

            count = 0;
            for(int j = W - 1;j >= 0;j--) {
                if (S[i][j] == '#') {
                    count = 0;
                } else {
                    cells[i][j].right += count;
                    count++;
                }
            }
        }

        for(int j = 0;j < W;j++) {
            int count = 0;
            for(int i = 0;i < H;i++) {
                if (S[i][j] == '#') {
                    count = 0;
                } else {
                    cells[i][j].top += count;
                    count++;
                }
            }

            count = 0;
            for(int i = H - 1;i >= 0;i--) {
                if (S[i][j] == '#') {
                    count = 0;
                } else {
                    cells[i][j].bottom += count;
                    count++;
                }
            }
        }

        int ans = 0;
        for(int i = 0;i < H;i++) {
            for(int j = 0;j < W;j++) {
                if (S[i][j] == '#') {
                    continue;
                }
                ans = Math.max(ans, cells[i][j].top + cells[i][j].bottom + cells[i][j].left + cells[i][j].right + 1);
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
