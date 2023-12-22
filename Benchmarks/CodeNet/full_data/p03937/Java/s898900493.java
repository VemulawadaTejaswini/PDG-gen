import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static char[][] ary;
    private static boolean[][] b;
    private static int h;
    private static int w;
    public static void main(String[] args) throws Exception {
        h = sc.nextInt();
        w = sc.nextInt();
        ary = new char[h][w];
        b = new boolean[h][w];
        for (int i = 0;i < h;i++) {
            String s = sc.next();
            for (int j = 0;j < w;j++) {
                ary[i][j] = s.charAt(j);
            }
        }
        
        if (move(0, 0)) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }
    
    private static boolean move(int x, int y) {
        b[x][y] = true;
        int[] dx = {0, -1, 0, 1};
        int[] dy = {-1, 0, 1, 0};
        
        for (int i = 0;i < 4;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (0<=nx&&nx<h&&0<=ny&&ny<w) {
                if (ary[nx][ny]=='#'&&!b[nx][ny]) {
                    if (i==0||i==1) {
                        return false;
                    } else {
                        return move(nx, ny);
                    }
                }
            }
        }
        
        return true;
    }
}
