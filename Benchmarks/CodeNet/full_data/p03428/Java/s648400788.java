import java.io.*;
import java.util.*;

class Solver {
  int n;
  double[] x;
  double[] y;
  
  public double[] solve(int n, double[] x, double[] y) {
    this.n = n;
    this.x = x;
    this.y = y;
    
    ArrayList<Double> atanList = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      for (int j = i+1; j < n; j++) {
        double a1 = Math.atan2(y[j] - y[i], x[j] - x[i]) + Math.PI / 2;
        if (a1 < 0) {
          a1 += 2.0 * Math.PI;
        }
        
        atanList.add(a1);
        if (a1 < Math.PI) {
          atanList.add(a1 + Math.PI);
        } else {
          atanList.add(a1 - Math.PI);
        }
      }
    }
    
    atanList.add(0.0);
    atanList.add(2.0 * Math.PI);
    
    Collections.sort(atanList);
    
    double[] answer = new double[n];
    for (int i = 1; i < atanList.size(); i++) {
      double width = atanList.get(i) - atanList.get(i - 1);
      double mid = (atanList.get(i) + atanList.get(i - 1)) / 2;
      
      double infX = 1e12 * Math.cos(mid);
      double infY = 1e12 * Math.sin(mid);
      
      double minD = Math.hypot(infX - x[0], infY - y[0]);
      int minIndex = 0;
      for (int j = 1; j < n; j++) {
        double d = Math.hypot(infX - x[j], infY - y[j]);
        if (d < minD) {
          minD = d;
          minIndex = j;
        }
      }
      
      answer[minIndex] += width / 2.0 / Math.PI;
    }
    return answer;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    double[] x = new double[n];
    double[] y = new double[n];
    for (int i = 0; i < n; i++) {
      x[i] = reader.nextDouble();
      y[i] = reader.nextDouble();
    }
    double[] answer = new Solver().solve(n, x, y);
    for (double d : answer) {
      out.printf("%.20f\n", d);
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

