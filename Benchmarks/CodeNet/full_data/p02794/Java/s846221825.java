import java.util.*;
public class Main{
	static ArrayList<Edge>[] map;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		map=new ArrayList[n];
		for(int i=0; i<n; i++){
			map[i]=new ArrayList<>();
		}
		for(int i=1; i<n; i++){
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			map[a].add(new Edge(b,i));
			map[b].add(new Edge(a,i));
		}
		
		int m=sc.nextInt();
		long[] s=new long[m];
		for(int i=0; i<m; i++){
			int u=sc.nextInt()-1;
			int v=sc.nextInt()-1;
			s[i]=dfs(u,v,-1);
		}
		long ans=0;
		for(int i=0; i<1<<m; i++){
			long tmp=0;
			for(int j=0; j<m; j++){
				if((i>>j & 1)==1){
					tmp|=s[j];
				}
			}
			long pm=Long.bitCount(tmp);
			if(Integer.bitCount(i)%2==0){
				ans+=1L<<(n-1-pm);
			}else{
				ans-=1L<<(n-1-pm);
			}
		}
		System.out.println(ans);
	}
	static long dfs(int now,int goal,int front){
		for(Edge i:map[now]){
			if(i.to==front){
				continue;
			}
			long tmp=dfs(i.to,goal,now);
			if(tmp!=-1){
				return tmp+(1L<<i.id);
			}
		}
		if(now==goal){
			return 0;
		}else{
			return -1;
		}
	}
	static class Edge{
		int to,id;
		Edge(int to,int id){
			this.to=to;
			this.id=id;
		}
	}
}
