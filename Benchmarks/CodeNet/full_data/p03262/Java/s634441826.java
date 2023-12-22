import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long X = sc.nextLong();
        long[] x = new long[N + 1];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextLong();
        }
        x[N] = X;
        Arrays.sort(x);
        Set<Long> set = new HashSet<>();
        for (int i = 1; i <= N; i++) {
            set.add(x[i] - x[i - 1]);
        }
        List<Long> list = new ArrayList<>(set);
        long ans = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            ans = gcd(ans, list.get(i));
        }
        System.out.println(ans);
    }

}
