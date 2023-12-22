import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

// Java8
public class Main
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception
	{
		new Main().run();
	}

	final long INF = 1000000002;

	void run()
	{
		int n = sc.nextInt();
		TreeSet<Vertex> xset = new TreeSet<>(Vertex.xcmp);
		TreeSet<Vertex> yset = new TreeSet<>(Vertex.ycmp);
		PriorityQueue<Vertex> q = new PriorityQueue<>(Vertex.positioning);
		for(int i=0; i<n; i++)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			Vertex v = new Vertex(i, x, y);
			xset.add(v);
			yset.add(v);
			q.offer(v);
		}
		long cost = 0;
		while(true)
		{
			Vertex v = q.poll();
			if(q.isEmpty()) break;
			Vertex xl = xset.lower(v);
			long xlc = xl==null ? INF : Math.abs(xl.x - v.x);
			Vertex xh = xset.higher(v);
			long xhc = xh==null ? INF : Math.abs(xh.x - v.x);
			Vertex yl = yset.lower(v);
			long ylc = yl==null ? INF : Math.abs(yl.y - v.y);
			Vertex yh = yset.higher(v);
			long yhc = yh==null ? INF : Math.abs(yh.y - v.y);
			long c = Math.min(Math.min(xlc, xhc), Math.min(ylc, yhc));
			cost += c;
		}
		System.out.println(cost);
	}
}
class Vertex
{
	int id, x, y;

	public Vertex(int i, int x, int y)
	{
		id = i;
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Vertex) return id==((Vertex)obj).id;
		return false;
	}
	
	@Override
	public int hashCode()
	{
		return id;
	}
	
	static Comparator<Vertex> positioning = Comparator.<Vertex>comparingLong(p -> p.x + p.y).thenComparing(Comparator.<Vertex>comparingLong(p -> p.id));
	static Comparator<Vertex> xcmp = Comparator.<Vertex>comparingLong(p -> p.x).thenComparing(Comparator.<Vertex>comparingLong(p -> p.id));
	static Comparator<Vertex> ycmp = Comparator.<Vertex>comparingLong(p -> p.y).thenComparing(Comparator.<Vertex>comparingLong(p -> p.id));
}