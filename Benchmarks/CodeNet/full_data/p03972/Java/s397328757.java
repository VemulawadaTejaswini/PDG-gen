
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by yufeng.fyf on 16/10/10.
 */
public class Main {
    private static String temple = "CODEFESTIVAL2016";
    private static int MAX = 100000001;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int w = input.nextInt();
        int h = input.nextInt();
        input.nextLine();
        int[] p = new int[w];
        int[] q = new int[h];
        char[][] visit = new char[w+1][h+1];

        for(int i=0;i<w;i++){
            p[i] = input.nextInt();
        }
        for(int i=0;i<h;i++){
            q[i] = input.nextInt();
        }
        int count=0;
        int all = (w+1)*(h+1);
        int allValue = 0;
        int i=0,j=0;
        Set<Point> visit_points = new HashSet<>();
        visit_points.add(new Point(0,0));
        while(count<all-1){
            int min = MAX;
            int i_temp=0,j_temp =0;
            Iterator<Point> it = visit_points.iterator();
            while (it.hasNext()) {
                visit[i][j]=1;
                Point point  = it.next();
                int a=MAX,b=MAX,c=MAX,d=MAX;
                 i = point.i;
                 j = point.j;
                //左
                if(i>0 && visit[i-1][j]==0){
                    a = p[i-1];
                    if(a<min){
                        min = a;
                        i_temp = i-1;
                        j_temp = j;
                    }
                }
                //右
                if(i<w && visit[i+1][j]==0){
                    b = p[i];
                    if(b<min){
                        min = b;
                        i_temp = i+1;
                        j_temp = j;
                    }
                }
                if(j>0&& visit[i][j-1]==0){
                    c = q[j-1];
                    if(c<min){
                        min = c;
                        i_temp = i;
                        j_temp = j-1;
                    }
                }
                if(j<h&& visit[i][j+1]==0){
                    d = q[j];
                    if(d<min){
                        min = d;
                        i_temp = i;
                        j_temp = j+1;
                    }
                }
            }
                allValue += min;
                i = i_temp;
                j = j_temp;
                visit_points.add(new Point(i,j));
                count++;
                System.out.println(i + " " + j);
        }
        System.out.println(allValue);
    }

}
class Point{
    public Point(int i, int j) {
        this.i = i;
        this.j = j;
    }
    int i;
    int j;
}
