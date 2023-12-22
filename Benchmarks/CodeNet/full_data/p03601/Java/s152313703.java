
import java.util.Scanner;

public class Main {
    int a, b, c, d, e, f;

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();
    }

    private double calc(int a, int b) {
        return (double) (100 * b) / (a + b);
    }

    private void solve() {
        int m = 1 + Math.max(f / a, f / b) / 100;
        double ans = -1.;
        int ansS = -1, ansA = -1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                int water = a * i + b * j;
                if (water == 0 || water * 100 >= f)
                    continue;
                int sugar = 0, sugarM = e * water;
                int l = Math.max(sugarM / c, sugarM / d) + 1;
                for (int k = 0; k < l; k++) {
                    for (int n = 0; n < l; n++) {
                        int tmp = (c * k) + (d * n);
                        if (tmp <= sugarM && tmp > sugar && sugar + water * 100 < f)
                            sugar = tmp;
                    }
                }
                if (ans < calc(water * 100, sugar)) {
                    ans = calc(water * 100, sugar);
                    ansS = sugar;
                    ansA = water * 100 + sugar;
                }
            }
        }
        System.out.printf("%d %d\n", ansA, ansS);
    }


}
