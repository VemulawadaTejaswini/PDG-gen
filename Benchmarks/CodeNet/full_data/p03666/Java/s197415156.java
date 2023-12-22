import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        long n = scanner.nextInt() - 1;
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long c = scanner.nextInt();
        long d = scanner.nextInt();
        for (long i = 0, j = n; i < n; i++, j--) {
            if (i * d - j * c >= Math.abs(a - b) && i * c - j * d <= Math.abs(a - b)) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}