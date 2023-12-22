import java.util.Scanner;
import java.util.ArrayList;
public class Main{
	static ArrayList<Integer>[] list;
	static boolean[] check;
	static int n;
	static int count=0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int m=sc.nextInt();
		list=new ArrayList[n];
		check=new boolean[n];
		for(int i=0; i<n; i++){
			list[i]=new ArrayList<>();
		}
		int[][] ab=new int[m][2];
		for(int i=0; i<m; i++){
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			list[a].add(b);
			list[b].add(a);
			ab[i][0]=a;
			ab[i][1]=b;
		}
		int ans=0;
		for(int i=0; i<m; i++){
			count=0;
			if(dfs(ab[i][0],ab[i][1],0)){
				ans++;
			}
		}
		System.out.println(ans);
	}
	static boolean dfs(int a,int b,int now){
		count++;
		if(count==n){
			System.out.print(count+" ");
			return false;
		}
		check[now]=true;
		for(int i:list[now]){
			if(!check[i] && !(now==a && i==b) && !(now==b && i==a)){
				if(!dfs(a,b,i)){
					check[now]=false;
					return false;
				}
			}
		}
		check[now]=false;
		return true;
	}
}
