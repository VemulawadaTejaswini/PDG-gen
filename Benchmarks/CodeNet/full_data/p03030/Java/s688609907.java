import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {
    int N;
    private class Pair implements Comparable<Pair> {
        String s;
        int p;
        int index;
        public Pair(String s, int p, int index) {
            this.s = s;
            this.p = p;
            this.index = index;
        }

        public int compareTo(Pair other) {
            if (s.equals(other.s)) {
                return other.p - this.p;
            }
            return this.s.compareTo(other.s);
        }
    }
    private void solve() {
        N = nextInt();
        ArrayList<Pair> pairs = new ArrayList<>();
        for(int i = 0;i < N;i++) {
            pairs.add(new Pair(next(), nextInt(), i));
        }

        Collections.sort(pairs);

        for(Pair pair: pairs) {
            out.println(pair.index + 1);
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
