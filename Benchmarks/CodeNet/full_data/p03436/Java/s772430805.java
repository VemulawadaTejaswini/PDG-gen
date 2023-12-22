import java.util.*;

class Point{
    int x; int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        char[][] maze = new char[h][w];
        int vacant = 0;
        for(int i=0;i<h;i++){
            maze[i] = sc.next().toCharArray();
            for(int j=0;j<w;j++){
                if(maze[i][j]=='.'){
                    vacant++;
                }
            }
        }
        sc.close();
        Deque<Point> points = new ArrayDeque<Point>();
        points.addLast(new Point(0,0));
        int[][] distance = new int[h][w];
        for(int i=0;i<h;i++){
            Arrays.fill(distance[i],h*w+1);
        }
        distance[0][0] = 0;
        while(points.getFirst() != null){
            Point p = points.removeFirst();
            int x = p.x; int y = p.y;
            maze[y][x] = '#';
            if(x==w-1 && y==h-1){
                break;
            }
            int[] dx = {-1,0,1,0}; int[] dy = {0,-1,0,1};
            for(int i=0;i<4;i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx==-1 || nx==w || ny==-1 || ny==h || maze[ny][nx]=='#' || distance[ny][nx] != h*w+1){
                    continue;
                }else{
                    points.addLast(new Point(nx,ny));
                    distance[ny][nx] = distance[y][x] + 1;
                }
            }
        }
        if(distance[h-1][w-1] == h*w+1){
            System.out.println(-1);
        }else{
            System.out.println(vacant - distance[h-1][w-1]-1);
        }
    }
}