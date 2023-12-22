import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static Scanner s=new Scanner(System.in);
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n) {return REPS(n).map(i->getInt());}
	static int getInt(){return Integer.parseInt(s.next());}
	static class Pair<T,U>{
		T l;U r;
		Pair(T L,U R){l=L;r=R;}
		T getL(){return l;}
		U getR(){return r;}
	}
	public static void main(String[]$){
		int n=getInt(),a[]=INS(n*3).toArray();
		PriorityQueue<Integer>left=new PriorityQueue<>(),right=new PriorityQueue<>();

		int[]lres=new int[n+1];
		{
			for(int i=0;i<n;++i) {
				int v=a[i];
				lres[0]+=v;
				left.add(v);
			}
			for(int i=1;i<=n;++i) {
				int v=a[n+ i-1];
				left.add(v);
				lres[i]=lres[i-1]+v-left.poll();
			}
			//System.out.println(Arrays.toString(lres));
		}

		int[]rres=new int[n+1];
		{
			for(int i=0;i<n;++i) {
				int v=-a[n*3-1 -i];
				rres[0]+=v;
				right.add(v);
			}
			for(int i=1;i<=n;++i) {
				int v=-a[n*2   -i];
				right.add(v);
				rres[i]=rres[i-1]+v-right.poll();
			}
			//System.out.println(Arrays.toString(rres));
		}
		System.out.println(
				REPS(n+1)
				.map(i->lres[i]+rres[n-i])
				.max().getAsInt()
				);
	}
}