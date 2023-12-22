import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static boolean augment(boolean[][] adj, int node, int[] n_to_m, int[] m_to_n, boolean[] visited){
		final int n = adj.length;
		final int m = adj[0].length;
		
		if(node < 0){ return true; }
		for(int match = 0; match < m; match++){
			if(!adj[node][match]){ continue; }
			if(visited[match]){ continue; }
			
			visited[match] = true;
			if(augment(adj, m_to_n[match], n_to_m, m_to_n, visited)){
				n_to_m[node] = match;
				m_to_n[match] = node;
				return true;
			}
		}
		
		return false;
	}	
	
	public static int matching(boolean[][] adj){
		final int n = adj.length;
		final int m = adj[0].length;
		
		int[] n_to_m = new int[n];
		int[] m_to_n = new int[m];
		Arrays.fill(n_to_m, -1);
		Arrays.fill(m_to_n, -1);
		
		int match = 0;
		for(int node = 0; node < n; node++){
			boolean[] visited = new boolean[m];
			
			if(augment(adj, node, n_to_m, m_to_n, visited)){
				match++;
			}
		}
		
		return match;
	}
	
	public static final int toInt(int x, int y){
		return y * 120 + x;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		int[] f_rs = new int[n];
		int[] f_cs = new int[n];
		int[] s_rs = new int[n];
		int[] s_cs = new int[n];
		
		for(int i = 0; i < n; i++){
			final int f_r = sc.nextInt();
			final int f_c = sc.nextInt();
			final int s_r = sc.nextInt();
			final int s_c = sc.nextInt();
			
			f_rs[i] = f_r;
			f_cs[i] = f_c;
			s_rs[i] = s_r;
			s_cs[i] = s_c;
		}
		
		int points = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < n; i++){
			final int f_hash = toInt(f_rs[i], f_cs[i]);
			if(!map.containsKey(f_hash)){ map.put(f_hash, points++); }
			final int s_hash = toInt(s_rs[i], s_cs[i]);
			if(!map.containsKey(s_hash)){ map.put(s_hash, points++); }
		}
		
		boolean[][] adj = new boolean[n][points];
		for(int i = 0; i < n; i++){
			final int f_hash = toInt(f_rs[i], f_cs[i]);
			final int s_hash = toInt(s_rs[i], s_cs[i]);
			final int f_index = map.get(f_hash);
			final int s_index = map.get(s_hash);
			
			adj[i][f_index] = adj[i][s_index] = true;
		}
		
		System.out.println(matching(adj) == n ? "YES" : "NO");
	}
}