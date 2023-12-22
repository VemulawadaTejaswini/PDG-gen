import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt() - 1;
        int y = sc.nextInt() - 1;
        
        // dist[i][j] = 点i→jの直接距離
        // i→jとj→iの距離が同じとは限らない
        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = Math.abs(j-i);
            }
        }
        
        dist[x][y] = 1;
        
        // 「ワーシャルフロイド法」
        // 3つの頂点i, j, kを選んで、
        // i→k→jという道がi→jという道より短ければi→jの距離を更新する
        for (int k = 0; k < n; k++) {  // 経由点kは必ず一番外側のループ
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
        
        int[] hindo = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                hindo[dist[i][j]]++;
            }
        }
        
        for (int i = 1; i < n; i++) {
            System.out.println(hindo[i]);
        }
    }
}