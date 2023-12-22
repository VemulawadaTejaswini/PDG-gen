import java.util.Scanner;

public class Main {
    static final long MOD = 1000000000+7;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long a = in.nextLong();
        long b = in.nextLong();
        long result = patternsUpTo(n) - patternsJust(b, n) - patternsJust(a, n);
        while(result < 0) {
            result += MOD;
        }
        while(result > MOD) {
            result -= MOD;
        }
        System.out.println(result);
    }
    private static long patternsUpTo(long n) {
        // n種類の花から1本以上を選択する場合の数（0本は許されない）
        // 2^n - 1
        // https://stackoverflow.com/a/19764856/518639
        long u = 1;
        long w = 2;
        while(n!=0) {
            if((n & 1) != 0) {
                u = (u * w) % MOD;
            }
            n = n >> 1;
            if(n != 0) {
                w = (w * w) % MOD;
            }
        }
        u = (u==0) ? (MOD - 1) : u-1;
        return u;
    }
    private static long patternsJust(long b, long n) {
        // n種類の花からちょうどb本を選択する場合の数
        // nCb
        long result = 1;
        for(long i=n; i>n-b; i--) {
            result *= i;
        }
        for(long i=2; i<=b; i++) {
            result /= i;
        }
        return result;
    }
}
