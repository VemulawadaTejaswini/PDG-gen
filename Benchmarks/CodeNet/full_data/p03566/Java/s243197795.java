import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static final void main(String[] args) {
        new Main().solve();
        out.flush();
    }

    // ========================================================================= //

    public void solve() {
        int n = sc.nextInt();
        double[] t = new double[n];
        double[] v = new double[n + 1];
        for (int i = 0; i < n; i++) t[i] = sc.nextDouble();
        for (int i = 0; i < n; i++) v[i] = sc.nextDouble();
        v[n] = 0.0;

        double ans = 0.0, curV = 0.0;
        for (int i = 0; i < n; i++) {
            for (double j = 0; j < t[i]; j+=0.5) {
                boolean up = true, eq = true;
                double  tc = t[i] - j;
                for (int k = i + 1; k < n + 1; k++) {
                    if (curV + 0.5 - tc >= v[k]) up = false;
                    if (curV - tc >= v[k]) eq = false;
                    if (k < n) tc += t[k];
                }

                if (up && curV + 0.5 <= v[i]) {
                    ans += curV * 0.5 + 0.125;
                    curV += 0.5;
                }
                else if (eq) {
                    ans += curV * 0.5;
                }
                else {
                    ans += curV * 0.5 - 0.125;
                    curV -= 0.5;
                }
            }
        }
        out.println(ans);
    }
}
