
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        if (Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
