import java.util.Arrays;
import java.util.Scanner;

class Main{
	private static final int n=1000001;
	static Scanner s=new Scanner(System.in);
	static int gInt() {return Integer.parseInt(s.next());}
	static long gLong() {return Long.parseLong(s.next());}

	public static void main(String[]$){
		boolean[]p=new boolean[n];
		Arrays.fill(p,true);
		p[0]=false;
		p[1]=false;
		for(int i=2;i<n;++i)
			if(p[i])
				for(long j=(long)i*i;j<n;j+=i)
					p[(int)j]=false;

		int[]a=new int[n];
		for(int i=1;i<n;i+=2)
			if(p[i]&&p[(i+1)/2])
				a[i]=1;
		Arrays.parallelPrefix(a,Integer::sum);
		for(int q=gInt();q>0;--q)
			System.out.println(-a[gInt()-1]+a[gInt()]);
	}
}