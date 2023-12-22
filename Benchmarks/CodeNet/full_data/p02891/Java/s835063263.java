
import java.util.Scanner;

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
            final char a = line.charAt(0);
            int i;
            for (i = 1; i < line.length(); i++) {
                if (line.charAt(i) != a) {
                    break;
                }
            }

            final char b = line.charAt(line.length() - 1);
            int j;
            for (j = 1; j < line.length(); j++) {
                if (line.charAt(line.length() - 1 - j) != b) {
                    break;
                }
            }

            addition = (k - 1) * ((long) Math.floor((i + j) / 2) - (long) Math.floor(i / 2) - (long) Math.floor(j / 2));
        }


        System.out.println(cost * k + addition);
    }
}
