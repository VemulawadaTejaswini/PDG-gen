import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	 int n;
	 int m;
	 ArrayList<Integer>[] path;
	 boolean[] v; //訪問済みか
	 int ans=0;
	 int count=0;
	
	public  void solve() {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		int[] a=new int[m];
		int[] b=new int[m];
		path=new ArrayList[m];

		for(int i=0;i<m;i++){
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			path[i]=new ArrayList<>();
		}
		//隣接行列
		for(int i=0;i<m;i++){
			path[a[i]-1].add(b[i]);
			path[b[i]-1].add(a[i]);
		}
		v=new boolean[n+1];
		v[1]=true;
		count++;
		
		dfs(v,1);
		
		System.out.println(ans);
	}
	
	public void dfs(boolean[] v,int start){
		if(count==n){
			ans++;
			return;
		}else{
			for(int i=0;i<path[start-1].size();i++){
				if(v[path[start-1].get(i)]==false){
					v[path[start-1].get(i)]=true;
					count++;
					dfs(v,path[start-1].get(i));
					v[path[start-1].get(i)]=false;
					count--;
				}
			}
			return;
		}
	}
	public static void main(String args[]){
		new Main().solve();
	}
}