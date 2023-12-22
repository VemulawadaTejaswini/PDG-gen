import java.util.*;
import java.io.*;

public class Main {
  
  public static void main(String[] abc) {
     Main answer = new Main();
     long solution = answer.solve();
     System.out.println(solution);
  }
  
  private long[] dp;
  
  private long solve() {
     Scanner sc = new Scanner(System.in);     
     int N = sc.nextInt();
     int M = sc.nextInt();
     Map<Integer, List<Integer>> graph = new HashMap<>();
     for(int i=0;i<M;i++) {
        int u = sc.nextInt();
        int v = sc.nextInt();
        List<Integer> children = graph.getOrDefault(u, new ArrayList<>());        
        children.add(v);
        graph.put(u, children);
     }
     long bestLen =0;
     dp = new long[1000000];
     Arrays.fill(dp, -1);
     for(int i=1;i<=N;i++) {
       bestLen = Math.max(bestLen, getBestLen(i, graph));
     }
     return bestLen;
  }
	  
  private long getBestLen(int u, Map<Integer, List<Integer>> graph) {
	 if (dp[u]!=-1) return dp[u];
     if (!graph.containsKey(u)){
        dp[u]=0;
        return dp[u];
     } else {
        long bestChildLen=0;
        for(int child: graph.get(u)){
         	 long currChildLen = getBestLen(child, graph);
             bestChildLen = Math.max(bestChildLen, currChildLen);
        }
		dp[u] = bestChildLen+1;
        return dp[u];
     }
  }
}
