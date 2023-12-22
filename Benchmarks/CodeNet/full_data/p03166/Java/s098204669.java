import java.util.*;

class Main {
  public static void main(String[] args) {
    int n, m;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();

    Map<Integer, List<Integer>> edges = new HashMap<>();
    Map<Integer, Integer> dist = new HashMap<>();
    ArrayList<Integer> sourceEdges = new ArrayList<>();
    for(int i = 1; i <= n; i++) {
      sourceEdges.add(i);
      dist.put(i, 1);
    }
    edges.put(-1, sourceEdges);
   while(sc.hasNext()) {
     int x = sc.nextInt();
     int y = sc.nextInt();
 
     ArrayList<Integer> temp = new ArrayList<>();
     if(edges.containsKey(x)) {
       temp = (ArrayList)edges.get(x);
     }
      temp.add(y);
     edges.put(x, temp);
   }
   

    ArrayList<Integer> queue = new ArrayList<Integer>();
    queue.add(edges.keySet().iterator().next());
    
    while(queue.size() > 0) {
      int key = queue.remove(0);
      ArrayList<Integer> l = (ArrayList)edges.getOrDefault(key, null);
      if(l == null)
        continue;
      for(int node : l) {
        dist.put(node, Math.max(dist.get(node), dist.getOrDefault(key, 0) + 1));
        queue.add(node);
      }

    }
    int res = 0;
    for(int key : dist.keySet()) {
      if(res < dist.get(key))
        res = dist.get(key);
    }
     System.out.println(res-1);             
  }
}