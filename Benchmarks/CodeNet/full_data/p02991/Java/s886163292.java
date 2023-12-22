import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer>[] list = new ArrayList[n+1];
		for(int i = 1; i <= n; i++){
		    list[i] = new ArrayList<Integer>();
		}
		for(int i = 0; i < m; i++){
		    int from = sc.nextInt();
		    int to = sc.nextInt();
		    list[from].add(to);
		}
		int s = sc.nextInt();
		int t = sc.nextInt();

		// 計算
		int result = -1;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int[] firsts = new int[n+1];
		Arrays.fill(firsts, Integer.MAX_VALUE);
		int[] seconds = new int[n+1];
		Arrays.fill(seconds, Integer.MAX_VALUE);
		int[] thirds = new int[n+1];
		Arrays.fill(thirds, Integer.MAX_VALUE);
		pq.add(s);
		thirds[s] = 0;
		while(!pq.isEmpty()){
		    Integer now = pq.poll();
		    ArrayList<Integer> first = list[now];
		    for(Integer i : first){
		        if(firsts[i] <= thirds[now]) continue;
		        firsts[i] = thirds[now];
		        ArrayList<Integer> second = list[i];
		        for(Integer j : second){
		            if(seconds[i] <= thirds[now]) continue;
		            seconds[i] = thirds[now];
		            ArrayList<Integer> third = list[j];
		            for(Integer k : third){
		                int before = thirds[k];
		                thirds[k] = min(thirds[k], thirds[now] + 1);
		                if(thirds[k] != before) pq.add(k);
		            }
		        }
		    }
		}
		if(thirds[t] != Integer.MAX_VALUE) result = thirds[t];

		// 出力
		System.out.println(result);

	}
}