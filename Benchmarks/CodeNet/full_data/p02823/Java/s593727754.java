import java.math.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        long a;
        long b;
        n = sc.nextLong();
        a = sc.nextLong();
        b = sc.nextLong();
        long ans = 0;
        if ((b - a) % 2 == 1) {
            ans = Math.min(Math.max(a - 1, n - a), Math.max(b - 1, n - b));
        } else
            ans = (b - a) / 2;
        System.out.println(ans);
    }
}
