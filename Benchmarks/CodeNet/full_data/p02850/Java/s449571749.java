import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] cnt = new int[n+1];
		int k = 0;
		Edge[] edge = new Edge[n];
		ArrayList<Edge>[] list = new ArrayList[n+1];
		for(int i = 1; i <= n; i++){
		    list[i] = new ArrayList<Edge>();
		}
		for(int i = 0; i < n-1; i++){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    cnt[a]++;
		    cnt[b]++;
		    k = max(k, max(cnt[a], cnt[b]));
		    if(a > b){
		        int c = a;
		        a = b;
		        b = c;
		    }
		    edge[i] = new Edge(a, b, 0);
		    list[a].add(edge[i]);
		    list[b].add(edge[i]);
		}
		
		// 計算
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int[] color = new int[n+1];
		int[] visited = new int[n+1];
		pq.add(1);
		while(!pq.isEmpty()){
		    Integer i = pq.poll();
		    visited[i] = 1;
		    ArrayList<Edge> edges = list[i];
		    int c = color[i];
		    for(Edge e : edges){
		        int next = e.from;
		        if(i == next) next = e.to;
		        if(visited[next] == 1) continue;
		        c++;
		        if(c > k) c = 1;
		        e.c = c;
		        color[next] = c;
		        pq.add(next);
		    }
		}
		
		// 出力
		System.out.println(k);
		for(int i = 0; i < n-1; i++){
		    System.out.println(edge[i].c);
		}
	}
}

class Edge {
    int from;
    int to;
    int c;
    
    Edge(int from, int to, int c){
        this.from = from;
        this.to = to;
        this.c = c;
    }

    public String toString(){
        return "from:" + from + " to:" + to + " c:" + c;
    }   
}
