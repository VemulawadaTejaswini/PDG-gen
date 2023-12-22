import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public final class Main {
    private static final long startTime = System.currentTimeMillis();
    private static final boolean LOCAL = false;
    private static final boolean DEBUG = false;
    private static final long TL = LOCAL ? 2000 : 25000;
    private static final int INF = 1 << 29;
    private static final int TMAX = 10000;
    private static final long TMAX2 = TMAX * TMAX;
    private static final int TLAST = 9500;
    private static final double INITIAL_COOLER = 0.00001;
    private static final double FINAL_COOLER = 0.1;
    private static final Scanner sc = new Scanner(System.in);
    private static final SplittableRandom rnd = new SplittableRandom(42);
    private static final Counter counter = new Counter();
    private static int V, E;
    private static int[][] G, G_PREV;
    private static int[] orders = new int[TMAX];
    private static int lastOrder;
    private static IntAry[] vos;
    private static PrintWriter writer;
    private static double cooler = INITIAL_COOLER;

    public static void main(String[] args) {
        V = sc.nextInt();
        E = sc.nextInt();
        G = new int[V][V];
        G_PREV = new int[V][V];
        vos = new IntAry[V];
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
        sc.next();
        for (int i = 0; i < TMAX; i++) {
            if (sc.next().charAt(0) == '1') {
                sc.next();
                int dst = sc.nextInt() - 1;
                orders[i] = dst;
                vos[dst].add(i);
                lastOrder = i;
            }
        }
        for (int i = 0; i < V; i++) {
            vos[i].add(TMAX + 1);
        }
        State sol = greedy();
        for (int turn = 1; ; turn++) {
            if (System.currentTimeMillis() - startTime > TL) {
                debug("turn:" + turn);
                break;
            }
            State cur = greedy();
            debug("score:" + cur.score + " at turn:" + turn);
            if (cur.score > sol.score) {
                sol = cur;
            }
        }
//        sol = improve(sol);
        writer = new PrintWriter(System.out);
        sol.output();
        counter.print();
    }

    private static State initialSolution() {
        State st = new State();
        int[] nextDeliver = new int[V];
        final int WAIT_ORDER = 5;
        final int MIN_ORDER = 1;
//        int MAX_WAIT_ORDER = rnd.nextInt(30) + 11;
//        int WAIT_ORDER = rnd.nextInt(MAX_WAIT_ORDER - 10) + 10;
//        int MIN_ORDER = Math.min(WAIT_ORDER - 1, rnd.nextInt(10) + 2);
        int oc = 0;
        int t = 0;
        int lastLoad = -1;
        while (t < TMAX) {
            int shopT = t == 0 ? 0 : t + G[st.path.back()][0];
            if (oc < MIN_ORDER && shopT < TLAST) {
                t = shopT;
                for (int i = lastLoad + 1; i <= t; i++) {
                    if (orders[i] != 0) {
                        oc++;
                    }
                }
                while (t < TLAST && oc < WAIT_ORDER) {
                    t++;
                    if (orders[t] != 0) {
                        oc++;
                    }
                }
                st.goShop(t);
                lastLoad = t;
            } else {
                int minDist = INF;
                int next = 0;
                for (int i = 1; i < V; i++) {
                    int nt = t + G[st.path.back()][i];
                    if (nt > TMAX) continue;
                    if (vos[i].a[nextDeliver[i]] > lastLoad) continue;
                    if (G[st.path.back()][i] < minDist || G[st.path.back()][i] == minDist && (rnd.nextInt() & 3) == 0) {
                        minDist = G[st.path.back()][i];
                        next = i;
                    }
                }
                if (next == 0) break;
                if (st.path.back() != 0 && G[st.path.back()][0] + G[0][next] <= minDist) {
                    t += G[st.path.back()][0];
                    for (int i = lastLoad + 1; i <= t; i++) {
                        if (orders[i] != 0) {
                            oc++;
                        }
                    }
                    st.goShop(t);
                    lastLoad = t;
                }
                t += G[st.path.back()][next];
                while (vos[next].a[nextDeliver[next]] <= lastLoad) {
                    st.score += TMAX2 - sq(t - vos[next].a[nextDeliver[next]]);
                    oc--;
                    nextDeliver[next]++;
                }
                st.goCustomer(next);
            }
        }

        if (DEBUG) {
            int orderCount = 0;
            int undeliver = 0;
            for (int i = 0; i < TMAX; i++) {
                if (orders[i] != 0) orderCount++;
            }
            for (int i = 0; i < V; i++) {
                undeliver += vos[i].size - 1 - nextDeliver[i];
            }
            debug("score:" + st.score);
            debug("undeliver:" + undeliver + "/" + orderCount);
        }
        return st;
    }

    private static State greedy() {
        final int MIN_ORDER_COUNT = 5;
        Beam[] beams = new Beam[TMAX + 1];
        beams[0] = new Beam();
        beams[0].nextDeliver = new int[V];
        for (int time = 0; time < TMAX; time++) {
            Beam beam = beams[time];
            if (beam == null) continue;
            if (beam.last) continue;
            int oc = 0;
            for (int i = 1; i < V && oc < MIN_ORDER_COUNT; i++) {
                int di = beam.nextDeliver[i];
                while (vos[i].a[di] < time) {
                    oc++;
                    di++;
                }
            }
            if (oc < MIN_ORDER_COUNT) {
                int t = time;
                while (t <= TLAST) {
                    if (oc > 0) {
                        Beam nb = createNextBeam(beam, t);
                        updateBeams(beams, nb);
                    }
                    if (oc == MIN_ORDER_COUNT) break;
                    t++;
                    while (t < TLAST && orders[t] == 0) {
                        t++;
                    }
                    oc++;
                }
            } else {
                Beam nb = createNextBeam(beam, time);
                updateBeams(beams, nb);
            }
        }
        Beam best = beams[0];
        for (int i = 1; i <= TMAX; i++) {
            if (beams[i] != null && beams[i].score > best.score) {
                best = beams[i];
            }
        }
        if (DEBUG) {
            int orderCount = 0;
            int undeliver = 0;
            for (int i = 0; i < TLAST; i++) {
                if (orders[i] != 0) orderCount++;
            }
            for (int i = 0; i < V; i++) {
                undeliver += vos[i].size - 1 - best.nextDeliver[i];
            }
            debug("undeliver:" + undeliver + "/" + orderCount);
        }
        State ret = new State();
        ret.score = best.score;
        ArrayList<Beam> list = new ArrayList<>();
        while (best != beams[0]) {
            list.add(best);
            best = best.prev;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            Beam b = list.get(i);
            debug(b);
            ret.path.add(0);
            ret.waitUntil.add(b.startAt);
            int t = b.startAt;
            for (int j = 0; j < b.path.size; j++) {
                int cur = b.path.a[j];
                t += G[j == 0 ? 0 : b.path.a[j - 1]][cur];
                ret.path.add(cur);
                ret.waitUntil.add(t);
            }
        }
        return ret;
    }

    private static void updateBeams(Beam[] beams, Beam beam) {
        int t = beam.startAt;
        long score = beam.prev.score;
        int[] nextDeliver = beam.prev.nextDeliver.clone();
        for (int i = 0; i < beam.path.size - 1 && t <= TMAX; i++) {
            int cur = beam.path.a[i];
            int arrive = t + G[i == 0 ? 0 : beam.path.a[i - 1]][cur];
            if (arrive > TMAX) {
                if (beams[t] == null || beams[t].score < score) {
                    Beam nb = new Beam();
                    nb.prev = beam.prev;
                    nb.startAt = beam.startAt;
                    nb.finishAt = t;
                    nb.nextDeliver = nextDeliver.clone();
                    nb.score = score;
                    nb.path = beam.path.copyOf(0, i);
                    nb.last = true;
                    beams[t] = nb;
                    debug("at:" + t + " score;" + score);
                }
                break;
            }
            t = arrive;
            while (vos[cur].a[nextDeliver[cur]] <= beam.startAt) {
                score += TMAX2 - sq(t - vos[cur].a[nextDeliver[cur]]);
                nextDeliver[cur]++;
            }
            if (i < beam.path.size - 1 && G[cur][0] + G[0][beam.path.a[i + 1]] <= G[cur][beam.path.a[i + 1]]) {
                int nt = t + G[cur][0];
                if (nt <= TMAX && (beams[nt] == null || beams[nt].score < score)) {
                    Beam nb = new Beam();
                    nb.prev = beam.prev;
                    nb.startAt = beam.startAt;
                    nb.finishAt = nt;
                    nb.nextDeliver = nextDeliver.clone();
                    nb.score = score;
                    nb.path = beam.path.copyOf(0, i + 1);
                    beams[nt] = nb;
//                    debug("at:" + nt + " score;" + score);
                }
            }
        }
        if (beam.finishAt <= TMAX && (beams[beam.finishAt] == null || beams[beam.finishAt].score < beam.score)) {
            beams[beam.finishAt] = beam;
//            debug("at:" + beam.finishAt + " score;" + beam.score);
        }
    }

    private static long[] countO = new long[400];
    private static long[] coefO = new long[400];
    private static long[] constO = new long[400];

    private static Beam createNextBeam(Beam prev, int startAt) {
        IntAry vs = new IntAry();
        for (int i = 1; i < V; i++) {
            if (vos[i].a[prev.nextDeliver[i]] <= startAt) {
                vs.add(i);
                int j = prev.nextDeliver[i];
                countO[i] = coefO[i] = constO[i] = 0;
                while (vos[i].a[j] <= startAt) {
                    countO[i]++;
                    coefO[i] += 2 * vos[i].a[j];
                    constO[i] += vos[i].a[j] * vos[i].a[j];
                    j++;
                }
            }
        }
        long score = 0;
        long t = startAt;

        for (int i = 0, cur = 0; i < vs.size; i++) {
            int min = 9999;
            int mi = -1;
            for (int j = i; j < vs.size; j++) {
                if (G[cur][vs.a[j]] < min || G[cur][vs.a[j]] == min && (rnd.nextInt() & 1) == 0) {
                    min = G[cur][vs.a[j]];
                    mi = j;
                }
            }
            swap(vs.a, i, mi);
            cur = vs.a[i];
            t += min;
            score += countO[cur] * (TMAX2 - t * t) + coefO[cur] * t - constO[cur];
        }
//        for (int i = 0; i < vs.size - 1; i++) {
//            int pos = rnd.nextInt(vs.size - i) + i;
//            swap(vs.a, i, pos);
//        }
//        for (int i = 0; i < vs.size; i++) {
//            int cur = vs.a[i];
//            t += G[i == 0 ? 0 : vs.a[i - 1]][cur];
//            int j = prev.nextDeliver[cur];
//            while (vos[cur].a[j] <= startAt) {
//                score += TMAX2 - sq(t - vos[cur].a[j]);
//                j++;
//            }
//        }
        for (int i = 0; i < (vs.size - 1) * 2; i++) {
            int p1 = rnd.nextInt(vs.size);
            int p2 = rnd.nextInt(vs.size - 1);
            if (p1 <= p2) {
                p2++;
            } else {
                int tmp = p2;
                p2 = p1;
                p1 = tmp;
            }
            // 2-opt
            t = startAt;
            long nextScore = 0;
            int pp = 0;
            for (int j = 0; j < p1 && t <= TMAX; j++) {
                int cur = vs.a[j];
                t += G[pp][cur];
                if (t > TMAX) break;
                nextScore += countO[cur] * (TMAX2 - t * t) + coefO[cur] * t - constO[cur];
                pp = cur;
            }
            for (int j = p2; j >= p1 && t <= TMAX; j--) {
                int cur = vs.a[j];
                t += G[pp][cur];
                if (t > TMAX) break;
                nextScore += countO[cur] * (TMAX2 - t * t) + coefO[cur] * t - constO[cur];
                pp = cur;
            }
            for (int j = p2 + 1; j < vs.size && t <= TMAX; j++) {
                int cur = vs.a[j];
                t += G[pp][cur];
                if (t > TMAX) break;
                nextScore += countO[cur] * (TMAX2 - t * t) + coefO[cur] * t - constO[cur];
                pp = cur;
            }
            if (score < nextScore) {
                for (int lo = p1, hi = p2; lo < hi; lo++, hi--) {
                    swap(vs.a, lo, hi);
                }
//                debug("score:" + score + "->" + nextScore);
                score = nextScore;
            }
        }
        Beam ret = new Beam(prev);
        ret.startAt = ret.finishAt = startAt;
        for (int i = 0; i < vs.size; i++) {
            int cur = vs.a[i];
            ret.finishAt += G[i == 0 ? 0 : vs.a[i - 1]][cur];
            while (vos[cur].a[ret.nextDeliver[cur]] <= startAt) {
                ret.nextDeliver[cur]++;
            }
        }
        if (startAt < TLAST) {
            ret.finishAt += G[vs.back()][0];
        } else {
            ret.last = true;
        }
        ret.path = vs;
        ret.score = prev.score + score;
        return ret;
    }

    static class Beam {
        Beam prev;
        int startAt, finishAt;
        int[] nextDeliver;
        IntAry path;
        long score;
        boolean last;

        Beam() {
        }

        Beam(Beam prev) {
            this.prev = prev;
            this.nextDeliver = prev.nextDeliver.clone();
        }

        public String toString() {
            return "startAt:" + startAt + " finishAt:" + finishAt + " score:" + score + "\npath:" + path;
        }
    }

    private static State improve(State st) {
        State bestState = st.clone();
        for (int turn = 0; ; turn++) {
            if ((turn & 0xFF) == 0) {
                long elapsed = System.currentTimeMillis() - startTime;
                if (elapsed > TL) {
                    debug("turn:" + turn);
                    break;
                }
                double c0 = Math.log(INITIAL_COOLER);
                double c1 = Math.log(FINAL_COOLER);
                double ratio = elapsed * 1.0 / TL;
                cooler = Math.exp(c0 * (1 - ratio) + c1 * ratio);
            }
            int pos = rnd.nextInt(st.path.size);
            if (st.path.a[pos] == 0) {
                int type = rnd.nextInt() & 1;
                if (type == 0) {
                    // extend wait to next order and insert it somewhere
                    int extendTo = st.waitUntil.a[pos];
                    while (extendTo < TLAST) {
                        extendTo++;
                        if (orders[extendTo] != 0) {
                            break;
                        }
                    }
                    if (st.waitUntil.a[pos] >= TLAST) continue;

                } else {
                    // shorten wait to previous order
                }

            } else {
                int type = rnd.nextInt() & 1;
                if (type == 0) {
                    // skip
                } else {
                    // move

                }
            }

        }
        return bestState;
    }

    private static boolean accept(long diff) {
        if (diff >= 0) return true;
        double v = diff * cooler;
        if (v < -8.0) return false;
        return rnd.nextDouble() < Math.exp(v);
    }

    static class State {
        IntAry path;
        IntAry waitUntil;
        long score;

        State() {
            path = new IntAry();
            waitUntil = new IntAry();
        }

        public State clone() {
            State ret = new State();
            ret.path = new IntAry(this.path);
            ret.waitUntil = new IntAry(this.waitUntil);
            ret.score = this.score;
            return ret;
        }

        void goShop(int until) {
            path.add(0);
            waitUntil.add(until);
        }

        void goCustomer(int v) {
            waitUntil.add(waitUntil.back() + G[path.back()][v]);
            path.add(v);
        }

        void output() {
            debug(path);
            debug(waitUntil);
            int t = 0;
            int idx = 0;
            for (int i = 0; i < path.size - 1; i++, idx++) {
                while (t < waitUntil.a[idx]) {
                    writer.println(-1);
                    t++;
                }
                outputPath(path.a[i], path.a[i + 1]);
                t += G[path.a[i]][path.a[i + 1]];
            }
            while (t < TMAX) {
                writer.println(-1);
                t++;
            }
            writer.flush();
        }

        void outputPath(int u, int v) {
//            debug(u + "->" + v);
            if (G_PREV[u][v] == u) {
                for (int i = 0; i < G[u][v]; i++) {
                    writer.println(v + 1);
                }
            } else {
                outputPath(u, G_PREV[u][v]);
                outputPath(G_PREV[u][v], v);
            }
        }
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

