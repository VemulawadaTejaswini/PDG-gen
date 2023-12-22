
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String s = scanner.next();
        final int length = s.length();

        int count = 0;
        for (int i = 0; i < (length + 1) / 2; i++) {
            if (s.charAt(i) == 'p') {
                count--;
            }
        }
        for (int i = (length + 1) / 2; i < length; i++) {
            if (s.charAt(i) == 'g') {
                count++;
            }
        }
        System.out.println(count);
    }
}
