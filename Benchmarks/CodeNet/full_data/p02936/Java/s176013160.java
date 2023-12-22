import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    D_Ki();
  }

  private static class Node {

    int id;
    List<Node> children = new ArrayList<>();

    Node(int id) {
      this.id = id;
    }
  }

  private final static Map<Integer, Integer> numberToBeAddedByRootNodeId = new HashMap<>();

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

      nodes[idOfNodeA - 1].children.add(nodes[idOfNodeB - 1]);
    }

    for (int i = 0; i < numberOfOperations; i++) {
      int rootNodeIdOfTargetSubtree = sc.nextInt();
      int numberToBeAdded = sc.nextInt();

      final Integer number = numberToBeAddedByRootNodeId
          .getOrDefault(rootNodeIdOfTargetSubtree, 0);

      numberToBeAddedByRootNodeId.put(rootNodeIdOfTargetSubtree, number + numberToBeAdded);
    }

    outputAnswer(nodes[0]);
  }

  private static long currentCount = 0;

  private static void outputAnswer(Node node) {

    currentCount += numberToBeAddedByRootNodeId.getOrDefault(node.id, 0);

    if (node.id != 1) {
      System.out.print(" ");
    }
    System.out.print(currentCount);

    for (Node child : node.children) {
      outputAnswer(child);
    }

    currentCount -= numberToBeAddedByRootNodeId.getOrDefault(node.id, 0);
  }
}
