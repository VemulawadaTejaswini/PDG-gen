import java.util.*;

class Main{
	public static void main(String[] $){
		var s=new Scanner(System.in);
		int n=s.nextInt();
		var t=s.next().toCharArray();

		var a=new int[n+1];
		var b=new int[n+1];
		var c=new int[n+1];
		for(int i=1;i<=n;++i)
			a[i]=t[i-1]=='R'?a[i-1]+1:a[i-1];
		for(int i=1;i<=n;++i)
			b[i]=t[i-1]=='G'?b[i-1]+1:b[i-1];
		for(int i=1;i<=n;++i)
			c[i]=t[i-1]=='B'?c[i-1]+1:c[i-1];

		long r=0;
		for(int i=1;i<=n;++i){
			long l=0;
			if(t[i-1]=='R') {
				l=f(n,b,c,i)+f(n,c,b,i);
			}
			if(t[i-1]=='G') {
				l=f(n,a,c,i)+f(n,c,a,i);
			}
			if(t[i-1]=='B') {
				l=f(n,b,a,i)+f(n,a,b,i);
			}

			for(int d=1;i+d<=n&&i-d>=1;++d){
				if(t[i-1]!=t[i-d-1]&&t[i-1]!=t[i+d-1]&&t[i-d-1]!=t[i+d-1])
					--l;
			}

			r+=l;
		}
		System.out.println(r);
	}

	private static int f(int n,int[] b,int[] c,int i){
		return b[i]*(c[n]-c[i]);
	}
}
