import java.awt.*;
import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();
		ArrayList<Point> a=new ArrayList<>();
		for(int i=0;i<n;++i)
			a.add(new Point(s.nextInt(),s.nextInt()));

		int r=Integer.MAX_VALUE;

		for(int i=0;i<n;++i){
			for(int j=i+1;j<n;++j){
				int dx=a.get(j).x-a.get(i).x;
				int dy=a.get(j).y-a.get(i).y;

				ArrayList<Point> l=new ArrayList<>();
				int t=0;
				for(Point p:a){
					if(!l.stream().anyMatch(q->p.equals(new Point(q.x+dx,q.y+dy)))){
						++t;
					}
					l.add(p);
				}
				r=Math.min(r,t);
			}
		}
		System.out.println(r);
	}
}