import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {
    int N,K;
    int[] V;

    private void solve() {
        N = nextInt();
        K = nextInt();
        V = new int[N];
        long SUM = 0;
        for(int i = 0;i < N;i++) {
            V[i] = nextInt();
            SUM += V[i];
        }

        int M = Math.min(K , N);
        long[][] sum = new long[N + 1][N + 1];
        for(int i = 0;i <= M;i++) {
            for(int j = 0;j <= M;j++) {
                if (i + j > N) {
                    break;
                }

                for(int k = i;k < N - j;k++) {
                    sum[i][j] += V[k];
                }
            }
        }

        for(int i = 0;i <= M;i++) {
            for(int j = 0;j <= M;j++) {
                if (i + j > N) {
                    break;
                }

                PriorityQueue<Integer> pq = new PriorityQueue<>();
                for(int k = 0;k < i;k++) {
                    pq.add(V[k]);
                }

                for(int k = N-j;k < N;k++) {
                    pq.add(V[k]);
                }

                if (i + j < K) {
                    int cnt = K - i - j;
                    while(cnt > 0 && !pq.isEmpty()) {
                        sum[i][j] += pq.poll();
                        cnt--;
                    }
                }
            }
        }

        long ans = 0;
        for(int i = 0;i <= M;i++) {
            for(int j = 0;j <= M;j++) {
                if (i + j > N) {
                    break;
                }
                ans = Math.max(ans, SUM - sum[i][j]);
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
