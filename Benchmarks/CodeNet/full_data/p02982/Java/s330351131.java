import java.util.*;

class Main{
	public static void main(String[] $) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),d=s.nextInt();

		int[][]p=new int[n][d];
		for(int i=0;i<n;++i)
			for(int j=0;j<d;++j)
				p[i][j]=s.nextInt();

		int r=0;
		for(int i=0;i<n;++i) {
			for(int j=i+1;j<n;++j) {
				if(f(p[i],p[j],d))
					++r;
			}
		}
		System.out.println(r);
	}

	private static boolean f(int[] p,int[] p2,int n){
		int sum=0;
		for(int i=0;i<n;++i)
			sum+=(p[i]-p2[i])*(p[i]-p2[i]);
		return Math.abs(Math.pow((int)Math.sqrt(sum),2)-sum)<0.0001;
	}
}
