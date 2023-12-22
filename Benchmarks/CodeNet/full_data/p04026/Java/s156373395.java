import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    // int N = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        String s = scanner.nextLine();
        if (s.charAt(0) == s.charAt(1)) {
            System.out.printf("%d %d\n", 1, 2);
            return;
        }
        for (int i = 0; i < s.length() - 2; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);
            char c3 = s.charAt(i + 2);
            if (c1 == c2 || c1 == c3 || c2 == c3) {
                System.out.printf("%d %d\n", i + 1, i + 3);
                return;
            }
        }
        System.out.printf("%d %d\n", -1, -1);
    }

}
