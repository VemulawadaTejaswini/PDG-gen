
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int H=scanner.nextInt();
        final int W=scanner.nextInt();
        final Point startPoint=new Point(0,0);
        final Point goalPoint=new Point(H-1,W-1);
        final char[][] map=new char[H][W];
        final int[][] route=new int[H][W];
        int white=0;
        for(int i=0;i<H;i++){
            String line=scanner.next();
            for(int j=0;j<W;j++){
                map[i][j]=line.charAt(j);
                if(map[i][j]=='.') white++;
            }
        }
        Deque<Point> shouldSearchPoints=new ArrayDeque<>();
        shouldSearchPoints.addLast(startPoint);
        while(shouldSearchPoints.size()>0){
            Point currentSearchPoint=shouldSearchPoints.removeFirst();
            int x=currentSearchPoint.x;
            int y=currentSearchPoint.y;
            int currentRouteCount=route[currentSearchPoint.x][currentSearchPoint.y];
            List<Point> nearPoint=new ArrayList<>();
            nearPoint.add(new Point(x,y+1));
            nearPoint.add(new Point(x,y-1));
            nearPoint.add(new Point(x+1,y));
            nearPoint.add(new Point(x-1,y));
            List<Point> nextPoints=nearPoint.stream().filter(point -> {
                if(point.x<0||point.x>=H||point.y<0||point.y>=W){
                    return false;
                }
                if(map[point.x][point.y]=='#'||(point.x==startPoint.x&&point.y==startPoint.y)||route[point.x][point.y]!=0){
                    return false;
                }
                return true;
            }).collect(Collectors.toList());
            nextPoints.forEach(point -> {
                if(route[point.x][point.y]==0){
                    route[point.x][point.y]=currentRouteCount+1;
                }
            });
            shouldSearchPoints.addAll(nextPoints);
            if(route[goalPoint.x][goalPoint.y]!=0){
                System.out.println(white-route[goalPoint.x][goalPoint.y]-1);
                return;
            }
        }
        System.out.println(-1);


    }
}
class Point{
    final int x;
    final int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}