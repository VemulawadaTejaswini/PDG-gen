import java.util.*;

class Main{
	static int mod=1000000007;

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();
		int[]q=new int[n];
		Arrays.setAll(q,i->s.nextInt());

		BitSet a=new BitSet(n+1);

		for(int i=n;i>0;--i) {
			int t=q[i-1];
			for(int j=i*2;j<=n;++j)
				t^=a.get(j)?1:0;
			a.set(i,t==1);
		}
		System.out.println(a.cardinality());
		a.stream().forEach(System.out::println);
	}
}
