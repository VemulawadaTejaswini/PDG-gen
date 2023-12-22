import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int r = sc.nextInt();

        if (b == 0) {
            System.out.println(0);
        } else if (r == 0) {
            System.out.println(n);
        } else {
            int times = n / (b + r);
            int rev = n % (b + r);
            System.out.println(times * b + Math.min(rev, b));
        }
    }
}