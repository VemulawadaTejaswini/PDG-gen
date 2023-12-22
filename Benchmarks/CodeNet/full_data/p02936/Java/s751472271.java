import java.io.*;
import java.util.*;

class Solver {
  final int n, q;
  final int[] as, bs, ps, xs;
  
  List<List<Integer>> edges;
  int[] nodeDirectCounters;
  int[] nodeCounters;
  
  Solver(int n, int q, int[] as, int[] bs, int[] ps, int[] xs) {
    this.n = n;
    this.q = q;
    this.as = as;
    this.bs = bs;
    this.ps = ps;
    this.xs = xs;
  }
  
  private void markParentDfs(int index, int parentIndex, int parentSum) {
    nodeCounters[index] = parentSum;
    for (int childIndex : edges.get(index)) {
      if (childIndex == parentIndex) {
        continue;
      }
      markParentDfs(childIndex, index, nodeDirectCounters[childIndex] + parentSum);
    }
  }
  
  public int[] solve() {
    nodeDirectCounters = new int[n+1];
    for (int i = 0; i < q; i++) {
      nodeDirectCounters[ps[i]] += xs[i];
    }
    
    edges = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      edges.add(new ArrayList<>());
    }
    
    for (int i = 0; i < n-1; i++) {
      edges.get(as[i]).add(bs[i]);
      edges.get(bs[i]).add(as[i]);
    }
    
    nodeCounters = new int[n+1];
    markParentDfs(1, 1, nodeDirectCounters[1]);
    return nodeCounters;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int q = reader.nextInt();
    int[] as = new int[n-1];
    int[] bs = new int[n-1];
    for (int i = 0; i < n-1; i++) {
      as[i] = reader.nextInt();
      bs[i] = reader.nextInt();
    }
    int[] ps = new int[q];
    int[] xs = new int[q];
    for (int i = 0; i < q; i++) {
      ps[i] = reader.nextInt();
      xs[i] = reader.nextInt();
    }
    
    int[] answers = new Solver(n, q, as, bs, ps, xs).solve();
    out.print(answers[1]);
    for (int i = 2; i <= n; i++) {
      out.print(" ");
      out.print(answers[i]);
    }
    out.println();
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
  
  public static void shuffle(int[] array) {
    Random random = new Random();
    int n = array.length;
    for (int i = 0; i < n; i++) {
      int randomIndex = i + random.nextInt(n - i);
      
      int temp = array[i];
      array[i] = array[randomIndex];
      array[randomIndex] = temp;
    }
  }
  
  public static void shuffle(long[] array) {
    Random random = new Random();
    int n = array.length;
    for (int i = 0; i < n; i++) {
      int randomIndex = i + random.nextInt(n - i);
      
      long temp = array[i];
      array[i] = array[randomIndex];
      array[randomIndex] = temp;
    }
  }
  
  public static void sort(int[] array) {
    shuffle(array);
    Arrays.sort(array);
  }
  
  public static void sort(long[] array) {
    shuffle(array);
    Arrays.sort(array);
  }
}

