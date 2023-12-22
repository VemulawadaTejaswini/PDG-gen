import java.util.*;
import java.io.*;

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
class Point extends Pair<Double,Double>{
    public Point(double x, double y){
        super(x,y);
    }
    public double distanceTo(Point another){
        double distX = Math.abs(this.getFirst()-another.getFirst());
        double distY = Math.abs(this.getSecond()-another.getSecond());
        return distX+distY;/*manhattan dist*/
        //return Math.sqrt(distX*distX+distY*distY);/*euclidean dist*/
        //return Math.max(distX,distY);/*chebyshev dist*/
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Point[] student = new Point[N];
        Point[] check = new Point[M];
        for(int n=0;n<N;n++) student[n] = new Point(sc.nextDouble(),sc.nextDouble());
        for(int m=0;m<M;m++) check[m] = new Point(sc.nextDouble(),sc.nextDouble());
        for(int n=0;n<N;n++){
        	int bestCheck = 0;
        	double bestDist = Double.POSITIVE_INFINITY;
        	for(int m=0;m<M;m++){
        	    if(student[n].distanceTo(check[m])<bestDist){
        	        bestDist = student[n].distanceTo(check[m]);
        	        bestCheck = m+1;
        	    }
        	}
        	System.out.println(bestCheck);
        }
    }
}