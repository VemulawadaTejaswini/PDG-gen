import java.util.Scanner;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.nextLine();
        char[][] cake = new char[H][W];
        for (int i = 0; i < H; i++) {
            cake[i] = scanner.nextLine().toCharArray();
        }

        int[][] ans = new int[H][W];
        int id = 0;
        for (int i = 0; i < H; i++) {
            int left = -1;
            for (int j = 0; j < W; j++) {
                if (cake[i][j] == '#') {
                    left = j;
                    id++;
                }
                if (left >= 0) {
                    ans[i][j] = id;
                }
            }
            int right = -1;
            for (int j = W - 1; j >= 0; j--) {
                if (cake[i][j] == '#') {
                    right = j;
                }
                if (right >= 0 && ans[i][j] == 0) {
                    ans[i][j] = ans[i][right];
                }
            }
        }
        for (int i = 1; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (ans[i][j] == 0) {
                    ans[i][j] = ans[i - 1][j];
                }
            }
        }
        for (int i = H - 2; i >= 0; i--) {
            for (int j = 0; j < W; j++) {
                if (ans[i][j] == 0) {
                    ans[i][j] = ans[i + 1][j];
                }
            }
        }

        for (int i = 0; i < H; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < W; j++) {
                sb.append(ans[i][j]);
                sb.append(' ');
            }
            System.out.println(sb.toString().trim());
        }

    }

}

