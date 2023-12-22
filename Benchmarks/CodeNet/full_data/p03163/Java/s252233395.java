import java.io.*;
import java.util.*;


public class Main {

  private static long recurse(int remainingCapacity, long value, int item, long[][] items, long[][] memo) {

    long max = value;

    if (memo[remainingCapacity][item] > -1) {
      return memo[remainingCapacity][item];
    }

    for (int i = item; i < items.length; i ++) {
      if (remainingCapacity - items[i][0] < 0) {
        break;
      }
      long val = recurse(remainingCapacity - (int)items[i][0], value + items[i][1], i + 1, items, memo);
      max = Math.max(val, max);
    }

    memo[remainingCapacity][item] = max;

    return max;
  }

  public static void main(String[] args) {
    MyScanner sc = new MyScanner();
    out = new PrintWriter(new BufferedOutputStream(System.out));

    int N = sc.nextInt(); // num items
    int capacity = sc.nextInt(); // backpack capacity

    long[][] items = new long[N][2];

    for (int i = 0; i < N; i ++) {
      items[i][0] = sc.nextLong();
      items[i][1] = sc.nextLong();
    }

    Arrays.sort(items, new Comparator<long[]>() {
      @Override
      public int compare(long[] a, long[] b) {
        return (int) (a[0] - b[0]);
      }
    });

    long[][] memo = new long[capacity + 1][N + 1];
    for (long[] a : memo) {
      Arrays.fill(a, -1);
    }

    long max = recurse(capacity, 0, 0, items, memo);

    out.println(max);

    out.close();
  }


  //-----------PrintWriter for faster output---------------------------------
  public static PrintWriter out;

  //-----------MyScanner class for faster input----------
  public static class MyScanner {
    BufferedReader br;
    StringTokenizer st;

    public MyScanner() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    String nextLine(){
      String str = "";
      try {
        str = br.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return str;
    }

  }
  //--------------------------------------------------------
}