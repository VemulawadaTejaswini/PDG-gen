
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
        for (int i = 2; i <= b; i++) {
            if (b % i == 0) {
                count++;
                while (b % i == 0) {
                    b /= i;
                }
            }
        }
        System.out.println(count + 1);
    }
}
