import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ySize = scanner.nextInt();
        int xSize = scanner.nextInt();
        scanner.nextLine();
        int[][] dp = new int[ySize][xSize];
        dp[0][0] = 1;

        for (int y = 0; y < ySize; ++y) {
            String line = scanner.nextLine();
            for (int x = 0; x < xSize; ++x) {
                if (line.charAt(x) == '.') {
                    if (x > 0) {
                        dp[y][x] += dp[y][x - 1];
                    }
                    if (y > 0) {
                        dp[y][x] += dp[y - 1][x];
                    }
                    dp[y][x] %= 1_000_000_007;
                }
            }
        }
        System.out.println(dp[ySize - 1][xSize - 1]);
    }
}
