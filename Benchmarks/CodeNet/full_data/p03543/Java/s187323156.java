import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        
        // dist[i][j] = 点i→jの直接距離
        // iとjを入れ替えても距離が同じとは限らない
        int[][] dist = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                dist[i][j] = sc.nextInt();
            }
        }
        
        // 「ワーシャルフロイド法」
        // 3つの頂点i, j, kを選んで、
        // i→k→jという道がi→jという道より短ければi→jの距離を更新する
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
        
        // ans = 全員が点1に集まるまでの距離
        long ans = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int p = sc.nextInt();
                if (p == -1 || p == 1) continue;
                ans += dist[p][1];
            }
        }
        System.out.println(ans);
    }
}