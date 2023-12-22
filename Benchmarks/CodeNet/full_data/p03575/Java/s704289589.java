import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.InputStream;

import java.io.PrintWriter;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class Main {
    static final int MAX_N = 50;

    static boolean[] visited;
    static boolean[][] graph;

    static int N;

    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);

        N = nextInt();
        final int M = nextInt();

        int[] a = new int[N];
        int[] b = new int[N];

        graph = new boolean[MAX_N][MAX_N];

        for (int i = 0; i < M; i++) {
            // 0-indexed
            a[i] = nextInt() - 1;
            b[i] = nextInt() - 1;

            graph[a[i]][b[i]] = true;
            graph[b[i]][a[i]] = true;
        }

        int cnt = 0;

        visited = new boolean[N];

        for (int i = 0; i < M; i++) {
            graph[a[i]][b[i]] = false;
            graph[b[i]][a[i]] = false;

            dfs(0);

            if (judge()) cnt++;

            // 元に戻す
            graph[a[i]][b[i]] = true;
            graph[b[i]][a[i]] = true;

            // 初期化
            // 未訪問
            Arrays.fill(visited, false);
        }

        out.println(cnt);

        out.flush();
    }

    static boolean judge() {
        boolean ret = false;

        for (int i = 0; i < N; i++)
            if (!visited[i]) {
                ret = true;
                break;
            }

        return ret;
    }

    static void dfs(int n) {
        visited[n] = true;

        for (int i = 0; i < N; i++)
        {
            if (visited[i]) continue;
            if (!graph[n][i]) continue;
            dfs(i);
        }
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
