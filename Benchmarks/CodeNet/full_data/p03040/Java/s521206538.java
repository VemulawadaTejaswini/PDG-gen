import java.io.*;
import java.util.*;

enum Type {
  Update,
  Calculate
}

class Query {
  Type type;
  long a;
  long b;
  
  Query(Type type, long a, long b) {
    this.type = type;
    this.a = a;
    this.b = b;
  }
}

class Mid {
  PriorityQueue<Long> large;
  PriorityQueue<Long> small;
  
  Mid() {
    large = new PriorityQueue<>(new Comparator<Long>(){
      public int compare(Long a, Long b) {
        return Long.compare(a, b);
      }
    });
    small = new PriorityQueue<>(new Comparator<Long>(){
      public int compare(Long a, Long b) {
        return -Long.compare(a, b);
      }
    });
  }
  
  long getMid() {
    return small.peek();
  }
  
  void insert(long v) {
    small.add(v);
    
    /*
    System.err.println("A");
    System.err.printf("%d %d\n", small.size(), large.size());
    System.err.println(small.peek());
    System.err.println(large.peek());
    */
    while (!small.isEmpty() && !large.isEmpty() && small.peek() > large.peek()) {
      large.add(small.poll());
    }
    
    /*
    System.err.println("b");
    System.err.printf("%d %d\n", small.size(), large.size());
    System.err.println(small.peek());
    System.err.println(large.peek());
    */
    while (small.size() >= large.size() + 2) {
      large.add(small.poll());
    }
    
    /*
    System.err.println("c");
    System.err.printf("%d %d\n", small.size(), large.size());
    System.err.println(small.peek());
    System.err.println(large.peek());
    */
    while (small.size() < large.size()) {
      small.add(large.poll());
    }
    
//    System.err.println("d");
//    System.err.printf("%d %d\n", small.size(), large.size());
//    System.err.println(small.peek());
//    System.err.println(large.peek());
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int q = reader.nextInt();
    long bSum = 0;
    Mid mid = new Mid();
    for (int i = 0; i < q; i++) {
      int t = reader.nextInt();
      switch (t) {
      case 1:
        long a = reader.nextLong();
        long b = reader.nextLong();
        mid.insert(a);
        bSum += b;
        break;
      case 2:
        long x = mid.getMid();
        out.printf("%d %d\n", x, bSum);
        
        break;
      }
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

