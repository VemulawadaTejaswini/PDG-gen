import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.InputStream;

import java.io.PrintWriter;

import java.util.Arrays;
import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class Main {
    static int ans;
    static boolean[] done;
    static ArrayList< ArrayList<Integer> > edge;

    static void dfs(int a) {
        boolean flg = true;

        for (int i = 0; i < done.length; i++) {
            if (!done[i]) {
                flg = false;
                break;
            }
        }

        if (flg) {
            ans++;
            return;
        }

        for (int i = 0; i < edge.get(a).size(); i++) {
            int next = edge.get(a).get(i);

            if (!done[next]) {
                done[next] = true;

                dfs(next);

                done[next] = false;
            }
        }

        return;
    }

    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);

        final int N = nextInt();
        final int M = nextInt();

        edge = new ArrayList<>();

        for (int i = 0; i < N; i++) edge.add(new ArrayList<>());

        for (int i = 0; i < M; i++) {
            // 0-indexed
            final int a = nextInt() - 1;
            final int b = nextInt() - 1;

            edge.get(a).add(b);
            edge.get(b).add(a);
        }

        done = new boolean[N];

        Arrays.fill(done, false);

        done[0] = true;

        ans = 0;
        dfs(0);

        out.println(ans);

        out.flush();
    }

    // FastScanner start
    static final InputStream in = System.in;
    static final byte[] buffer = new byte[1024];
    static int ptr = 0;
    static int buflen = 0;
    static boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
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
    static int readByte() {
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }
    static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
    static boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }
    static String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    static long nextLong() {
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
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if(b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    static int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }
    static double nextDouble() {
        return Double.parseDouble(next());
    }
    // FastScanner end
}
