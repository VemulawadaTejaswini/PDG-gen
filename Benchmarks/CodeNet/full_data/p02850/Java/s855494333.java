import java.util.*;
public class Main{
	static int[] ans;
	static ArrayList<State>[] list;
	static int max=0;
	static int n;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		ans=new int[n-1];
		list=new ArrayList[n];
		for(int i=0; i<n; i++){
			list[i]=new ArrayList<>();
		}
		for(int i=0; i<n-1; i++){
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			list[a].add(new State(b,i));
			list[b].add(new State(a,i));
		}
		dfs(-1,-1,0);
		System.out.println(max);
		for(int i=0; i<n-1;i++){
			System.out.println(ans[i]);
		}
		
	}
	static void dfs(int front,int no,int now){
		int count=1;
		for(State i:list[now]){
			if(i.g==front){
				continue;
			}
			if(count==no){
				count++;
			}
			max=Math.max(max,count);
			ans[i.ind]=count;
			dfs(now,count++,i.g);
		}
	}
	static class State{
		int g,ind;
		State(int g,int ind){
			this.g=g;
			this.ind=ind;
		}
	}
}
