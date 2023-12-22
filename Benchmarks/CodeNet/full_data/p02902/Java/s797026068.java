import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<Integer>[] list=new ArrayList[n];
		for(int i=0; i<n; i++){
			list[i]=new ArrayList<>();
		}
		for(int i=0; i<m; i++){
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			list[a].add(b);
		}
		int mini=Integer.MAX_VALUE;
		int index=-1;
		int[] ans=new int[n];
		for(int i=0; i<n; i++){
			ArrayDeque<Integer>  que=new ArrayDeque<>();
			int[] prev=new int[n];
			int[] dist=new int[n];
			boolean[] visited=new boolean[n];
			que.add(0);
			que.add(i);
			while(!que.isEmpty()){
				int t=que.poll();
				int j=que.poll();
				dist[j]=dist[t]+1;
				prev[j]=t;
				if(visited[j]){
					if(j==i && mini>dist[j]-1){
						index=i;
						mini=dist[j]-1;
						ans=prev;
					}
					break;
				}
				visited[j]=true;
				for(int k:list[j]){
					que.add(j);
					que.add(k);
				}
			}
		}
		if(mini!=Integer.MAX_VALUE){
			System.out.println(mini);
			int i=ans[index];
			System.out.println(index+1);
			while(i!=index){
				System.out.println(i+1);
				i=ans[i];
			}
		}else{
			System.out.println(-1);
		}
	}
}
