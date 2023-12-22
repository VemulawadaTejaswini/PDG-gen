import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  private static class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

    public FastScanner(InputStream in) {
      reader = new BufferedReader(new InputStreamReader(in));
      tokenizer = null;
    }

    public String next() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public String nextLine() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          return reader.readLine();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }

      return tokenizer.nextToken("\n");
    }

    public long nextLong() {
      return Long.parseLong(next());
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
      int[] a = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = nextInt();
      return a;
    }

    public long[] nextLongArray(int n) {
      long[] a = new long[n];
      for (int i = 0; i < n; i++)
        a[i] = nextLong();
      return a;
    }
  }

  private static void dfs(ArrayList<HashSet<Integer>> p, Integer id, int[] groupIds, int groupId, HashSet<Integer> group) {
    if (groupIds[id] >= 0) return;
    group.add(id);
    groupIds[id] = groupId;
    for (int f : p.get(id)) {
      dfs(p, f, groupIds, groupId, group);
    }
  }

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();
    ArrayList<Integer[]> friends = new ArrayList<>();
    ArrayList<HashSet<Integer>> p = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      p.add(new HashSet<Integer>());
    }
    for (int i = 0; i < m; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      if (a == b) continue;
      p.get(a).add(b);
      p.get(b).add(a);
      Integer[] f = new Integer[2];
      f[0] = Math.min(a, b);
      f[1] = Math.max(a, b);
      friends.add(f);
    }
    ArrayList<HashSet<Integer>> blocks = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      blocks.add(new HashSet<Integer>());
    }
    for (int i = 0; i < k; i++) {
      int c = sc.nextInt() - 1;
      int d = sc.nextInt() - 1;
      if (c == d) continue;
      blocks.get(c).add(d);
      blocks.get(d).add(c);
    }
    int[] groupIds = new int[n];
    for (int i = 0; i < n; i++) {
      groupIds[i] = -1;
    }
    int groupId = 0;
    ArrayList<HashSet<Integer>> groups = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      if (groupIds[i] >= 0) continue;
      HashSet<Integer> group = new HashSet<>();
      dfs(p, i, groupIds, groupId, group);
      groups.add(group);
      groupId++;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      long sum = 0L;
      sum += groups.get(groupIds[i]).size() - 1;
      sum -= p.get(i).size();
      for (int b : blocks.get(i)) {
        if (groups.get(groupIds[i]).contains(b)) sum -= 1L;
      }
      if (i > 0) sb.append(" ");
      sb.append(sum);
    }
    System.out.println(sb.toString());
  }
}