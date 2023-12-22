import java.util.*;
import java.io.*;

public class Main {
  
  public static void main(String[] args) {
    // System.out.println(new Pair(2, 3).compareTo(new Pair(3, 2)));
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    // FastReader in = new FastReader();
    PrintWriter out = new PrintWriter(System.out);

    int n = in.nextInt();
    int W = in.nextInt();

    int[] w = new int[n];
    int[] v = new int[n];

    int V = 0;
    for (int i = 0; i < n; i++) {
      w[i] = in.nextInt();
      v[i] = in.nextInt();
      V += v[i];
    }

    long[] dp = new long[V + 1]; 
    // dp[i]: min W to achieve value of i

    long INF = (long) 1e12 + 7;

    Arrays.fill(dp, INF);
    dp[0] = 0;

    for (int i = 0; i < n; i++) {
      for (int j = V; j >= v[i]; j--) {
        dp[j] = Math.min(dp[j], dp[j - v[i]] + w[i]);
      }
    }

    for (int i = V; i >= 0; i--) {
      if (dp[i] <= W) {out.println(i);out.flush();return;}
    }

    out.println(0);

    
    out.flush();

  }

  static int[] knapsack(Item item, int C) {
    C = C - item.price;
    int[] dp = new int[C + 1];
    Arrays.fill(dp, item.price * item.value);
    int n = item.subs.size();

    for (int i = 0; i < n; i++) {
      for (int j = C; j >= item.subs.get(i).price; j--) {
        dp[j] = Math.max(dp[j], dp[j - item.subs.get(i).price] + item.subs.get(i).price * item.subs.get(i).value);
      }
    }
    return dp;
  }

  static class Item {
    int price, value;
    List<Item> subs;
    Item(int p, int v) {price = p; value = v; subs = new ArrayList<>();}
    int getTotal() {
      int tt = price;
      for (Item i : subs) {tt += i.price;}
      return tt;
    }
  }

  
  static class FastReader {

    public BufferedReader br; 
    StringTokenizer st; 

    public FastReader() {br = new BufferedReader(new InputStreamReader(System.in));} 

    String next() { 
      while (st == null || !st.hasMoreElements()) { 
          try {st = new StringTokenizer(br.readLine());} 
          catch (IOException e) {e.printStackTrace();} 
      } 
      return st.nextToken(); 
    } 

    int nextInt() {return Integer.parseInt(next());} 

    long nextLong() {return Long.parseLong(next());} 

    double nextDouble() {return Double.parseDouble(next());} 

    String nextLine() {
      String str = ""; 
        try {str = br.readLine();} 
        catch (IOException e) {e.printStackTrace();} 
        return str; 
  }
}

} 

  



  
  


  













