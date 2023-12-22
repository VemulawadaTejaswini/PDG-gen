import java.util.*;

public class Main {
    static char[][] c;

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        long[] x = new long[n + 1];
        Set<Integer> a = new HashSet<>();
        Set<M> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            set.add(new M(scan.nextInt(), scan.nextInt(), scan.nextInt()));
        }
        while(!set.isEmpty()) {
            Optional<M> o = set.stream().filter(data -> a.contains(data.l) || a.contains(data.r)).findAny();
            if(o.isPresent()) {
                M c = o.get();
                if(a.contains(c.l)) {
                    if(a.contains(c.r)) {
                        if(x[c.r] - x[c.l] != c.d) {
                            System.out.println("No");
                            return;
                        }
                    }
                    else {
                        x[c.r] = x[c.l] + c.d;
                        a.add(c.r);
                    }
                }
                else {
                    x[c.l] = x[c.r] - c.d;
                    a.add(c.l);
                }
                set.remove(c);
            }
            else {
                M c = set.stream().findAny().get();
                x[c.l] = 0;
                x[c.r] = c.d;
                a.add(c.l);
                a.add(c.r);
                set.remove(c);
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

        public boolean equals(Object obj) {
            M o = (M) obj;
            return this.l == o.l &&this.r == o.r && this.d == o.d;
        }

        public int hashCode() {
            return l * 31 + r * 17 + d;
        }
    }
}
