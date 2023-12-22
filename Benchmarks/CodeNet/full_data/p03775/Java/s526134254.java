import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int sqrN = (int)Math.sqrt(n);

        long res = Integer.MAX_VALUE;
        for (int i = 1; i <= sqrN; ++i) {
            if (n % i == 0) {
                long b = n / i;

                long tmp = Math.max(func(i), func(b));
                if (tmp < res) res = tmp;
            }
        }

        System.out.println(res);
    }

    static long func(long n) {
        long cnt = 0;
        while (n != 0) {
            n /= 10;
            ++cnt;
        }
        return cnt;
    }
}
