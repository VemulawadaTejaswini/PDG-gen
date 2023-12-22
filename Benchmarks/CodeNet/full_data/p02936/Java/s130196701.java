import java.util.*;
import java.util.stream.*;

class Main{
	static int mod=1000000007;

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),q=s.nextInt();
		int[]p=new int[n],r=new int[n];
		p[0]=-1;

		for(int i=0;i<n-1;++i) {
			int a=s.nextInt()-1;
			int b=s.nextInt()-1;
			p[b]=a;
		}
		for(int i=0;i<q;++i)
			r[s.nextInt()-1]+=s.nextInt();

		for(int i=1;i<n;++i)
			r[i]+=r[p[i]];
//		System.err.println(Arrays.toString(p));
//		System.err.println(Arrays.toString(r));
		System.out.println(Arrays.stream(r).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
	}
}
