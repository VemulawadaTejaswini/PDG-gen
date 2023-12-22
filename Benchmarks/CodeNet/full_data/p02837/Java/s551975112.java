import java.util.*;
public class Main {
	static int N, A[];
	static List X;
	static boolean mujun;
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = new int[N];

		X = new ArrayList<ArrayList<int[]>>();
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
			List tmp = new ArrayList<int[]>();
			for(int j=0;j<A[i];j++) {
				int x = sc.nextInt() - 1; //人だけ０スタートにする
				int y = sc.nextInt();
				int t[] = {x, y};
				tmp.add(t);
			}	
			X.add(tmp);
		}
		sc.close();
		
		int ans = 0;
		//iさんを、正直者と仮定する。
		for(int i = 0;i<N;i++) {
			int visited[] = new int[N];
			mujun = false;
			dfs(i, visited);
			if(mujun) continue;
			
			for(int j=0;j<N;j++) {
				if(visited[j]==0) {
					int subVisited[] = visited.clone();
					mujun = false;
					dfs(j, subVisited);
					if(mujun) continue;
					visited = subVisited;
				}
			}
			
			int cnt = 0;
			for(int t:visited) {
				if(t==1)cnt ++;
			}
			
			ans = Math.max(ans, cnt);
		}
		System.out.println(ans);
	}
	
	static void dfs(int x, int[] visited) {
		visited[x]=1;
		List T = (List)X.get(x);
		for(int i=0;i<A[x];i++) {
			int[] tmp = (int[])T.get(i);
			int next = tmp[0];
			int nextTrue = tmp[1]; 
			
			if(nextTrue == 0) {
				if(visited[next]==1) {
					mujun = true;
				}
				visited[next] = -1;
			}
			else {
				if(visited[next]==-1) {
					mujun = true;
				}
			}
			
			if(!isVisited(next, visited)&&nextTrue==1) {
				dfs(next,visited);
			}
		}
	}
	
	static boolean isVisited(int x, int[] visited) {
		if(visited[x]==1||visited[x]==-1) return true;
		return false;
	}
	
}