import java.util.Scanner;

public class Main {

    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }

    private static long gcd(long m, long n) {
        long r;
        while (n > 0) {
            r = m % n;
            m = n;
            n = r;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] mn = new long[n];
        long u = 1;
        long max = 0;
        for (int i = 0; i < n; i++) {
            mn[i] = sc.nextLong();
            if (i == 0) {
                u = mn[0];
            } else {
                u = lcm(u, mn[i]);
            }
            max = (mn[i] > max) ? mn[i] : max;
        }

        boolean w = true;
        for (int i = 0; i < n; i++) {
            if (max % mn[i] != 0) {
                w = false;
                break;
            }
        }

        System.out.println(w ? max : u);
    }

}