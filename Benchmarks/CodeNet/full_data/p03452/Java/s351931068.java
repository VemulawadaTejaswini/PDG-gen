import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main{

	private static final long nan=Integer.MIN_VALUE*10000L;

	class Info{
		int l,r,d;
		public Info(){
			l=gInt()-1;
			r=gInt()-1;
			d=gInt();
			if(l>r){
				int t=l;
				l=r;
				r=t;
				d=-d;
			}
		}
		@Override
		public String toString(){
			return "Info [l="+l+", r="+r+", d="+d+"]";
		}
	}

	private void solve(){
		int n=gInt();
		long[] pos=new long[n];
		Arrays.fill(pos,nan);
		Info[] info=REPS(gInt()).mapToObj(i->new Info())
				.sorted(Comparator.<Info>comparingInt(o->o.l).thenComparing(o->o.r))
				//				.peek(System.out::println)
				.toArray(Info[]::new);
		for(Info i:info){
			if(pos[i.l]!=nan&&pos[i.r]!=nan){
				if(pos[i.r]-pos[i.l]!=i.d){
					System.out.println("No");
					return;
				}
			}
			if(pos[i.l]==nan)
				pos[i.l]=0;
			pos[i.r]=pos[i.l]+i.d;
		}
		System.out.println("Yes");
	}


	public static void main(String[] $){
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