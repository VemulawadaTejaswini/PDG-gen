import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private void replace(char[][] S, int H, int W, int ii, int jj) {
        if (S[ii][jj] == '#') {
            return;
        }

        char cnt = 0;
        for (int i = Math.max(ii - 1, 0); i <= Math.min(ii + 1, H - 1); i++) {
            for (int j = Math.max(jj - 1, 0); j <= Math.min(jj + 1, W - 1); j++) {
                if (S[i][j] == '#') {
                    cnt++;
                    continue;
                }
            }
        }
        cnt += '0';
        S[ii][jj] = cnt;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] S = new char[H][];

        for (int i = 0; i < H; i++) {
            S[i] = sc.next().toCharArray();
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                replace(S, H, W, i, j);
            }
        }

        for (int i = 0; i < H; i++) {
            System.out.println(S[i]);
        }

        return;
    }

}