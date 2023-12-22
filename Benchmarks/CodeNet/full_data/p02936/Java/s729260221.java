import java.util.*;
import java.lang.*;


class Main {

  static class Node {
    ArrayList<Integer> children = new ArrayList<Integer>();
    ArrayList<Integer> parents = new ArrayList<Integer>();
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int node_count = sc.nextInt();
    int q_count = sc.nextInt();

    ArrayList<Node> nodes = new ArrayList<Node>();
    ArrayList<Integer> results = new ArrayList<Integer>();
    for (int i = 0; i < node_count; i++) {
      nodes.add(new Node());
      results.add(0);
    }

    for (int i = 0; i < node_count - 1; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      nodes.get(a).children.add(b);
      nodes.get(a).parents.forEach(p -> nodes.get(p).children.add(b));
      nodes.get(b).parents.add(a);
    }

    for (int j = 0; j < q_count; j++) {
      int p = sc.nextInt() - 1;
      int x = sc.nextInt();
      int p_value = results.get(p);
      results.set(p, p_value + x);
      nodes.get(p).children.forEach(c -> {
        int c_value = results.get(c);
        results.set(c, c_value + x);
      });
    }

          StringBuilder val = new StringBuilder();

    results.forEach(r -> val.append(r + " "));
            System.out.println(new String(val));

  }
}