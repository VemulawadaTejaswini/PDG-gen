import java.util.*;
public class Main {
	static int[] f=new int[112345];
	static long[] sz=new long[112345];
	static int[] mmax=new int[112345];
	public static class edge implements Comparable<edge> {
		int u,v,w;
		@Override
		public int compareTo(edge o) {
			return w-o.w;
		}
	}
	public static int F(int x) {
		if (f[x]==x) return x;
		mmax[x]=Math.max(mmax[x],mmax[f[x]]);
		return f[x]=F(f[x]);
	}
	public static void U(int x,int y,int w) {
		int fx=F(x),fy=F(y);
		if (fx==fy) {
			if (w<=sz[fx])
				mmax[fx]=w;
			return;
		}
		sz[fx]+=sz[fy];
		f[fy]=fx;
		if (w<=sz[fx])
			mmax[fx]=w;
		return;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		edge[] e=new edge[m];
		long tot=0;
		for (int i=1;i<=n;++i) {
			sz[i]=in.nextLong();
			f[i]=i;
			tot+=sz[i];
		}
		for (int i=0;i<m;++i) {
			e[i]=new edge();
			e[i].u=in.nextInt();
			e[i].v=in.nextInt();
			e[i].w=in.nextInt();
		}
		Arrays.sort(e,0,m);
		for (int i=0;i<m;++i) U(e[i].u,e[i].v,e[i].w);
		for (int i=1;i<=n;++i) F(i);
		int res=0;
		for (int i=0;i<m;++i) {
			if (mmax[e[i].u]>=e[i].w) ++res;
		}
		System.out.println(m-res);
	}
}