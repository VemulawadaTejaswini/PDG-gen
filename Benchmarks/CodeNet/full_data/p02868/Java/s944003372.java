import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<State>[] map=new ArrayList[n];
		map[0]=new ArrayList<>();
		for(int i=n-1; i>=1; i--){
			map[i]=new ArrayList<>();
			map[i].add(new State(i-1,0));
		}
		for(int i=0; i<m; i++){
			int l=sc.nextInt()-1;
			int r=sc.nextInt()-1;
			long c=sc.nextLong();
			map[l].add(new State(r,c));
		}
		PriorityQueue<State> q=new PriorityQueue<>();
		long[] dist=new long[n];
		Arrays.fill(dist,-1);
		q.add(new State(0,0));
		while(!q.isEmpty() && dist[n-1]==-1){
			State s=q.poll();
			if(dist[s.l]!=-1){
				continue;
			}
			dist[s.l]=s.c;
			for(State ss:map[s.l]){
				if(dist[ss.l]==-1){
					q.add(new State(ss.l,ss.c+s.c));
				}
			}
		}
		System.out.println(dist[n-1]);
	}
	static class State implements Comparable<State>{
		int l;
		long c;
		State(int l,long c){
			this.l=l;
			this.c=c;
		}
		@Override
		public int compareTo(State o){
			return Long.compare(this.c,o.c);
		}
	}
}
