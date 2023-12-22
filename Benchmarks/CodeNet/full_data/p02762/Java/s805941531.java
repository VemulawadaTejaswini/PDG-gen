import java.util.*;

public class Main {
  public static void main(String args[]) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();
    Map<Integer, List<Integer>> friends = new HashMap<>();
    Map<Integer, List<Integer>> block = new HashMap<>();
    for(int i = 1; i <= n; i++) {
      friends.put(i, new ArrayList<>());
      block.put(i, new ArrayList<>());
    }

    int[] root = new int[n+1];
    int[] size = new int[n+1];
    for(int i = 1; i <= n; i++) {
      root[i] = i;
      size[i] = 1;
    }
    for(int i = 0; i < m; i++) {
      int v = sc.nextInt();
      int u = sc.nextInt();
      friends.get(v).add(u);
      friends.get(u).add(v);
      union(root, size, v, u);
    }
    for(int i = 1; i <= n; i++) {
      find(root, i);
    }
    for(int i = 0; i < k; i++) {
      int v = sc.nextInt();
      int u = sc.nextInt();
      block.get(v).add(u);
      block.get(u).add(v);
    }
    for(int i = 1; i <= n; i++) {
      int cycleSize = size[root[i]];
      int friendSize = friends.get(i).size();
      int blackCnt = 0;
      for(int b : block.get(i)) {
        if(root[b] == root[i])
          blackCnt++;
      }
      if(i == n)
        System.out.println(cycleSize - friendSize - 1 - blackCnt);
      else
        System.out.print(cycleSize - friendSize - 1 - blackCnt + " ");
    }
  }

  private static void union(int[] root, int[] size, int a, int b) {
    int rootA = find(root, a);
    int rootB = find(root, b);
    if(rootA == rootB) return;
    if(size[rootA] >= size[rootB]) {
      root[rootB] = rootA;
      size[rootA] += size[rootB];
    } else {
      root[rootA] = rootB;
      size[rootB] += size[rootA];
    }
  }

  private static int find(int[] root, int node) {
    if(root[node] != node) {
        root[node] = find(root, root[node]);
    }
    return root[node];
  }
}
