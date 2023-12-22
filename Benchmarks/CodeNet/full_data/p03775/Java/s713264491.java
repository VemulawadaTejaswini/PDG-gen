import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long digits = Integer.MAX_VALUE;
        for (long i = 1; i*i <= n; i++) {
            if (n % i != 0) continue;

            long tmpB = n/i;
            int tmpDigits = Math.max(digitsCount(i), digitsCount(tmpB));

            if (digits > tmpDigits) digits = tmpDigits;
        }

        System.out.println(digits);
    }

    public static int digitsCount(long a) {
        int ans = 0;
        while (a>0) {
            a/=10;
            ans++;
        }
        return ans;
    }
}
