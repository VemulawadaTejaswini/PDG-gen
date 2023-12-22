
import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static final int MOD = (int)Math.pow(10,9)+7;

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();

        long ret = powMod(2, n) - 1 - combinationMod(n, a) - combinationMod(n, b);
        ret %= MOD;

        os.println(ret < 0 ? ret + MOD : ret);
    }


    static long powMod(long seed, long n) {
        long ret = 1;
        while(n > 0) {
            if((n & 1) == 1) ret = seed * ret % MOD;
            seed = seed * seed % MOD;
            n = n >> 1;
        }
        return ret;
    }

    static long combinationMod(long n, long k) {
        long child = 1;
        long mother = 1;

        for(long i = n; i >= n-k+1; i--) {
            child = child * i % MOD;
            mother = mother * (n-i+1) % MOD;
        }

        long ret = child * powMod(mother, MOD-2) % MOD;

        return ret;
    }

}