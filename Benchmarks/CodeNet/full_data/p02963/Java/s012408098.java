
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        long a, b, c, d;
        a=d=mysqrt(s);
        long tmp = a * a - s;
        if (tmp == 1) {
            System.out.println(0 + " " + 0 + " " + a + " " + 1 + " " + 1 + " " + d);
            return;
        } else if (tmp == 0) {
            System.out.println(0 + " " + 0 + " " + a + " " + 0 + " " + 0 + " " + d);
            return;
        }
        for (long i = 2; i <= Math.sqrt(tmp) + 1; i++) {
            if (tmp % i == 0) {
                b = i;
                c = tmp / i;
                System.out.println(0 + " " + 0 + " " + a + " " + b + " " + c + " " + d);
                return;
            }
        }
        d -= 1;
        tmp -= a;
        b = 1;
        c = tmp;
        System.out.println(0 + " " + 0 + " " + a + " " + b + " " + c + " " + d);
    }

    static long mysqrt(long s) {
        long ans = (long) Math.sqrt(s) - 3;
        while (ans * ans < s || ans < 0) {
            ans++;
        }
        return ans;

    }
}
