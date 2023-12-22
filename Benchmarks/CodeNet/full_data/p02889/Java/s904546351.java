import java.util.*;

class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),l=s.nextInt();
		long inf=999_999_999_999L;
		long[][] g=new long[n][n];

		for(int i=0;i<n;++i)
			for(int j=0;j<n;++j)
				if(i!=j)
					g[i][j]=inf;

		for(int i=0;i<m;++i) {
			int src=s.nextInt()-1,dst=s.nextInt()-1,cost=s.nextInt();
			g[src][dst]=g[dst][src]=cost;
		}

		for(int k=0;k<n;++k)
			for(int i=0;i<n;++i)
				for(int j=0;j<n;++j)
					g[i][j]=Math.min(g[i][j],g[i][k]+g[k][j]);

		//Arrays.stream(g).map(Arrays::toString).forEach(System.err::println);

		for(int i=0;i<n;++i)
			for(int j=0;j<n;++j)
				if(i!=j)
					g[i][j]=g[i][j]<=l?1:inf;

		for(int k=0;k<n;++k)
			for(int i=0;i<n;++i)
				for(int j=0;j<n;++j)
					g[i][j]=Math.min(g[i][j],g[i][k]+g[k][j]);

		//Arrays.stream(g).map(Arrays::toString).forEach(System.err::println);

		for(int q=s.nextInt();q>0;--q) {
			long v=g[s.nextInt()-1][s.nextInt()-1];
			System.out.println(v==inf?-1:v-1);
		}
	}
}