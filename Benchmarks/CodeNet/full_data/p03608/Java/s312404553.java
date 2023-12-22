
import java.util.*;
public class Main {
	
	static int N, M, R, r[], graph[][];	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		R = sc.nextInt();
		r = new int[R];
		for(int i=0;i<R;i++)r[i]= sc.nextInt()-1;
		
		int max = Integer.MAX_VALUE/2;
		graph = new int[N][N];
		for(int t[]:graph)Arrays.fill(t,max);
		for(int i=0;i<M;i++) {
			int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();		
			graph[--A][--B] = graph[B][A] = C;
		}
		sc.close();

		
		for(int k=0;k<N;k++) {
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					graph[i][j]=Math.min(graph[i][j], graph[i][k]+graph[k][j]);
				}
			}
		}
		
		//順列的にR個の回り方全通りを探索する。
		int visited[]=new int[N];
		Arrays.fill(visited, -1);
		
		int min = max;
		for(int t:r) {
			min = Math.min(min, dfs(t, 0, visited));
		}
		
		System.out.println(min);
		
	}
	
	static int dfs(int vertex, int subDist , int visited[]) {
		int subVisited[] = visited.clone();
		subVisited[vertex]=1;
		boolean stop = true;
		for(int t:r) {
			if(subVisited[t]==-1) {
				stop = false;
				break;
			}
		}
		
		if(stop) {
			return subDist;
		}
		
		int min = Integer.MAX_VALUE/2;
		for(int t:r) {
			if (subVisited[t]==1)continue;
			min = Math.min(min, dfs(t, subDist+graph[vertex][t] , subVisited));
		}
		
		return min;
	}
	
}