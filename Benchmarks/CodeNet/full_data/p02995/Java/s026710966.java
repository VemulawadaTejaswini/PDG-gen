import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();
        long D = scanner.nextLong();

        long LCM = lcm(C, D);

        long C1 = A / C;
        if (A % C > 0) {
            C1++;
        }
        long C2 = B / C;

        long D1 = A / D;
        if (A % D > 0) {
            D1++;
        }
        long D2 = B / D;

        long LCM1 = A / LCM;
        if (A % LCM > 0) {
            LCM1++;
        }
        long LCM2 = B / LCM;

        System.out.println((B - A + 1) - ((C2-C1+1) + (D2-D1+1) - (LCM2-LCM1+1)));
    }

    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }

    private static long gcd(long m, long n) {
        if (m < n) {
            return gcd(n, m);
        }
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }
}