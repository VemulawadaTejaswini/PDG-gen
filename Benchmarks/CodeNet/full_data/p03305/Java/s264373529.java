import java.util.*;
import java.io.PrintWriter;
public class Main{
	static int n;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int m=sc.nextInt();
		int s=sc.nextInt()-1;
		int t=sc.nextInt()-1;
		ArrayList<Node>[] aedge=new ArrayList[n];
		ArrayList<Node>[] bedge=new ArrayList[n];
		for(int i=0; i<n; i++){
			aedge[i]=new ArrayList<>();
			bedge[i]=new ArrayList<>();
		}
		for(int i=0; i<m; i++){
			int u=sc.nextInt()-1;
			int v=sc.nextInt()-1;
			int a=sc.nextInt();
			int b=sc.nextInt();
			aedge[u].add(new Node(v,a));
			aedge[v].add(new Node(u,a));
			bedge[u].add(new Node(v,b));
			bedge[v].add(new Node(u,b));
		}
		long[] sfor=Dijkstra(aedge,s);
		long[] tfor=Dijkstra(bedge,t);
		
		long[] ans=new long[n];
		long hand=1000000000000000L;
		ans[n-1]=sfor[n-1]+tfor[n-1];
		for(int i=n-2; i>=0; i--){
			ans[i]=Math.min(ans[i+1],sfor[i]+tfor[i]);
		}
		PrintWriter pw=new PrintWriter(System.out);
		for(int i=0; i<n; i++){
			pw.println(hand-ans[i]);
		}
		pw.flush();
	}
	static long[] Dijkstra(ArrayList<Node>[] edge,int start){
		long[] re=new long[n];
		Arrays.fill(re,-1);
		PriorityQueue<Node> q=new PriorityQueue<>((x,y)->((x.dis-y.dis)<0?-1:1));
		q.add(new Node(start,0));
		while(!q.isEmpty()){
			Node node=q.poll();
			if(re[node.goal]!=-1) continue;
			re[node.goal]=node.dis;
			for(Node tmp:edge[node.goal]){
				if(re[tmp.goal]!=-1) continue;
				q.add(new Node(tmp.goal,node.dis+tmp.dis));
			}
		}
		return re;
	}
	static class Node{
		int goal;
		long dis;
		Node(int goal,long dis){
			this.goal=goal;
			this.dis=dis;
		}
	}
}
