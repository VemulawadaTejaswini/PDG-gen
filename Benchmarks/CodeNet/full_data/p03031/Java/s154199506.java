import java.util.Scanner;

class Main {

    public static int ans = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        boolean[][] con = new boolean[M][N];
        for (int i = 0; i < M; i++) {
            int len = scanner.nextInt();
            for (int j = 0; j < len; j++) {
                con[i][scanner.nextInt() - 1] = true;
            }
        }
        int[] p = new int[M];
        for (int i = 0; i < M; i++) {
            p[i] = scanner.nextInt();
        }
        dfs(0, 0, N, M, con, p);
        System.out.println(ans);

    }

    public static void dfs(int i, int s, int N, int M, boolean[][] con, int[] p) {
        if (i == N) {
            boolean flag = true;
            for (int l = 0; l < M; l++) {
                int cnt = 0;
                for (int j = 0; j < N; j++) {
                    if ((s >> j & 1) == 1 && con[l][j]) {
                        cnt++;
                    }
                }
                if (cnt % 2 != p[l]) {
                    flag = false;
                }
            }
            if (flag) {
                ans++;
            }
        } else {
            dfs(i + 1, s | 1 << i, N, M, con, p);
            dfs(i + 1, s, N, M, con, p);
        }
    }

}
