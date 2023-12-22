import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] temp = new int[n+1];
		ArrayList<Edge>[] list = new ArrayList[n+1];
		for(int i = 1; i <= n; i++){
		    list[i] = new ArrayList<Edge>();
		}
		for(int i = 1; i < n; i++){
		    int u = sc.nextInt();
		    int v = sc.nextInt();
		    int w = sc.nextInt();
		    if(w%2 == 0){
		        w = 1;
		    }else{
		        w = -1;
		    }
		    /*if(u > v){
		        int temp = u;
		        u = v;
		        v = temp;
		    }*/
		    list[u].add(new Edge(u, v, w));
		    list[v].add(new Edge(v, u, w));
		}
		
		// 計算
		int[] result = new int[n+1];
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		q.add(1);
		while(!q.isEmpty()){
		    int now = q.poll();
		    if(result[now] == 0) result[now] = 1;
		    for(Edge e : list[now]){
		        int i = e.v;
		        if(result[i] != 0) continue;
		        result[i] = result[now]*e.w;
		        q.add(i);
		    }
		}
		
		// 出力
        for(int i = 1; i <= n; i++){
		    System.out.println(max(0, result[i]));
		}
		//System.out.println(result);
	}

}

class Edge {
    int u;
    int v;
    int w;
    
    Edge(int u, int v, int w){
        this.u = u;
        this.v = v;
        this.w = w;
    }
    
    
    public String toString(){
        return "u:" + u + " v:" + v + " w:" + w;
    }
    
}