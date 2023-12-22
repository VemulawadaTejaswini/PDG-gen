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
        int N = scanner.nextInt();
        long X = scanner.nextLong();
        scanner.nextLine();
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        long[][] min = new long[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(min[i], Long.MAX_VALUE / 2);
            min[i][i] = a[i];
        }
        for (int i = 1; i < N; i++) {
            for (int l = 0; l < N; l++) {
                min[l][Math.floorMod(l + i, N)] = Math.min(min[l][Math.floorMod(l + i - 1, N)], a[Math.floorMod(l + i, N)]);
            }
        }

        long ans = Long.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            long tmp = i * X;
            for (int j = 0; j < N; j++) {
                tmp += min[Math.floorMod(j - i, N)][j];
            }
            ans = Math.min(ans, tmp);
        }
        System.out.println(ans);
    }

}