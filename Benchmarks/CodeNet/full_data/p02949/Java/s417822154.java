import java.util.*;
import java.util.stream.*;

class Main{
	static int mod=1000000007;

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),p=s.nextInt();

		ArrayList<ArrayList<Pair<Integer,Integer>>> g=new ArrayList<>(n);
		ArrayList<ArrayList<Integer>> f=new ArrayList<>(n);
		for(int i=0;i<n;++i)
			g.add(new ArrayList<>(1));
		for(int i=0;i<n;++i)
			f.add(new ArrayList<>(1));
		for(int i=0;i<m;++i) {
			int v=s.nextInt()-1;
			int d=s.nextInt()-1;
			int c=s.nextInt()-p;
			g.get(v).add(new Pair<>(d,c));
			f.get(d).add(v);
		}

		boolean[]dfs=new boolean[n];
		dfs[n-1]=true;
		dfs(n,dfs,f);
		System.err.println(Arrays.toString(dfs));

		long[]score=new long[n];
		Arrays.fill(score,Integer.MIN_VALUE/2);
		score[0]=0;

		BitSet visited=new BitSet(n),v=new BitSet(n);
		visited.set(0);
		for(int t=0;t<n*2;++t) {
			for(int i=visited.nextSetBit(0);i!=-1;i=visited.nextSetBit(i+1)) {
				for(Pair<Integer,Integer> e:g.get(i)) {
					if(score[e.a]<score[i]+e.b) {
						if(t>=n-1&&dfs[e.a]) {
							System.err.println(e.a);
							System.out.println(-1);
							return;
						}
						score[e.a]=score[i]+e.b;
						v.set(e.a);
					}
				}
			}
			visited.or(v);
		}

		System.err.println(Arrays.toString(score));

		System.out.println(IntStream.range(0,n).filter(i->dfs[i]).mapToLong(i->score[i]).max().getAsLong());
	}

	private static void dfs(int n,boolean[] dfs,ArrayList<ArrayList<Integer>> f){
		ArrayDeque<Integer>q=new ArrayDeque<>();
		q.add(n-1);
		while(!q.isEmpty()) {
			for(int Q=q.size();Q>0;--Q) {
				int poll=q.poll();
				for(int r:f.get(poll)) {
					if(!dfs[r]) {
						q.add(r);
						dfs[r]=true;
					}
				}
			}
		}
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
