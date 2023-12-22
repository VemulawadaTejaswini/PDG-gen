import java.io.*;
import java.util.*;
public class Main {
 
  public static void main(String[] args) { 
        solve();
      out.close();
  }

  static class Node {
    int stat;
    int comp;
    public Node(int stat, int comp) {
      this.stat = stat;
      this.comp = comp;
    }
  }

  private static void solve() {
      int n = sc.nextInt();
      int m = sc.nextInt();
      Map<Integer, List<Node>> graph = new HashMap<>(); 
      for(int i = 1; i <= n; i++)
        graph.put(i, new ArrayList<>());
      for(int i = 0; i < m; i++) {
        int u = sc.nextInt();
        int v = sc.nextInt();
        int c = sc.nextInt();
        graph.get(u).add(new Node(v, c));
      }

      long[] dist = new long[n+1];
      Arrays.fill(dist, Long.MAX_VALUE);
      dist[1] = 0;

      ArrayDeque<Node> queue = new ArrayDeque<>();
      queue.offer(new Node(1, 0));
      while(!queue.isEmpty()) {
        Node node = queue.poll();
        int curStat = node.stat;
        if(curStat == n) break;
        int curComp = node.comp;
        for(Node adj : graph.get(curStat)) {
          int cost = (adj.comp == curComp) ? 0 : 1;
          if(dist[adj.stat] > cost + dist[curStat]) {
            dist[adj.stat] = cost + dist[curStat];
            if(cost == 0) {
              queue.offerFirst(adj);
            } else {
              queue.offerLast(adj);
            }
          }
        }
      }
      out.println(dist[n] == Long.MAX_VALUE ? -1 : dist[n]);
  }

  private static String mkArr(int[] arr) {
    StringBuilder sb = new StringBuilder();
    for(int a : arr) {
      sb.append(a + " ");
    }
    return sb.toString();
  }

  private static String mkList(List<Integer> arr) {
    StringBuilder sb = new StringBuilder();
    for(int a : arr) {
      sb.append(a + " ");
    }
    return sb.toString();
  }
  
  static int mod = 1_000_000_007;

    private static long C(int n, int k) {
    long res1 = factor(n-k+1, n);
    long res2 = factor(1, k);
    long reverse = reverse(res2);
    return (res1 * reverse) % mod;
  }

  private static long reverse(long a) {
    return powMod(a, mod - 2);
  }

  private static long factor(int left, int right){
    long res = 1;
    for(int i = left; i <= right; i++)
      res = (res * i) % mod;
    return res;
  }

  public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
 
  public static FastScanner sc = new FastScanner();

  static class FastScanner {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st=new StringTokenizer("");
      String next() {
        while (!st.hasMoreTokens())
          try {
            st=new StringTokenizer(br.readLine());
          } catch (IOException e) {
            e.printStackTrace();
          }
        return st.nextToken();
      }
      
      int nextInt() {
        return Integer.parseInt(next());
      }
      int[] readArray(int n) {
        int[] a=new int[n];
        for (int i=0; i<n; i++) a[i]=nextInt();
        return a;
      }
      long nextLong() {
        return Long.parseLong(next());
      }
  }

  static long pow(long a, long N) {
    if (N == 0) return 1;
    else if (N == 1) return a;
    else {
      long R = pow(a,N/2);
      if (N % 2 == 0) {
        return R*R;
      }
      else {
        return R*R*a;
      }
    }
  }
   
  static long powMod(long a, long N) {
    if (N == 0) return 1;
    else if (N == 1) return a % mod;
    else {
      long R = powMod(a,N/2) % mod;
      R = (R * R) % mod;
      if (N % 2 == 1) {
        R = (R * a) % mod;
      }
        return R % mod;
    }
  }

  static void mergeSort(int[] A){ // low to hi sort, single array only
    int n = A.length;
    if (n < 2) return;
    int[] l = new int[n/2];
    int[] r = new int[n - n/2];

    for (int i = 0; i < n/2; i++){
      l[i] = A[i];
    }

    for (int j = n/2; j < n; j++){
      r[j-n/2] = A[j];
    }

    mergeSort(l);
    mergeSort(r);
    merge(l, r, A);
  }
 
  static void merge(int[] l, int[] r, int[] a){
    int i = 0, j = 0, k = 0;
    while (i < l.length && j < r.length && k < a.length){
      if (l[i] < r[j]){
        a[k] = l[i];
        i++;
      }
      else{
        a[k] = r[j];
        j++;
      }
      k++;
    }
    while (i < l.length){
      a[k] = l[i];
      i++;
      k++;
    }

    while (j < r.length){
      a[k] = r[j];
      j++;
      k++;
    }
  }

  private static class Edge {
    int src;
    int dest;
    int weight;
    public Edge(int s, int d, int w) {
      this.src = s;
      this.dest = d;
      this.weight = w;
    }
  }
  private static int[] prim(Map<Integer, List<Edge>> graph) {
      int n = graph.size(); // number of the nodes
      Edge[] edges = new Edge[n];
      for(int i = 0; i < n; i++)
        edges[i] = new Edge(-1, i, Integer.MAX_VALUE);
      edges[0].weight = 0;

      int[] parents = new int[n];
      parents[0] = -1;

      TreeSet<Edge> treeSet = new TreeSet<>((a, b) -> a.weight - b.weight);
      treeSet.add(edges[0]);

      boolean[] visited = new boolean[n];
      while(treeSet.size() > 0) {
        Edge e = treeSet.pollFirst();
        visited[e.dest] = true;
        for(Edge child : graph.get(e.dest)) {
          if(visited[child.dest]) continue;
          if(edges[child.dest].weight > child.weight) {
            treeSet.remove(edges[child.dest]);
            edges[child.dest].weight = child.weight;
            treeSet.add(edges[child.dest]);
            parents[child.dest] = e.dest;
          }
        }
      }
      return parents;
  }

  private static void testDijkstr() {
    Map<Integer, List<Edge>> graph = new HashMap<>();
    for(int i = 0; i < 9; i++)
      graph.put(i, new ArrayList<>());
    addEdge(0, 1, 4 , graph);
    addEdge(0, 7, 8 , graph);
    addEdge(1, 2, 8 , graph);
    addEdge(1, 7, 11, graph);
    addEdge(2, 3, 7 , graph);
    addEdge(2, 8, 2 , graph);
    addEdge(2, 5, 4 , graph);
    addEdge(3, 4, 9 , graph);
    addEdge(3, 5, 14, graph);
    addEdge(4, 5, 10, graph);
    addEdge(5, 6, 2 , graph);
    addEdge(6, 7, 1 , graph);
    addEdge(6, 8, 6 , graph);
    addEdge(7, 8, 7 , graph);
    Edge[] es = dijkstra(graph);
    for(int i = 0; i < 9; i++)
    out.println(i + ": " + es[i].weight);
  }

  private static void addEdge(int a, int b, int w, Map<Integer, List<Edge>> graph) {
    graph.get(a).add(new Edge(a, b, w));
    graph.get(b).add(new Edge(b, a, w));
  }

  private static Edge[] dijkstra(Map<Integer, List<Edge>> graph) {
    int n = graph.size();
    Edge[] es =  new Edge[n];
    for(int i = 0; i < n; i++)
      es[i] = new Edge(-1, i, Integer.MAX_VALUE);
    es[0].weight = 0;

    TreeSet<Edge> treeSet = new TreeSet<>((a, b) -> a.weight - b.weight);
    treeSet.add(es[0]);

    boolean[] visited = new boolean[n];

    while(treeSet.size() > 0) {
      Edge e = treeSet.pollFirst();
      visited[e.dest] = true;
      for(Edge ed : graph.get(e.dest)) {
        if(visited[ed.dest] || ed.weight + es[e.dest].weight >= es[ed.dest].weight) 
          continue;
        treeSet.remove(es[ed.dest]);
        es[ed.dest].weight = ed.weight + es[e.dest].weight;
        treeSet.add(es[ed.dest]);
      }
    }
    return es;
  }

  private static Edge[] kruskal(int v, Edge[] edges) {
    Edge[] res = new Edge[v-1];

    int[] p = new int[v];
    for(int i = 0; i < v; i++) 
      p[i] = i;

    int[] rank = new int[v];
    Arrays.fill(rank, 1);

    Arrays.sort(edges, (e1, e2) -> e1.weight - e2.weight);
    for(int i = 0, idx = 0; i < res.length;) {
      Edge e = edges[idx++];
      if(union(p, rank, e.src, e.dest)) {
        res[i++] = e;
      }
    }
    return res;
  }

  private static boolean union(int[] root, int[] rank, int u, int v) {
      int rootA = find(root, u);
      int rootB = find(root, v);
      if(rootA == rootB) return false;

      if(rank[rootA] > rank[rootB]) {
        rank[rootA] += rank[rootB];
        root[rootB] = rootA;
      } else {
        rank[rootB] += rank[rootA];
        root[rootA] = rootB;
      }
      return true;
  }

  private static int find(int[] root, int node) {
    if(root[node] != node) {
      root[node] = find(root, root[node]);
    }
    return root[node];
  }

  static class BIT {
    int n;
    int[] nums;
    int[] bit;

    public BIT(int[] nums) {
      this.nums = nums;
      this.n = nums.length;
      this.bit = new int[n + 1];
      for(int i = 0; i < n; i++)
        init(i, nums[i]);
    }

    void init(int i, int val) {
      i++;
      while(i <= n) {
        bit[i] += val;
        i += (i & -i); // (i & (-i)): get moet least significate digit
      }
    }

    void update(int i, int val) {
      int diff = val - nums[i];
      nums[i] = val;
      init(i, diff);
    }

    int getSum(int i) {
      int sum = 0;
      i++;
      while(i > 0) {
        sum += bit[i];
        i -= (i & -i); // ex: 1100 -> 1000 -> 0000. subtract moet least significate digit
      }
      return sum;
    }

    int sumRange(int i, int j) {
      return getSum(j) - getSum(i - 1);
    }
  }
}