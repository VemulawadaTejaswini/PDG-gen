import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();
        int[][] xya = new int[n][3];
        for (int i = 0; i < n; i++) {
            xya[i][0] = sc.nextInt();
            xya[i][1] = sc.nextInt();
            xya[i][2] = sc.nextInt();
        }

        int ans = solve(w, h, n, xya);
        System.out.println(ans);
    }

    static int solve(int w, int h, int n, int[][] xya) {

        int INF = 999;
        int MINF = -999;

        int xMAX = MINF;
        int xMIN = INF;
        int yMAX = MINF;
        int yMIN = INF;
        for (int i = 0; i < n; i++) {
            int ptn = xya[i][2];

            // @formatter:off
            switch (ptn) {
                case 1: xMAX = Math.max(xya[i][0], xMAX); break;
                case 2: xMIN = Math.min(xya[i][0], xMIN); break;
                case 3: yMAX = Math.max(xya[i][1], yMAX); break;
                case 4: yMIN = Math.min(xya[i][1], yMIN); break;
            }
            // @formatter:on
        }

        // 操作のないクエリは0にして何もしない
        xMAX = xMAX == MINF ? 0 : xMAX;
        xMIN = xMIN == INF ? 0 : w - xMIN;
        yMAX = yMAX == MINF ? 0 : yMAX;
        yMIN = yMIN == INF ? 0 : h - yMIN;

        int x = w - xMAX - xMIN;
        int y = h - yMAX - yMIN;

        int ans = x * y;
        return ans > 0 ? ans : 0;
    }
}
