
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long h = scanner.nextInt();
        final long w = scanner.nextInt();

        System.out.println((h * w + 1) / 2);
    }
}
