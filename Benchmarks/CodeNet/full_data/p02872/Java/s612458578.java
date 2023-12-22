import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Main {
    private static final long startTime = System.currentTimeMillis();
    private static final boolean LOCAL = true;
    private static final boolean DEBUG = false;
    private static final long TL = LOCAL ? 10000 : 29000;
    private static final int INF = 1 << 29;
    private static final int TMAX = 10000;
    private static final long TMAX2 = TMAX * TMAX;
    private static final int TLAST = 9500;
    private static final Scanner sc = new Scanner(System.in);
    private static final SplittableRandom rnd = new SplittableRandom(42);
    private static int V, E;
    private static int[][] G, G_PREV;
    private static int[] freq;
    private static int[] orders = new int[TMAX];
    private static int lastOrder;
    private static IntAry[] vos;
    private static int DIST_ALLOW = 35;
    private static int[] nextDeliver;
    private static Plan plan = new Plan();
    private static Pos pos = new Pos();
    private static long score;

    public static void main(String[] args) {
        V = sc.nextInt();
        E = sc.nextInt();
        freq = new int[V];
        G = new int[V][V];
        G_PREV = new int[V][V];
        vos = new IntAry[V];
        nextDeliver = new int[V];
        plan.ary = new IntAry();
        for (int i = 0; i < V; i++) {
            Arrays.fill(G[i], INF);
            vos[i] = new IntAry(TMAX * 2 / V);
            G[i][i] = 0;
            G_PREV[i][i] = i;
        }
        for (int i = 0; i < E; i++) {
            int u = Integer.parseInt(sc.next()) - 1;
            int v = Integer.parseInt(sc.next()) - 1;
            int d = Integer.parseInt(sc.next());
            G[u][v] = G[v][u] = d;
            G_PREV[u][v] = u;
            G_PREV[v][u] = v;
        }
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                for (int k = 0; k < V; k++) {
                    if (G[j][k] > G[j][i] + G[i][k]) {
                        G[j][k] = G[j][i] + G[i][k];
                        G_PREV[j][k] = i;
                    }
                }
            }
        }
        for (int i = 0; i < V; i++) {
            freq[i] = sc.nextInt();
        }
        sc.next();
        for (int i = 0; i < TMAX; i++) {
            if (sc.next().charAt(0) == '1') {
                sc.next();
                int dst = sc.nextInt() - 1;
                orders[i] = dst;
                vos[dst].add(i);
                lastOrder = i;
            }
            int put = sc.nextInt();
            for (int j = 0; j < put; j++) {
                sc.next();
            }
            int command = solveSinglePeriod(i);
            System.out.println(command == -1 ? command : command + 1);
            sc.next(); // verdict
            int deliv = sc.nextInt();
            for (int j = 0; j < deliv; j++) {
                sc.next();
            }
        }
        if (DEBUG) {
            int orderCount = 0;
            int undeliver = 0;
            for (int i = 0; i < TLAST; i++) {
                if (orders[i] != 0) orderCount++;
            }
            for (int i = 0; i < V; i++) {
                undeliver += vos[i].size - nextDeliver[i];
            }
            debugfln("score:%d undeliver:%d/%d", score, undeliver, orderCount);
        }
    }

    static int solveSinglePeriod(int time) {
        int dist = G[pos.from][pos.to];
        if (dist == pos.move) {
            while (nextDeliver[pos.to] < vos[pos.to].size && vos[pos.to].a[nextDeliver[pos.to]] <= plan.startAt) {
                score += TMAX2 - sq(time - vos[pos.to].a[nextDeliver[pos.to]]);
                nextDeliver[pos.to]++;
            }
            if (plan.full()) {
                plan = createPlan(time);
            }
            if (plan.size() == 0) {
                pos.from = pos.to = pos.move = 0;
                return -1;
            }
            pos.from = pos.to;
            pos.to = plan.next();
            pos.move = 1;
        } else {
            pos.move++;
        }
        debugfln("%d->%d %d", pos.from, pos.to, pos.move);
        return pos.to;
    }

    private static long[] countO = new long[400];
    private static long[] coefO = new long[400];
    private static long[] constO = new long[400];

    static Plan createPlan(int startAt) {
        IntAry vs = new IntAry();
        for (int i = 1; i < V; i++) {
            if (vos[i].a[nextDeliver[i]] <= startAt) {
                vs.add(i);
                int j = nextDeliver[i];
                countO[i] = coefO[i] = constO[i] = 0;
                while (j < vos[i].size && vos[i].a[j] <= startAt) {
                    countO[i]++;
                    coefO[i] += 2 * vos[i].a[j];
                    constO[i] += vos[i].a[j] * vos[i].a[j];
                    j++;
                }
            }
        }
        plan.startAt = startAt;
        if (vs.size == 0) {
            // wait
            plan.set(new IntAry());
            return plan;
        }
        long score = 0;
        long t = startAt;

        for (int i = 0; i < vs.size - 1; i++) {
            int pos = rnd.nextInt(vs.size - i) + i;
            swap(vs.a, i, pos);
        }
        for (int i = 0, cur = 0; i < vs.size; i++) {
            int min = 9999;
            int mi = -1;
            for (int j = i; j < vs.size; j++) {
                if (G[cur][vs.a[j]] < min) {
                    min = G[cur][vs.a[j]];
                    mi = j;
                }
            }
            swap(vs.a, i, mi);
            cur = vs.a[i];
            t += min;
            if (t <= TMAX) {
                score += countO[cur] * (TMAX2 - t * t) + coefO[cur] * t - constO[cur];
            }
        }
        plan.set(vs);
        return plan;
    }

    static class Plan {
        IntAry ary;
        int pos, startAt;

        int size() {
            return ary.size;
        }

        int next() {
            return ary.a[pos++];
        }

        boolean full() {
            return pos == ary.size;
        }

        void set(IntAry path) {
            pos = 0;
            ary.clear();
            int prev = 0;
            for (int i = 0; i < path.size; i++) {
                setRec(prev, path.a[i]);
                prev = path.a[i];
            }
            setRec(prev, 0);
        }

        void setRec(int u, int v) {
            if (G_PREV[u][v] == u) {
                ary.add(v);
            } else {
                setRec(u, G_PREV[u][v]);
                setRec(G_PREV[u][v], v);
            }
        }
    }

    static class Pos {
        int from, to, move;
    }


    static final class IntAry {
        int[] a;
        int size;

        IntAry() {
            a = new int[16];
        }

        IntAry(int cap) {
            a = new int[cap];
        }

        IntAry(int[] a) {
            this.a = a;
            this.size = a.length;
        }

        IntAry(IntAry that) {
            a = that.a.clone();
            size = that.size;
        }

        @Override
        public String toString() {
            return Arrays.toString(Arrays.copyOf(a, size));
        }

        IntAry copyOf(int from, int to) {
            return new IntAry(Arrays.copyOfRange(this.a, from, to));
        }

        void add(int v) {
            if (size == a.length) {
                int[] na = new int[a.length * 2];
                System.arraycopy(a, 0, na, 0, size);
                a = na;
            }
            a[size++] = v;
        }

        void addAll(IntAry ia) {
            if (this.size + ia.size < a.length) {
                int[] na = new int[this.size + ia.size];
                System.arraycopy(a, 0, na, 0, size);
                a = na;
            }
            System.arraycopy(ia.a, 0, a, size, ia.size);
            size += ia.size;
        }

        void clear() {
            size = 0;
        }

        int pop() {
            size--;
            return a[size];
        }

        int back() {
            return a[size - 1];
        }

        void remove(int pos) {
            System.arraycopy(a, pos + 1, a, pos, size - pos - 1);
            size--;
        }

        void swapRemove(int pos) {
            swap(a, pos, size - 1);
            size--;
        }

        void sort() {
            Arrays.sort(a, 0, size);
        }

        void reverse() {
            for (int lo = 0, hi = size - 1; lo < hi; lo++, hi--) {
                swap(a, lo, hi);
            }
        }
    }

    private static void swap(int[] a, int p1, int p2) {
        int tmp = a[p1];
        a[p1] = a[p2];
        a[p2] = tmp;
    }

    private static long sq(long v) {
        return v * v;
    }

    private static void debug(String str) {
        if (DEBUG) System.err.println(str);
    }

    private static void debug(Object... obj) {
        if (DEBUG) System.err.println(Arrays.deepToString(obj));
    }

    private static void debugfln(String fmt, Object... obj) {
        if (DEBUG) System.err.printf(fmt + "\n", obj);
    }

    private static final class Counter {
        ArrayList<Integer> count = new ArrayList<>();

        void add(int i) {
            if (DEBUG) {
                while (count.size() <= i) {
                    count.add(0);
                }
                count.set(i, count.get(i) + 1);
            }
        }

        void print() {
            if (DEBUG) {
                System.err.print("[");
                for (int i = 0; i < count.size(); ++i) {
                    System.err.print(count.get(i) + ", ");
                }
                System.err.println("]");
            }
        }
    }
}
