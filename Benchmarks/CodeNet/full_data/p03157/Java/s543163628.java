import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        char[][] f=new char[h][w];
        for (int i = 0; i < h; i++) {
            String t=sc.next();
            for (int j = 0; j < w; j++) {
                f[i][j]=t.charAt(j);
            }
        }
        long ans=0;
        int[] dx={-1,0,1,0};
        int[] dy={0,-1,0,1};
        int[][] node=new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if(node[i][j]==0) {
                    Queue<Point> q = new ArrayDeque<>();
                    if(f[i][j]=='#'){
                        q.add(new Point(i, j));
                        node[i][j]++;
                    }
                    long tempW = 0, tempB = 0;
                    while (!q.isEmpty()) {
                        Point p = q.poll();
                        if (f[p.x][p.y] == '.') tempW++;
                        else tempB++;
                        for (int k = 0; k < 4; k++) {
                            int x = p.x + dx[k];
                            int y = p.y + dy[k];
                            if (0 <= x && x < h && 0 <= y && y < w) {
                                if (node[x][y] == 0 && f[p.x][p.y] != f[x][y]) {
                                    q.add(new Point(x, y));
                                    node[x][y]++;
                                }
                            }
                        }
                    }
                    ans += tempB * tempW;
                }
            }
        }
        out.println(ans);
    }
}
