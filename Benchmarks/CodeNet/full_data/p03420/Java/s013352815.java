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
        int N = scanner.nextInt(), K = scanner.nextInt();
        scanner.nextLine();

        long ans = 0;
        for (int b = 1; b <= N; b++) {
            int rep = (N / b) * Math.max(b - K, 0);
            int rem = Math.max((N % b) - K + 1, 0);
            int a0 = (rep > 0 || rem > 0) && K == 0 ? -1 : 0;
            ans += rep + rem + a0;
        }
        System.out.println(ans);
    }

}