import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        char[][] matrix = new char[h][w];
        for(int i=0;i<h;i++){
            matrix[i] = sc.next().toCharArray();
        }
        sc.close();
        int count=0;
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(matrix[i][j] == '#'){
                    continue;
                }
                int n = search(matrix, i, j, h, w);
                if(n > count){
                    count = n;
                }
            }
        }
        System.out.println(count);
    }
    public static int search(char[][] matrix, int y, int x, int h, int w){
        int[] dx = {-1,0,1,0}; int[] dy = {0,-1,0,1};
        Deque<Point> points = new ArrayDeque<Point>();
        points.addLast(new Point(x,y));
        int[][] distance = new int[h][w];
        for(int i=0;i<h;i++){
            Arrays.fill(distance[i],h*w+1);
        }
        int px = x; int py = y;
        while(true){
            try{
                Point p = points.removeFirst();
                x = p.x; y = p.y;
            }catch(NoSuchElementException e){
                break;
            }
            if(matrix[y][x] == '#'){
                break;
            }
            for(int i=0;i<4;i++){
                int nx = x + dx[i]; int ny = y + dy[i];
                if(ny<0 || ny>=h || nx<0 || nx>=w || distance[ny][nx] != h*w+1){
                    continue;
                }
                points.addLast(new Point(nx,ny));
            }
        }
        return (int)(Math.abs(px - x) + Math.abs(py - y));
    }
}
class Point{
    int x; int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}