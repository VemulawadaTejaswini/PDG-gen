
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        scanner.nextLine();
        final String s = scanner.nextLine();
        final String t = scanner.nextLine();

        final int gcd = getGCD(n, m);

        for(int i = 0;i < gcd;i++){
            final char a = s.charAt(i * n / gcd);
            final char b = t.charAt(i * m / gcd);

            if(a != b){
                System.out.println(-1);
                throw new RuntimeException();
            }
        }

        final int lcm = n * m / gcd;
        System.out.println(lcm);
    }

    private static int getGCD(final int a, final int b) {
        if (b > a) {
            return getGCD(b, a);
        }

        if (b == 0) {
            return a;
        }

        return getGCD(b, a % b);
    }
}
