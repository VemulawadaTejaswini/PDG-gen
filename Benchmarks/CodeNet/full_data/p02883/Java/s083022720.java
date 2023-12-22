import java.util.*;
class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		long k=s.nextLong();
		long[] a=new long[n],b=new long[n];
		Arrays.setAll(a,i->s.nextInt());
		Arrays.setAll(b,i->s.nextInt());
		Arrays.sort(a);
		Arrays.sort(b);
		long ng=-1,ok=1000_000_000_000_000_000L;
		while(Math.abs(ok-ng)>1){
			long mid=(ok+ng)/2,r=0;
			for(int i=0;i<n;++i){
				long v=a[n-1-i]*b[i];
				r+=mid>=v?0:(v-mid+b[i]-1)/b[i];
			}
			if(r<=k)
				ok=mid;
			else
				ng=mid;
		}
		System.out.println(ok);
	}
}
