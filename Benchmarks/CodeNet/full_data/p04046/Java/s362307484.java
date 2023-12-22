import java.math.*;
import java.util.*;

public class Main {
    private long mod = 1_000_000_007L;
    private BigInteger bmod = BigInteger.valueOf(mod);
    private BigInteger bkaijo[];
    private BigInteger inv[];

    public void main(Scanner sc) {
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        inv = new BigInteger[h + w - 1];
        bkaijo = new BigInteger[h + w - 1];
        inv[0] = BigInteger.ONE;
        bkaijo[0] = BigInteger.ONE;
        for (int i = 1; i <= h + w - 2; i++) {
            bkaijo[i] = bkaijo[i - 1].multiply(BigInteger.valueOf(i)).mod(bmod);
            inv[i] = bkaijo[i].modInverse(bmod);
        }

        long ans = 0;
        long ans1, ans2;
        for (int i = b; i < w; i++) {
            ans1 = calc(0, 0, h - a - 1, i);
            ans2 = calc(h - a, i, h - 1, w - 1);
            ans += ans1 * ans2 % mod;
            ans %= mod;
        }

        System.out.println(ans);
    }

    private long calc(int h1, int w1, int h2, int w2) {
        int h = h2 - h1;
        int w = w2 - w1;

        return bkaijo[h + w].multiply(inv[h]).mod(bmod).multiply(inv[w]).mod(bmod).longValue();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
