import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[][] A = new int[3][3];
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    A[r][c] = sc.nextInt();
                }
            }
            int N = sc.nextInt();
            int[] b = new int[N];
            for (int i = 0; i < N; i++) {
                b[i] = sc.nextInt();
            }

            boolean[][] used = new boolean[3][3];
            for (int i = 0; i < N; i++) {
                for (int r = 0; r < 3; r++) {
                    for (int c = 0; c < 3; c++) {
                        if (A[r][c] == b[i]) {
                            used[r][c] = true;
                        }
                    }
                }
            }

            boolean bingo = false;
            for (int r = 0; r < 3; r++) {
                bingo |= isBingoR(used, r);
            }
            for (int c = 0; c < 3; c++) {
                bingo |= isBingoC(used, c);
            }
            bingo |= isBingoUL(used);
            bingo |= isBingoUR(used);
            System.out.println(bingo ? "Yes" : "No");
        }
    }

    private static boolean isBingoR(boolean[][] used, int r) {
        for (int c = 0; c < 3; c++) {
            if (!used[r][c]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isBingoC(boolean[][] used, int c) {
        for (int r = 0; r < 3; r++) {
            if (!used[r][c]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isBingoUL(boolean[][] used) {
        return used[0][0] && used[1][1] && used[2][2];
    }

    private static boolean isBingoUR(boolean[][] used) {
        return used[0][2] && used[1][1] && used[2][0];
    }
}