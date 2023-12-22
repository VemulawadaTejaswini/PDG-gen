import java.io.*;
import java.util.*;

public class Main {
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args){
        int n = in.i();
        ArrayList<Long>[] edge = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            edge[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            int a = in.i();
            int b = in.i();
            long j  = (long)i << 17;
            edge[a].add(j + b);
            edge[b].add(j + a);
        }
        int k = 0;
        int parent = 0;
        for (int i = 1; i <= n; i++) {
            int size = edge[i].size();
            if (k < size) {
                k = size;
                parent = i;
            }
        }

        int[] edgeColor = new int[n];
        int[] nodeColor = new int[n + 1];
        LinkedList<Integer> nodeList = new LinkedList<>();
        nodeList.add(parent);
        while(nodeList.size() > 0) {
            parent = nodeList.pop();
            int color = 1;
            int used = nodeColor[parent];
            for (long l : edge[parent]) {
                int i = (int)(l >> 17);
                if (edgeColor[i] > 0) {
                    continue;
                } else if (color == used) {
                    color++;
                }
                int child = (int)(l & ((1 << 17) - 1));
                nodeColor[child] = color;
                edgeColor[i] = color;
                color++;
                nodeList.push(child);
            }
        }
        out.println(k);
        for (int i = 1; i < n; i++) {
            out.println(edgeColor[i]);
        }
        out.close();
    }


    static int max(int a, int b) {
        return a < b ? b : a;
    }
}

class MyReader extends BufferedReader {
    char[] cbuf = new char[1024];
    int head = 0;
    int tail = 0;

    MyReader() {
        super(new InputStreamReader(System.in));
    }

    char next() {
        if (head == tail) {
            try {
                tail = read(cbuf, 0, cbuf.length);
            } catch (IOException e) {}
            head = 0;
        }
        return cbuf[head++];
    }

    void back() {
        head--;
    }

    boolean minus() {
        boolean minus;
        while (true) {
            char c = next();
            if (c != ' ' && c != '\n' && c != '\r') {
                if (!(minus = c == '-')) back();
                return minus;
            }
        }
    }

    void skip() {
        while (true) {
            char c = next();
            if (c != ' ' && c != '\n' && c != '\r') {
                back();
                break;
            }
        }
    }

    char[] s(final int N) {
        skip();
        char[] s = new char[N];
        for (int i = 0; i < s.length; i++) {
            s[i] = next();
        }
        return s;
    }

    int i() {
        boolean minus = minus();
        int n = 0;
        while (true) {
            int k = next() - '0';
            if (k < 0 || 9 < k) break;
            n = 10 * n + k;
        }
        return minus ? -n : n;
    }

    int[] ii(final int N) {
        int[] a = new int[N];
        for (int j = 0; j < a.length; j++) a[j] = i();
        return a;
    }

    long l() {
        boolean minus = minus();
        long n = 0;
        while (true) {
            int k = next() - '0';
            if (k < 0 || 9 < k) break;
            n = 10 * n + k;
        }
        return minus ? -n : n;
    }
}
