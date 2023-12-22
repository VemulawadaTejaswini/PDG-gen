import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int x = Integer.parseInt(sc.next());
    int y = Integer.parseInt(sc.next());
    Map<Integer, Node> nodes = new HashMap<>();
    Node previousNode = null;
    for (int i = 1; i <= n; i++) {
      Node node = new Node(i);
      if (Objects.nonNull(previousNode)) {
        node.neighbors.add(previousNode);
        previousNode.neighbors.add(node);
      }
      nodes.put(i, node);
      previousNode = node;
    }
    Node xNode = nodes.get(x);
    Node yNode = nodes.get(y);
    xNode.neighbors.add(yNode);
    yNode.neighbors.add(xNode);
    for (Node node : nodes.values()) {
      node.calculate();
    }
    Map<Integer, Long> answer = nodes.values().stream()
      .flatMap(v -> v.distanceToNumOfId.entrySet().stream())
      .collect(Collectors.groupingBy(
        e -> e.getKey(),
        Collectors.summingLong(e -> e.getValue())
      ));
    for (int i = 1; i < n; i++) {
      pw.println(answer.getOrDefault(i, 0L) / 2);
    }
  }

  static class Node {

    private int id;
    private Set<Node> neighbors = new HashSet<>();

    private Map<Node, Integer> idToDistance = new HashMap<>();
    private Map<Integer, Long> distanceToNumOfId;

    public Node(int id) {
      this.id = id;
    }

    void calculate() {
      idToDistance.put(this, 0);
      for (Node neighbor : neighbors) {
        idToDistance.put(neighbor, 1);
      }
      Set<Node> deepDive = new HashSet<>();
      deepDive.addAll(neighbors);
      int distance = 1;
      while (!deepDive.isEmpty()) {
        Set<Node> next = new HashSet<>();
        for (Node d : deepDive) {
          next.addAll(calculateRecursively(d, distance));
        }
        deepDive = next;
        distance++;
      }
      distanceToNumOfId = idToDistance.values().stream()
        .collect(Collectors.groupingBy(
          Function.identity(),
          Collectors.counting()
        ));
    }

    Set<Node> calculateRecursively(Node other, int currentDistance) {
      Set<Node> deepDive = new HashSet<>();
      for (Node neighbor : other.neighbors) {
        if (idToDistance.containsKey(neighbor)) {
          continue;
        }
        idToDistance.put(neighbor, currentDistance + 1);
        deepDive.add(neighbor);
      }
      return deepDive;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Node node = (Node) o;
      return id == node.id;
    }

    @Override
    public int hashCode() {
      return Objects.hash(id);
    }

    @Override
    public String toString() {
      return "Node{" +
        "id=" + id +
        '}';
    }
  }
}
