import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
  private long[] count;
  private List<Set<Integer>> children;
  public Main(int N) {
    this.count = new long[N];
    Arrays.setAll(count, i -> 0);
    this.children = new ArrayList<Set<Integer>>(N);
    for (int i = 0; i < N; i++)
      children.add(new HashSet<Integer>());
  }
  public void addChild(int node, int child) {
    this.children.get(node).add(child);
  }
  public void addCount(int node, int value) {
    count[node] += value;
    for (Integer child : children.get(node))
      this.addCount(child - 1, value);
  }
  public long[] getCount() {
    return this.count;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Q = sc.nextInt();
    Main m = new Main(N);
    for (int i = 0; i < N - 1; i++)
      m.addChild(sc.nextInt() - 1, sc.nextInt());
    for (int i = 0; i < Q; i++)
      m.addCount(sc.nextInt() - 1, sc.nextInt());
    System.out.println(Arrays.stream(m.getCount()).boxed().map(v -> String.valueOf(v)).collect(Collectors.joining(" ")));
  }
}