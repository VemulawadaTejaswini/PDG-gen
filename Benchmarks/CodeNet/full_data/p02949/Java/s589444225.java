import java.util.*;
import java.util.stream.*;

class Main{
	static int mod=1000000007;

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),p=s.nextInt();

		ArrayList<ArrayList<Pair<Integer,Integer>>> g=new ArrayList<>(n);
		for(int i=0;i<n;++i)
			g.add(new ArrayList<>(1));
		for(int i=0;i<m;++i)
			g.get(s.nextInt()-1).add(new Pair<>(s.nextInt()-1,s.nextInt()-p));

		byte[]dfs=new byte[n];
		dfs[n-1]=1;
		dfs(0,n,dfs,g);

		long[]score=new long[n],scorenext=new long[n];
		BitSet now=new BitSet(n),next=new BitSet(n);
		now.set(0);
		for(int t=1;t<=n;++t) {
			for(int i=now.nextSetBit(0);i!=-1;i=now.nextSetBit(i+1)) {
				for(Pair<Integer,Integer> e:g.get(i)) {
					if(score[e.a]<score[i]+e.b) {
						if(t==n&&dfs[e.a]==1) {
							System.out.println(-1);
							return;
						}
						scorenext[e.a]=Math.max(scorenext[e.a],score[i]+e.b);
						next.set(e.a);
					}
				}
			}
			//System.err.println(Arrays.toString(score));
			now.clear();
			now.or(next);
			next.clear();
			System.arraycopy(scorenext,0,score,0,n);
		}

		System.out.println(IntStream.range(0,n).filter(i->dfs[i]==1).mapToLong(i->score[i]).max().getAsLong());
	}

	private static byte dfs(int i,int n,byte[] dfs,ArrayList<ArrayList<Pair<Integer,Integer>>> g){
		if(dfs[i]!=0)
			return dfs[i];
		dfs[i]=-1;
		for(Pair<Integer,Integer> e:g.get(i))
			dfs[i]=(byte)Math.max(dfs[i],dfs(e.a,n,dfs,g));
		return dfs[i];
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