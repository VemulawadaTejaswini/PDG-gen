import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static HashMap<Point,Integer> map = new HashMap<Point,Integer>();
	static int N,W;
	static int[] w,v;
	public static void main(String[] args){
		Scanner io = new Scanner(System.in);	
		N = io.nextInt();
		W = io.nextInt();
		w = new int[N+1];
		v = new int[N+1];
		
		for (int i = 0; i < N; i++) {
			w[i+1] = io.nextInt();
			v[i+1] = io.nextInt();
		}
		
		System.out.println(value(N,W));
	}
	public static int value(int i,int wMax){
		Point p = new Point(i,wMax);
		if(map.containsKey(p)){
			return map.get(p);
		}
		int val;
		if(i==0){
			val = 0;
		}else if(wMax<w[i]){
			val = value(i-1,wMax);
		}else{
			val = Math.max(value(i-1,wMax),value(i-1,wMax-w[i])+v[i]);
		}
		map.put(p,val);
		return val;
	}
}

class Point{
	int i;
	int w;
	public Point(int i, int w){
		this.i = i;
		this.w = w;
 	}
	@Override
	public boolean equals(Object p){
		return (i==((Point)p).i && w==((Point)p).w);
	}
}