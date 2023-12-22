import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		long k = sc.nextLong();
		int MOD = 1000000007;
		ArrayList<Integer>[] list = new ArrayList[n+1];
		for(int i = 1; i <= n; i++){
		    list[i] = new ArrayList<Integer>();
		}
		for(int i = 0; i < n-1; i++){
		    int from = sc.nextInt();
		    int to = sc.nextInt();
		    list[from].add(to);
		    list[to].add(from);
		}

		// 計算
		long result = k;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int[] visited = new int[n+1];
		pq.add(1);
		visited[1] = 1;
		while(!pq.isEmpty()){
		    Integer now = pq.poll();
		    ArrayList<Integer> next = list[now];
		    long cnt = k - 1;
		    if(now == 1) cnt = k;
		    for(Integer i : next){
		        if(visited[i] == 1) continue;
		        visited[i] = 1;
		        pq.add(i);
		        cnt = max(cnt - 1, 0);
		        result = (result * cnt)%MOD;
		    }
		}

		// 出力
		System.out.println(result);

	}
}