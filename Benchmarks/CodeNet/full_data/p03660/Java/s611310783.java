import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	int N;
	int[]a;
	int[]b;
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		a=new int[N-1];
		b=new int[N-1];
		ArrayList<Integer>[] path=new ArrayList[N];
		int []dist_1=new int[N];
		int []dist_N=new int[N];
		boolean[] visited=new boolean[N];
		dist_1[0]=0;
		dist_N[N-1]=0;
		for(int i=0;i<N;i++){
			path[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<N-1;i++){
			a[i]=sc.nextInt()-1;
			b[i]=sc.nextInt()-1;
			path[a[i]].add(b[i]);
			path[b[i]].add(b[i]);
		}
		
		Queue<Integer> nowq=new LinkedList<Integer>();
		Queue<Integer> nextq=new LinkedList<Integer>();
		
		nowq.add(0);
		int count=0;
		while(!nowq.isEmpty()){
			int now=nowq.poll();
			visited[now]=true;
			dist_1[now]=count;
			
			for(int i=0;i<path[now].size();i++){
				if(!visited[path[now].get(i)]) nextq.add(path[now].get(i));
			}
			nowq=nextq;
			count++;
		}
		
		nowq.add(N-1);
		count=0;
		Arrays.fill(visited, false);
		while(!nowq.isEmpty()){
			int now=nowq.poll();
			visited[now]=true;
			dist_N[now]=count;
			
			for(int i=0;i<path[now].size();i++){
				if(!visited[path[now].get(i)]) nextq.add(path[now].get(i));
			}
			nowq=nextq;
			count++;
		}
		
		int snukeCount=0;
		int fennecCount=0;
		for(int i=0;i<N;i++){
			if(dist_1[i]<=dist_N[i])fennecCount++;
			else snukeCount++;
		}
		
		if(fennecCount>snukeCount)System.out.println("Fennec");
		else System.out.println("Snuke");
		
	}
}
