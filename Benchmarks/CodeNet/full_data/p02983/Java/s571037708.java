import java.util.Scanner;

public class Main {

    static final long MOD = 2019;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();
        sc.close();

        long min = l % MOD;
        long max = Math.min((r - l), MOD);
        long ans = MOD;
        for (long i = min; i <= min + max; i++) {
            for (long j = min + 1; j <= min + max; j++) {
                long tmp = (i * j) % MOD;
                if (tmp < ans) {
                    ans = tmp;
                }
            }
        }
        System.out.println(ans);
    }

}
