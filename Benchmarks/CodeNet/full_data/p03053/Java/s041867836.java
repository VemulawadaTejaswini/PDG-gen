import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int M = -1;
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] masu = new int[h + 2][w + 2];
        for (int i = 0; i < w + 2; i++) {
            masu[0][i] = M;
            masu[h + 1][i] = M;
        }
        for (int i = 0; i < h + 2; i++) {
            masu[i][0] = M;
            masu[i][w + 1] = M;
        }
        for (int i = 1; i < h + 1; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                char c = s.charAt(j);
                masu[i][j + 1] = (c == '.') ? M : 0;
            }
        }

        for (int k = 0; k < h * w; k++) {
            for (int i = 1; i < h + 1; i++) {
                for (int j = 1; j < w + 1; j++) {
                    if (masu[i][j] == k) {
                        if (masu[i - 1][j] == M) {
                            masu[i - 1][j] = masu[i][j] + 1;
                        }
                        if (masu[i][j + 1] == M) {
                            masu[i][j + 1] = masu[i][j] + 1;
                        }
                        if (masu[i][j - 1] == M) {
                            masu[i][j - 1] = masu[i][j] + 1;
                        }
                        if (masu[i + 1][j] == M) {
                            masu[i + 1][j] = masu[i][j] + 1;
                        }
                    }
                }
            }
        }

        int ans = 0;

        for (int i = 1; i < h + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                ans = Math.max(ans, masu[i][j]);
            }
        }

        System.out.println(ans);
        sc.close();
    }
}