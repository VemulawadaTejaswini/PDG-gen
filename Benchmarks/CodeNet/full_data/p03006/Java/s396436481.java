import java.awt.*;
import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();
		ArrayList<Point> a=new ArrayList<>();
		ArrayList<Point> b=new ArrayList<>();
		for(int i=0;i<n;++i) {
			Point e=new Point(s.nextInt(),s.nextInt());
			a.add(e);
			b.add(e);
		}
		a.sort(Comparator.comparingInt(o->o.x));
		b.sort(Comparator.comparingInt(o->o.y));

		System.err.println(a);
		System.err.println(b);

		int r=n==1?1:Integer.MAX_VALUE;

		for(int i=0;i<n;++i){
			for(int j=i+1;j<n;++j){
				long dx=a.get(j).x-a.get(i).x;
				long dy=a.get(j).y-a.get(i).y;

				int t=Math.min(f(a,dx,dy),f(b,dx,dy));
				r=Math.min(r,t);
				//System.err.println(t+" "+dx+" "+dy);
			}
		}
		System.err.println();
		System.out.println(r);
	}

	private static int f(ArrayList<Point> a,long dx,long dy){
		ArrayList<Point> l=new ArrayList<>();
		int t=0;
		for(Point p:a){
			if(l.stream().noneMatch(q->(p.x==q.x+dx&&p.y==q.y+dy)||(p.x==q.x-dx&&p.y==q.y-dy)))
				++t;
			l.add(p);
		}
		return t;
	}
}