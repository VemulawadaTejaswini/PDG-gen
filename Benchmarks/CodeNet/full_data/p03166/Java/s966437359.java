public class Main {
  
  public static void main(String[] abc) {
     Main answer = new Main();
     long solution = answer.solve();
     System.out.println(solution);
  }
  
  private int[] dp;
  
  private long solve() {
     Scanner sc = new Scanner();     
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
     int bestLen =0;
     dp = new int[N];
     Arrays.fill(dp, -1);
     for(int i=1;i<=N;i++) {
       bestLen = Math.max(bestLen, getBestLen(i, graph));
     }
     return bestLen;
  }
	  
  private int getBestLen(int u, Map<Integer, List<Integer>> graph) {
	 if (dp[u]!=-1) return dp[u];
     if (!graph.containsKey(u)){
        dp[u]=0;
        return dp[u];
     } else {
        int bestChildLen=0;
        for(int child: graph.get(u)){
         	 int currChildLen = getBestLen(child, graph);
             bestChildLen = Math.max(bestChildLen, currChildLen);
        }
		dp[u] = bestChildLen+1;
        return dp[u];
     }
  }
}