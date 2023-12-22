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
        int n = Integer.parseInt(sc.next());
        ArrayList<Point> array = new ArrayList<Point>();
        int x,y;
        for(int i=0;i<n;i++){
            x = Integer.parseInt(sc.next());
            y = Integer.parseInt(sc.next());
            array.add(new Point(x,y));
        }
        sc.close();
        array.sort((a,b) -> a.x - b.x);
        ArrayList<Point> diffs = new ArrayList<Point>();
        int len = 0;
        for(int i=0;i<n;i++){
            int ix = array.get(i).x;
            int iy = array.get(i).y;
            for(int j=i+1;j<n;j++){
                int jx = array.get(j).x;
                int jy = array.get(j).y;
                diffs.add(new Point(jx-ix, jy-iy));
                len++;
            }
        }
        diffs.sort((a,b) -> a.x - b.x);
        int count = 1;
        int max = 0;
        for(int i=1;i<len;i++){
            Point pa = diffs.get(i);
            Point pb = diffs.get(i-1);
            if(pa.x==pb.x && pa.y==pb.y){
                count++;
            }else{
                if(max < count){
                    max = count;
                }
                count = 1;
            }
        }
      	if(n==1){
          System.out.println(1);
        }else{
          System.out.println(n - max);
        }
    }
}