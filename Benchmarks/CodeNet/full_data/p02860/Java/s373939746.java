import java.util.*;

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
    // long[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
    static void solve(Scanner scanner) {
        scanner.nextLine();
        String S = scanner.nextLine();
        if (S.length() % 2 == 1) {
            System.out.println("No");
            return;
        }
        String f = S.substring(0, S.length() / 2);
        String l = S.substring(S.length() / 2);
        System.out.println(f.equals(l) ? "Yes" : "No");
    }

}
