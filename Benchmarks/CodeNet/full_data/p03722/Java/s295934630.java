import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	int n,m;
	int[]a;
	int[]b;
	long[]c;
	long[][] path;
	long cost=0;
	long Max=Long.MIN_VALUE/2;
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		a=new int[m];
		b=new int[m];
		c=new long[m];
		path=new long[n+1][n+1];
		for(int i=0;i<m;i++){
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			c[i]=sc.nextLong();
			path[a[i]][b[i]]=c[i];
		}
		for(int i=1;i<=n;i++){
			if(path[n][i]>0 && path[i][n]>0){
				System.out.println("inf");
				return;
			}
		}
		dfs(1);
		System.out.println(Max);
		
	}
	void dfs(int x){
		if(x==n){
			if(Max<cost)Max=cost;
		}
		for(int i=1;i<=n;i++){
			if(path[x][i]!=0){
				cost+=path[x][i];
				dfs(i);
				cost-=path[x][i];
			}
		}
	}
}
