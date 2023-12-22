import java.awt.Point;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class Main{
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n) {return REPS(n).map(i->getInt());}
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}

	public static void main(String[]$){
		Point st=new Point(getInt(),getInt()),go=new Point(getInt(),getInt());
		if(st.x==go.x) {
			for(int i=getInt();i>0;--i) {
				if(getInt()==st.x) {
					int y=getInt();
					if((st.y-y)*(go.y-y)<0) {
						System.out.println(m(st,go)*100+11.41592653589794);
						return;
					}
					break;
				}
			}
			System.out.printf("%.15f",m(st,go)*100);
			return;
		}
		if(st.y==go.y) {
			for(int i=getInt();i>0;--i) {
				int x=getInt();
				if((st.x-x)*(go.x-x)<0) {
					if(getInt()==st.y) {
						System.out.println(m(st,go)*100+11.41592653589794);
						return;
					}
					break;
				}
			}
			System.out.printf("%.15f",m(st,go)*100);
			return;
		}
		if(st.y>go.y) {
			Point buf=go;
			go=st;
			st=buf;
		}
		TreeSet<Point>p=
				st.x<go.x?
				new TreeSet<>(Comparator.comparingDouble(Point::getX)):
				new TreeSet<>(Comparator.comparingDouble(Point::getX).reversed());

		TreeMap<Integer,Integer> res=new TreeMap<>();
		for(int i=getInt();i>0;--i) {
			int x=getInt(),y=getInt();
			if((st.x-x)*(go.x-x)<=0&&(st.y-y)*(go.y-y)<=0)
				p.add(new Point(x,y));
		}
		res.put(st.y-1,0);
		for(Point e:p) {
			res.put(e.y,res.lowerEntry(e.y).getValue()+1);
		}
		int v=res.values().stream().mapToInt(i->i).max().getAsInt();
		System.out.printf("%.15f",
				m(st,go)*100
				+v*5*(Math.PI-4)
				);
	}
	private static long m(Point st,Point go){
		return Math.abs(st.x-go.x)+Math.abs(st.y-go.y);
	}
}