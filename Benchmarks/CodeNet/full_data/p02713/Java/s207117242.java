import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int x = sc.nextInt();

        long ans = 0;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                for (int k = 1; k <= x; k++) {
                    ans += gcd(gcd(i, j), k);
                }
            }
        }

        System.out.println(ans);
    }

    private static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
