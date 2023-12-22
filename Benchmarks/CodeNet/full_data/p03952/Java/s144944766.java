import java.util.stream.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        if (n != x) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            IntStream.range(1, 2 * n).forEach(System.out::println);
        }
    }
}