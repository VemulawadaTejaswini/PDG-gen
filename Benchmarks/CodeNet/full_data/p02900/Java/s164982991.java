import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        int gcd = (int) getGcd(a, b);
        System.out.println(getPf(gcd) + 1);
    }

    static long getGcd(long x, long y) {
        return y == 0 ? x : getGcd(y, x % y);
    }

    static int getPf (int n) {
        int cnt = 0;
        for (long i = 2; i * i <= n; i++) {
            boolean isFirst = true;
            if (n % i != 0) {
                continue;
            }
            while (n % i == 0) {
                n /= i;
                if (isFirst) {
                    cnt++;
                    isFirst = false;
                }
            }
        }
        if (n != 1) {
            cnt++;
        }
        return cnt;
    }
}