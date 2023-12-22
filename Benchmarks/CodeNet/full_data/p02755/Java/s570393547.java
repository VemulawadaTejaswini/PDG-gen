import java.util.Scanner;

public class Main {
    static long n;
    static long a;
    static long b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextLong();
        b = sc.nextLong();
        long ax = a * 100 / 8; //25
        long bx = b * 100 / 10; //20
        boolean ok = false;
        long ans = 0;
        if (ax == bx) {
            ans = ax;
            ok = true;
        } else if (ax > bx) {
            if (ax*1/10 == b) {
                ans = ax;
                ok = true;

            }
        } else if (ax < bx) {
            if (bx*8/100 == a) {
                ans = bx;
                ok = true;

            }
        }
        System.out.println(ok?ans:-1);
    }
}