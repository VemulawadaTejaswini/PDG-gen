/**
 * Created at 21:07 on 2020-03-08
 */

import java.io.*;
import java.util.*;

public class Main {

  static FastScanner sc = new FastScanner();
  static Output out = new Output(System.out);

  static final int[] dx = {0, 1, 0, -1};
  static final int[] dy = {-1, 0, 1, 0};

  static final long MOD = (long) (1e9 + 7);
  static final long INF = Long.MAX_VALUE / 2;

  static final int e5 = (int) 1e5;

  public static class Solver {
    public Solver() {

      int N = sc.nextInt();

      ArrayList<Integer>[] one = new ArrayList[N];
      ArrayList<Integer>[] two = new ArrayList[N];
      ArrayDeque<Integer>[] three = new ArrayDeque[N];
      for (int i=0; i<N; i++) {
        one[i] = new ArrayList<Integer>();
        three[i] = new ArrayDeque<>();
      }

      for (int i=0; i<N-1; i++) {
        int a = sc.nextInt() - 1;
        int b = sc.nextInt() - 1;
        one[a].add(b);
        one[b].add(a);
      }

      UnionFindTree uf = new UnionFindTree(N);

      for (int i=0; i<N; i++) {
        for (int j : one[i]) {
          for (int k : one[j]) {
            if (k == i) continue;
            for (int l : one[k]) {
              if (l == j) continue;

              three[i].add(l);
              uf.union(i, l);

            }
          }
        }
      }

      long[] ans = new long[N];

      ans[0] = 1;
      long count1 = 1;
      long count2 = 0;

      ArrayDeque<Integer> node1 = new ArrayDeque<Integer>();
      ArrayDeque<Integer> node2 = new ArrayDeque<Integer>();
      node1.addLast(0);

      ArrayList<Integer> used = new ArrayList<Integer>();
      used.add(uf.find(0));

      while (count1 < (N+2)/3 || count2 < (N+1)/3) {

        if (count2 < count1) {

          while (true) {

            if (node1.isEmpty()) {
              for (int i = 0; i < N; i++) {
                if (ans[i] == 0 && !used.contains(uf.find(i))) {
                  used.add(uf.find(i));
                  ans[i] = 2;
                  node2.addLast(i);
                  break;
                }
              }
              break;
            }

            int node = node1.getFirst();
            if (three[node].isEmpty()) {
              node1.removeFirst();
              continue;
            }

            int next = three[node].removeFirst();
            if (ans[next] != 0) continue;
            ans[next] = 2;
            node2.addLast(next);

            break;

          }

          count2++;

        } else {

          while (true) {

            if (node2.isEmpty()) {
              for (int i = 0; i < N; i++) {
                if (ans[i] == 0 && !used.contains(uf.find(i))) {
                  used.add(uf.find(i));
                  ans[i] = 1;
                  node1.addLast(i);
                  break;
                }
              }
              break;
            }

            int node = node2.getFirst();
            if (three[node].isEmpty()) {
              node2.removeFirst();
              continue;
            }

            int next = three[node].removeFirst();
            if (ans[next] != 0) continue;
            ans[next] = 1;
            node1.addLast(next);

            break;

          }

          count1++;

        }
      }

      //out.print(ans, " ");
      out.print(1);
      int[] next_number = {3, 4, 2};
      for (int i=1; i<N; i++) {
        out.print(" " + next_number[(int)ans[i]]);
        next_number[(int)ans[i]] += 3;
      }
      out.println();

    }

    class UnionFindTree {

      int[] parent; //インデックスにとノードを対応させ、そのルートノードのインデックスを格納
      int[] rank; //parentと同様に、木の高さを格納
      long[] size; //ルートの集合に含まれるノード数(ルート以外での値は不定)

      public UnionFindTree(int size) {
        this.parent = new int[size];
        this.rank = new int[size];
        this.size = new long[size];

        for (int i = 0; i < size; i++) {
          makeSet(i);
        }
      }

      public void makeSet(int i) {
        parent[i] = i;
        rank[i] = 0; //集合の高さ
        size[i] = 1;
      }

      public void union(int x, int y) {
        int xRoot = find(x);
        int yRoot = find(y);

        //xが属する木の方が大きい場合
        if (rank[xRoot] > rank[yRoot]) {
          parent[yRoot] = xRoot; //yの親をxに更新
          size[xRoot] += size[yRoot];
        } else if(rank[xRoot] < rank[yRoot]) {
          parent[xRoot] = yRoot;
          size[yRoot] += size[xRoot];
        } else if (xRoot != yRoot){
          parent[yRoot] = xRoot;
          size[xRoot] += size[yRoot];
          rank[xRoot]++; //同じ高さの木がルートの子として着くから大きさ++;
        }

      }

      //引数の属する木のルートのidを返す
      public int find(int i) {
        if (i != parent[i]) {
          parent[i] = find(parent[i]);
        }
        return parent[i];
      }

      public long size(int i) {
        return size[find(i)];
      }

      //同じ木に属しているか
      public boolean same(int x, int y) {
        return find(x) == find(y);
      }
    }
  }

  public static void main(String[] args) {
    new Solver();
    out.flush();
  }

  static class FastScanner {
    private InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;


    public void load() {
      try {
        in = new FileInputStream(next());
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    private boolean hasNextByte() {
      if (ptr < buflen) {
        return true;
      } else {
        ptr = 0;
        try {
          buflen = in.read(buffer);
        } catch (IOException e) {
          e.printStackTrace();
        }
        if (buflen <= 0) {
          return false;
        }
      }
      return true;
    }

    private int readByte() {
      if (hasNextByte()) return buffer[ptr++];
      else return -1;
    }

    private static boolean isPrintableChar(int c) {
      return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
      while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
    }

    public boolean hasNext() {
      skipUnprintable();
      return hasNextByte();
    }

    public String next() {
      if (!hasNext()) throw new NoSuchElementException();
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while (isPrintableChar(b)) {
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb.toString();
    }

    public long nextLong() {
      if (!hasNext()) throw new NoSuchElementException();
      long n = 0;
      boolean minus = false;
      int b = readByte();
      if (b == '-') {
        minus = true;
        b = readByte();
      }
      if (b < '0' || '9' < b) {
        throw new NumberFormatException();
      }
      while (true) {
        if ('0' <= b && b <= '9') {
          n *= 10;
          n += b - '0';
        } else if (b == -1 || !isPrintableChar(b)) {
          return minus ? -n : n;
        } else {
          throw new NumberFormatException();
        }
        b = readByte();
      }
    }

    public int nextInt() {
      return (int) nextLong();
    }

    public int[] nextIntArray(int N, boolean oneBased) {
      if (oneBased) {
        int[] array = new int[N + 1];
        for (int i = 1; i <= N; i++) {
          array[i] = sc.nextInt();
        }
        return array;
      } else {
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
          array[i] = sc.nextInt();
        }
        return array;
      }
    }

    public long[] nextLongArray(int N, boolean oneBased) {
      if (oneBased) {
        long[] array = new long[N + 1];
        for (int i = 1; i <= N; i++) {
          array[i] = sc.nextLong();
        }
        return array;
      } else {
        long[] array = new long[N];
        for (int i = 0; i < N; i++) {
          array[i] = sc.nextLong();
        }
        return array;
      }
    }
  }

  static class Output extends PrintWriter {

    private long startTime;

    public Output(PrintStream ps) {
      super(ps);
    }

    public void print(int[] a, String separator) {
      for (int i = 0; i < a.length; i++) {
        if (i == 0) print(a[i]);
        else print(separator + a[i]);
      }
      println();
    }

    public void print(long[] a, String separator) {
      for (int i = 0; i < a.length; i++) {
        if (i == 0) print(a[i]);
        else print(separator + a[i]);
      }
      println();
    }

    public void print(String[] a, String separator) {
      for (int i = 0; i < a.length; i++) {
        if (i == 0) print(a[i]);
        else print(separator + a[i]);
      }
      println();
    }

    public void print(ArrayList a, String separator) {
      for (int i = 0; i < a.size(); i++) {
        if (i == 0) print(a.get(i));
        else print(separator + a.get(i));
      }
      println();
    }

    public void start() {
      startTime = System.currentTimeMillis();
    }

    public void time(String s) {
      long time = System.currentTimeMillis() - startTime;
      println(s + "(" + time + ")");
    }

  }

}
