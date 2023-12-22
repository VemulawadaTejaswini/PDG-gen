
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            final long a = sc.nextLong();
            final long b = sc.nextLong();
            final long c = sc.nextLong();
            final long d = sc.nextLong();
            long from = a - b;
            if (from < 0) {
                System.out.println("No");
                continue;
            }
            from = (from - c) % b + c;

            if (d >= b) {
                final long add = d % b;
                while (from <= c && add != 0) {
                    from += add;
                }
                if (add == 0 && from <= c) {
                    from += d;
                }
                if (from >= b) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        }
    }
}