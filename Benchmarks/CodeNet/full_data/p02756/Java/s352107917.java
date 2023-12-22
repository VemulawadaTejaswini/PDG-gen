
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        StringBuilder s = new StringBuilder(scanner.next());
        final int q = scanner.nextInt();

        boolean flag = true;
        for (int i = 0; i < q; i++) {
            final int query = scanner.nextInt();
            if (query == 1) {
                flag = !flag;
                continue;
            }

            final boolean f = scanner.nextInt() == 1;
            final String c = scanner.next();

            if (flag ^ f) {
                s.insert(0, c);
            } else {
                s.append(c);
            }

        }

        if (flag) {
            System.out.println(s.reverse());
        } else {
            System.out.println(s);
        }
    }
}
