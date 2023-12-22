import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        
        // 上下左右
        int[] dx = new int[]{1, 0, -1, 0, 1, -1, 1, -1};
        int[] dy = new int[]{0, 1, 0, -1, 1, -1, -1, 1};
        
        char[][] board = new char[h][w];
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < w; j++) {
                board[i][j] = str.charAt(j);
            }
        }
        
        int[][] ans = new int[h][w];
        // スタート地点の全探索(BFS)
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (board[i][j] == '#') {
                    ans[i][j] = -1;
                    continue;
                }
                
                // 移動可能なら現在地までの距離+1を代入
                for (int k = 0; k < 8; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    
                    if (0 <= nx && nx < h && 0 <= ny && ny < w &&
                        board[nx][ny] == '#') {
                        ans[i][j]++;
                    }
                }
                
            }
        }
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (ans[i][j] == -1) {
                    System.out.print("#");
                } else {
                    System.out.print(ans[i][j]);
                }
                
                if (j == w - 1) {
                    System.out.println();
                }
            }
        }
    }
}