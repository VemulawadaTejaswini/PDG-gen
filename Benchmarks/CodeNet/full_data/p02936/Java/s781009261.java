
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static List <Integer>[] Edge ;
	static long[] sum;
	static boolean[] visit;
	static Deque <Integer>que;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int q = Integer.parseInt(sc.next());

		Edge = new ArrayList [n];
		for(int i = 0 ; i < n ;i++) {
			Edge[i] = new ArrayList <Integer>();
		}
		
		for(int i = 0 ; i < n-1 ;i++) {
			int a = Integer.parseInt(sc.next())-1;
			int b = Integer.parseInt(sc.next())-1;
			Edge[a].add(b);
			Edge[b].add(a);
		}
		
		sum = new long [n];
		visit = new boolean [n];
		
		for(int i = 0 ; i < q ; i++){
			int p = Integer.parseInt(sc.next());
			long x = Long.parseLong(sc.next());
			sum[p-1] += x;
		}
		que = new ArrayDeque <Integer>();
		visit[0] = true;
		BFS(0);
		
		
		for(int i = 0 ; i < n ;i++) {
			System.out.println(sum[i]);
		}
		
	}
	
	static void BFS(int now) {
		
		if(Edge[now].isEmpty()) {
			return;
		}
		
		for(int i : Edge[now]) {
			if(visit[i]) {
				continue;
			}
			que.addLast(i);
			sum[i] += sum[now];

		}
		if(que.size() == 0) {
			return;
		}
		//System.out.println(now);
		visit[now] = true;
		BFS(que.pollFirst());
		
		
	}
	

}
