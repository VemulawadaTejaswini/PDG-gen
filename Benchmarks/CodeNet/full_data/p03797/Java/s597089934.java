import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long m = scanner.nextInt();
        if (n >= m / 2) {
            System.out.println(n);
        } else {
            m -= 2 * n;
            m = (m - m % 4) / 4;
            System.out.println(n + m);
        }

    }
}
