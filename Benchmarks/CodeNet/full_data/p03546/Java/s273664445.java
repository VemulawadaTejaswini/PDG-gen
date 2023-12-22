import java.util.Scanner;

public class Main {

    private static int[][] c;
    private static int[] min;

    private static void dfs(int currentIdx, int sum, int startIdx) {
        for (int i = 0; i <= 9; i++) {
            if (i == currentIdx || sum + c[currentIdx][i] >= min[startIdx]) {
                continue;
            }
            if (i == 1) {
                min[startIdx] = Math.min(min[startIdx], sum + c[currentIdx][i]);
            }
            dfs(i, sum + c[currentIdx][i], startIdx);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        c = new int[10][10];
        int[][] a = new int[h][w];
        min = new int[10];
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                c[i][j] = sc.nextInt();
                if (j == 1) {
                    min[i] = c[i][j];
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <= 9; i++) {
            dfs(i, 0, i);
        }
        int ans = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (a[i][j] == -1 || a[i][j] == 1) {
                    continue;
                }
                ans += min[a[i][j]];
            }
        }
        System.out.println(ans);
    }

}
