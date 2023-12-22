import java.util.*;
import java.io.*;

public class Main {
    static int[] dx = { 0, 1, 0, -1 };
    static int[] dy = { -1, 0, 1, 0 };
    static int INF = 1000000000;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int h = sc.nextInt();
        int w = sc.nextInt();
        List<String> str = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            str.add(sc.next());
        }
        int sx = 0;
        int sy = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (str.get(i).charAt(j) == '#') {
                    sy = i;
                    sx = j;
                }
            }
        }
        Point s = new Point(sx, sy);
        int[][] dist = bfs(s, str);
        int ans = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ans = Math.max(ans, dist[i][j]);
            }
        }
        System.out.println(ans);
    }

    public static int[][] bfs(Point s, List<String> str) {
        int[][] dist = new int[1001][1001];
        for (int[] d : dist) {
            Arrays.fill(d, INF);
        }
        Queue<Point> que = new LinkedList<>();
        que.offer(s);
        dist[s.x][s.y] = 0;
        while (!que.isEmpty()) {
            Point p = que.poll();
            // System.out.println("p = " + p);
            for (int i = 0; i < 4; i++) {
                int ny = p.y + dy[i];
                int nx = p.x + dx[i];
                if (nx < 0 || ny < 0 || nx >= str.get(0).length() || ny >= str.size()) {
                    continue;
                }
                if (str.get(ny).charAt(nx) == '.' && dist[p.x][p.y] + 1 < dist[nx][ny]) {
                    dist[nx][ny] = dist[p.x][p.y] + 1;
                    // System.out.printf("nx = %d ,ny = %d %n", nx, ny);
                    que.offer(new Point(nx, ny));
                }
                if (str.get(ny).charAt(nx) == '#') {
                    dist[nx][ny] = 0;
                    que.offer(new Point(nx, ny));
                }
            }
        }
        return dist;
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("(x = %d,y = %d)", this.x, this.y);
    }
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
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

    private int readByte() {
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
