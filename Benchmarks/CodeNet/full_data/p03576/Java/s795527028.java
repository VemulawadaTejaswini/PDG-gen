import java.util.*;
import java.lang.*;

class Pair<E,F>{
    E first;
    F second;
    public Pair(E first, F second){
        this.first=first;
        this.second=second;
    }
    public E getFirst(){return first;}
    public F getSecond(){return second;}
    public String toString(){
        return "<"+first.toString()+","+second.toString()+">";
    }
    public int hashCode(){
        return first.hashCode()*30011+second.hashCode()+2;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pair another = (Pair) obj;
        return this.getFirst().equals(another.getFirst())&&this.getSecond().equals(another.getSecond());
    }
}

class Point extends Pair<Long,Long>{
    public Point(long x, long y){
        super(x,y);
    }
    public boolean contains(long xMin, long xMax, long yMin, long yMax){ //all inclusive
        return this.first >= xMin && this.first <=xMax && this.second>=yMin && this.second<=yMax;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Point[] point = new Point[N];
        Set<Long> xEdges = new HashSet<>(), yEdges = new HashSet<>();
        for(int n=0; n<N; n++){
            long x = sc.nextLong(), y = sc.nextLong();
            point[n] = new Point(x,y);
            xEdges.add(x);
            yEdges.add(y);
        }

        long ans = Long.MAX_VALUE;
        for(long xMin:xEdges) for(long xMax:xEdges){
            if(xMax<xMin) continue;
            for(long yMin:yEdges) for(long yMax:yEdges){
                if(yMax<yMin) continue;
                int inner = 0;
                for(int n=0; n<N; n++) if(point[n].contains(xMin,xMax, yMin, yMax)) inner++;
                if(inner>=K) ans = Math.min(ans, (xMax-xMin)*(yMax-yMin));
            }
        }
        System.out.println(ans);
    }
}
