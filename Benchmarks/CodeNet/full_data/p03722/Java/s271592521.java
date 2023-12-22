import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	long INF=Long.MAX_VALUE/2;
	int n,m;
	long[] dist;
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		
		Edge[] v=new Edge[m];
		for(int i=0;i<m;i++){
			v[i]=new Edge();
			v[i].from=sc.nextInt();
			v[i].to=sc.nextInt();
			v[i].cost=-sc.nextInt();
		}
		
		//dist[i]:iにたどり着く最短距離
		dist=new long[n+1];
		Arrays.fill(dist, INF);
		dist[1]=0; //初期化
		
		//ベルマンフォード法
		boolean flag=true;
		long ans=0;
		int cnt=0;
		while(flag){
			flag=false;
			for(int i=0;i<m;i++){
				if(dist[v[i].from]+v[i].cost<dist[v[i].to]){
					dist[v[i].to]=dist[v[i].from]+v[i].cost;
					flag=true;
				}
			}
			if(cnt==n){
				ans=dist[n];
			}
			if(cnt==2*n){
				if(ans>dist[n]){
					System.out.println("inf");
					return;
				}else{
					System.out.println(-dist[n]);
					return;
				}
			}
			cnt++;
			if(!flag)break;
		}
		
		System.out.println(-dist[n]);
	}
	class Edge{
		int to;
		int from;
		int cost;
	}
}