import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
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
            TaskD solver = new TaskD();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskD {
        public void solve(int testNumber, FastInput in, PrintWriter out) {
            int r = in.readInt();
            int c = in.readInt();
            int n = in.readInt();
            int[][] rcas = new int[n][3];
            int[][] rotateRcas = new int[n][3];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    rcas[i][j] = in.readInt();
                    rotateRcas[i][j] = rcas[i][j];
                }
                Memory.swap(rotateRcas[i], 0, 1);
            }

            out.println(check(r, c, rcas) && check(c, r, rotateRcas) ? "Yes" : "No");
        }

        public boolean check(int r, int c, int[][] rcas) {
            Arrays.sort(rcas, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

            Node[] cols = new Node[c + 1];
            for (int i = 1; i <= c; i++) {
                cols[i] = new Node();
            }

            for (int i = 1; i < rcas.length; i++) {
                int ci = rcas[i][1];

                for (int j = i - 1; j >= 0 && rcas[i][0] == rcas[j][0]; j--) {
                    int cj = rcas[j][1];
                    if (cols[ci].find() == cols[cj].find()) {
                        if (cols[ci].diff - cols[cj].diff != rcas[i][2] - rcas[j][2]) {
                            return false;
                        }
                    } else {
                        Node.merge(cols[cj], cols[ci], rcas[i][2] - rcas[j][2]);
                    }
                    break;
                }

                Node min = cols[ci].find().min;
                long val = rcas[i][2] - cols[ci].diff + min.diff;
                if (val < 0) {
                    return false;
                }
            }

            return true;
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
    static class Memory {
        public static void swap(int[] data, int i, int j) {
            int tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
        }

    }
    static class Node {
        Node p = this;
        int rank;
        long diff;
        Node min = this;

        public Node find() {
            if (p.p == p) {
                return p;
            }
            p.find();
            diff += p.diff;
            p = p.find();
            return p;
        }

        public static Node min(Node a, Node b) {
            a.find();
            b.find();
            return a.diff <= b.diff ? a : b;
        }

        public static void merge(Node a, Node b, long d) {
            a.find();
            b.find();
            // Rb + Db = Ra + Da + d
            // Rb = Ra + Da + d - Db
            d = a.diff + d - b.diff;
            a = a.find();
            b = b.find();
            if (a == b) {
                return;
            }
            if (a.rank == b.rank) {
                a.rank++;
            }
            if (a.rank > b.rank) {
                b.p = a;
                b.diff = d;
                a.min = min(a.min, b.min);

            } else {
                a.p = b;
                a.diff = -d;
                b.min = min(a.min, b.min);
            }
        }

    }
}

