import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {

    int N,C;
    PriorityQueue<T> time;

    private class T implements Comparable<T> {
        public int s,t,c;
        public T(int s,int t,int c) {
            this.s = s;
            this.t = t;
            this.c = c;
        }

        public int compareTo(T t) {
            if (this.t == t.t) {
                return this.c - t.c;
            }
            return this.t - t.t;
        }
    }

    private void solve() {
        N = nextInt();
        C = nextInt();

        time = new PriorityQueue<>();
        for(int i = 0;i < N;i++) {
            T t = new T(nextInt(),nextInt(),nextInt());
            time.add(t);
        }

        int ans = 0;
        while(time.size() > 0) {
            ans++;
            PriorityQueue<T> tmp = new PriorityQueue<>();
            int preT = 0;
            while(time.size() > 0) {
                T t = time.poll();
                if (preT <= t.s - 1) {
                    preT = t.t;
                } else {
                    tmp.add(t);
                }
            }
            time = tmp;
        }

        out.println(Math.min(N,ans));
    }

    public static void main(String[] args) {
        out.flush();
        new Main().solve();
        out.close();
    }

    /* Input */
    private static final InputStream in = System.in;
    private static final PrintWriter out = new PrintWriter(System.out);
    private final byte[] buffer = new byte[2048];
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