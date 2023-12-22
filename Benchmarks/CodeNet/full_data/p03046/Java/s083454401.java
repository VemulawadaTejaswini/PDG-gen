import java.io.*;
import java.util.*;

class Solver {
  private static final int[] IMP = new int[]{-1};
  
  private int[] solveLarge(int m, int k) {
    if (k >= (1 << m)) {
      return IMP;
    }
    ArrayList<Integer> output = new ArrayList<>();
    for (int i = (1 << m) - 1; i >= 0; i--) {
      if (i == k) {
        continue;
      }
      output.add(i);
    }
    output.add(k);
    for (int i = 0; i < (1 << m); i++) {
      if (i == k) {
        continue;
      }
      output.add(i);
    }
    output.add(k);
    
    int[] list = new int[1 << (m + 1)];
    for (int i = 0; i < output.size(); i++) {
      list[i] = output.get(i);
    }
    return list;
  }
  
  public int[] solve(int m, int k) {
    switch (m) {
    case 0:
      if (k == 0) {
        return new int[]{0, 0};
      } else {
        return IMP;
      }
    case 1:
      if (k == 0) {
        return new int[]{0, 0, 1, 1};
      } else {
        return IMP;
      }
    default:
      return solveLarge(m, k);
    }
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int m = reader.nextInt();
    int k = reader.nextInt();
    int[] answer = new Solver().solve(m, k);
    for (int n : answer) {
      out.print(n);
      out.print(" ");
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
}

