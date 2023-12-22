import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        Long a = kbd.nextLong();
        Long b = kbd.nextLong();
        Long c = kbd.nextLong();
        Long d = kbd.nextLong();

        Long ac = (long) Math.ceil(1.0 * a / c);
        Long bc = (long) Math.floor(1.0 * b / c);
        Long tempC = bc - ac + 1;

        Long ad = (long) Math.ceil(1.0 * a / d);
        Long bd = (long) Math.floor(1.0 * b / d);
        Long tempD = bd - ad + 1;

        Long lcm = lcm(c, d);
        Long lcmA = (long) Math.ceil(1.0 * a / lcm);
        Long lcmB = (long) Math.floor(1.0 * b / lcm);
        Long tempLcm = lcmB - lcmA + 1;
        Long not = (tempC + tempD) - tempLcm;
        System.out.println(b - a + 1 - not);
    }

    static Long lcm(Long m, Long n) {
        return m * n / gcd(m, n);
    }

    static Long gcd(Long m, Long n) {
        if (m < n)
            return gcd(n, m);
        if (n == 0)
            return m;
        return gcd(n, m % n);
    }
}