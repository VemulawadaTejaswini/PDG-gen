import java.util.*;
import java.lang.*;
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

class Point extends Pair<Integer,Integer>{
    public Point(int x, int y){
        super(x,y);
    }
}

class Operation{
    int oldX, oldY, newX, newY;
    public Operation(int oldX, int oldY, int newX, int newY){
        this.oldX = oldX;
        this.oldY = oldY;
        this.newX = newX;
        this.newY = newY;
    }
    public Operation(Point oldCood, Point newCood){
        this.oldX = oldCood.getFirst();
        this.oldY = oldCood.getSecond();
        this.newX = newCood.getFirst();
        this.newY = newCood.getSecond();
    }
    public String toString(){
        return (1+oldX)+" "+(1+oldY)+" "+(1+newX)+" "+(1+newY);
    }
}
public class Main {
    public static boolean inside(int H, int W, int h, int w){
        return h>=0 && h<H && w>=0 && w<W;
    }
    public static boolean inside(int H, int W, Point p){
        return inside(H,W,p.getFirst(),p.getSecond());
    }
    public static Point nextCell(int H, int W, int h, int w){
        if(h%2==0){
        	if(w==W-1) return new Point(h+1,w);
        	else return new Point(h,w+1);
        }else{
        	if(w==0) return new Point(h+1,w);
        	else return new Point(h,w-1);
        }
    }
    public static Point nextCell(int H, int W, Point cell){
        return nextCell(H,W,cell.getFirst(),cell.getSecond());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] board = new int[H][W];
        for(int h=0;h<H;h++)for(int w=0;w<W;w++) board[h][w]=sc.nextInt();
        LinkedList<Operation> operations = new LinkedList<>();
        Point current = new Point(0,0);
        while(inside(H,W,nextCell(H,W,current))){
        	if(board[current.getFirst()][current.getSecond()]%2!=0){
        	    Operation op = new Operation(current,nextCell(H,W,current));
        	    operations.add(op);
        	    board[current.getFirst()][current.getSecond()]--;
        	    board[nextCell(H,W,current).getFirst()][nextCell(H,W,current).getSecond()]++;
        	}
        	current = nextCell(H,W,current);
        }
        System.out.println(operations.size());
        for(Operation op:operations){
        	System.out.println(op);
        }
        
    }
}
