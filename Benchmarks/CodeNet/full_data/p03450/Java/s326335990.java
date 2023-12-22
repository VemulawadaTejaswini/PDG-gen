
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        final int[] array = new int[n + 1];
        for (int i = 0; i < m; i++) {
            final int left = scanner.nextInt();
            final int right = scanner.nextInt();
            final int distance = scanner.nextInt();

            if (array[left] == 0) {
                array[left] = left;
            }

            if (array[right] == 0) {
                array[right] = array[left] + distance;
            } else {
                if (array[right] != array[left] + distance) {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}
