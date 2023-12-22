import java.util.*;

// 解説を読んで実装
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();

        int[][] plane = new int[501][501];

        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            plane[r][l]++;
        }

        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = 0;

            for (int j = l; j <= r; j++) {
                for (int k = l; k <= r; k++) {
                    ans += plane[j][k];
                }
            }

            System.out.println(ans);
        }
    }
}
