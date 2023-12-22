
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

        // aArr[0]をかえる
        int gcd0 = aArr[1];
        for (int i = 1; i < n - 1; i++) {
            gcd0 = gcd(gcd0, aArr[i]);
        }

        // aArr[n - 2]をかえる
        int gcd1 = aArr[n - 1];
        for (int i = 0; i < n - 2; i++) {
            gcd1 = gcd(gcd1, aArr[i]);
        }

        // aArr[n - 1]をかえる
        int gcd2 = aArr[n - 2];
        for (int i = 0; i < n - 2; i++) {
            gcd2 = gcd(gcd2, aArr[i]);
        }

        // write your code
        System.out.println(Math.max(gcd0, Math.max(gcd1, gcd2)));
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
