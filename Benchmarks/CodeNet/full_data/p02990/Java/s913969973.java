import java.io.*;
import java.util.*;

public class Main {
  // Bn
  // b1, r1, b2
  // b1, r1, b2, r2, b3
  // b1, r1, b2, r2, b3, r3, b4
  
  private static final long M = 1_000_000_007;
  
  private static long[] solve(int n, int k) {
    long[] output = new long[k];
    long[][] dptable = new long[n + 1][n + 1];
    int bMax = k;
    int rMax = n - k;
    
    for (int i = 1; i <= bMax; i++) {
      for (int j = 0; j <= rMax; j++) {
        dptable[i][j] = 1;
      }
    }
    for (int a = 1; a <= k; a++) {
      for (int j = 0; j <= rMax; j++) {
        output[a-1] += dptable[bMax][j];
        output[a-1] %= M;
      }
      
      
      long[][] nextDpTable = new long[n + 1][n + 1];
      for (int i = 1; i <= bMax; i++) {
        long rowSum = 0;
        for (int j = 1; j <= rMax; j++) {
          rowSum += dptable[i-1][j-1];
          rowSum %= M;
          nextDpTable[i][j] = nextDpTable[i-1][j] + rowSum;
          nextDpTable[i][j] %= M;
          
          /*
          for (int s = 1; s < i; s++) {
            for (int t = 1; t < j; t++) {
              nextDpTable[i][j] += dptable[s][t];
            }
          }
          */
          
        }
      }
      dptable = nextDpTable;
    }
    return output;
    
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int k = reader.nextInt();
    long[] answer = solve(n, k);
    for (long v : answer) {
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

