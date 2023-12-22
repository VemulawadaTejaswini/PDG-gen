import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt() - 1;
        int b = sc.nextInt() - 1;
        
        // dist[i][j] = 点i→jの直接距離
        // i→jとj→iの距離が同じとは限らない
        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = Math.abs(j - i);
            }
        }
        dist[a][b] = 1;
        dist[b][a] = 1;
        
        // 「ワーシャルフロイド法」
        // 3つの頂点i, j, kを選んで、
        // i→k→jという道がi→jという道より短ければi→jの距離を更新する
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = Math.min(dist[i][a] + dist[a][b] + dist[b][j], dist[i][b] + dist[b][a] + dist[a][j]);
                dist[i][j] = Math.min(dist[i][j], tmp);
            }
        }
        
        int[] array = new int[n];
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                array[dist[i][j]]++;
            }
        }
        for (int i = 1; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}