import java.util.*;
import java.io.*;
import java.math.*;
class Main{
	static int solve(int src,ArrayList<ArrayList<Integer>>graph,int[]dp){
		if(dp[src]!=0)
			return dp[src];
		boolean leaf=true;
		int bestChild=0;
		for(int child:graph.get(src)){
			leaf=false;
			bestChild=Math.max(bestChild,solve(child,graph,dp));
		}
		return dp[src]=leaf?0:1+bestChild;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String[]s1=s.split(" ");
		int n=Integer.parseInt(s1[0]);
		int m=Integer.parseInt(s1[1]);
		ArrayList<ArrayList<Integer>>graph=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<=n;i++)
			graph.add(new ArrayList<Integer>());
		for(int i=1;i<=m;i++){
			String l=br.readLine();
			String[]l1=l.split(" ");
			int x=Integer.parseInt(l1[0]);
			int y=Integer.parseInt(l1[1]);
			graph.get(x).add(y);
		}
		int[]dp=new int[10001];
		int ans=0;
		for(int i=1;i<=n;i++){
			ans=Math.max(ans,solve(i,graph,dp));
		}
		System.out.println(ans);
	}
}