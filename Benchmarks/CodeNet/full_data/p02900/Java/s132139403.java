
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        long tmp;
        while ((tmp = a % b) != 0) {
            a = b;
            b = tmp;
        }

        int count = 0;
        long c = b;
        for (int i = 2; i <= Math.sqrt(b); i++) {
            if (c % i == 0) {
                count++;
                while (c % 2 == 0) {
                    c /= i;
                }
            }
        }
        System.out.println(count + 1);
    }
}
