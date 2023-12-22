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

        for (int i = 1; i < n; i++) {
            long value = sc.nextLong() / 2;
            if (list.contains(value)) {
                continue;
            }
            list.add(value);
            gcd = gcd(gcd, value);
        }

        double lcm = 1;
        for (Long aLong : list) {
            lcm *= 1.0 / aLong;
        }
        double ans;

        if (lcm < (double) 1 / m) {
            ans = 0;
        } else {
            lcm *= gcd;
            ans = m * lcm;
        }

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
