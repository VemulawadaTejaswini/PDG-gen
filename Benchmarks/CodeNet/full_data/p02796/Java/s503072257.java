import java.util.*;

public class Main{
	public static void main(String[] args){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<Pair<Integer,Integer>> robots=new ArrayList<>(n);

		for(int i=0;i<n;++i) {
			int x=s.nextInt(),l=s.nextInt();
			robots.add(new Pair<>(x-l,x+l));
		}

		robots.sort(null);

		TreeMap<Integer,Integer> map=new TreeMap<>();

		for(Pair<Integer,Integer> p:robots){
			SortedMap<Integer,Integer> sub=map.subMap(Integer.MIN_VALUE,p.a+1);
			if(sub.isEmpty()){
				map.put(p.b,1);
			}else{
				map.put(p.b,1+sub.values().stream().mapToInt(i->i).max().getAsInt());
				sub.clear();
			}
			System.err.println(map);
		}
		System.out.println(map.values().stream().mapToInt(i->i).max().getAsInt());
	}
}

class Pair<A extends Comparable<A>,B extends Comparable<B>> implements Comparable<Pair<A,B>>{
	A	a;
	B	b;

	public Pair(A A,B B){
		a=A;
		b=B;
	}
	public Pair(Pair<A,B> p){
		this(p.a,p.b);
	}

	public Pair<B,A> swapped(){
		return new Pair<>(b,a);
	}

	@Override
	public String toString(){
		return "P["+a+", "+b+"]";
	}

	@Override
	public int compareTo(Pair<A,B> o){
		int v=a.compareTo(o.a);
		if(v!=0)
			return v;
		return b.compareTo(o.b);
	}

	@Override
	public int hashCode(){
		return Objects.hashCode(a)*31+Objects.hashCode(b);
	}

	@Override
	public boolean equals(Object obj){
		if(this==obj) return true;
		if(!(obj instanceof Pair))
			return false;
		Pair<?,?> other=(Pair<?,?>)obj;
		return Objects.equals(a,other.a)&&Objects.equals(b,other.b);
	}
}
