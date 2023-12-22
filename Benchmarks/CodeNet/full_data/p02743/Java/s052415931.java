
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long a = scanner.nextInt();
        final long b = scanner.nextInt();
        final long c = scanner.nextInt();

        if (2 * Math.sqrt(a * b) < c - a - b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
