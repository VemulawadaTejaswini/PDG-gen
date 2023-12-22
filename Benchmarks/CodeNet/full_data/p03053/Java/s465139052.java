import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Queue;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        char[][] grid = new char[h][w];

        for (int i=0; i<h; i++){
            String s = sc.next();
            grid[i] = s.toCharArray();
        }

        boolean[][] visited = new boolean[h][w];

        for (int i=0; i<h; i++){
            for (int j=0; j<w; j++){
                if (grid[i][j]=='#'){
                    visited[i][j] = true;
                }
            }
        }

        int[][] d = new int[h][w];

        long ans = 0;

        Queue<int[]> q = new ArrayDeque();

        int[] arr = {0, 0};

        for (int i=0; i<h; i++){
            for (int j=0; j<w; j++){
                if (grid[i][j]=='#'){
                    d[i][j] = 0;
                    int[] a = {i, j};
                    q.add(a);
                }
            }
        }
//        System.out.println(q.size());

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        while (!q.isEmpty()){
            int[] tmp = q.poll();
            int y = tmp[0];
//            System.out.print(y);
            int x = tmp[1];
//            System.out.println(x);
            int cnt = d[y][x];
            for (int i=0; i<4; i++){
                if (0<=y+dy[i] && y+dy[i]<=h-1 && 0<=x+dx[i] && x+dx[i]<=w-1){
                    if (!visited[y+dy[i]][x+dx[i]] ){
                        visited[y+dy[i]][x+dx[i]] = true;
                        int[] add = {y+dy[i], x+dx[i]};
                        q.add(add);
                        d[y+dy[i]][x+dx[i]] = cnt+1;
//                        System.out.println(d[y+dy[i]][x+dx[i]]);
                    }
                }
            }
        }

        for (int i=0; i<h; i++){
            for (int j=0; j<w-1; j++){
//                System.out.print(d[i][j]);
            }
//            System.out.println(d[i][w-1]);
        }

        for (int i=0; i<h; i++){
            for (int j=0; j<w; j++){
                ans = Math.max(ans, d[i][j]);
            }
        }
        System.out.println(ans);


    }
}