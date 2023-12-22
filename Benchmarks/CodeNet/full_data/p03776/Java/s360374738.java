import java.util.*;
import java.util.Map.*;
public class Main {
    static int MAX = 50;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        long[][] c = comb(n);
        List<Long> v = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            v.add(sc.nextLong());
        }
        Collections.sort(v, Comparator.reverseOrder());

        double ave = 0.0;
        for (int i = 0; i < a; i++) {
            ave += (double) v.get(i);
        }
        ave = ave / (double) a;

        int aInCnt = 0;
        int aCnt = 0;
        for (int i = 0; i < n; i++) {
            if (v.get(i) == v.get(a - 1)) {
                aCnt++;
                if (i < a) {
                    aInCnt++;
                }
            }
        }

        long ans = 0;
        if (v.get(0) == v.get(a - 1)) {
            for (int i = a; i <= b; i++) {
                ans += c[aCnt][i];
            }
        } else {
            ans += c[aCnt][aInCnt];
        }
        System.out.println(String.format("%.6f", ave));
        System.out.println(ans);
    }

    public static long[][] comb(long n) {
        long[][] c = new long[MAX + 1][MAX + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= MAX; j++) {
                if (j == 0 || i == j) {
                    c[i][j] = 1L;
                    continue;
                }
                c[i][j] = c[i - 1][j - 1] + c[i - 1][j];
            }
        }
        return c;
    }
}
