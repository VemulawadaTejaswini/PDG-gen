import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        final int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < a.length; i++) {
            final int prev = a[(i + a.length - 1) % a.length];
            final int next = a[(i + a.length + 1) % a.length];

            if ((prev ^ next) != a[i]) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}