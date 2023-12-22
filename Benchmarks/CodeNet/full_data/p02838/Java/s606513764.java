import java.util.*;

public class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		long[]a=new long[n+1];
		int[][]b=new int[60][n+1];
		for(int i=1;i<=n;++i) {
			long v=a[i]=s.nextLong();
			long d=1;
			for(int j=0;j<60;++j,d<<=1)
				b[j][i]=(v&d)>0?1:0;
		}
		for(int[]bb:b)
			Arrays.parallelPrefix(bb,Integer::sum);

		long r=0;
		for(int i=1;i<n;++i) {
			long d=1;
			for(int j=0;j<60;++j,d<<=1) {
				int c=b[j][n]-b[j][i];
				r+=(a[i]&d)>0?(n-i-c)*d:c*d;
				r%=1000000007;
			}
		}

		System.out.println(r);
	}
}
