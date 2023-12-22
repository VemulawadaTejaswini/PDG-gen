import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),q=s.nextInt();
		int[]l=new int[n];
		int[]r=new int[n];
		int[]x=new int[n];
		for(int i=0;i<n;++i) {
			l[i]=s.nextInt();
			r[i]=s.nextInt()-1;
			x[i]=s.nextInt();
		}
		int d[]=new int[q];
		int e[]=new int[q];
		for(int p=0;p<q;++p)
			d[p]=s.nextInt();
		Arrays.fill(e,2000000000);

		for(int i=0;i<n;++i) {
			int b=Arrays.binarySearch(d,l[i]-x[i]);
			int c=Arrays.binarySearch(d,r[i]-x[i]);
			if(b<0)b=~b;
			if(c<0)c=~c-1;
			for(int j=b;j<=c;++j)
				e[j]=Math.min(e[j],x[i]);
		}
		Arrays.stream(e).forEach(i->System.out.println(i==2000000000?-1:i));
	}
}