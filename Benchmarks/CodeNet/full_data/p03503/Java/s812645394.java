import java.util.Arrays;
import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main{

	private void solve(){
		int n=gInt();
		int[]c=REPS(n).map(i->ints(10).sum()).toArray();
		boolean f=false;
		int r=0;
		int[][]v=new int[n][];
		int[]max=new int[n];
		for(int i:rep(n)) {
			v[i]=ints(11).toArray();
			for(int j:rep(1,c[i]))
				if(v[i][max[i]]<v[i][j])
					max[i]=j;
			f|=max[i]!=0;
			r+=v[i][max[i]];
		}
		if(!f)
			r+=REPS(n).map(i->
			Arrays.stream(v[i]).skip(1).limit(c[i]).max().getAsInt()
			-v[i][max[i]])
			.max().getAsInt();
		System.out.println(r);
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