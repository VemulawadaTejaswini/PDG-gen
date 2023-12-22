import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {

    char[] ch;

    private void solve() {
        ch = next().toCharArray();

        if (ch.length < 26) {

            int[] cnt = new int[26];
            for(char c : ch) {
                cnt[c-'a']++;
            }

            int index = -1;
            for (int i = 0; i < 26; i++) {
                if (cnt[i] == 0) {
                    index = i;
                    break;
                }
            }

            StringBuilder sb = new StringBuilder();
            sb.append(ch);
            sb.append((char) ('a' + index));
            out.println(sb);
            return;
        } else {

            int[][] cnt = new int[ch.length + 1][26];
            for (int i = 0; i < ch.length; i++) {
                for (int j = 0; j < 26; j++) {
                    cnt[i + 1][j] += cnt[i][j];
                }
                cnt[i + 1][ch[i] - 'a']++;
            }

            for (int i = ch.length - 1; i >= 0; i--) {
                int c = ch[i] - 'a';
                int index = -1;
                for (int j = 25; j > c; j--) {
                    if (cnt[i][j] == 0) {
                        index = j;
                    }
                }

                if (index != -1) {
                    ch[i] = (char) ('a' + index);
                    out.println(String.valueOf(ch, 0, i + 1));
                    return;
                }
            }
        }
        out.println(-1);
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
