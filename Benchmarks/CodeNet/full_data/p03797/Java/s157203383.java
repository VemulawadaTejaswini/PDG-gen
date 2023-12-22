
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long all = scanner.nextLong() * 2L + scanner.nextLong();
        System.out.println(all / 4);
    }
}
