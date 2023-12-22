import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {

    int N;
    ArrayList<Point> list;

    private class Point implements Comparable<Point>{
        int type;
        int x,y;

        public Point(int type,int x,int y) {
            this.type = type;
            this.x = x;
            this.y = y;
        }

        public int compareTo(Point other) {
            return this.x - other.x;
        }
    }

    private void solve() {
        N = nextInt();

        list = new ArrayList<>();

        for(int i = 0;i < N;i++) {
            int a = nextInt();
            int b = nextInt();

            list.add(new Point(0,a,b));
        }

        for(int i = 0;i < N;i++) {
            int c = nextInt();
            int d = nextInt();

            list.add(new Point(1,c,d));
        }

        Collections.sort(list);

        TreeSet<Integer> set = new TreeSet<>();
        int ans = 0;

        for(int i = 0;i < list.size();i++) {
            if (list.get(i).type == 0) {
                set.add(i);
            } else {
                int removeIndex = -1;
                for(int index : set) {
                    if (list.get(index).y >= list.get(i).y) {
                        continue;
                    }
                    if (removeIndex == -1 || list.get(removeIndex).y < list.get(index).y) {
                        removeIndex = index;
                    }
                }

                if (removeIndex != -1) {
                    set.remove(removeIndex);
                    ans++;
                }
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