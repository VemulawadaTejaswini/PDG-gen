
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final String s = scanner.next();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            final int a = s.charAt(i) - '0';
            sum += (i % 2 == 0 ? a : -a);
        }

        if (sum < 0) {
            sum = -sum - 1;
        }

        System.out.println(sum % 3);
    }
}
