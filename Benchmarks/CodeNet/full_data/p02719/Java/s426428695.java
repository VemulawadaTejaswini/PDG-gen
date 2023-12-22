import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if (n >= k) {
            long t1 = n % k;
            long t2 = k - t1;
            System.out.println(Math.min(t1, t2));
            return;
        }
        long ans = Math.min(n, k - n);
        System.out.println(ans);
    }
}