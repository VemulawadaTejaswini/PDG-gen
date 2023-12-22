import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] x=new long[n];
		long[] y=new long[n];
		int ans=Integer.MAX_VALUE;
		for(int i=0; i<n; i++){
			x[i] = sc.nextLong();
			y[i]= sc.nextLong();
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				Unionfind uf=new Unionfind(n);
				long xx=x[i]-x[j];
				long yy=y[i]-y[j];
				for(int k=0; k<n;k++){
					for(int t=0; t<n;t++){
						if(x[k]-x[t]==xx && y[k]-y[t]==yy){
							uf.unite(k,t);
						}
					}
				}
				ans=Math.min(ans,uf.count());
			}
		}
		System.out.println(ans);
	
	}
	static class Unionfind{
		int[] parent;
		int count;
		public Unionfind(int n){
			this.parent=new int[n];
			for(int i = 0; i<n; i++){
				parent[i]=i;
			}
			count=n;
		}
		public int root(int t){
			if(parent[t]==t){
				return t;
			}else{
				return parent[t]=root(parent[t]);
			}
		}
		public void unite(int x,int y){
			if(same(x,y)){
				return;
			}
			int xroot = root(x);
			int yroot = root(y);
			parent[yroot]=xroot;
			count--;
		}
		public boolean same(int x,int y){
			return root(x)==root(y);
		}
		public int count(){
			return this.count;
		}
	}
}
