import java.util.Arrays;
import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main{

	class Edge implements Comparable<Edge>{
		boolean isHorizontal;
		int cost,pos;

		public Edge(boolean isHorizontal,int cost,int pos){
			this.isHorizontal=isHorizontal;
			this.cost=cost;
			this.pos=pos;
		}

		@Override
		public int compareTo(Edge o){
			return this.cost-o.cost;
		}
	}

	private void solve(){
		int n=gInt();
		int[]a=ints(n).toArray();
		
		int r=a[0]-1;
		a[0]=1;
		int min=1;
		for(int i=1;i<n;++i) {
			if(a[i]>min+1) {
				r+=((a[i]-1)/(min+1));
				a[i]=min;
			}else {
				min=a[i];
			}
		}
		System.out.println(r);
		System.err.println(Arrays.toString(a));
	}

	public static void main(String[]$){
		new Main().solve();
	}

	static Scanner s=new Scanner(System.in);


	static int gInt(){
		return s.nextInt();
	}
	static long gLong(){
		return s.nextLong();
	}
	static long gDouble(){
		return s.nextLong();
	}


	static Range rep(int i){
		return new Range(i);
	}
	static Range rep(int f,int t,int d){
		return new Range(f,t,d);
	}
	static Range rep(int f,int t){
		return rep(f,t,1);
	}
	static Range rrep(int f,int t){
		return rep(f,t,-1);
	}

	static class Range implements Iterable<Integer>,PrimitiveIterator.OfInt{

		int to,cur,d;

		Range(int from,int to,int d){
			this.cur=from-d;
			this.to=to;
			this.d=d;
		}

		Range(int n){
			this(0,n-1,1);
		}

		@Override
		public Iterator<Integer> iterator(){
			return this;
		}

		@Override
		public boolean hasNext(){
			return cur+d==to||(cur!=to&&(cur<to==cur+d<to));
		}

		@Override
		public int nextInt(){
			return cur+=d;
		}
	}


	static IntStream REPS(int v){
		return IntStream.range(0,v);
	}

	static IntStream REPS(int l,int r){
		return IntStream.rangeClosed(l,r);
	}


	static IntStream ints(int n){
		return REPS(n).map(i->gInt());
	}

	static Stream<String> strs(int n){
		return REPS(n).mapToObj(i->s.next());
	}

}
