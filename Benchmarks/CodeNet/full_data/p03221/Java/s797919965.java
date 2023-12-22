import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();

        // index(0-origin), prefecture(1-origin), year
        String[] orders = new String[m];
        for (int i = 0; i < m; i++) {
            int prefecture = scanner.nextInt();
            int year = scanner.nextInt();
            orders[i] = String.format("%06d", prefecture) + String.format("%10d", year) + String.format("%06d", i);
        }

        Arrays.sort(orders);

        String[] messages = new String[m];
        messages[Integer.parseInt(orders[0].substring(16))] = orders[0].substring(0, 6) + String.format("%06d", 1);
        int order = 1;
        for (int i = 1; i < m; i++) {
            if (!orders[i - 1].substring(0, 6).equals(orders[i].substring(0, 6))) {
                messages[Integer.parseInt(orders[i].substring(16))] = orders[i].substring(0, 6) + String.format("%06d", 1);
                order = 1;
            } else {
                messages[Integer.parseInt(orders[i].substring(16))] = orders[i].substring(0, 6) + String.format("%06d", ++order);
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.println(messages[i]);
        }
    }
}
