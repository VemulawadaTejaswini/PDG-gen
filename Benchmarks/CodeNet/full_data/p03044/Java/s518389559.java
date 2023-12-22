import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[][] edge = new int[n+1][n+1];
		ArrayList<Integer>[] list = new ArrayList[n+1];
		Arrays.fill(list, new ArrayList<Integer>());
		for(int i = 1; i < n; i++){
		    int u = sc.nextInt();
		    int v = sc.nextInt();
		    int w = sc.nextInt();
		    if(w%2 == 0){
		        w = 1;
		    }else{
		        w = -1;
		    }
		    edge[u][v] = w;
		    edge[v][u] = w;
		    list[u].add(v);
		    list[v].add(u);
		}
		
		// 計算
		int[] result = new int[n+1];
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		q.add(1);
		while(!q.isEmpty()){
		    int now = q.poll();
		    if(result[now] == 0) result[now] = 1;
		    for(Integer i : list[now]){
		        if(result[i] != 0) continue;
		        result[i] = result[now]*edge[now][i];
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
