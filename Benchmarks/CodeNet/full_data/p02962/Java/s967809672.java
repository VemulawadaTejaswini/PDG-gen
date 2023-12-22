import java.util.*;
class Main{
	public static String s , t;
	public static int n , m;
	public static Scanner input = new Scanner(System.in);
	public static int org;
	public static void main(String[] args){
		s = input.nextLine();
		t = input.nextLine();
		n = s.length() ;
		m = t.length();
		String cp = s;
		org = n;
		while(s.length() < n + m)
			s += cp;
		n = s.length();
		
		graph G = new graph(n+m);

		kmp.computeLPSArray(m);
		kmp.kmp_search(n , m , G);
		
		System.out.println(G.longest_path(n));

	}
}
class kmp{
	public static int lps[];
	static void computeLPSArray(int m ){
		lps = new int[m];
		int length = 0;
		int i = 1;
		while(i < m){
			if(Main.t.charAt(i) == Main.t.charAt(length)){
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
	static void kmp_search(int n , int m , graph G){
		int i = 0 , j = 0;
		while(i < n){
			if(Main.s.charAt(i) == Main.t.charAt(j)){
				i++;
				j++;
			}
			if(j == m){
				G.add_edge(i-m , i%Main.org);
				j = lps[j-1];
			}
			else if(i < n && Main.s.charAt(i) != Main.t.charAt(j)){
				if(j != 0)
					j = lps[j-1];
				else
					i++;
			}

		}
	}
}
class graph{
	int v;
	LinkedList<Integer> G[];
	int indeg[];
	boolean visited[];
	int max_dis[];
	graph(int V){
		v = V;
		indeg = new int[V];
		visited = new boolean[V];
		max_dis = new int[V];
		G = new LinkedList[V];
		for(int i = 0 ;i < V ; i++)
			G[i] = new LinkedList<>();
	} 
	void add_edge(int a, int b){
		G[a].add(b);
		indeg[b]++;
	}
	
	int longest_path(int n){
		Queue<Integer> q = new LinkedList<>();
		int mx = 0 , cnt = 0;
		for(int i = 0 ;i < n; i++){
			if(indeg[i] == 0)
				q.add(i);
		}
		while(q.size() > 0){
			int u = q.peek();
			
			mx = Math.max(mx , max_dis[u]);
			q.remove();
			cnt++;
			visited[u] = true;
			for(int v : G[u]){
				if(!visited[v]){
					indeg[v]--;
					max_dis[v] = Math.max(max_dis[v] , max_dis[u] + 1);
					if(indeg[v] == 0)
						q.add(v);
				}
				else
					return -1;
			}
		}
		if(cnt < n)
			return -1;
		return mx;
	}	
}




