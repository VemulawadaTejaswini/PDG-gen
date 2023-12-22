import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] org = new long[n];
        long oneTime = (long)n * (n + 1) / 2;
        long total = 0;
        for (int i = 0; i < n; i++) {
            org[i] = sc.nextInt();
            total += org[i];
        }
        if (total % oneTime != 0) {
            System.out.println("NO");
            return;
        }
        long count = total / oneTime;
        for (int i = 0; i < n; i++) {
            long target = org[(i + 1) % n] - org[i] - count;
            if (target % n != 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
