import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;



public class Main{
	static long ans[];
	static long sum[];
	static int n;
	static ArrayList<Integer>[] edges;
	static boolean[] used;
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	   	n = sc.nextInt();
	   	int q = sc.nextInt();
	   	sum = new long[n];
	   	edges = new ArrayList[n];
	   	ans = new long[n];
	   	used = new boolean[n];
	   	for(int i = 0; i < n; i++) {
	   		edges[i] = new ArrayList<>();
	   	}
	   	for(int i = 0; i < n-1; i++) {
	   		int a = sc.nextInt()-1;
	   		int b = sc.nextInt()-1;
	   		edges[a].add(b);
	   	}
	   	for(int i = 0; i < q; i++) {
	   		int p = sc.nextInt();
	   		long x = sc.nextLong();
	   		sum[p-1]=sum[p-1]+x;
	   	}
	   	dfs(0,0);
	  	StringBuilder s = new StringBuilder();
	  	for(int i = 0; i < n; ++i) {
	  		s.append(ans[i]+" ");
	  	}
	  	System.out.println(s.toString());
	}
	 private static void dfs(int i, long j) {
		 if(used[i]) {
			 return;
		 }
		 used[i] = true;
		 ans[i] += sum[i]+j;
		 for(int next : edges[i]) {
			 dfs(next,ans[i]);
		 }
	 }
}