
import java.io.*;
import java.util.*;

class XComparator implements Comparator<Point>{
	@Override
	public int compare(Point p1, Point p2){
		return p1.x < p2.x ? -1 : 1;
	}
}

class YComparator implements Comparator<Point>{
	@Override
	public int compare(Point p1, Point p2){
		return p1.y < p2.y ? -1 : 1;
	}
}

class MyComparator implements Comparator<Next>{
	@Override
	public int compare(Next p1, Next p2){
		return p1.cost < p2.cost ? -1 : 1;
	}
}

class Unionfind{
	int[] number;

	Unionfind(int n){
		number = new int[n];
		for(int i=0;i<n;i++){
			number[i] = i;
		}
	}

	int find(int x){
		if(number[x] == x){
			return x;
		}
		return number[x] = find(number[x]);
	}

	void unite(int x, int y){
		if(number[x] == number[y]){

		}
		else{
			number[find(x)] = number[find(y)];
		}
	}

	boolean same(int x, int y){
		if(number[find(x)] == number[find(y)]){
			return true;
		}
		return false;
	}
}

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        Unionfind union = new Unionfind(n);
        for(int i=0;i<n;i++){
        	x[i] = sc.nextInt();
        	y[i] = sc.nextInt();
        }
        ArrayList<Point> xlist = new ArrayList<Point>();
        ArrayList<Point> ylist = new ArrayList<Point>();
        for(int i=0;i<n;i++){
        	Point p = new Point(x[i], y[i], i);
        	xlist.add(p);
        	ylist.add(p);
        }
        Collections.sort(xlist, new XComparator());
        Collections.sort(ylist, new YComparator());

    	ArrayList<Next> list = new ArrayList<Next>();

        for(int i=0;i<n-1;i++){
        	Point p1 = xlist.get(i);
        	Point p2 = xlist.get(i+1);
        	list.add(new Next(p1.now, p2.now, (int)Math.abs(p1.x-p2.x)));
        	p1 = ylist.get(i);
        	p2 = ylist.get(i+1);
        	list.add(new Next(p1.now, p2.now, (int)Math.abs(p1.y-p2.y)));
        }

        Collections.sort(list, new MyComparator());
        int ans = 0;
        for(int i=0;i<list.size();i++){
        	Next p = list.get(i);
        	if(union.same(p.a, p.b)){

        	}
        	else{
        		union.unite(p.a, p.b);
        		ans += p.cost;
        	}
        }

        System.out.println(ans);
    }
}

class Point{
	int x;
	int y;
	int now;
	Point(int x, int y, int now){
		this.x = x;
		this.y = y;
		this.now = now;
	}
}

class Next{
	int a;
	int b;
	int cost;
	Next(int a, int b, int cost){
		this.a = a;
		this.b = b;
		this.cost = cost;
	}
}