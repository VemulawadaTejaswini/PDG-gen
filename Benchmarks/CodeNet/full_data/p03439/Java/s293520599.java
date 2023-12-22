
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    private static final String VACANT = "Vacant";

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(0);
        final String initial = scanner.next();
        if (initial.equals(VACANT)) {
            System.out.println(0);
            return;
        }

        String previous = initial;
        int left = 0;
        int right = n - 1;
        while (true) {
            if (right - left <= 1) {
                System.out.println(right);
                return;
            }
            final int mid = (left + right) / 2;
            System.out.println(mid);
            System.out.flush();
            final String current = scanner.next();
            if ((mid - left) % 2 == 0) {
                if (previous.equals(current)) {
                    left = mid;
                } else {
                    right = mid;
                }
            } else {
                if (previous.equals(current)) {
                    right = mid;
                } else {
                    left = mid;
                }
            }
            previous = current;
        }
    }
}
