import java.util.*;
import java.io.*;
 
class Main {
 
  static int INF = (int) 1e9 + 7;
  static List<List<Integer>> adj;
 
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    
    int n = in.nextInt();
    adj = new ArrayList<>(n + 1);
    for (int i  = 0; i <= n; i++) {
      adj.add(new ArrayList<>());
    }
    for (int i = 1; i < n; i++) {
      int u = in.nextInt();
      int v = in.nextInt();
      adj.get(u).add(v);
      adj.get(v).add(u);
    }

    long[] res = dfs(1, -1);

   
    System.out.println(add(res[0], res[1]));
  }

  static long[] dfs(int cur, int parent) {

    // res[0]: counts when cur is painted black
    // res[1]: counts when cur is painted white
    long[] res = new long[2]; 
    Arrays.fill(res, 1);

    for (int next : adj.get(cur)) {
      if (next != parent) {
        long[] child = dfs(next, cur);
        res[0] = mul(res[0], child[1]);
        res[1] = mul(res[1], add(child[0], child[1]));
      }
    }

    return res;
    


    //System.out.println(cur);
  }

  static void add(int[] a, int i, int j) {
    a[i] += a[j];
    if (a[i] >= INF) {a[i] -= INF;}
  }

  static long add(long a, long b) {
    a = a + b;
    if (a >= INF) {a -= INF;}
    return a;
  }

  static long mul(long a, long b) {
    long res = a * b;
    
    return  (res % INF);
  }

  static int countSetBit(int a) {
    int count = 0; 
    while (a > 0) {
      count += (a & 1);
      a = a >> 1;
    }
    return count;
  }

 
}