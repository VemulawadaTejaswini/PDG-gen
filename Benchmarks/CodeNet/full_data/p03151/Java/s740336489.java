import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		long[]a=new long[n],b=new long[n];
		Arrays.setAll(a,i->s.nextInt());
		Arrays.setAll(b,i->s.nextInt());
		
		if(Arrays.stream(a).sum()<Arrays.stream(b).sum()) {
			System.out.println(-1);
			return;
		}
		
		long[]d=new long[n];
		Arrays.setAll(d,i->a[i]-b[i]);
		Arrays.sort(d);
//		System.err.println(Arrays.toString(d));
		
		int sd=0,r=0;
		for(int i=0;i<n&&d[i]<0;++i) {
			++r;
			sd+=d[i];
		}
		for(int i=n-1;i>=0&&sd<0;--i) {
			++r;
			sd+=d[i];
		}
		System.out.println(r);
	}
}