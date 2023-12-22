import java.io.*;
import java.util.*;

class NextNode {
  int id;
  int distance;
  
  NextNode(int id, int distance) {
    this.id = id;
    this.distance = distance;
  }
}

class Solver {
  ArrayList<ArrayList<NextNode>> edges;
  int[] colors;
  
  private void paintDfs(int id, int color) {
    if (colors[id] >= 0) {
      return;
    }
    colors[id] = color;
    
    for (NextNode next : edges.get(id)) {
      if (next.distance % 2 == 0) {
        paintDfs(next.id, color);
      } else {
        paintDfs(next.id, 1 - color);
      }
    }
  }
  
  public int[] solve(int n, int[] u, int[] v, int[] w) {
    edges = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      edges.add(new ArrayList<>());
    }
    
    for (int i = 0; i < n - 1; i++) {
      edges.get(u[i]).add(new NextNode(v[i], w[i]));
      edges.get(v[i]).add(new NextNode(u[i], w[i]));
    }
    
    colors = new int[n + 1];
    Arrays.fill(colors, -1);
    paintDfs(1, 0);
    
    int[] output = new int[n];
    for (int i = 0; i < n; i++) {
      output[i] = colors[i + 1];
    }
    return output;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int[] u = new int[n - 1];
    int[] v = new int[n - 1];
    int[] w = new int[n - 1];
    for (int i = 0; i < n - 1; i++) {
      u[i] = reader.nextInt();
      v[i] = reader.nextInt();
      w[i] = reader.nextInt();
    }
    
    int[] answer = new Solver().solve(n, u, v, w);
    for (int color : answer) {
      out.println(color);
    }
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

class ContestReader {
  private BufferedReader reader;
  private StringTokenizer tokenizer;
  
  ContestReader(InputStream in) {
    reader = new BufferedReader(new InputStreamReader(in));
  }
  
  public String next() {
    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
      try {
        tokenizer = new java.util.StringTokenizer(reader.readLine());
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
    return tokenizer.nextToken();
  }
  
  public int nextInt() {
    return Integer.parseInt(next());
  }
  
  public long nextLong() {
    return Long.parseLong(next());
  }
  
  public double nextDouble() {
    return Double.parseDouble(next());
  }
  
  public int[] nextIntArray(int n) {
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextInt();
    }
    return array;
  }
  
  public long[] nextLongArray(int n) {
    long[] array = new long[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextLong();
    }
    return array;
  }
}

class Algorithm {
  private static void swap(Object[] list, int a, int b) {
    Object tmp = list[a];
    list[a] = list[b];
    list[b] = tmp;
  }
  
  public static <T extends Comparable<? super T>> boolean nextPermutation(T[] ts) {
    int rightMostAscendingOrderIndex = ts.length - 2;
    while (rightMostAscendingOrderIndex >= 0 &&
        ts[rightMostAscendingOrderIndex].compareTo(ts[rightMostAscendingOrderIndex + 1]) >= 0) {
      rightMostAscendingOrderIndex--;
    }
    if (rightMostAscendingOrderIndex < 0) {
      return false;
    }
    
    int rightMostGreatorIndex = ts.length - 1;
    while (ts[rightMostAscendingOrderIndex].compareTo(ts[rightMostGreatorIndex]) >= 0) {
      rightMostGreatorIndex--;
    }
    
    swap(ts, rightMostAscendingOrderIndex, rightMostGreatorIndex);
    for (int i = 0; i < (ts.length - rightMostAscendingOrderIndex - 1) / 2; i++) {
      swap(ts, rightMostAscendingOrderIndex + 1 + i, ts.length - 1 - i);
    }
    return true;
  }
}

