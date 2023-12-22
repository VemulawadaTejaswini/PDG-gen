import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.io.IOException;
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
            }
            for (int i = 0; i < m; i++) {
                Node a = nodes[in.readInt()];
                Node b = nodes[in.readInt()];
                Integer op = in.readInt();
                a = a.getNode(op);
                b = b.getNode(op);
                a.next.add(b);
                b.next.add(a);
            }

            for (int i = 1; i <= n; i++) {
                nodes[i].dist = inf;
                for (Node node : nodes[i].map.values()) {
                    node.dist = inf;
                }
            }

            nodes[1].dist = 0;
            TreeSet<Node> set = new TreeSet<>((a, b) -> (a.dist == b.dist ? a.id - b.id : a.dist - b.dist));
            set.add(nodes[1]);


            while (!set.isEmpty()) {
                Node head = set.pollFirst();
                for (Node node : head.next) {
                    int dist = head.dist + head.charge;
                    if (dist >= node.dist) {
                        continue;
                    }
                    set.remove(node);
                    node.dist = dist;
                    set.add(node);
                }
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
        List<Node> next = new ArrayList<>();
        Map<Integer, Node> map = new HashMap<>();
        int dist;
        int charge = 1;
        static int cnt = 0;
        int id;

        public Node getNode(Integer key) {
            Node node = map.get(key);
            if (node == null) {
                node = new Node();
                next.add(node);
                node.next.add(this);
                node.charge = 0;
                map.put(key, node);
            }
            return node;
        }

        public Node() {
            id = cnt++;
        }

    }
}

