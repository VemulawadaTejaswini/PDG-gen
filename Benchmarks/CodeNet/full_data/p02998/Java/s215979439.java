
import java.util.*;

public class Main {

    int n;
    int[] xs, ys;

    int cnt;
    E[] g;

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        xs = new int[n];
        ys = new int[n];

        TreeSet<Integer> xp = new TreeSet<>(), yp = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            xs[i] = sc.nextInt();
            ys[i] = sc.nextInt();
            xp.add(xs[i]);
            yp.add(ys[i]);
        }

        HashMap<Integer, Integer> x2int = new HashMap<>(), y2int = new HashMap<>();

        cnt = 0;
        for (int p: xp) x2int.put(p, cnt++);
        for (int p: yp) y2int.put(p, cnt++);

        g = new E[cnt];
        for (int i = 0; i < cnt; i++) g[i] = new E();

        for (int i = 0; i < n; i++) {
            int xidx = x2int.get(xs[i]), yidx = y2int.get(ys[i]);
            g[xidx].add(yidx);
            g[yidx].add(xidx);
        }

        long ans = 0;
        boolean[] visited = new boolean[cnt];
        for (int i = 0; i < cnt; i++) if (!visited[i]) {
            Ret r = solve(i, true, visited);
            if (r.xc < 2 || r.yc < 2) continue;
            long max = Math.max(r.xc, r.yc);
            ans += max * max - r.ec;
        }
        System.out.println(ans);
    }


    Ret solve(int cur, boolean isX, boolean[] visited) {
        visited[cur] = true;
        Ret ret = new Ret();

        for (int next: g[cur]) if (!visited[next]) {
            Ret n = solve(next, !isX, visited);
            ret.ec += n.ec + 1;
            ret.xc += n.xc;
            ret.yc += n.yc;
        }
        if (isX) ret.xc++;
        else ret.yc++;
        return ret;
    }

    class Ret {
        int ec, xc, yc;
        Ret() {
            this.ec = 0;
            this.xc = 0;
            this.yc = 0;
        }
    }

    class E extends ArrayList<Integer> {}


    void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
