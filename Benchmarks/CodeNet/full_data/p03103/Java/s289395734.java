import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {
    int N,M;
    int[] A,B;

    private class Pair implements Comparable<Pair> {
        int price, num;
        public Pair(int price, int num) {
            this.price = price;
            this.num = num;
        }

        public int compareTo(Pair other) {
            return this.price - other.price;
        }
    }

    private void solve() {
        N = nextInt();
        M = nextInt();

        A = new int[N];
        B = new int[N];

        for(int i = 0;i < N;i++) {
            A[i] = nextInt();
            B[i] = nextInt();
        }

        ArrayList<Pair> pairs = new ArrayList<>();
        for(int i = 0;i < N;i++) {
            pairs.add(new Pair(A[i], B[i]));
        }

        Collections.sort(pairs);

        long ans = 0;
        for(int i = 0;i < N;i++) {
            long num = Math.min(M, pairs.get(i).num);
            ans += num * pairs.get(i).price;
            M -= num;
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
