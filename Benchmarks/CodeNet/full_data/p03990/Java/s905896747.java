import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

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
            TaskE solver = new TaskE();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskE {
        int inf = (int) 1e8;

        public void solve(int testNumber, FastInput in, PrintWriter out) {
            int n = in.readInt();

            Node[] nodes = new Node[n + 1];
            LCTNode[] lctNodes = new LCTNode[n + 1];
            for (int i = 1; i <= n; i++) {
                nodes[i] = new Node();
                nodes[i].id = i;
                lctNodes[i] = new LCTNode();
                lctNodes[i].pushUp();
            }

            Node x = nodes[in.readInt()];
            Node y = nodes[in.readInt()];

            List<Node[]> edges = new ArrayList<>(n);
            for (int i = 1; i < n; i++) {
                Node a = nodes[in.readInt()];
                Node b = nodes[in.readInt()];
                a.red.add(b);
                b.red.add(a);
                edges.add(new Node[] {a, b});
            }



            for (int i = 1; i < n; i++) {
                int aId = in.readInt();
                int bId = in.readInt();

                Node a = nodes[aId];
                Node b = nodes[bId];
                a.blue.add(b);
                b.blue.add(a);

                LCTNode.join(lctNodes[aId], lctNodes[bId]);
            }

            dfsForDepth(y, null, 0);

            for (Node[] edge : edges) {
                LCTNode.findRoute(lctNodes[edge[0].id], lctNodes[edge[1].id]);
                LCTNode.splay(lctNodes[edge[0].id]);
                if (lctNodes[edge[0].id].size - 1 >= 3) {
                    edge[0].escape = edge[1].escape = true;
                }
            }

            int escape = escape(x, null, 0);
            if (escape == inf) {
                out.println(-1);
            } else {
                out.println(escape * 2);
            }
        }

        public int escape(Node root, Node fa, int depth) {
            if (root.depth <= depth) {
                return root.depth;
            }
            if (root.escape) {
                return inf;
            }
            int max = root.depth;
            for (Node node : root.red) {
                if (node == fa) {
                    continue;
                }
                max = Math.max(max, escape(node, root, depth + 1));
            }
            return max;
        }

        public void dfsForDepth(Node root, Node fa, int depth) {
            root.depth = depth;
            for (Node node : root.blue) {
                if (node == fa) {
                    continue;
                }
                dfsForDepth(node, root, depth + 1);
            }
        }

    }
    static class Node {
        List<Node> red = new ArrayList<>(2);
        List<Node> blue = new ArrayList<>(2);
        boolean escape;
        int depth;
        int id;

    }
    static class LCTNode {
        public static final LCTNode NIL = new LCTNode();
        LCTNode left = NIL;
        LCTNode right = NIL;
        LCTNode father = NIL;
        LCTNode treeFather = NIL;
        boolean reverse;
        int id;
        int size;
        static {
            NIL.left = NIL;
            NIL.right = NIL;
            NIL.father = NIL;
            NIL.treeFather = NIL;
        }

        public static void access(LCTNode x) {
            LCTNode last = NIL;
            while (x != NIL) {
                splay(x);
                x.right.father = NIL;
                x.right.treeFather = x;
                x.setRight(last);
                x.pushUp();

                last = x;
                x = x.treeFather;
            }
        }

        public static void makeRoot(LCTNode x) {
            access(x);
            splay(x);
            x.reverse();
        }

        public static void join(LCTNode y, LCTNode x) {
            makeRoot(x);
            x.treeFather = y;
        }

        public static void findRoute(LCTNode x, LCTNode y) {
            makeRoot(y);
            access(x);
        }

        public static void splay(LCTNode x) {
            if (x == NIL) {
                return;
            }
            LCTNode y, z;
            while ((y = x.father) != NIL) {
                if ((z = y.father) == NIL) {
                    y.pushDown();
                    x.pushDown();
                    if (x == y.left) {
                        zig(x);
                    } else {
                        zag(x);
                    }
                } else {
                    z.pushDown();
                    y.pushDown();
                    x.pushDown();
                    if (x == y.left) {
                        if (y == z.left) {
                            zig(y);
                            zig(x);
                        } else {
                            zig(x);
                            zag(x);
                        }
                    } else {
                        if (y == z.left) {
                            zag(x);
                            zig(x);
                        } else {
                            zag(y);
                            zag(x);
                        }
                    }
                }
            }

            x.pushDown();
            x.pushUp();
        }

        public static void zig(LCTNode x) {
            LCTNode y = x.father;
            LCTNode z = y.father;
            LCTNode b = x.right;

            y.setLeft(b);
            x.setRight(y);
            z.changeChild(y, x);

            y.pushUp();
        }

        public static void zag(LCTNode x) {
            LCTNode y = x.father;
            LCTNode z = y.father;
            LCTNode b = x.left;

            y.setRight(b);
            x.setLeft(y);
            z.changeChild(y, x);

            y.pushUp();
        }

        public String toString() {
            return "" + id;
        }

        public void pushDown() {
            if (reverse) {
                reverse = false;

                LCTNode tmpNode = left;
                left = right;
                right = tmpNode;

                left.reverse();
                right.reverse();
            }

            left.treeFather = treeFather;
            right.treeFather = treeFather;
        }

        public void reverse() {
            reverse = !reverse;
        }

        public void setLeft(LCTNode x) {
            left = x;
            x.father = this;
        }

        public void setRight(LCTNode x) {
            right = x;
            x.father = this;
        }

        public void changeChild(LCTNode y, LCTNode x) {
            if (left == y) {
                setLeft(x);
            } else {
                setRight(x);
            }
        }

        public void pushUp() {
            if (this == NIL) {
                return;
            }
            size = 1 + left.size + right.size;
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
}

