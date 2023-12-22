import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {

    int N,M;
    int[] a,b;
    boolean[][] graph;
    boolean[] visited;

    private boolean dfs(int s,int t) {
        if (s == t) {
            return true;
        }

        if (visited[s]) {
            return false;
        }
        visited[s] = true;

        for(int i = 0;i < N;i++) {
            if (visited[i]) {
                continue;
            }

            if (graph[s][i] && graph[i][s]) {
                if(dfs(i,t)) {
                    return true;
                }
            }
        }
        visited[s] = false;
        return false;
    }

    private void solve() {
        N = nextInt();
        M = nextInt();

        a = new int[M];
        b = new int[M];
        graph = new boolean[N][N];
        for(int i = 0;i < M;i++) {
            a[i] = nextInt() - 1;
            b[i] = nextInt() - 1;

            graph[a[i]][b[i]] = true;
            graph[b[i]][a[i]] = true;
        }

        int ans = 0;
        visited = new boolean[N];
        for(int i = 0;i < M;i++) {
            int s = a[i];
            int t = b[i];
            graph[s][t] = graph[t][s] = false;
            Arrays.fill(visited,false);
            if(!dfs(s,t)) {
                ans++;
            }
            graph[s][t] = graph[t][s] = true;
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
