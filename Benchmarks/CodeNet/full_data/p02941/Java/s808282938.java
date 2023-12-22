import java.io.*;
import java.util.*;

class Node implements Comparable<Node> {
  long b;
  final int index;
  
  Node(long b, int index) {
    this.b = b;
    this.index = index;
  }
  
  public int compareTo(Node node) {
    return -1 * Long.compare(this.b, node.b);
  }
}

public class Main {
  private static long solve(int n, long[] as, long[] bs) {
    PriorityQueue<Node> queue = new PriorityQueue<>();
    long count = 0L;
    for (int i = 0; i < n; i++) {
      queue.add(new Node(bs[i], i));
    }
    
    while (!queue.isEmpty()) {
      Node node = queue.poll();
      int index = node.index;
      if (node.b == as[index]) {
        continue;
      }
      long b1 = bs[(index - 1 + n) % n];
      long b2 = bs[(index + 1) % n];
      long large = Math.max(b1, b2);
      long target1 = as[index];
      long target2 = Math.max(large, target1);
      long bsum = b1 + b2;
      // b0 - bsum * k >= target2
      // b0 - target2 >= bsum * k
      // (b0 - target2) / bsum >= k
      long k = (bs[index] - target2) / bsum;
      if (k == 0) {
        k++;
      }
      bs[index] = bs[index] - k * bsum;
      if (bs[index] < as[index]) {
        return -1;
      }
      if (bs[index] > as[index]) {
        queue.add(new Node(bs[index], index));
      }
      count += k;
    }
    return count;
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    long[] as = reader.nextLongArray(n);
    long[] bs = reader.nextLongArray(n);
    out.println(solve(n, as, bs));
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

