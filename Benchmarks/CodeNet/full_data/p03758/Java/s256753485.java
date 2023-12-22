import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Main {
  static final boolean LOCAL = true;
  static final boolean DEBUG = true;
  static Scanner sc = new Scanner(System.in);
  static PrintWriter writer = new PrintWriter(System.out);
  static int N;
  static char[] query;
  static boolean[][] graph;
  static UnionFind uf;
  static int edges;
  static int qc;
  static long seed;

  public static void main(String[] args) {
    if (args.length >= 1) {
      seed = Long.parseLong(args[0]);
    }
    N = sc.nextInt();
    if (LOCAL) generate();
    query = new char[N];
    Arrays.fill(query, '0');
    graph = new boolean[N][N];
    uf = new UnionFind(N);
    for (int i = 0; i < N; i++) {
      solve(i);
    }
    if (LOCAL) {
      System.out.println("validate:" + validate());
      System.out.println("query count:" + qc);
    } else {
      writer.print("!");
      for (int i = 0; i < N; i++) {
        for (int j = i + 1; j < N; j++) {
          if (graph[i][j]) writer.print(" (" + i + "," + j + ")");
        }
      }
      writer.println();
      writer.flush();
    }
  }

  static void solve(int axis) {
    final int BUCKET = 8;
    ArrayList<Integer> pos = new ArrayList<>();
    for (int i = axis + 1; i < N; i++) {
      if (uf.find(axis, i)) continue;
      pos.add(i);
      if (pos.size() == BUCKET) {
        solveSub(axis, pos);
        pos.clear();
      }
    }
    if (!pos.isEmpty()) {
      solveSub(axis, pos);
    }
  }

  static int solveSub(int axis, ArrayList<Integer> pos) {
    if (edges == N - 1) return 0;
    pos.add(axis);
    int v = query(pos);
    pos.remove(pos.size() - 1);
    if (v == 0) return v;
    if (pos.size() == 1 && v == 1) {
      addEdge(axis, pos.get(0));
    }
    if (pos.size() == 1) return v;
    ArrayList<Integer> subPos = new ArrayList<>();
    for (int i = 0; i < pos.size() / 2; i++) {
      subPos.add(pos.get(i));
    }
    int sv = solveSub(axis, subPos);
    if (sv == v) return v;
    subPos.clear();
    for (int i = pos.size() / 2; i < pos.size(); i++) {
      subPos.add(pos.get(i));
    }
    int sv2 = solveSub(axis, subPos);
    if (pos.size() == 2 && v == 1 && sv == 0 && sv2 == 0 && !graph[pos.get(0)][pos.get(1)]) {
      addEdge(pos.get(0), pos.get(1));
    }
    return v;
  }

  static void addEdge(int a, int b) {
    graph[a][b] = graph[b][a] = true;
    uf.union(a, b);
    ++edges;
  }

  static int query(ArrayList<Integer> pos) {
    ++qc;
    int ret;
    for (int p : pos) {
      query[p] = '1';
    }
    if (LOCAL) {
      ret = processQuery();
    } else {
      writer.write("? " + String.valueOf(query) + "\n");
      writer.flush();
      ret = sc.nextInt();
    }
    for (int p : pos) {
      query[p] = '0';
    }
    return ret;
  }

  static class UnionFind {
    int[] set;

    UnionFind(int n) {
      set = new int[n];
      Arrays.fill(set, -1);
    }

    void union(int a, int b) {
      int rtA = root(a);
      int rtb = root(b);
      if (rtA == rtb) {
        return;
      }
      set[rtA] += set[rtb];
      set[rtb] = rtA;
    }

    boolean find(int a, int b) {
      return root(a) == root(b);
    }

    int root(int a) {
      if (set[a] < 0) {
        return a;
      } else {
        set[a] = root(set[a]);
        return set[a];
      }
    }

    int size(int a) {
      return -set[root(a)];
    }
  }

  static boolean[][] ans;

  static void generate() {
    ans = new boolean[N][N];
    SplittableRandom rnd = new SplittableRandom(seed);
    UnionFind uf = new UnionFind(N);
    int count = 0;
    while (true) {
      int a = rnd.nextInt(N);
      int b = rnd.nextInt(N);
      if (uf.find(a, b)) continue;
      ans[a][b] = ans[b][a] = true;
      uf.union(a, b);
      ++count;
      if (count == N - 1) break;
    }
  }

  static int processQuery() {
    boolean[] visited = new boolean[N];
    int ret = 0;
    for (int i = 0; i < N; i++) {
      if (query[i] == '0' || visited[i]) continue;
      int d = diameter(visited, i);
      ret += d * d;
    }
    if (DEBUG) {
      System.err.println("? " + String.valueOf(query) + " " + ret);
    }
    return ret;
  }

  static int diameter(boolean[] visited, int pos) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(pos);
    for (int i = 0; i < list.size(); i++) {
      int cur = list.get(i);
      OUT:
      for (int j = 0; j < N; j++) {
        if (query[j] == '0' || !ans[cur][j]) continue;
        for (int k = 0; k < i; k++) {
          if (list.get(k) == j) continue OUT;
        }
        list.add(j);
      }
    }
    int farest = list.get(list.size() - 1);
    list.clear();
    list.add(farest);
    visited[farest] = true;
    for (int d = 0; ; d++) {
      ArrayList<Integer> next = new ArrayList<>();
      for (int cur : list) {
        for (int i = 0; i < N; i++) {
          if (query[i] == '0' || !ans[cur][i] || visited[i]) continue;
          next.add(i);
          visited[i] = true;
        }
      }
      if (next.isEmpty()) return d;
      list = next;
    }
  }

  static boolean validate() {
    if (DEBUG) {
      System.err.println("expect");
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          System.err.print(ans[i][j] ? "1" : "0");
        }
        System.err.println();
      }
      System.err.println("actual");
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          System.err.print(graph[i][j] ? "1" : "0");
        }
        System.err.println();
      }
    }
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (graph[i][j] != ans[i][j]) return false;
      }
    }
    return true;
  }
}


