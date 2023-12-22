import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.InputStream;

import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.ArrayDeque;

class Edge implements Comparable<Edge> {
    // 頂点番号 最短コスト
    int to;
    int cost;

    Edge(int to, int cost) {
        this.to = to;
        this.cost = cost;
    }

    // x.compereTo(y)
    // x は cost
    // y は Edge.cost
    @Override
    public int compareTo(Edge edge) {
        return this.cost - edge.cost;
    }
}

@SuppressWarnings("unchecked")
public class Main {
    // 道情報 行き 配列
    static ArrayList< ArrayList<Edge> > goList;

    // 所要時間 行き 配列
    static ArrayList<Integer> goAry;

    // 行ったことある、ない
    static ArrayList<Boolean> gone;

    // 幅優先探索 Breadth-First Search
    static void bfs(int start) {
        ArrayDeque<Edge> que = new ArrayDeque<>();

        // スタート地点をキューに入れる
        que.add(new Edge(start, 0));

        // 距離を0にする
        goAry.set(start, 0);

        // 行ったことがある
        gone.set(start, true);

        while (0 < que.size()) {
            Edge q = que.getFirst();
            que.pop();

            for (int i = 0; i < goList.get(q.to).size(); i++) {
                Edge e = goList.get(q.to).get(i);

                // 行ったことがない
                if (gone.get(e.to) == false) {
                    goAry.set(e.to, goAry.get(q.to) + e.cost);
                    // push 頂点 時間
                    que.add(new Edge(e.to, goAry.get(e.to)));
                    // 行ったことがある
                    gone.set(e.to, true);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);

        final String Fennec = "Fennec";
        final String Snuke = "Snuke";

        final int N = nextInt();

        goList = new ArrayList<>();

        for (int i = 0; i < N; i++) goList.add(new ArrayList<>());

        for (int i = 0; i < N - 1; i++) {
            // 0-indexed
            final int a = nextInt() - 1;
            final int b = nextInt() - 1;

            (goList.get(a)).add(new Edge(b, 1));
            (goList.get(b)).add(new Edge(a, 1));
        }

        goAry = new ArrayList<>();
        gone = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            // 初期化
            goAry.add(0);
            // 行ったことがない
            gone.add(false);
        }

        // 幅優先探索 Breadth-First Search
        bfs(0);

        ArrayList<Integer> tmp = new ArrayList<>(goAry);

        for (int i = 0; i < N; i++) {
            // 初期化
            goAry.set(i, 0);
            // 行ったことがない
            gone.set(i, false);
        }

        bfs(N - 1);

        int first = 0;
        int second = 0;
        for (int i = 0; i < N; i++) {
            if (tmp.get(i) <= goAry.get(i)) first++;
            else second++;
        }

        out.println(first <= second ? Snuke : Fennec);

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
