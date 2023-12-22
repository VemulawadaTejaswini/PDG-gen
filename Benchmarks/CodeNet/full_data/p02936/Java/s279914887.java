import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[] result = new int[n];
		ArrayList<Edge>[] list = new ArrayList[n];
		for(int i = 0; i < n; i++){
		    list[i] = new ArrayList<Edge>();
		}
		for(int i = 0; i < n-1; i++){
		    int from = sc.nextInt()-1;
		    int to = sc.nextInt()-1;
		    list[from].add(new Edge(from, to, 0));
		    list[to].add(new Edge(to, from, 0));
		}
		int[] c = new int[n];
		for(int i = 0; i < q; i++){
		    int index = sc.nextInt()-1;
		    c[index] += sc.nextInt();
		}
		
		// 計算
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int[] visited = new int[n];
		pq.add(0);
		result[0] = c[0];
		visited[0] = 1;
		while(!pq.isEmpty()){
		    int from = pq.poll();
		    for(Edge e : list[from]){
		        int to = e.to;
		        if(visited[to] == 1) continue;
		        visited[to] = 1;
		        result[to] = result[from] + c[to];
		        pq.add(to);
		    }
		}
		
		// 出力
		for(int i = 0; i < n; i++){
		    System.out.print(result[i] + " ");
		}
		
	}
}

class Edge {
    int from;
    int to;
    int weight;
    
    Edge(int from, int to, int weight){
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    public String toString(){
        return "from:" + from + " to:" + to + " weight:" + weight;
    }   
}

