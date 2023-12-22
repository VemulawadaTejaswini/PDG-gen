import java.util.*;
import java.io.*;
 
class Main {
 
  static int INF = (int) 1e9 + 7;
  static List<List<Integer>> adj;
 
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    
    int n = in.nextInt();
    int[] h = new int[n], a = new int[n];
    for (int i = 0; i < n; i++) {
      h[i] = in.nextInt();
    }
    for (int i = 0; i < n; i++) {
      a[i] = in.nextInt();
    }

    long[] dp = new long[n];
    dp[0] = a[0];
    long res = 0;
    for (int i = 1; i < n; i++) {
      long prevMax = 0;
      for (int j = 0; j < i; j++) {
        if (h[j] < h[i]) {prevMax = Math.max(prevMax, dp[j]);}
      }
      dp[i] = prevMax + a[i];
      res = Math.max(res, dp[i]);
    }

   
    System.out.println(res);
  }

  static int[] dfs(int cur, int parent) {

    // res[0]: counts when cur is painted black
    // res[1]: counts when cur is painted white
    int[] res = new int[2]; 
    Arrays.fill(res, 1);

    for (int next : adj.get(cur)) {
      if (next != parent) {
        int[] child = dfs(next, cur);
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

  static int add(int a, int b) {
    a = a + b;
    if (a >= INF) {a -= INF;}
    return a;
  }

  static int mul(int a, int b) {
    long res = a * b;
    
    return (int) (res % INF);
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