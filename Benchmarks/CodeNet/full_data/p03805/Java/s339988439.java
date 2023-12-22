import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int n;
	static int m;
	static ArrayList<Integer>[] path;
	static boolean[] v; //訪問済みか
	static int ans=0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		int[] a=new int[m];
		int[] b=new int[m];
		path=new ArrayList[n];

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
		
		dfs(v,1);
		
		System.out.println(ans);
	}
	
	public static void dfs(boolean[] v,int start){
		boolean judge=true;
		for(int i=0;i<n;i++){
			if(v[i+1]==false){
				judge=false;
			}
		}
		if(judge){
			ans++;
			return;
		}else{
			for(int i=0;i<path[start-1].size();i++){
				if(v[path[start-1].get(i)]==false){
					v[path[start-1].get(i)]=true;
					dfs(v,path[start-1].get(i));
					v[path[start-1].get(i)]=false;
				}
			}
			return;
		}
	}
}