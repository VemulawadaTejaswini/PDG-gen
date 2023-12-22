import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    // int N = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int H = scanner.nextInt(), W = scanner.nextInt(), N = scanner.nextInt();
        scanner.nextLine();
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        StringBuilder sb = new StringBuilder();
        boolean reverse = false;
        int index = 0;
        while (index < a.length) {
            while (sb.length() < 2 * W && a[index] > 0) {
                sb.append(index + 1);
                sb.append(' ');
                a[index]--;
            }
            if (sb.length() == 2 * W) {
                if (reverse) {
                    sb.reverse();
                }
                System.out.println(sb.toString().trim());
                sb = new StringBuilder();
                reverse = !reverse;
            }
            if (a[index] == 0) {
                index++;
            }
        }
    }

}