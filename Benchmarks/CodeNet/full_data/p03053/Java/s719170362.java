import java.util.*;

import com.sun.javafx.scene.paint.GradientUtils.Point;

import static java.lang.Math.*;

import java.awt.SystemTray;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dx[] = {0, 1, 0, -1};
        int dy[] = {1, 0, -1, 0};

        int h = sc.nextInt();
        int w = sc.nextInt();
        char map[][] = new char[h][w];
        int a[][] = new int[h][w];
        int INF = Integer.MAX_VALUE;
        for(int[] n: a){
            Arrays.fill(n,INF);
        }
        Queue<Point> queue = new ArrayDeque<>();
        for(int i = 0; i < h; i++){
            map[i] = sc.next().toCharArray();
            for(int j=0; j<w; j++){
                if(map[i][j] == '#'){
                queue.add(new Point(i, j));
                a[i][j] = 0;
                }
            }
        }
        int memo = 0;
        while(!queue.isEmpty()){
            Point p = queue.poll();
            for(int k=0; k<4; k++){
                int X = p.x + dx[k];
                int Y = p.y + dy[k];
                if(X>=0 && X<h && Y>=0 && Y<w && a[X][Y]==INF){
                    a[X][Y] = a[p.x][p.y] + 1;
                    queue.add(new Point(X,Y));
                    memo = a[X][Y];
                }
            }
        }
        System.out.println(memo);
    }

}
