import java.util.*;

public class Main {
    static char[][] c;

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        long[] x = new long[n + 1];
        Set<Integer> a = new HashSet<>();
        Map<Integer, Set<M>> mapl = new HashMap<>();
        Map<Integer, Set<M>> mapr = new HashMap<>();

        for (int i = 0; i < m; i++) {
            M tmp = new M(scan.nextInt(), scan.nextInt(), scan.nextInt());
            if (!mapl.containsKey(tmp.l)) {
                Set<M> s = new HashSet<>();
                s.add(tmp);
                mapl.put(tmp.l, s);
            } else {
                mapl.get(tmp.l).add(tmp);
            }
            if (!mapr.containsKey(tmp.r)) {
                Set<M> s = new HashSet<>();
                s.add(tmp);
                mapr.put(tmp.r, s);
            } else {
                mapr.get(tmp.r).add(tmp);

            }
        }
        while (!mapl.isEmpty()) {
            Optional<Integer> ol = mapl.keySet().stream().filter(a::contains).findAny();
            if (ol.isPresent()) {
                Set<M> s = mapl.get(ol.get());
                M c =s.stream().findAny().get();
                if (a.contains(c.r)) {
                    if (x[c.r] - x[c.l] != c.d) {
                        System.out.println("No");
                        return;
                    }
                } else {
                    x[c.r] = x[c.l] + c.d;
                    a.add(c.r);
                }
                if(s.size() == 1) {
                    mapl.remove(ol.get());
                }
                else {
                    s.remove(c);
                }
                Set<M> sr = mapr.get(c.r);
                if(sr.size() == 1) {
                    mapr.remove(c.r);
                }
                else {
                    sr.remove(c);
                }
                continue;
            }
            Optional<Integer> or = mapr.keySet().stream().filter(a::contains).findAny();
            if (or.isPresent()) {
                Set<M> s  = mapr.get(or.get());
                M c =s.stream().findAny().get();

                x[c.l] = x[c.r] - c.d;
                a.add(c.l);

                if(s.size() == 1) {
                    mapr.remove(or.get());
                }
                else {
                    s.remove(c);
                }
                Set<M> sl = mapl.get(c.l);
                if(sl.size() == 1) {
                    mapl.remove(c.l);
                }
                else {
                    sl.remove(c);
                }
            }
            else {
                M c = mapl.values().stream().findAny().get().stream().findAny().get();
                x[c.l] = 0;
                x[c.r] = c.d;
                a.add(c.l);
                a.add(c.r);
                Set<M> sl = mapl.get(c.l);
                if(sl.size() == 1) {
                    mapl.remove(c.l);
                }
                else {
                    sl.remove(c);
                }
                Set<M> sr = mapr.get(c.r);
                if(sr.size() == 1) {
                    mapr.remove(c.r);
                }
                else {
                    sr.remove(c);
                }
            }
        }
        System.out.println("Yes");
    }

    static class M {
        int l;
        int r;
        int d;

        M(int l, int r, int d) {
            this.l = l;
            this.r = r;
            this.d = d;
        }

        @Override
        public boolean equals(Object obj) {
            M o = (M) obj;
            return this.l == o.l && this.r == o.r && this.d == o.d;
        }

        @Override
        public int hashCode() {
            return l * 31 + r * 17 + d;
        }
    }
}
