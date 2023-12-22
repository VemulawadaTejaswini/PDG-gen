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
        int H = scanner.nextInt(), W = scanner.nextInt();
        scanner.nextLine();
        int[][] table = new int[H][W];
        for (int i = 0; i < H; i++) {
            table[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        long cnt = 0L;
        for (int i = 0; i < H; i++) {
            for (int j = 1; j < W; j++) {
                table[i][j] += table[i][j - 1];
                cnt += table[i][j - 1];
            }
        }
        for (int i = 1; i < H; i++) {
            table[i][W - 1] += table[i - 1][W - 1];
            cnt += table[i - 1][W - 1];
        }

        System.out.println(cnt);
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W - 1; j++) {
                for (int k = 0; k < table[i][j]; k++) {
                    System.out.printf("%d %d %d %d\n", i + 1, j + 1, i + 1, j + 2);
                }
            }
        }
        for (int i = 0; i < H - 1; i++) {
            for (int k = 0; k < table[i][W - 1]; k++) {
                System.out.printf("%d %d %d %d\n", i + 1, W - 1, i + 2, W - 1);
            }
        }
    }

}
