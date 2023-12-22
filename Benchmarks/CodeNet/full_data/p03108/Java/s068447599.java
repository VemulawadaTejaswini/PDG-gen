import java.util.Scanner;
import java.awt.Point;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Point[] g=new Point[m];
		int[] ans=new int[m];
		for(int i = 1; i<n; i++){
			ans[m-1]+=i;
		}
		for(int i = 0; i<m; i++){
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			g[i]=new Point(a,b);
		}
		Unionfind uf=new Unionfind(n);
		for(int i=m-1; i>=0; i--){
			if(i!=m-1){
				ans[i]=ans[i+1]-uf.size(g[i+1].x);
				if(ans[i]<0){
					ans[i]=0;
				}
			}
			uf.unite(g[i].x,g[i].y);
		}
		for(int i = 0; i<m; i++){
			System.out.println(ans[i]);
		}
	}
	static class Unionfind{
		int[] parent;
		int[] size;
		int[] sizesi;
		public Unionfind(int n){
			this.parent=new int[n];
			this.size=new int[n];
			this.sizesi=new int[n];
			for(int i = 0; i<n; i++){
				parent[i]=i;
			}
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
				size[x]=0;
				return;
			}
			int xroot = root(x);
			int yroot = root(y);
			parent[yroot]=xroot;
			if(sizesi[yroot]==0 && sizesi[xroot]==0){
				sizesi[xroot]=2;
				size[xroot]=1;
			}else if(sizesi[yroot]>0 && sizesi[xroot]>0){
				size[xroot]=sizesi[yroot]*sizesi[xroot];
				sizesi[xroot]=sizesi[yroot]+sizesi[xroot];
			}else if( sizesi[xroot]>0 && sizesi[yroot]==0){
				size[xroot]=sizesi[xroot];
				sizesi[xroot]++;
			}else if(sizesi[yroot]>0 && sizesi[xroot]==0){
				size[xroot]=sizesi[yroot];
				sizesi[xroot]=sizesi[yroot]+1;
			}
		}
		public boolean same(int x,int y){
			return root(x)==root(y);
		}
		public int size(int x){
			return size[root(x)];
		}
	}
}