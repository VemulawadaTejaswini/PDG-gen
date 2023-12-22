import java.util.Scanner;

public class Main {
    int h, w, d;
    Pair[] as;
    int q;
    int[] rs, ls;

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        w = sc.nextInt();
        d = sc.nextInt();
        as = new Pair[h*w + 1];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int a = sc.nextInt();
                as[a] = new Pair(i+1, j+1);
            }
        }
        q = sc.nextInt();
        rs = new int[q]; ls = new int[q];
        for (int i = 0; i < q; i++) {
            ls[i] = sc.nextInt();
            rs[i] = sc.nextInt();
        }
    }

    private void solve() {
        int[] acc = new int[h * w + 1];
        for (int i = 1; i <= d; i++) {
            acc[i] = 0;
            for (int j = i + d; j <= h * w; j += d) {
                acc[j] = acc[j-d] + as[j].dst(as[j-d]);
            }
        }
        for (int i = 0; i < q; i++) {
            System.out.println(acc[rs[i]] - acc[ls[i]]);
        }
    }

    private class Pair {
        int fst, snd;
        Pair (int fst, int snd) {
            this.fst = fst;
            this.snd = snd;
        }

        int dst(Pair p) {
            int a = Math.abs(fst - p.fst);
            int b = Math.abs(snd - p.snd);
            return a + b;
        }
    }
}
