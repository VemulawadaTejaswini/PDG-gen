import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        
        // 上下左右
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};
        
        char[][] board = new char[h][w];
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < w; j++) {
                board[i][j] = str.charAt(j);
            }
        }
        
        Queue<int[]> que = new ArrayDeque<int[]>();
        que.add(new int[]{0, 0, 1});
        
        boolean[][] visited = new boolean[h][w];
        visited[0][0] = true;
        
        int steps = 1;
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int x = cur[0];
            int y = cur[1];
            int depth = cur[2];
            
            // 移動可能なら現在地までの距離+1を代入
            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                int ndepth = depth + 1;
                
                if (0 <= nx && nx < h && 0 <= ny && ny < w &&
                    board[nx][ny] == '.' && !visited[nx][ny]) {
                    que.add(new int[]{nx, ny, ndepth});
                    visited[nx][ny] = true;
                    
                    if (nx == h-1 && ny == w-1) steps = ndepth;
                }
            }
        }
        if (steps == 1) {
            System.out.println(-1);
            return;
        }
        
        int sharp = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (board[i][j] == '#') sharp++;
            }
        }
        
        System.out.println((h*w) - steps - sharp);
    }
}