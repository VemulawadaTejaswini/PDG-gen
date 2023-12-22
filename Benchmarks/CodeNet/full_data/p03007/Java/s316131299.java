import java.io.*;
import java.util.*;

class Solver {
  int n;
  int[] as;
  
  private String[] solvePositiveOnly() {
    String[] answer = new String[n];
    int minValue = as[0];
    for (int i = 1; i <= n-2; i++) {
      answer[i] = String.format("%d %d", minValue, as[i]);
      minValue = minValue - as[i];
    }
    answer[n-1] = String.format("%d %d", as[n-1], minValue);
    answer[0] = String.format("%d", as[n-1] - minValue);
    return answer;
  }
  
  private String[] solveNegativeOnly() {
    String[] answer = new String[n];
    int maxValue = as[n-1]; 
    for (int i = 0; i <= n-2; i++) {
      answer[i + 1] = String.format("%d %d", maxValue, as[i]);
      maxValue = maxValue - as[i];
    }
    answer[0] = "" + maxValue;
    return answer;
  }
  
  private String[] solveBoth() {
    String[] answer = new String[n];
    int maxValue = as[n-1];
    int minValue = as[0];
    for (int i = 1; i <= n-2; i++) {
      if (as[i] >= 0) {
        answer[i] = String.format("%d %d", minValue, as[i]);
        minValue = minValue - as[i];
      } else {
        answer[i] = String.format("%d %d", maxValue, as[i]);
        maxValue = maxValue - as[i];
      }
    }
    answer[n-1] = String.format("%d %d", maxValue, minValue);
    answer[0] = String.format("%d", maxValue - minValue);
    return answer;
  }
  
  public String[] solve(int n, int[] as) {
    this.n = n;
    this.as = as;
    Arrays.sort(this.as);
    
    if (as[0] >= 0) {
      return solvePositiveOnly();
    } else if (as[n-1] <= 0) {
      return solveNegativeOnly();
    } else {
      return solveBoth();
    }
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int[] as = reader.nextIntArray(n);
    String[] answer = new Solver().solve(n, as);
    for (String line : answer) {
      out.println(line);
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

