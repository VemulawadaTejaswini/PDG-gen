import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();

        Set<Long> set = new HashSet<>();

        for (long i = 1; i <= (long) Math.sqrt(M) + 2; i++) {
            if (M % i == 0) {
                set.add(i);
                set.add(M / i);
            }
        }

        long ret = Long.MIN_VALUE;

        for (long val : set) {
            if (val * N <= M) ret = Math.max(ret, val);
        }

        System.out.println(ret);
    }
}