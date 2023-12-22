
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    long MOD = (long)1e9 + 7;

    // (0, 0), (1, 0), (0, 1)
    // 110110

    void run() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n  = s.length();
        long ans = 1, add = 1;
        for (int i = n - 1; i > 0; i--) {
            ans = (ans * 3) % MOD;
        }
        for (int i = n - 1; i > 0; i--) {
            add = (add * (s.charAt(i) == '0' ? 1 : 3)) % MOD;
        }

        add = (add * 2) % MOD;

        System.out.println((ans + add) % MOD);
    }

    void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
