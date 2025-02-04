import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        Set<Long> s = new HashSet<>();

        long min = n;
        while (!s.contains(n)) {
            if (n % k == 0) {
                min = 0;
                break;
            }

            if (n > k) n /= k;

            s.add(n);
            n = Math.abs(n - k);
            min = Math.min(min, n);
        }

        System.out.println(min);
    }
}