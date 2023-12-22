import java.io.*;
import java.util.*;

class Data implements Comparable<Data> {
  int s;
  int t;
  int x;
  
  public Data(int s, int t, int x) {
    this.s = s;
    this.t = t;
    this.x = x;
  }
  
  public int compareTo(Data data) {
    return this.x - data.x;
  }
}

class SegTree {
  int indexMin;
  int indexMax;
  ArrayList<SegTree> children;
  int value;
  
  public SegTree(int indexMin, int indexMax, int value) {
    this.indexMin = indexMin;
    this.indexMax = indexMax;
    this.value = value;
  }
  
  public boolean inside(int index) {
    return indexMin <= index && index < indexMax;
  }
  
  public int getValue(int index) {
    if (children == null) {
      return value;
    }
    
    for (SegTree s : children) {
      if (s.inside(index)) {
        return s.getValue(index);
      }
    }
    throw new RuntimeException();
  }
  
  public void update(int rangeMin, int rangeMax, int v) {
    if (rangeMax <= indexMin) {
      return;
    }
    
    if (indexMax <= rangeMin) {
      return;
    }
    
    if (indexMin == rangeMin && indexMax == rangeMax) {
      children = null;
      value = v;
      return;
    }
    
    if (children == null) {
      children = new ArrayList<>();
      int indexMid = (indexMin + indexMax) / 2;
      children.add(new SegTree(indexMin, indexMid, value));
      children.add(new SegTree(indexMid, indexMax, value));
    }
    
    for (SegTree s : children) {
      s.update(Math.max(rangeMin, s.indexMin), Math.min(rangeMax, s.indexMax), v);
    }
  }
}

class Solver {
  public int[] solve(int n, int q, int[] ss, int[] ts, int[] xs, int[] ds) {
    int[] output = new int[q];
//    System.err.println("A");
    
    Data[] data = new Data[n];
    for (int i = 0; i < n; i++) {
      data[i] = new Data(ss[i], ts[i], xs[i]);
    }
    Arrays.sort(data);
    int dataIndex = data.length - 1;
    
    SegTree segTree = new SegTree(0, 1 << 30, data.length);
    
    for (int i = ds.length - 1; i >= 0; i--) {
//    System.err.println("B");
      while (dataIndex >= 0 && data[dataIndex].x >= ds[i]) {
//    System.err.println("C");
        Data d = data[dataIndex];
        int rangeMin = d.s - d.x;
        int rangeMax = d.t - d.x;
        if (rangeMax <= 0) {
        dataIndex--;
          continue;
        }
        segTree.update(Math.max(rangeMin, 0), rangeMax, dataIndex);
        dataIndex--;
      }
      int blockIndex = segTree.getValue(ds[i]);
      if (blockIndex == data.length) {
        output[i] = -1;
      } else {
        output[i] = data[blockIndex].x;
      }
    }
    return output;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int q = reader.nextInt();
    int[] ss = new int[n];
    int[] ts = new int[n];
    int[] xs = new int[n];
    for (int i = 0; i < n; i++) {
      ss[i] = reader.nextInt();
      ts[i] = reader.nextInt();
      xs[i] = reader.nextInt();
    }
    int[] ds = new int[q];
    for (int i = 0; i < q; i++) {
      ds[i] = reader.nextInt();
    }
    int[] output = new Solver().solve(n, q, ss, ts, xs, ds);
    for (int v : output) {
      out.println(v);
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

