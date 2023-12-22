import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.IOException;
import java.util.Random;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.List;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
            FastOutput out = new FastOutput(outputStream);
            TaskD solver = new TaskD();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskD {
        NumberTheory.EulerSieve es = new NumberTheory.EulerSieve(10000000);

        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();

            IntList oneList = new IntList();
            int last = in.readInt();
            oneList.add(last - 1);
            for (int i = 1; i < n; i++) {
                int x = in.readInt();
                if (x - last != 1) {
                    oneList.add(last);
                    oneList.add(x - 1);
                }
                last = x;
            }
            oneList.add(last);

            oneList.unique();


            IntList oddList = new IntList();
            IntList evenList = new IntList();
            for (int i = 0; i < oneList.size(); i++) {
                int v = oneList.get(i);
                if (v % 2 == 0) {
                    evenList.add(v);
                } else {
                    oddList.add(v);
                }
            }


            KMAlgo km = new KMAlgo(oddList.size(), evenList.size());
            for (int i = 0; i < oddList.size(); i++) {
                for (int j = 0; j < evenList.size(); j++) {
                    int dist = Math.abs(oddList.get(i) - evenList.get(j));
                    if (dist > 2 && es.isPrime(dist)) {
                        km.addEdge(i, j);
                    }
                }
            }

            int match = 0;
            for (int i = 0; i < oddList.size(); i++) {
                match += km.matchLeft(i) ? 1 : 0;
            }

            int ans = match * 1 + (oddList.size() - match) / 2 * 2 + (evenList.size() - match) / 2 * 2
                            + (oddList.size() - match) % 2 * 3;

            out.println(ans);

        }

    }
    static class Randomized {
        static Random random = new Random();

        public static void randomizedArray(int[] data, int from, int to) {
            to--;
            for (int i = from; i <= to; i++) {
                int s = nextInt(i, to);
                int tmp = data[i];
                data[i] = data[s];
                data[s] = tmp;
            }
        }

        public static int nextInt(int l, int r) {
            return random.nextInt(r - l + 1) + l;
        }

    }
    static class IntList {
        private int size;
        private int cap;
        private int[] data;
        private static final int[] EMPTY = new int[0];

        public IntList(int cap) {
            this.cap = cap;
            if (cap == 0) {
                data = EMPTY;
            } else {
                data = new int[cap];
            }
        }

        public IntList(IntList list) {
            this.size = list.size;
            this.cap = list.cap;
            this.data = Arrays.copyOf(list.data, size);
        }

        public IntList() {
            this(0);
        }

        private void ensureSpace(int need) {
            int req = size + need;
            if (req > cap) {
                while (cap < req) {
                    cap = Math.max(cap + 10, 2 * cap);
                }
                data = Arrays.copyOf(data, cap);
            }
        }

        private void checkRange(int i) {
            if (i < 0 || i >= size) {
                throw new ArrayIndexOutOfBoundsException();
            }
        }

        public int get(int i) {
            checkRange(i);
            return data[i];
        }

        public void add(int x) {
            ensureSpace(1);
            data[size++] = x;
        }

        public void sort() {
            if (size <= 1) {
                return;
            }
            Randomized.randomizedArray(data, 0, size);
            Arrays.sort(data, 0, size);
        }

        public void unique() {
            if (size <= 1) {
                return;
            }

            sort();
            int wpos = 1;
            for (int i = 1; i < size; i++) {
                if (data[i] != data[wpos - 1]) {
                    data[wpos++] = data[i];
                }
            }
            size = wpos;
        }

        public int size() {
            return size;
        }

        public int[] toArray() {
            return Arrays.copyOf(data, size);
        }

        public String toString() {
            return Arrays.toString(toArray());
        }

    }
    static class KMAlgo {
        KMAlgo.Node[] leftSides;
        KMAlgo.Node[] rightSides;
        int version;

        public KMAlgo(int l, int r) {
            leftSides = new KMAlgo.Node[l];
            for (int i = 0; i < l; i++) {
                leftSides[i] = new KMAlgo.Node();
                leftSides[i].id = i;
                leftSides[i].leftSide = true;
            }
            rightSides = new KMAlgo.Node[r];
            for (int i = 0; i < r; i++) {
                rightSides[i] = new KMAlgo.Node();
                rightSides[i].id = i;
            }
        }

        public void addEdge(int lId, int rId) {
            leftSides[lId].nodes.add(rightSides[rId]);
            rightSides[rId].nodes.add(leftSides[lId]);
        }

        private void prepare() {
            version++;
        }

        public boolean matchLeft(int id) {
            if (leftSides[id].partner != null) {
                return false;
            }
            prepare();
            return findPartner(leftSides[id]);
        }

        private boolean findPartner(KMAlgo.Node src) {
            if (src.visited == version) {
                return false;
            }
            src.visited = version;
            for (KMAlgo.Node node : src.nodes) {
                if (!tryRelease(node)) {
                    continue;
                }
                node.partner = src;
                src.partner = node;
                return true;
            }
            return false;
        }

        private boolean tryRelease(KMAlgo.Node src) {
            if (src.visited == version) {
                return false;
            }
            src.visited = version;
            if (src.partner == null) {
                return true;
            }
            if (findPartner(src.partner)) {
                src.partner = null;
                return true;
            }
            return false;
        }

        public String toString() {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < leftSides.length; i++) {
                if (leftSides[i].partner == null) {
                    continue;
                }
                builder.append(leftSides[i].id).append(" - ").append(leftSides[i].partner.id).append("\n");
            }
            return builder.toString();
        }

        public static class Node {
            List<KMAlgo.Node> nodes = new ArrayList(2);
            int visited;
            KMAlgo.Node partner;
            int id;
            boolean leftSide;

            public String toString() {
                return "" + id;
            }

        }

    }
    static class FastOutput implements AutoCloseable, Closeable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput println(int c) {
            cache.append(c).append('\n');
            return this;
        }

        public FastOutput flush() {
            try {
                os.append(cache);
                os.flush();
                cache.setLength(0);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
            return this;
        }

        public void close() {
            flush();
            try {
                os.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

    }
    static class NumberTheory {
        public static class EulerSieve {
            private int[] primes;
            private boolean[] isComp;
            private int primeLength;

            public boolean isPrime(int x) {
                if (x == 1) {
                    return false;
                }
                return !isComp[x];
            }

            public EulerSieve(int limit) {
                isComp = new boolean[limit + 1];
                primes = new int[limit + 1];
                primeLength = 0;
                for (int i = 2; i <= limit; i++) {
                    if (!isComp[i]) {
                        primes[primeLength++] = i;
                    }
                    for (int j = 0, until = limit / i; j < primeLength && primes[j] <= until; j++) {
                        int pi = primes[j] * i;
                        isComp[pi] = true;
                        if (i % primes[j] == 0) {
                            break;
                        }
                    }
                }
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
                    bufLen = -1;
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

