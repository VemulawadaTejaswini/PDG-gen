import java.io.*;
import java.util.*;

class Sushi implements Comparable<Sushi> {
  public final int t;
  public final long d;
  
  public Sushi(int t, long d) {
    this.t = t;
    this.d = d;
  }
  
  public int compareTo(Sushi sushi) {
    return -1 * Long.compare(this.d, sushi.d);
  }
}

public class Main {
  private static long solve(int n, int k, int[] ts, long[] ds) {
    Sushi[] ss = new Sushi[n];
    for (int i = 0; i < n; i++) {
      ss[i] = new Sushi(ts[i], ds[i]);
    }
    
    Arrays.sort(ss);
    int[] netaCounts = new int[n + 1];
    long neta = 0;
    long point = 0;
    
    boolean[] duplicated = new boolean[n + 1];
    ArrayDeque<Long> removeNetaCandidates = new ArrayDeque<>();
    for (int i = 0; i < k; i++) {
      if (!duplicated[ss[i].t]) {
        point -= neta * neta;
        neta++;
        point += neta * neta;
        duplicated[ss[i].t] = true;
      } else {
        removeNetaCandidates.addLast(ss[i].d);
      }
      
      point += ss[i].d;
    }
    
    ArrayDeque<Long> addNetaCandidates = new ArrayDeque<>();
    for (int i = k; i < n; i++) {
      if (!duplicated[ss[i].t]) {
        duplicated[ss[i].t] = true;
        addNetaCandidates.addLast(ss[i].d);
      }
    }
    
    long maxPoint = point;
    while (!removeNetaCandidates.isEmpty() && !addNetaCandidates.isEmpty()) {
      point -= neta * neta;
      neta++;
      point += neta * neta;
      point -= removeNetaCandidates.pollLast();
      point += addNetaCandidates.pollFirst();
      maxPoint = Math.max(maxPoint, point);
    }
    return maxPoint;
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int k = reader.nextInt();
    int[] ts = new int[n];
    long[] ds = new long[n];
    for (int i = 0; i < n; i++) {
      ts[i] = reader.nextInt();
      ds[i] = reader.nextLong();
    }
    out.println(solve(n, k, ts, ds));
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
  
  public int[][] nextIntMatrix(int n, int m) {
    int[][] matrix = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextInt();
      }
    }
    return matrix;
  }
  
  public long[][] nextLongMatrix(int n, int m) {
    long[][] matrix = new long[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextInt();
      }
    }
    return matrix;
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

