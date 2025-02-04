import java.util.Scanner;

class Main {

    int n, k;
    long[] x, y;

    void solve() {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        x = new long[n];
        y = new long[n];
        for(int i = 0; i < n; i++) {
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }
        long ans = Long.MAX_VALUE;
        for(int a = 0; a < n; a++) {
            for(int b = 0; b < n; b++) {
                for(int c = 0; c < n; c++) {
                    for(int d = 0; d < n; d++) {
                        long mx = Math.min(Math.min(x[a], x[b]), Math.min(x[c], x[d]));
                        long my = Math.min(Math.min(y[a], y[b]), Math.min(y[c], y[d]));
                        long Mx = Math.max(Math.max(x[a], x[b]), Math.max(x[c], x[d]));
                        long My = Math.max(Math.max(y[a], y[b]), Math.max(y[c], y[d]));
                        if(count(mx, my, Mx, My) >= k) {
                            ans = Math.min((Mx - mx) * (My - my), ans);
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
    int count(long mx, long my, long Mx, long My) {
        int c = 0;
        for(int i = 0; i < n; i++) {
            if(mx <= x[i] && x[i] <= Mx && my <= y[i] && y[i] <= My) {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}
