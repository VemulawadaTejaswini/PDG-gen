import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long b = sc.nextLong();
        if (b == 0) {
            System.out.println(0);
            return;
        }
        long r = sc.nextLong();

        long x = N / (r + b);
        long ans = b * x;
        long mod = N % (r + b);
        if (mod == 0) {
            System.out.println(ans);
        }
        if (mod < b) {
            System.out.println(ans + mod);
        } else {
            System.out.println(ans + b);
        }


    }
}
