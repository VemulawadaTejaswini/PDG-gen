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
        public void solve(int testNumber, FastInput in, PrintWriter out) {
            int n = in.readInt();
            char[] s = new char[400000];
            Node root = new Node();

            Node[] nodes = new Node[n + 1];
            for (int i = 1; i <= n; i++) {
                int m = in.readString(s, 0);
                normalize(s, m);
                nodes[i] = add(root, s, 0, m);
            }

            int q = in.readInt();
            char[] perm = new char['z' - 'a' + 1];

            List<Query> queries = new ArrayList<>(q);
            for (int i = 0; i < q; i++) {
                int k = in.readInt();
                in.readString(perm, 0);
                normalize(perm, perm.length);

                Query query = new Query();
                query.seq = perm.clone();
                nodes[k].queries.add(query);
                queries.add(query);
            }
            prepare(root, new int[Node.range][Node.range], 0);

            for (Query query : queries) {
                out.println(query.ans);
            }
        }

        public void normalize(char[] s, int n) {
            for (int i = 0; i < n; i++) {
                s[i] -= 'a';
            }
        }

        public Node add(Node node, char[] s, int i, int n) {
            node.word++;
            if (i == n) {
                node.val = 1;
                return node;
            }
            return add(node.get(s[i]), s, i + 1, n);
        }

        public void prepare(Node root, int[][] occurence, int prefix) {
            for (int i = 0; i < Node.range; i++) {
                if (root.next[i] == null) {
                    continue;
                }
                for (int j = 0; j < Node.range; j++) {
                    if (root.next[j] == null) {
                        continue;
                    }
                    occurence[i][j] += root.next[j].word;
                }

                prepare(root.next[i], occurence, prefix + root.val);

                for (int j = 0; j < Node.range; j++) {
                    if (root.next[j] == null) {
                        continue;
                    }
                    occurence[i][j] -= root.next[j].word;
                }
            }

            for (Query q : root.queries) {
                q.ans = 1 + prefix;
                for (int i = 1; i < Node.range; i++) {
                    for (int j = 0; j < i; j++) {
                        q.ans += occurence[q.seq[i]][q.seq[j]];
                    }
                }
            }
        }

    }
    static class Node {
        static int range = 'z' - 'a' + 1;
        int val;
        int word;
        Node father;
        char ch;
        Node[] next = new Node[range];
        List<Query> queries = new ArrayList<>();

        public Node get(int i) {
            if (next[i] == null) {
                next[i] = new Node();
                next[i].father = this;
                next[i].ch = (char) (i + 'a');
            }
            return next[i];
        }

        public String toString() {
            return father == null ? "" : father.toString() + ch;
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

        public int readString(char[] data, int offset) {
            skipBlank();

            int originalOffset = offset;
            while (next > 32) {
                data[offset++] = (char) next;
                next = read();
            }

            return offset - originalOffset;
        }

    }
    static class Query {
        char[] seq;
        int ans;

    }
}

