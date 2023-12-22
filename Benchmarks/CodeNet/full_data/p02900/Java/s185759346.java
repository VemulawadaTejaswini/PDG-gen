import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        sc.close();
        long c = gcd(a, b);
        int d = 0;
        for (int i = 2 ; i <= Math.sqrt(c) ; i++) {
            if (c % i == 0) {
                d++;
                while (c % i == 0) {
                    c /= i;
                }
            }
        }
        if (c > 1) d++;

        System.out.println(d + 1);


    }

    static long gcd(long a, long b) {
        if (a < b) return gcd(b, a);
        if (b == 0) return a;
        return gcd(b, a % b);
    }

}
