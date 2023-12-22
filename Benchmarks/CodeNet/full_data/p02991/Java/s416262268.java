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
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		int[] visited = new int[n+1];
		Arrays.fill(visited, Integer.MAX_VALUE);
		ad.add(s);
		visited[s] = 0;
		while(!ad.isEmpty()){
		    Integer now = ad.poll();
		    ArrayList<Integer> first = list[now];
		    for(Integer i : first){
		        ArrayList<Integer> second = list[i];
		        for(Integer j : second){
		            ArrayList<Integer> third = list[j];
		            for(Integer k : third){
		                int before = visited[k];
		                visited[k] = min(visited[k], visited[now] + 1);
		                if(visited[k] != before) ad.add(k);
		            }
		        }
		    }
		}
		if(visited[t] != Integer.MAX_VALUE) result = visited[t];

		// 出力
		System.out.println(result);

	}
}
