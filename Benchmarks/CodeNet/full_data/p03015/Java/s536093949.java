
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    long MOD = (long)1e9 + 7;

    void run() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n  = s.length();
        long ans = 1, sub = 1;
        for (int i = 0; i < n; i++) ans = (ans * 3) % MOD;
        for (int i = 0; i < n; i++) if (s.charAt(i) != '1')  sub = (sub * 2) % MOD;
        
        sub = (n * sub) % MOD;

        System.out.println((ans + MOD - sub) % MOD);
    }

    void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
