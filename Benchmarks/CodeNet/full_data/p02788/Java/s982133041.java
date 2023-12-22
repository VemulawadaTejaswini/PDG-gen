

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    static Scanner sc = null;
    static PrintWriter pw = null;

    //
//
//


    static {
        sc = new Scanner(System.in);
//        sc = new Scanner("3\n" +
//                "4 9\n" +
//                "5 10\n" +
//                "42 9999999967");
//        sc = new Scanner("1\n" +
//                "4 6\n" +
//                "5 10\n" +
//                "42 9999999967");
    }

    static int ni() {
        return sc.nextInt();
    }

    private static long nl() {
        return sc.nextLong();
    }

    static int[] nia(int l) {
        int[] r = new int[l];
        for (int s = 0; s < l; s++) {
            r[s] = ni();
        }
        return r;
    }


    public static void main(String[] args) {
        int n = ni();
        int d = ni();
        int a = ni();


        TreeSet<Long> xs = new TreeSet<>();
        HashMap<Long,List<Long>> mons = new HashMap<>();

        for (int s = 0; s < n; s++) {
            long x = ni();
            long h = ni();
            xs.add(x);
            xs.add(x + d * 2 + 1);
            mons.computeIfAbsent(x, r->new ArrayList<>()).add(h);
        }

        long cur = 0;
        long ans = 0;
        HashMap<Long, Long> remove = new HashMap<>();
        for (long l : xs) {
            cur -= remove.getOrDefault(l, 0L);
            List<Long> ms = mons.get(l);
            if (ms == null) {
                continue;
            }
            for (long m : ms) {
                if (m <= cur) {
                    continue;
                }
                long na = (m + a - 1) / a - cur / a;
                ans += na;
                remove.merge(l + d * 2 + 1L, na * a, Math::addExact);
                cur += na * a;
            }
        }

        System.out.println(ans);
    }

    private static void sl() {


    }

    private static long gcdCount(long gcValue, long checkWith, long toValIncl) {
        if (gcValue > 1)
            return gcdCount(1, checkWith / gcValue, toValIncl / gcValue);


        Divisors dd = new Divisors(checkWith);
        long ans = 0;
        for (Divisors m : dd.max1Divisors()) {
            long nn = m.numeric();
            if (m.divisors.size() % 2 == 0) {
                ans += toValIncl / nn;
            } else {
                ans -= toValIncl / nn;
            }
        }
        return ans;
    }


    private static long gcd(long a, long b) {
        if (b > a) return gcd(b, a);
        if (b == 0) return a;
        return gcd(b, a % b);
    }


    private static final class Divisors {
        Map<Long, Integer> divisors;

        public Divisors(long x) {
            this(cvt(x));
        }

        public Divisors(Map<Long, Integer> cvt) {
            this.divisors = cvt;
        }

        private Divisors(long x, int ct) {
            divisors = new HashMap<>();
            divisors.put(x, ct);
        }

        private long numeric() {
            long a = 1;
            for (Map.Entry<Long, Integer> x : divisors.entrySet()) {
                for (int s = 0; s < x.getValue(); s++) {
                    a *= x.getKey();
                }
            }
            return a;
        }

        private static Map<Long, Integer> cvt(long x) {
            Map<Long, Integer> divisors = new HashMap<>();
            for (long s = 2; s * s <= x; s++) {
                if (x % s == 0) {
                    divisors.merge(s, 1, Math::addExact);
                    x /= s;
                    s--;
                }
            }
            if (x > 1) {
                divisors.merge(x, 1, Math::addExact);
            }
            return divisors;
        }

        private Divisors gcd(Divisors other) {
            Map<Long, Integer> nn = new HashMap<>();
            for (Map.Entry<Long, Integer> mm : other.divisors.entrySet()) {
                Integer th = divisors.get(mm.getKey());
                if (th != null) {
                    nn.put(mm.getKey(), Math.min(th, mm.getValue()));
                }
            }

            return new Divisors(nn);
        }

        private Divisors mul(Divisors other) {
            Map<Long, Integer> nn = new HashMap<>(divisors);
            for (Map.Entry<Long, Integer> mm : other.divisors.entrySet()) {
                nn.merge(mm.getKey(), mm.getValue(), Math::addExact);
            }
            return new Divisors(nn);
        }


        private Divisors div(Divisors other) {
            Map<Long, Integer> nn = new HashMap<>(divisors);
            for (Map.Entry<Long, Integer> mm : other.divisors.entrySet()) {
                if (mm.getValue().equals(nn.get(mm.getKey()))) {
                    nn.remove(mm.getKey());
                } else {
                    nn.merge(mm.getKey(), -mm.getValue(), Math::addExact);
                }
            }
            return new Divisors(nn);
        }

        private List<Divisors> max1Divisors() {
            List<Divisors> list = new ArrayList<>();
            list.add(new Divisors(1));

            for (Map.Entry<Long, Integer> x : divisors.entrySet()) {
                int ol = list.size();
                Divisors cur = new Divisors(x.getKey(), 1);
                for (int l = 0; l < ol; l++) {
                    list.add(list.get(l).mul(cur));
                }
            }
            return list;
        }


        private List<Divisors> divisors() {
            List<Divisors> list = new ArrayList<>();
            list.add(new Divisors(1));

            for (Map.Entry<Long, Integer> x : divisors.entrySet()) {
                int ol = list.size();
                for (int t = 1; t <= x.getValue(); t++) {
                    Divisors cur = new Divisors(x.getKey(), t);
                    for (int l = 0; l < ol; l++) {
                        list.add(list.get(l).mul(cur));
                    }

                }
            }
            return list;
        }

        @Override
        public String toString() {
            return divisors.toString();
        }
    }


    private static long fact(int n) {
        if (n <= 1) return 1;
        return n * fact(n - 1);
    }

    private static Node[] func = new Node[26];

    private static void solve(int csn) {
        int r = ni();
        int c = ni();
        int d = ni();
        int e = ni();
        boolean[][] grid = new boolean[r][c];

        for (int s = 0; s < r; s++) {
            String k = sc.next();
            for (int l = 0; l < c; l++) {
                grid[s][l] = k.charAt(l) == '#';
            }
        }

        for (int t = 0; t < d; t++) {
            String l = sc.next();
            func[l.charAt(0) - 'A'] = Node.parse(l.substring(2));
        }
        sc.nextLine();
//        System.out.println("--------------------");
        for (int p = 0; p < e; p++) {
            String pos = sc.nextLine();
            String[] x = pos.split(" ");
            int ir = Integer.parseInt(x[0]) - 1;
            int ic = Integer.parseInt(x[1]) - 1;
            int dir = "nwse".indexOf(x[2].charAt(0));
            State state = new State(grid, ir, ic, dir);
            Node comm = Node.parse(sc.nextLine());

            if (comm.execute(state)) {
//                System.out.print("Answer -- ");
                System.out.println(state);
            } else {
//                System.out.print("Answer -- ");
                System.out.println("inf");
            }
        }
    }

    private static final class State {
        private final boolean[][] grid;
        int[] rd = new int[]{-1, 0, 1, 0};
        int[] cd = new int[]{0, -1, 0, 1};

        // "nesw"
        int direction;
        int posR;
        int posC;

        public char cDirection() {
            return "nwse".charAt(direction);
        }

        public State(boolean[][] grid, int ir, int ic, int dir) {
            direction = dir;
            posR = ir;
            posC = ic;
            this.grid = grid;
        }

        private boolean canMove() {
            int[] nm = nm();
            return !(nm[0] < 0 || nm[1] < 0 || nm[0] >= grid.length || nm[1] >= grid[0].length || grid[nm[0]][nm[1]]);
        }

        private int[] nm() {
            return new int[]{posR + rd[direction], posC + cd[direction]};
        }

        private void move() {
            if (canMove()) {
                int[] nm = nm();
                posR = nm[0];
                posC = nm[1];
            }
        }

        private void toLeft() {
            direction = (direction + 1) % 4;
        }


        @Override
        public String toString() {
            return (posR + 1) + " " + (posC + 1) + " " + cDirection();
        }

        public Integer toKey() {
            return posR + posC * 40 + direction * 1600;
        }

        public void fromKey(int ff) {
            this.posR = ff % 40;
            this.direction = ff / 1600;
            this.posC = (ff % 1600) / 40;
        }
    }

    private static final int STATE_SIZE = 1600 * 4 + 1;

    private static abstract class Node {
        private int[] statec = new int[STATE_SIZE];

        Node() {
            Arrays.fill(statec, -2);
        }

        static Node parse(String s) {
            if (s.length() == 0) {
                return Noop.INSTANCE;
            }
            if (s.charAt(0) == 'm') {
                return new Composite(new Move(), parse(s.substring(1)));
            }
            if (s.charAt(0) == 'l') {
                return new Composite(new Left(), parse(s.substring(1)));
            }
            if (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') {
                return new Composite(new ProcCall(s.charAt(0)), parse(s.substring(1)));
            }

            if (s.charAt(0) == 'u') {
                Condition condition = new Condition(s.charAt(1));
                int end = posValidPar(s.substring(2));
                Node f = parse(s.substring(3, 2 + end));
                Node next = parse(s.substring(end + 3));
                return new Composite(new Loop(condition, f), next);
            }
            if (s.charAt(0) == 'i') {
                Condition condition = new Condition(s.charAt(1));
                int first = posValidPar(s.substring(2));
                Node t = parse(s.substring(3, 2 + first));
                s = s.substring(first + 3);
                int second = posValidPar(s);
                Node f = parse(s.substring(1, second));
                Node next = parse(s.substring(second + 1));
                If ct = new If(condition, t, f);
                return new Composite(ct, next);
            }

            throw new IllegalStateException(s);
        }

        public final boolean execute(State state) {
            if (this instanceof Left || this instanceof Move) {
                return executeInt(state);
            }
            int key = state.toKey();
            int ff = statec[key];
            if (ff == -2) {
                if (executeInt(state)) {
                    statec[key] = state.toKey();
                } else {
                    statec[key] = -1;
                }
            } else {
                state.fromKey(ff);
            }
            return statec[key] != -1;
        }

        public abstract boolean executeInt(State state);
    }

    private static int posValidPar(String x) {
        assert x.charAt(0) == '(';
        int s = 0;
        for (int l = 0; l < x.length(); l++) {
            if (x.charAt(l) == '(') {
                s++;
            }
            if (x.charAt(l) == ')') {
                s--;
            }
            if (s == 0) {
                return l;
            }
        }

        throw new IllegalStateException(x);
    }

    private static class Composite extends Node {
        private List<Node> nodes = new ArrayList<>();

        public Composite(Node one, Node two) {
            nodes.addAll(l(one));
            nodes.addAll(l(two));
        }

        private List<Node> l(Node two) {
            if (two instanceof Noop) {
                return Collections.emptyList();
            }
            if (two instanceof Composite) {
                return ((Composite) two).nodes;
            }
            return Collections.singletonList(two);
        }


        public boolean executeInt(State state) {
            for (Node n : nodes) {
                if (!n.execute(state)) {
                    return false;
                }
            }
            return true;
        }
    }

    private static class Noop extends Node {
        private static Noop INSTANCE = new Noop();

        @Override
        public boolean executeInt(State state) {
            return true;
        }
    }

    private static class Move extends Node {
        @Override
        public boolean executeInt(State state) {
            state.move();
            return true;
        }
    }

    private static class Loop extends Node {
        private Condition c;
        private Node t;

        public Loop(Condition condition, Node f) {
            this.c = condition;
            this.t = f;
        }

        @Override
        public boolean executeInt(State state) {
            boolean[] vis = new boolean[STATE_SIZE];
            while (!c.match(state)) {
                Integer l = state.toKey();
                if (vis[l] || !t.execute(state)) {
                    return false;
                }
                vis[l] = true;
            }
            return true;
        }
    }

    private static class If extends Node {
        private Condition c;
        private Node t;
        private Node f;

        public If(Condition condition, Node t, Node f) {
            this.c = condition;
            this.t = t;
            this.f = f;
        }

        @Override
        public boolean executeInt(State state) {
            if (c.match(state)) {
                return t.execute(state);
            } else {
                return f.execute(state);
            }
        }
    }

    private static class Left extends Node {
        @Override
        public boolean executeInt(State state) {
            state.toLeft();
            return true;
        }
    }

    private static class ProcCall extends Node {
        private static final boolean[][] keys = new boolean[26][STATE_SIZE];

        private char proc;

        public ProcCall(char charAt) {
            proc = charAt;
        }

        @Override
        public boolean executeInt(State state) {
            Integer k = state.toKey();
            if (keys[proc - 'A'][k]) {
                return false;
            }
            keys[proc - 'A'][k] = true;
            boolean ans = func[proc - 'A'].execute(state);
            keys[proc - 'A'][k] = false;
            return ans;
        }
    }


    private static final class Condition {
        private char type;

        public Condition(char charAt) {
            type = charAt;
        }

        private boolean match(State c) {
            if ('b' == type) {
                return !c.canMove();
            }
            return type == c.cDirection();
        }
    }


}
