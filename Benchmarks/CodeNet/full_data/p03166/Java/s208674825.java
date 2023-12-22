//LongestPath
import java.io.*;
import java.util.*;
public class Main{
static int n,m;
static int[] b=new int[10005];
static ArrayList<Integer> adj[];
static int[] dist;
static int[] indegree;
public static void dfs(int node,boolean[] vis){	
	vis[node]=true;	
	for(Integer children:adj[node]){
		dist[children]=Math.max(dist[children],dist[node]+1);
		indegree[children]--;
		if(!vis[children]&&indegree[children]==0){
			dfs(children,vis);
		}
	}
	
}
public static int solve(){
	int ans=0;	
	boolean[] vis=new boolean[n+1];
	for(int i=1;i<=n;i++){	
		if(!vis[i]&&indegree[i]==0){
			dfs(i,vis);				
		}						
	}	
	for(int i=1;i<=n;i++){ans=Math.max(ans,dist[i]);}
	return ans;
}
public static void main(String[] args) throws IOException{
		// BufferedReader br = new BufferedReader(new
  //      FileReader("sampleinp.txt"));
    	BufferedReader br = new BufferedReader( 
                             new InputStreamReader(System.in)); 
		String str[]=br.readLine().split(" ");
	 	StringBuilder ans=new StringBuilder();
	 	n=Integer.parseInt(str[0]);
	 	m=Integer.parseInt(str[1]);
	 	adj=new ArrayList[n+1];
	 	dist=new int[n+1];
	 	indegree=new int[n+1];
	 	for(int i=1;i<=n;i++){adj[i]=new ArrayList<>();}
	 	for(int i=1;i<=m;i++){
	 		str=br.readLine().split(" ");
	 		int u=Integer.parseInt(str[0]);
	 		int v=Integer.parseInt(str[1]);
	 		adj[u].add(v);
	 		indegree[v]++;
	 	}
	 		
	 	ans.append(solve());
		// PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("sampleout.txt")));
  //       pw.write(ans.toString());
  //       pw.flush();
	 	System.out.println(ans.toString());

    }
}