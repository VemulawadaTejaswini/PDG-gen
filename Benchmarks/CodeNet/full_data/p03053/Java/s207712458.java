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

        // fin input

        // 実装2つめ
        for (int i = 1; i < h + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                // 横に伸ばす
                if (masu[i][j] == 0) {
                    for (int k = 1; k < w + 1; k++) {
                        if (k == j) {
                            continue;
                        } else {
                            if (masu[i][k] == M) {
                                masu[i][k] = Math.abs(j - k);
                            } else {
                                masu[i][k] = Math.min(masu[i][k], Math.abs(j - k));
                            }
                        }
                    }
                }
            }
        }

        // 縦方向操作
        for (int i = 1; i < h + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (masu[i][j] == M) {
                    continue;
                }
                for (int k = 1; k < h + 1; k++) {

                    if (k == i) {
                        continue;
                    } else {
                        if (masu[k][j] == M) {
                            masu[k][j] = masu[i][j] + Math.abs(i - k);
                        } else {
                            masu[k][j] = Math.min(masu[k][j], masu[i][j] + Math.abs(k - i));
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