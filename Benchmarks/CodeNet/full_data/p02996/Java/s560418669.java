import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {
    int N;
    int[] A,B;
    private class Task implements Comparable<Task> {
        int take, end;
        public Task(int take, int end) {
            this.take = take;
            this.end = end;
        }

        public int compareTo(Task task) {
            if (this.end == task.end) {
                return this.take - task.take;
            }
            return this.end - task.end;
        }
    }
    private void solve() {
        N = nextInt();
        A = new int[N];
        B = new int[N];
        for(int i = 0;i < N;i++) {
            A[i] = nextInt();
            B[i] = nextInt();
        }

        PriorityQueue<Task> pq = new PriorityQueue<>();
        for(int i = 0;i < N;i++) {
            pq.add(new Task(A[i], B[i]));
        }

        int now = 0;
        while(!pq.isEmpty()) {
            Task task = pq.poll();

            if (now + task.take > task.end) {
                out.println("No");
                return;
            }
            now = now + task.take;
        }

        out.println("Yes");
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
