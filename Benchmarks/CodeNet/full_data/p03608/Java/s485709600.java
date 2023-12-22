import java.io.*;
import java.util.*;
 
 
public class Main implements Runnable {
 
  public static final int MOD = 1000000007;

  public void run() {
    BetterScanner scanner = new BetterScanner(System.in);

    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int rNum = scanner.nextInt();

    int[] rr = new int[rNum];
    for (int i = 0 ; i < rNum ; i ++) {
      rr[i] = scanner.nextInt() - 1;
    }

    List<Integer>[] paths = new List[n];
    List<Integer>[] costs = new List[n];
    for (int i = 0 ; i < n ; i ++) {
      paths[i] = new ArrayList();
      costs[i] = new ArrayList();
    }
    for (int i = 0 ; i < m ; i ++) {
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 1;
      int c = scanner.nextInt();
      paths[a].add(b);
      costs[a].add(c);
      paths[b].add(a);
      costs[b].add(c);
    }

    int[][] dists = new int[n][n];
    for (int i = 0 ; i < rNum ; i ++) {
      for (int j = 0 ; j < rNum ; j ++) {
        dists[i][j] = calc(rr[i], rr[j], n, paths, costs);
      }
    }

    int[] a = new int[rNum];
    for (int i = 0 ; i < rNum ; i ++) {
      a[i] = i;
    }

    int min = Integer.MAX_VALUE;
    while (true) {
      int d = 0;
      for (int i = 0 ; i < rNum - 1 ; i ++) {
        d += dists[a[i]][a[i + 1]];
      }
      if (d < min) {
        min = d;
      }
      if (!nextPermutation(a)) {
        break;
      }
    }
    System.out.println(min);
  }

  private int calc(int first, int last, int n, List<Integer>[] paths, List<Integer>[] costs) {
    int[] dd = new int[n];
    for (int i = 0 ; i < n ; i ++) {
      dd[i] = (i == first) ? 0 : Integer.MAX_VALUE;
    }
    List<Integer> queue = new ArrayList();
    for (int i = 0 ; i < n ; i ++) {
      queue.add(i);
    }
    while (!queue.isEmpty()) {
      int min = Integer.MAX_VALUE;
      int minI = -1;
      for (int i : queue) {
        if (dd[i] < min) {
          min = dd[i]; minI = i;
        }
      }
      queue.remove((Integer)minI);
      for (int i = 0 ; i < paths[minI].size() ; i ++) {
        int next = paths[minI].get(i);
        int cost = costs[minI].get(i);
        if (dd[next] > dd[minI] + cost) {
          dd[next] = dd[minI] + cost;
        }
      }
    }
    return dd[last];
  }

  public static boolean nextPermutation(int[] a) {
    for (int i = a.length - 1 ; i > 0 ; --i) {
      if (a[i - 1] < a[i]) {
        int swapIndex = find(a[i - 1], a, i, a.length - 1);
        int temp = a[swapIndex];
        a[swapIndex] = a[i - 1];
        a[i - 1] = temp;
        Arrays.sort(a, i, a.length);
        return true;
      }
    }
    return false;
  }

  private static int find(int dest, int[] a, int s, int e) {
    if (s == e) {
      return s;
    }
    int m = (s + e + 1) / 2;
    return a[m] <= dest ? find(dest, a, s, m - 1) : find(dest, a, m, e);
  }

  public static void main(String[] args) {
    Main main = new Main();
    main.run();
  }

  public static class UnionFind {

    private int[] parents;
    private int[] ranks;

    public UnionFind(int max) {
      parents = new int[max];
      ranks = new int[max];
      for (int i = 0 ; i < max; i ++) {
        parents[i] = i;
      }
    }

    public int find(int i) {
      int parent = parents[i];
      if (i == parent) {
        return i;
      } else {
        parents[i] = find(parent);
        return parents[i];
      }
    }

    public void unite(int i, int j) {
      int iRoot = find(i);
      int jRoot = find(j);
      if (iRoot == jRoot) {
        return;
      } else {
        if (ranks[iRoot] > ranks[jRoot]) {
          parents[jRoot] = iRoot;
        } else if (ranks[jRoot] > ranks[iRoot]) {
          parents[iRoot] = jRoot;
        } else {
          parents[jRoot] = iRoot;
          ranks[iRoot] ++;
        }
      }
    }

    public boolean isConnected(int i, int j) {
      return find(i) == find(j);
    }

  }
 
  // scanner slightly faster than usual ones
  public static class BetterScanner {
 
    private InputStream stream;
    private byte[] buffer = new byte[1024];
    private int pointer = 0;
    private int bufferLength = 0;
 
    public BetterScanner(InputStream stream) {
      this.stream = stream;
    }
 
    private boolean updateBuffer() {
      if (pointer >= bufferLength) {
        pointer = 0;
        try {
          bufferLength = stream.read(buffer);
        } catch (IOException exception) {
          exception.printStackTrace();
        }
        return bufferLength > 0;
      } else {
        return true;
      }
    }
 
    private int read() {
      if (updateBuffer()) {
        return buffer[pointer ++];
      } else {
        return -1;
      }
    }
 
    public boolean hasNext() {
      skipUnprintable();
      return updateBuffer();
    }
 
    private void skipUnprintable() { 
      while (updateBuffer() && !isPrintableChar(buffer[pointer])) {
        pointer ++;
      }
    }
 
    public String next() {
      if (hasNext()) {
        StringBuilder builder = new StringBuilder();
        int codePoint = read();
        while (isPrintableChar(codePoint)) {
          builder.appendCodePoint(codePoint);
          codePoint = read();
        }
        return builder.toString();
      } else {
        throw new NoSuchElementException();
      }
    }
 
    public long nextLong() {
      if (hasNext()) {
        long number = 0;
        boolean minus = false;
        int codePoint = read();
        if (codePoint == '-') {
          minus = true;
          codePoint = read();
        }
        if (codePoint >= '0' && codePoint <= '9') {
          while (true) {
            if (codePoint >= '0' && codePoint <= '9') {
              number *= 10;
              number += codePoint - '0';
            } else if (codePoint < 0 || !isPrintableChar(codePoint)) {
              return (minus) ? -number : number;
            } else {
              throw new NumberFormatException();
            }
            codePoint = read();
          }
        } else {
          throw new NumberFormatException();
        }
      } else {
        throw new NoSuchElementException();
      }
    }
 
    public int nextInt() {
      long number = nextLong();
      if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
        return (int)number;
      } else {
        throw new NumberFormatException();
      }
    }
 
    private boolean isPrintableChar(int codePoint) {
      return codePoint >= 33 && codePoint <= 126;
    }
 
  }
 
}
