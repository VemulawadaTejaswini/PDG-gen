import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
//		// get a integer
//		int a = sc.nextInt();
//		// get a string
//		String s = sc.next();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] edge = new int[m][2];
		for(int i=0; i<m; i++){
			edge[i][0] = sc.nextInt();
			edge[i][1] = sc.nextInt();
		}
		
		System.out.println(hamiltonpath(n, m , edge));
	}
	
	public static LinkedList<Integer> hamiltonpath(int n, int m, int[][] edge){
		LinkedList<Integer> res = new LinkedList<>();
		List<List<Integer>> graph = new ArrayList<>();
		for(int i=0; i<n+1; i++){
			graph.add(new ArrayList<Integer>());
		}
		for(int i=0; i<m; i++){
			graph.get(edge[i][0]).add(edge[i][1]);
			graph.get(edge[i][1]).add(edge[i][0]);
		}
		boolean[] visited = new boolean[n+1];
		find(n, m, 5, graph, res, visited, true);
		res.removeFirst();
		find(n, m, 5, graph, res, visited, false);
		return res;
	}
	
	public static void find(int n, int m, int node, List<List<Integer>> graph, LinkedList<Integer> res, boolean[] visited, boolean forward){
		visited[node] = true;
		if(forward)
			res.add(node);
		else	res.addFirst(node);
		for(int i=0; i<graph.get(node).size(); i++){
			if(!visited[graph.get(node).get(i)]){
				find(n, m, graph.get(node).get(i), graph, res, visited, forward);
				return;
			}
		}
	}
}
