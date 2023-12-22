import java.util.*;
public class Main{
	static ArrayList<Integer>[] map;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] costv=new int[n];
		int[] costu=new int[n];
		int u=sc.nextInt()-1;
		int v=sc.nextInt()-1;
		map=new ArrayList[n];
		for(int i=0; i<n; i++){
			map[i]=new ArrayList<>();
		}
		for(int i=1; i<n; i++){
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			map[a].add(b);
			map[b].add(a);
		}
		dfs(-1,v,0,costv);
		dfs(-1,u,0,costu);
		int ans=0;
		for(int i=0; i<n; i++){
			if(costu[i]<costv[i]){
				ans=Math.max(costv[i]-1,ans);
			}
		}
		System.out.println(ans);
	}
	static void dfs(int front,int now,int c,int[] cm){
		cm[now]=c;
		for(int i:map[now]){
			if(front!=i){
				dfs(now,i,c+1,cm);
			}
		}
	}
}
