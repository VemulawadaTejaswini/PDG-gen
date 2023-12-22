import java.util.Scanner;
import java.util.ArrayList;
public class Main{
	static int[] ans;
	static ArrayList<Integer>[] edge;
	static boolean kk;
	static int goal;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		edge=new ArrayList[m];
		for(int i=0; i<m; i++){
			edge[i]=new ArrayList<>();
		}
		ans=new int[n];
		for(int i = 0; i<m; i++){
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			edge[a].add(b);
		}
		int start=sc.nextInt()-1;
		goal=sc.nextInt()-1;
		 kk=false;
		dfs(start,0);
		if(kk){
			System.out.println(ans[goal]/3);
		}else{
			System.out.println(-1);
		}
	}
	static void dfs(int now,int count){
		if(count!=0 && count%3==0){
			if(ans[now]==1){
				return;
			}
			ans[now]=1;
			if(ans[goal]==1){
				kk=true;
				ans[goal]=count;
				return;
			}
		}
		for(int i:edge[now]){
			dfs(i,count+1);
		}
	}
}


