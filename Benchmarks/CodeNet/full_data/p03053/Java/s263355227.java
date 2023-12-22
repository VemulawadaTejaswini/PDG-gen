import java.util.*;

import static java.lang.System.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int[][] A = new int[1000][1000];

    public static void main(String[] args) {
        int H = ni();
        int W = ni();

        for (int h = 0; h < H; h++) {
            for (int w = 0; w < W; w++) {
                A[h][w] = -1;
            }
        }

        for (int h = 0; h < H; h++) {
            String astr = sc.next();
            for (int w = 0; w < W; w++) {
                if (astr.charAt(w) == '#') {
                    A[h][w] = 0;
                }
            }
        }

        // 2回累積和
        accum(H, W);
        accum(H, W);

        int ans = 0;
        for (int h = 0; h < H; h++) {
            for (int w = 0; w < W; w++) {
                ans = Math.max(ans, A[h][w]);
            }
        }

        out.println(ans);
    }

    static void accum(int H, int W) {
        // 右
        for (int h = 0; h < H; h++) {
            for (int w = 0; w < W; w++) {
                if (A[h][w] != -1) {
                    while (++w < W) {
                        if (A[h][w] == -1) {
                            A[h][w] = A[h][w - 1] + 1;
                        } else if (A[h][w - 1] < A[h][w]) {
                            A[h][w] = A[h][w - 1] + 1;
                        } else {
                            w--;
                            break;
                        }
                    }
                }
            }
        }

        // 左
        for (int h = 0; h < H; h++) {
            for (int w = W - 1; w >= 0; w--) {
                if (A[h][w] != -1) {
                    while (--w >= 0) {
                        if (A[h][w] == -1) {
                            A[h][w] = A[h][w + 1] + 1;
                        } else if (A[h][w] < A[h][w + 1]) {
                            w++;
                            break;
                        } else {
                            A[h][w] = A[h][w + 1] + 1;
                        }
                    }
                }
            }
        }

        // 下
        for (int w = 0; w < W; w++) {
            for (int h = 0; h < H; h++) {
                if (A[h][w] != -1) {
                    while (++h < H) {
                        if (A[h][w] == -1) {
                            A[h][w] = A[h - 1][w] + 1;
                        } else if (A[h - 1][w] < A[h][w]) {
                            A[h][w] = A[h - 1][w] + 1;
                        } else {
                            h--;
                            break;
                        }
                    }
                }
            }
        }

        // 上
        for (int w = 0; w < W; w++) {
            for (int h = H - 1; h >= 0; h--) {
                if (A[h][w] != -1) {
                    while (--h >= 0) {
                        if (A[h][w] == -1) {
                            A[h][w] = A[h + 1][w] + 1;
                        } else if (A[h][w] < A[h + 1][w]) {
                            h++;
                            break;
                        } else {
                            A[h][w] = A[h + 1][w] + 1;
                        }
                    }
                }
            }
        }
    }

    static int ni() {
        return sc.nextInt();
    }

    static long nl() {
        return sc.nextLong();
    }

    static String ns() {
        return sc.next();
    }

    static int[] niarr(int N) {
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    static long[] nlarr(int N) {
        long[] a = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextLong();
        }
        return a;
    }
}