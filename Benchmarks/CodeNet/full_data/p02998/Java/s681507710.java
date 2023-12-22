import java.awt.*;
import java.util.*;

class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		HashMap<Integer,Integer>x=new HashMap<>(),y=new HashMap<>();
		ArrayList<Point>p=new ArrayList<>();

		for(int i=0;i<n;++i) {
			int a=s.nextInt()-1;
			int b=s.nextInt()-1;
			x.merge(a,1,Integer::sum);
			y.merge(b,1,Integer::sum);
			p.add(new Point(a,b));
		}

//		System.err.println(x);
//		System.err.println(y);

		System.out.println(
				p.stream().mapToLong(o->(x.get(o.x)-1L)*(y.get(o.y)-1L)).sum()
				);
	}
}
