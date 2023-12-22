import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Collection;
import java.io.IOException;
import java.util.Collections;
import java.util.TreeSet;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in Actual solution is at the top
 * 
 * @author daltao
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "daltao", 1 << 27);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastInput in = new FastInput(inputStream);
            PrintWriter out = new PrintWriter(outputStream);
            TaskC solver = new TaskC();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskC {
        int inf = (int) 1e9;

        public void solve(int testNumber, FastInput in, PrintWriter out) {
            int n = in.readInt();
            int m = in.readInt();

            Node[] nodes = new Node[n + 1];
            for (int i = 1; i <= n; i++) {
                nodes[i] = new Node();
                nodes[i].dist = inf;
            }
            for (int i = 0; i < m; i++) {
                Node a = nodes[in.readInt()];
                Node b = nodes[in.readInt()];
                Node edge = new Node();
                edge.operator = in.readInt();
                edge.dist = inf;
                a.next.add(edge);
                b.next.add(edge);
                edge.next.add(a);
                edge.next.add(b);
            }
            nodes[1].dist = 0;
            TreeSet<Node> set = new TreeSet<>((a, b) -> (a.dist == b.dist ? a.id - b.id : a.dist - b.dist));
            set.add(nodes[1]);
            while (!set.isEmpty()) {
                Node head = set.pollFirst();
                for (Node next : head.next) {
                    Collection<Node> col = null;
                    if (next.operator == -1) {
                        col = next.next;
                    } else {
                        col = Collections.singleton(next);
                    }
                    for (Node node : col) {
                        int dist = head.dist;
                        if (node.operator != head.operator) {
                            dist++;
                        }
                        if (dist >= node.dist) {
                            continue;
                        }
                        set.remove(node);
                        node.dist = dist;
                        set.add(node);
                    }
                }
            }

            for (Node edge : nodes[n].next) {
                nodes[n].dist = Math.min(nodes[n].dist, edge.dist);
            }
            if (nodes[n].dist >= inf) {
                out.println(-1);
            } else {
                out.println(nodes[n].dist);
            }
        }

    }
    static class FastInput {
        private final InputStream is;
        private byte[] buf = new byte[1 << 13];
        private int bufLen;
        private int bufOffset;
        private int next;

        public FastInput(InputStream is) {
            this.is = is;
        }

        private int read() {
            while (bufLen == bufOffset) {
                bufOffset = 0;
                try {
                    bufLen = is.read(buf);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (bufLen == -1) {
                    return -1;
                }
            }
            return buf[bufOffset++];
        }

        public void skipBlank() {
            while (next >= 0 && next <= 32) {
                next = read();
            }
        }

        public int readInt() {
            int sign = 1;

            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+' ? 1 : -1;
                next = read();
            }

            int val = 0;
            if (sign == 1) {
                while (next >= '0' && next <= '9') {
                    val = val * 10 + next - '0';
                    next = read();
                }
            } else {
                while (next >= '0' && next <= '9') {
                    val = val * 10 - next + '0';
                    next = read();
                }
            }

            return val;
        }

    }
    static class Node {
        List<Node> next = new ArrayList<>(2);
        int operator = -1;
        int dist;
        static int cnt = 0;
        int id;

        public Node() {
            id = cnt++;
        }

    }
}

