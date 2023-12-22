
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String line = scanner.nextLine();
        final long k = scanner.nextLong();

        long cost = 0;
        for (int i = 0; i < line.length() - 1; i++) {
            if (line.charAt(i) != line.charAt(i + 1)) {
                continue;
            }

            cost++;
            i++;
        }

        long addition = 0;
        if (line.charAt(0) == line.charAt(line.length() - 1)) {
            final char begin = line.charAt(0);
            int a;
            for (a = 1; a < line.length() && line.charAt(a) == begin; a++) ;

            final char end = line.charAt(line.length() - 1);
            int b;
            for (b = 1; b < line.length() && line.charAt(line.length() - 1 - b) == end; b++) ;

            addition = (k - 1) * ((a + b) / 2 - a / 2 - b / 2);
        }

        System.out.println(cost * k + addition);
    }
}
