import java.util.*;
public class Main {
	static int dp[]=new int[100001];
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<ArrayList<Integer>> g=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++){
			g.add(new ArrayList<Integer>());
		}
		for(int i=0;i<m;i++){
			int x=sc.nextInt();
			int y=sc.nextInt();
			g.get(x-1).add(y-1);
		}
		int ans=0;
		for(int i=0;i<n;i++){
			ans=Math.max(ans,dfs(i,g));
		}
		System.out.println(ans);
	}
	public static int dfs(int i,ArrayList<ArrayList<Integer>> g){
		int temp=0;
		if(dp[i]!=0){
			return dp[i];
		}
		for(int z:g.get(i)){
			temp=Math.max(temp,dfs(z,g)+1);
		}
		dp[i]=temp;
		return temp;
	}
}