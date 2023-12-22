import java.io.*;
import java.util.*;

class Position {
  int i;
  int j;
  
  Position(int i, int j) {
    this.i = i;
    this.j = j;
  }
}

class Node implements Comparable<Node> {
  Position position;
  int cost;
  
  public Node(Position position, int cost) {
    this.position = position;
    this.cost = cost;
  }
  
  public int compareTo(Node node) {
    return this.cost - node.cost;
  }
}

public class Main {
  private static final int[] DI = new int[]{1, 0, -1, 0};
  private static final int[] DJ = new int[]{0, 1, 0, -1};
  
  private static int divCeil(int a, int b) {
    return a / b + a % b > 0 ? 1 : 0;
  }
  
  private static int solve(int h, int w, int k, char[][] map) {
    int si = -1;
    int sj = -1;
    for (int i = 0; i < h && si < 0; i++) {
      for (int j = 0; j < w && si < 0; j++) {
        if (map[i][j] == 'S') {
          si = i;
          sj = j;
        }
      }
    }
    
    PriorityQueue<Node> queue = new PriorityQueue<>();
    boolean[][] visited = new boolean[h][w];
    queue.add(new Node(new Position(si, sj), 0));
    
    while (!queue.isEmpty()) {
      Node node = queue.poll();
      Position position = node.position;
      if (position.i == 0 || position.i == h-1 || position.j == 0 || position.j == w-1) {
        return 1;
      }
      if (visited[position.i][position.j]) {
        continue;
      }
      visited[position.i][position.j] = true;
      if (node.cost >= k) {
        continue;
      }
      for (int t = 0; t < DI.length; t++) {
        int nextI = position.i + DI[t];
        int nextJ = position.j + DJ[t];
        if (map[nextI][nextJ] == '#' || visited[nextI][nextJ]) {
          continue;
        }
        queue.add(new Node(new Position(nextI, nextJ), node.cost + 1));
      }
    }
    
    int maxVisitI = 0;
    int minVisitI = Integer.MAX_VALUE;
    int maxVisitJ = 0;
    int minVisitJ = Integer.MAX_VALUE;
    
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if (visited[i][j]) {
          maxVisitI = Math.max(maxVisitI, i);
          minVisitI = Math.min(minVisitI, i);
          maxVisitJ = Math.max(maxVisitJ, j);
          minVisitJ = Math.min(minVisitJ, j);
        }
      }
    }
    int[] costs = new int[]{
      1 + divCeil(minVisitI, k),
      1 + divCeil(minVisitJ, k),
      1 + divCeil(h - 1 - maxVisitI, k),
      1 + divCeil(w - 1 - maxVisitJ, k)
    };
    
    Arrays.sort(costs);
    return costs[0];
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int h = reader.nextInt();
    int w = reader.nextInt();
    int k = reader.nextInt();
    char[][] map = new char[h][];
    for (int i = 0; i < h; i++) {
      map[i] = reader.next().toCharArray();
    }
    out.println(solve(h, w, k, map));
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

