import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }


    // int N = Integer.parseInt(scanner.nextLine());
    // int N = scanner.nextInt(), M = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.nextLine());
        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        TreeSet<Integer> added = new TreeSet<>();
        for (int i = n.length - 1; i >= 0; i--) {
            int sum = 0;
            for (int b: added) {
                if (b % (i + 1) == 0) {
                    sum++;
                }
            }
            if (n[i] == 1) {
                if (sum % 2 == 0) {
                    added.add(i + 1);
                }
            } else {
                if (sum % 2 == 1) {
                    added.add(i + 1);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (added.contains(i + 1)) {
                sb.append(1);
            } else {
                sb.append(0);
            }
            sb.append(' ');
        }
        System.out.println(sb.toString().trim());
    }

}
