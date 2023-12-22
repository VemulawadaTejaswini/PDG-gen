
import java.util.Scanner;

public class Main {

    static int mod = 1000000000 + 7;
    static int max = 1000000 * 2 / 3 + 1;

    static long[] fact = new long[max];
    static long[] modinv = new long[max];
    static long[] factinv = new long[max];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = Integer.parseInt(scan.next());
        int y = Integer.parseInt(scan.next());
        scan.close();

        if ((x + y) % 3 != 0) {
            System.out.println(0);
            return;
        }

        int limit = (x + y) / 3;
        if (x < limit || y < limit) {
            System.out.println(0);
            return;
        }

        initCombi();
        System.out.println(combi(limit, x - limit));

    }

    private static void initCombi() {
        fact[0] = 1;
        fact[1] = 1;
        modinv[1] = 1;
        factinv[0] = 1;
        factinv[1] = 1;

        for (int i = 2; i < max; i++) {
            fact[i] = fact[i - 1] * i % mod;
            modinv[i] = mod - modinv[mod % i] * (mod / i) % mod;
            factinv[i] = factinv[i - 1] * modinv[i] % mod;
        }
    }

    private static long combi(int n, int k) {
        return fact[n] * (factinv[k] * factinv[n - k] % mod) % mod;
    }

}
