import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
//未完成
public class Main {
    public static void main(String[]$){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[] dx={0,1,1,0,-1,-1};
        int[] dy={1,0,-1,-1,0,1};
        int[][] grid=new int[n+1][n+1];
        for (int i = 0; i <= n; i++) {
            grid[i][0]=1;
            grid[0][i]=1;
            grid[n-i][i]=1;
        }
        Point s=new Point(x,0);
        int way=5;
        int ans=0;
        Point p=s;
        while(true){
            ans++;
            int X=p.x+dx[way],Y=p.y+dy[way];
            p=new Point(X,Y);
            if((p==s))break;
            out.println(p);
            out.println("way="+way);
            if(grid[X][Y]==1){
                switch(way){
                    case 0:
                        way=4;
                        break;
                    case 1:
                        way=3;
                        break;
                    case 2:
                        way=0;
                        break;
                    case 3:
                        way=5;
                        break;
                    case 4:
                        way=2;
                        break;
                    case 5:
                        way=1;
                        break;
                    default:
                        break;
                }
            }
            grid[X][Y]=1;
        }
        out.println(ans);
    }
}