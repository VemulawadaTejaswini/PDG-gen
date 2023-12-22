import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
 
 
public class Main {

	static long MOD = 1_000_000_007;
	static long[] fac;
	static long[] finv ;
	static long[] inv ;

	
	static int[] dp;
	static int INF = Integer.MAX_VALUE;
	static List<List<Integer>>map;
	static boolean[] visited;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//int N = Integer.parseInt(sc.next());
		//long L = Long.parseLong(sc.next());
		
		Scanner sc = new Scanner(System.in);
		//char[] c = sc.next().toCharArray();
		//int N = A.length;
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		
		map = new ArrayList<>();
		for(int i=0; i<N; i++){
			List<Integer> dot = new ArrayList<>();
			map.add(dot);
		}
		dp = new int[N];
		visited = new boolean[N];
		Arrays.fill(dp,INF);
		Arrays.fill(visited, false);
		
	    for(int i=0; i<M; i++){
	    	int u = Integer.parseInt(sc.next())-1;
	    	int v = Integer.parseInt(sc.next())-1;
	    	map.get(v).add(u);
	    }
		
	    int start = Integer.parseInt(sc.next())-1;
		int end = Integer.parseInt(sc.next())-1;
		
		dp[end] = 0;
		for(int to : map.get(end)){
			walk(end, end, to, 1);
		}
		
		int ans = INF;
		if(dp[start] == INF){
			ans = -1;
		}else{
			ans = dp[start];
		}
	    
		System.out.println("-1");
		
	}
	
	static void walk(int parent, int from, int to, int count){
		if(visited[parent])return;
		/*
		System.out.println("from:"+from+"\tto:"+to+"\tcount:"+count);
		for(int d :dp){
			System.out.print(d+" ");
		}
		System.out.println();
		*/
		if(count == 3){
			if(dp[to] != INF){
				dp[to] = Math.min(dp[to],dp[parent]+1);
				visited[parent] = true;
				return;
			}else{
				dp[to] = Math.min(dp[to],dp[parent]+1);
				visited[parent] = true;
				for(int to_ : map.get(to)){
					walk(to, to, to_, 1);
				}
			}
		}else{
			for(int to_ : map.get(to)){
				walk(parent, to, to_, count+1);
			}
		}
	}
	
	static long COM(int n, int k){
	    if (n < k) return 0;
	    if (n < 0 || k < 0) return 0;
	    return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
	}
	
	static long lcm (long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return (c/b);
	}
}

