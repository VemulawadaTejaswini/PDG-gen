import java.util.*;

class UnionFindNode {
  public int index;
  public UnionFindNode parent;

  UnionFindNode(int index) {
    this.index = index;
    this.parent = null;
  }

  public UnionFindNode getRoot() {
    if (this.parent == null) {
      return this;
    }
    UnionFindNode root = this.parent.getRoot();
    this.parent = root;
    return root;
  }

  public static void merge(UnionFindNode n1, UnionFindNode n2) {
    UnionFindNode root1 = n1.getRoot();
    UnionFindNode root2 = n2.getRoot();
    root1.parent = root2;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int n = s.nextInt();
    int m = s.nextInt();
    int[] p = new int[n+1];
    UnionFindNode[] ufns = new UnionFindNode[n+1];
    for (int i = 1; i <= n; i++) {
      p[i] = s.nextInt();
      ufns[i] = new UnionFindNode(i);
    }

    for (int i = 0; i < m; i++) {
      int x = s.nextInt();
      int y = s.nextInt();
      UnionFindNode.merge(ufns[x], ufns[y]);
    }

    int count = 0;
    for (int i = 1; i <= n; i++) {
      if (ufns[i].getRoot() == ufns[p[i]].getRoot()) {
        count++;
      }
    }
    System.out.println(count);
  }
}
