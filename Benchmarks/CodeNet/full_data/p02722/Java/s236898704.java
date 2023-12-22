import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        HashSet<Long> set = new HashSet<>();
        for (long i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                set.add(i);
                set.add(N / i);
            }
        }
        for (long i = 1; i * i <= N - 1; i++) {
            if ((N - 1) % i == 0) {
                set.add(i);
                set.add((N - 1) / i);
            }
        }
        int res = 0;
        for (long i : set) {
            if (i == 1) continue;
            long temp = N;
            while (temp % i == 0) {
                temp /= i;
            }
            temp %= i;
            if (temp == 1) res++;
        }
        System.out.println(res);
    }
}