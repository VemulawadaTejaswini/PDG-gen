import java.util.Scanner;

public class Main {

    private static final int MOD = 1_000_000_007;

    private static int H;
    private static int W;

    private static char[][] S;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        H = sc.nextInt();
        W = sc.nextInt();

        S = new char[H][W];

        for (int i = 0; i < H; i++) {
            S[i] = sc.next().toCharArray();
        }

        int[][] left = new int[H][W];
        int[][] right = new int[H][W];
        int[][] up = new int[H][W];
        int[][] down = new int[H][W];


        for (int i = 0; i < H; i++) {
            int cnt = 0;
            for (int j = W - 1; j >= 0; j--) {
                if (S[i][j] == '#') {
                    cnt = 0;
                } else {
                    cnt++;
                }

                left[i][j] = cnt;
            }
        }
        for (int i = 0; i < H; i++) {
            int cnt = 0;
            for (int j = 0; j < W; j++) {
                if (S[i][j] == '#') {
                    cnt = 0;
                } else {
                    cnt++;
                }

                right[i][j] = cnt;
            }
        }
        for (int j = 0; j < W; j++) {
            int cnt = 0;
            for (int i = H - 1; i >= 0; i--) {
                if (S[i][j] == '#') {
                    cnt = 0;
                } else {
                    cnt++;
                }

                up[i][j] = cnt;
            }
        }
        for (int j = 0; j < W; j++) {
            int cnt = 0;
            for (int i = 0; i < H; i++) {
                if (S[i][j] == '#') {
                    cnt = 0;
                } else {
                    cnt++;
                }

                down[i][j] = cnt;
            }
        }

        int max = 0;

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                max = Math.max(max, left[i][j] + right[i][j] + up[i][j] + down[i][j] - 3);
            }
        }

        System.out.println(max);
    }

}
