import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long m = sc.nextLong();
        long[] values = new long[n];
        long lcm = 1;

        for (int i = 0; i < n; i++) {
            long value = sc.nextLong();
            values[i] = value;
            long valid = value / 2;
            lcm = (lcm * valid) / gcd(lcm, valid);
            if (m < lcm) {
                // 最小公倍数が上限より大きい
                System.out.println(0);
                return;
            }
        }

        for (int i = 0; i < n ; i++) {
            if (lcm % values[i] == 0) {
                // lcmはvalidの2が最大乗数分かけられていて、1 / 2される前の値と合致するということはvalues内の値の2の倍数の個数が違う
                System.out.println(0);
                return;
            }
        }

        System.out.println((long)Math.ceil((double) m / (2 * lcm)));
    }

    private static long gcd(long a, long b) {
        long temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return b;
    }
}