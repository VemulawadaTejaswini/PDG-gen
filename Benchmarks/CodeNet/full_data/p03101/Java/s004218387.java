import java.util.Scanner;

public class Main {

    private void solve() {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();

        int[][] masu = new int[H][W];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < W; j++) {
                masu[i][j] = 1;
            }
        }
        for (int j = 0; j < w; j++) {
            for (int i = 0; i < H; i++) {
                masu[i][j] = 1;
            }
        }

        int ans = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (masu[i][j] == 0) {
                    ans++;
                }
            }
        }

        System.out.println(ans);

    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }

}
