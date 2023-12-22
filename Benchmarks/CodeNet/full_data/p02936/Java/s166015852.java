import java.util.*;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    int N, Q;
    Node[] nodes;
    int[] p, x;
    try(Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
      Q = sc.nextInt();
      nodes = new Node[N];
      for(int i = 0; i < N-1; i++) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        Node nodeA = nodes[a-1];
        if ( nodeA == null ) {
          nodeA = new Node(a);
          nodes[a-1] = nodeA;
        }
        Node nodeB = nodes[b-1];
        if ( nodeB == null ) {
          nodeB = new Node(b);
          nodes[b-1] = nodeB;
        }
        nodeA.addCounterPart(nodeB);
        nodeB.addCounterPart(nodeA);
      }
      p = new int[Q];
      x = new int[Q];
      for(int j = 0; j < Q; j++) {
        p[j] = sc.nextInt();
        x[j] = sc.nextInt();
      }
    }
    solve(nodes, p, x);
    System.out.print(nodes[0].getScore());
    for(int i = 1; i < N; i++) {
      System.out.print(" ");
      System.out.print(nodes[i].getScore());
    }
    System.out.println();
  }
  
  private static void solve(Node[] nodes, int[] p, int[] x) {
    int q = p.length;
    for(int j = 0; j < q; j++) {
      Node tmpRoot = nodes[p[j]-1];
      tmpRoot.addScore(x[j]);
    }
    nodes[0].propagateAll(null);
  }
  
  private static class Node {
    private final int id;
    
    private final Collection<Node> counterPartCollection;
    
    private volatile int score;
    
    public Node(int id) {
      this.id = id;
      score = 0;
      counterPartCollection = new ArrayList<>();
    }
    
    public int hashCode() {
      return id;
    }
    
    public void addCounterPart(Node counterPart) {
      counterPartCollection.add(counterPart);
    }
    
    public void addScore(int value) {
      score += value;
    }
    
    public void propagateAll(Node except) {
      final Node parent = this;
      counterPartCollection.stream()
        	.filter(counterPart -> counterPart.equals(except) == false)
        	.forEach(counterPart -> {
              				counterPart.addScore(score);
              				counterPart.propagateAll(parent);
            			});
    }

    public int getScore() {
      return score;
    }
  }

}
