import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if (n % k == 0) {
            System.out.println(0);
            return;
        }
        if (n > k) {
            long m = n / k;
            long t1 = Math.abs(n - m * k);
            long t2 = Math.abs(n - (m + 1) * k);
            if (t1 < t2) {
                System.out.println(t1);
            } else {
                System.out.println(t2);
            }
            return;
        }
        long ans = Math.min(n - k, k - n);
        System.out.println(ans);
    }
}
