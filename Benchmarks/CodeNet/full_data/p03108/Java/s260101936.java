

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static class UnionFind{
		private int cnt;
		int parent[];
		int[] rank;
		UnionFind(int n){
			cnt=n;
			parent =new int[n];
			Arrays.fill(parent, -1);
			
			
		}
		int root(int x)
		{
			if(parent[x]<0)
			{
				return x;
			}else {
				return parent[x]=root(parent[x]);
			}
			
			
		}
		int size(int a)
		{
			return -parent[root(a)];
		}
		public boolean connect(int a,int b)
		{
			a=root(a);
			b=root(b);
			if(a==b) {
				return false;
			}
			if(size(a)<size(b))
			{
				int r=a;
				a=b;
				b=r;
			
			}
			parent[a]+=parent[b];
			parent[b]=a;
			return true;
		}
		
		
		
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int a[]=new int[m];
		int b[]=new int[m];
		for(int i=0;i<m;i++)
		{
			a[i]=scan.nextInt()-1;
			b[i]=scan.nextInt()-1;
			
		}
		UnionFind uf=new UnionFind(n);
		long[] ans=new long[m];
		ans[m-1]=(long)n*(n-1)/2;
		for(int i=m-1;i>=1;i--)
		{
			ans[i-1]=ans[i];
			if(uf.root(a[i])!=uf.root(b[i])) {
				ans[i-1]-=(long)uf.size(a[i])*uf.size(b[i]);
				uf.connect(a[i], b[i]);
			}
		}
		for(int i=0;i<m;i++)
		{
			System.out.println(ans[i]);
		}
	}
	
}
