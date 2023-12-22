import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    D_Ki();
  }

  private static class Node {

    int id;
    long counter = 0;
    Node parent = null;

    Node(int id) {
      this.id = id;
    }
  }

  private static void D_Ki() {

    final Scanner sc = new Scanner(System.in);
    final int numberOfNodes = sc.nextInt();
    final int numberOfOperations = sc.nextInt();

    final Node[] nodes = new Node[numberOfNodes];
    for (int i = 0; i < nodes.length; i++) {
      nodes[i] = new Node(i + 1);
    }

    for (int i = 0; i < nodes.length - 1; i++) {
      int idOfNodeA = sc.nextInt();
      int idOfNodeB = sc.nextInt();

      nodes[idOfNodeB - 1].parent = nodes[idOfNodeA - 1];
    }

    for (int i = 0; i < numberOfOperations; i++) {
      int rootNodeIdOfTargetSubtree = sc.nextInt();
      int numberToBeAdded = sc.nextInt();

      nodes[rootNodeIdOfTargetSubtree - 1].counter += numberToBeAdded;
    }

    for (Node node : nodes) {

      if (node.id != 1) {
        node.counter += node.parent.counter;
        System.out.print(" ");
      }

      System.out.print(node.counter);
    }
  }
}
