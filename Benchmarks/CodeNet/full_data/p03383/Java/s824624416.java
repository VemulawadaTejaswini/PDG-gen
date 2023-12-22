import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {
    int H,W;
    char[][] ch;
    boolean[] usedRow,usedColumn;
    int[] swapRow;

    private boolean isSymmetryColumn(int a,int b) {
        for(int i = 0;i <= H - 1 - i;i++) {
            if (ch[swapRow[i]][a] != ch[swapRow[H - 1 - i]][b]) {
                return false;
            }
        }
        return true;
    }

    private boolean columnCheck() {

        int notUsedCnt = 0;

        Arrays.fill(usedColumn,false);
        for(int i = 0;i < W;i++) {
            if (usedColumn[i]) {
                continue;
            }
            for(int j = i + 1;j < W;j++) {
                if (usedColumn[j]) {
                    continue;
                }
                if (isSymmetryColumn(i,j)) {
                    usedColumn[i] = true;
                    usedColumn[j] = true;
                    break;
                }
            }

            if (!usedColumn[i]) {
                notUsedCnt++;
            }
        }
        if (W % 2 == 0) {
            return notUsedCnt == 0;
        } else {

            if (notUsedCnt > 1) {
                return false;
            } else {
                int notSymmetryColumn = -1;
                for (int i = 0; i < W; i++) {
                    if (!usedColumn[i]) {
                        notSymmetryColumn = i;
                        break;
                    }
                }
                return isSymmetryColumn(notSymmetryColumn, notSymmetryColumn);
            }
        }
    }
int cnt = 0;
    private boolean dfs2(int r) {

        if (r == (H+1) / 2) {
            cnt++;
            if (columnCheck()) {
                return true;
            }
            return false;
        }

        for(int i = 0;i < H;i++) {
            if (usedRow[i]) continue;
            for(int j = i;j < H;j++) {
                if (usedRow[j])continue;
                usedRow[i] = usedRow[j] = true;
                swapRow[i] = j;
                swapRow[j] = i;
                boolean ret = dfs2(r+1);
                if (ret) {
                    return true;
                }
                swapRow[i] = i;
                swapRow[j] = j;
                usedRow[i] = usedRow[j] = false;
            }
        }
        return false;
    }
    private boolean dfs1(int r) {

        if (r == H) {
            cnt++;
            if (columnCheck()) {
                return true;
            }
            return false;
        }

        if (usedRow[r]) {
            return dfs1(r + 1);
        }


        for(int i = r;i < H;i++) {
            if (usedRow[i]){
                continue;
            }
            usedRow[i] = true;
            swapRow[r] = i;
            swapRow[i] = r;

            boolean ret = dfs1(r + 1);
            if (ret) {
                return true;
            }

            swapRow[r] = r;
            swapRow[i] = i;
            usedRow[i] = false;
        }
        return false;
    }



    private void solve() {
        H = nextInt();
        W = nextInt();

        ch = new char[H][];
        for(int i = 0;i < H;i++) {
            ch[i] = next().toCharArray();
        }

        swapRow = new int[H];
        for(int i = 0;i < H;i++) {
            swapRow[i] = i;
        }
        usedRow = new boolean[H];
        usedColumn = new boolean[W];

        if (dfs2(0)) {
            out.println("YES");
        } else {
            out.println("NO");
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