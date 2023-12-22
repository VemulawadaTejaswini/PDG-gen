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
        int N = Integer.parseInt(scanner.nextLine());
        long ans = 0L;
        int rem = 0;
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            if (n > 0 && rem == 1) {
                ans++;
                n--;
            }
            ans += n / 2;
            rem = n % 2;
        }
        System.out.println(ans);
    }

}