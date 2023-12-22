import java.util.*;
import java.io.*;

class Point implements Comparable<Point>{
    public int x,y;
    public int color;
    public static int red=0,
                      blue=1;
    
    public Point(int x, int y, int color){
    	this.x=x;
    	this.y=y;
    	this.color=color;
    }
    
    public int compareTo(Point another){
    	return this.x-another.x;
    }
    
    public boolean connectable(Point another){
    	return (this.x<another.x && this.y<another.y && this.color==red && another.color==blue)
    	     ||(this.x>another.x && this.y>another.y && this.color==blue && another.color==red);
    }
    
    public void use(){
    	color = -1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Point[] r = new Point[N];
        for(int n=0;n<N;n++) r[n]= new Point(sc.nextInt(), sc.nextInt(), 0);
        Point[] b = new Point[N];
        for(int n=0;n<N;n++) b[n]= new Point(sc.nextInt(), sc.nextInt(), 1);
        Arrays.sort(r);
        Arrays.sort(b);
        
        int ans=0;
        
        for(Point blue:b){
        	int highest = -1;
        	for(Point red:r) if(blue.connectable(red) && red.y>highest)  highest=red.y;
        	if(highest>=0){
        	    ans++;
        	    for(Point red:r)if(red.y==highest) red.use();
        	}
        }
        
        System.out.println(ans);
        
        
        
        
    }
}