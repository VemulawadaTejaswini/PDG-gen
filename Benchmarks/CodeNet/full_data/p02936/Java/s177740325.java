import java.util.Scanner;
import java.util.ArrayList;
public class Main{
	static ArrayList<Integer>[] list;
	static long[] ans;
	static long[] point;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int q =sc.nextInt();
		list=new ArrayList[n];
		for(int i=0; i<n; i++){
			list[i]=new ArrayList<>();
		}
		for(int i=0; i<n-1; i++){
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			list[a].add(b);
		}
		point=new long[n];
		for(int i=0; i<q; i++){
			int p=sc.nextInt()-1;
			int x=sc.nextInt();
			point[p]+=x;
		}
		ans=new long[n];
		dfs(0,0);
		for(int i=0; i<n; i++){
			System.out.print(ans[i]+" ");
		}
	}
	static void dfs(int now,long sum){
		ans[now]=sum+point[now];
		for(int i:list[now]){
			dfs(i,sum+point[now]);
		}
		return;
	}
}
