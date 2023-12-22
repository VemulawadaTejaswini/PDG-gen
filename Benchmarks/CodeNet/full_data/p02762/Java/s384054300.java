import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		Unionfind uf=new Unionfind(n);
		int[] count=new int[n];
		for(int i=0; i<m; i++){
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			uf.unite(a,b);
			count[a]++;
			count[b]++;
		}
		int[] mai=new int[n];
		for(int i=0; i<k; i++){
			int c=sc.nextInt()-1;
			int d=sc.nextInt()-1;
			if(uf.root(c)==uf.root(d)){
				mai[c]--;
				mai[d]--;
			}
		}
		for(int i=0; i<n; i++){
			System.out.print(uf.size(i)-count[i]-1+mai[i]+" ");
		}
	}
	static class Unionfind{
		int[] parent;
		int[] size;
		public Unionfind(int n){
			this.parent=new int[n];
			this.size=new int[n];
			for(int i = 0; i<n; i++){
				parent[i]=i;
				size[i]=1;
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
				return;
			}
			int xroot = root(x);
			int yroot = root(y);
			parent[yroot]=xroot;
			size[xroot]+=size[yroot];
			size[yroot]=0;
		}
		public int size(int i){
			return size[root(i)];
		}
		public boolean same(int x,int y){
			return root(x)==root(y);
		}
	}
}
