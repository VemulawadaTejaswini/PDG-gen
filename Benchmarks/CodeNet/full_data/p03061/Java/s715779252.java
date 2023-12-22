import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] aArr = new int[n];

        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }

        Arrays.sort(aArr);

        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            Integer gcdTmp = null;
            for (int j = 0; j < n; j++) {
                if (j == i) continue;

                if (gcdTmp == null) {
                    gcdTmp = aArr[j];
                } else {
                    gcdTmp = gcd(aArr[j], gcdTmp);
                }

                if (gcdTmp <= ans) break;
            }
            ans = Math.max(ans, gcdTmp);
        }

        // write your code
        System.out.println(ans);
    }

    int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
