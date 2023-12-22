import java.util.*;
import java.util.function.ToDoubleFunction;


public class Main {
    private static final String ex = "3\n" +
            "4\n" +
            "2";

    public static void main(String[] args) {
        solve(new Scanner(System.in));
//        solve(new Scanner(ex));
    }

    private static void solve(Scanner scanner) {
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        System.out.println((a + b) * h / 2);
    }
}
