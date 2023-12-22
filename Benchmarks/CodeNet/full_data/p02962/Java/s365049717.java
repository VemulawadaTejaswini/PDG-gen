import java.util.*;
class Main{
	public static String s , t;
	public static int n , m;
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		s = input.nextLine();
		t = input.nextLine();
		n = s.length() ;
		m = t.length();
		int eff = (2*n+m)/n;
		eff *= n;

		graph G = new graph(n);
		
		kmp.computeLPSArray(m , t);
		kmp.kmp_search(eff , n , m , s , t , G);
		
		System.out.println(G.DFS(n));
	}
}
class kmp{
	public static int lps[];
	static void computeLPSArray(int m , String t){
		lps = new int[m];
		int length = 0;
		int i = 1;
		while(i < m){
			if(t.charAt(i) == t.charAt(length)){
				length++;
				lps[i] = length;
				i++;
			}
			else{
				if(length != 0)
					length = lps[i-1];
				else
					i++;
			}
		}
	}
	static void kmp_search(int eff , int n , int m , String s , String t , graph G){
		int i = 0 , j = 0;
		while(i < eff){
			if(s.charAt(i%n) == t.charAt(j)){
				i++;
				j++;
			}
			if(j == m){
				G.add_edge((i-m)%n , i%n);
				j = lps[j-1];
			}
			else if(i < eff && s.charAt(i%n) != t.charAt(j)){
				if(j != 0)
					j = lps[j-1];
				else
					i++;
			}
			
		}
	}
}
class graph{
	LinkedList<Integer> G[];
	int mx = 0;
	int color[];
	int dis[];
	boolean cycle = false;
	graph(int V){
		G = new LinkedList[V];
		color = new int[V];
		dis = new int[V];
		for(int i = 0 ;i < V ; i++)
			G[i] = new LinkedList<>();
		
	}
	void add_edge(int a, int b){
		G[a].add(b);
	}
	int DFS(int n){
		for(int i = 0 ;i < n ; i++){
			if(color[i] == 0){
				mx = Math.max(mx , dfs(i));
			}
		}
		if(cycle)
			return -1;
		else
			return mx;

	}
	int dfs(int s){
		color[s] = 1;
		int ans = 0;
		for(int it : G[s]){
			if(color[it] == 0)
				ans = Math.max(ans , dfs(it)+1);
			else if(color[it] == 1)
				cycle = true;
			else
				ans = Math.max(ans , dis[it] + 1);
		}
		dis[s] = ans;
		color[s] = 2;
		return ans;
	}
}
