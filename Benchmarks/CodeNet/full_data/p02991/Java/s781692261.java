import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Main{
	static int[][] visit;
	static ArrayList<Integer>[] map;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		visit=new int[n][3];
		map=new ArrayList[n];
		for(int i=0; i<n; i++){
			map[i]=new ArrayList<>();
			Arrays.fill(visit[i],Integer.MAX_VALUE);
		}
		for(int i=0; i<m; i++){
			int u=sc.nextInt()-1;
			int v =sc.nextInt()-1;
			map[u].add(v);
		}
		int s =sc.nextInt()-1;
		int t =sc.nextInt()-1;
		dfs(0,s);
		if(visit[t][0]!=Integer.MAX_VALUE){
			System.out.println(visit[t][0]/3);
		}else{
			System.out.println(-1);
		}
	}
	static void dfs(int count,int now){
		if(visit[now][count%3]>count){
			visit[now][count%3]=count;
		}else{
			return;
		}
		for(int i:map[now]){
			dfs(count+1,i);
		}
	}
}


