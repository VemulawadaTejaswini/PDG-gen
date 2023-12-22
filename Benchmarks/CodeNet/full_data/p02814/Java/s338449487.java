import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long m = sc.nextLong();
        ArrayList<Long> list = new ArrayList<>();
        long gcd = sc.nextLong() / 2;
        list.add(gcd);

        long ni = 1;

        long niValue = gcd;
        while (niValue % 2 == 0) {
            ni *= 2;
            niValue /= 2;
        }
        long ni2 = ni * 2;
        for (int i = 1; i < n; i++) {
            long value = sc.nextLong() / 2;
            if (list.contains(value)) {
                continue;
            }
            // 2の個数チェック
            if (value % ni != 0 || value % ni2 == 0) {
                System.out.println(0);
                return;
            }
            list.add(value);
            gcd = gcd(gcd, value);
        }

        double lcm = 1;
        double standard = (double)1 / m;
        for (Long aLong : list) {
            lcm *= 1.0 / aLong;
            if (lcm * gcd < standard) {
                System.out.println(0);
                return;
            }
        }

        lcm *= gcd;
        double ans = m * lcm;

        System.out.println((long)Math.ceil(ans / 2));
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
