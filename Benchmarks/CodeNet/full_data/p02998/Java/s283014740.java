import java.io.*;
import java.util.*;

class UnionFind {
  int[] parents;
  int[] ranks;
  
  UnionFind(int n) {
    parents = new int[n];
    ranks = new int[n];
    
    for (int i = 0; i < n; i++) {
      parents[i] = i;
    }
  }
  
  private int getRoot(int index) {
    if (parents[index] == index) {
      return index;
    } else {
      parents[index] = getRoot(parents[index]);
      return parents[index];
    }
  }
  
  public boolean sameGroup(int a, int b) {
    return getRoot(a) == getRoot(b);
  }
  
  public void merge(int a, int b) {
    int rootA = getRoot(a);
    int rootB = getRoot(b);
    if (rootA == rootB) {
      return;
    }
    if (ranks[rootA] < ranks[rootB]) {
      parents[rootA] = rootB;
    } else if (ranks[rootB] < ranks[rootA]) {
      parents[rootB] = rootA;
    } else {
      parents[rootA] = rootB;
      ranks[rootB]++;
    }
  }
  
  public boolean mightMerge(int a, int b) {
    int rootA = getRoot(a);
    int rootB = getRoot(b);
    if (rootA == rootB) {
      return false;
    }
    if (ranks[rootA] < ranks[rootB]) {
      parents[rootA] = rootB;
    } else if (ranks[rootB] < ranks[rootA]) {
      parents[rootB] = rootA;
    } else {
      parents[rootA] = rootB;
      ranks[rootB]++;
    }
    return true;
  }
}

public class Main {
  private static long solve(int n, int[] xs, int[] ys) {
    UnionFind unionFind = new UnionFind(n);
    int[] xToId = new int[100010];
    int[] yToId = new int[100010];
    Arrays.fill(xToId, -1);
    Arrays.fill(yToId, -1);
    for (int i = 0; i < n; i++) {
      if (xToId[xs[i]] >= 0) {
        unionFind.merge(xToId[xs[i]], i);
      } else {
        xToId[xs[i]] = i;
      }
      if (yToId[ys[i]] >= 0) {
        unionFind.merge(yToId[ys[i]], i);
      } else {
        yToId[ys[i]] = i;
      }
    }
    
    long answer = 0;
    boolean[] processed = new boolean[n];
    for (int i = 0; i < n; i++) {
      if (processed[i]) {
        continue;
      }
      
      HashSet<Integer> xSet = new HashSet<>();
      HashSet<Integer> ySet = new HashSet<>();
      int count = 0;
      for (int j = i; j < n; j++) {
        if (processed[j]) {
          continue;
        }
        if (!unionFind.sameGroup(i, j)) {
          continue;
        }
        processed[j] = true;
        
        xSet.add(xs[j]);
        ySet.add(ys[j]);
        count++;
      }
      
//      System.err.printf("%d %d %d", xSet.size(), ySet.size(), count);
      answer += ((long)xSet.size()) * ((long)ySet.size()) - count;
    }
    return answer;
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int[] xs = new int[n];
    int[] ys = new int[n];
    for (int i = 0; i < n; i++) {
      xs[i] = reader.nextInt();
      ys[i] = reader.nextInt();
    }
    out.println(solve(n, xs, ys));
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

