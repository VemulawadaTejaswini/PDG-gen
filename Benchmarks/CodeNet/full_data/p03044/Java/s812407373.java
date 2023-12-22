import java.util.Scanner;
import java.util.ArrayList;

class Node {
  int id;
  ArrayList<Edge> edges = new ArrayList<Edge>();
  Node(int id) {
    this.id = id;
  }

  int size() {
    return edges.size();
  }
}

class Edge {
  int to;
  int weight;
  Edge(int to, int weight) {
    this.to = to;
    this.weight = weight;
  }
}

class Main {

  static boolean full(Node[] nodes) {
    for(int i = 0; i < nodes.length; i++) {
      if(nodes[i] == null) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int[] answer = new int[n];

    for(int i=0; i<n; i++) {
      answer[i] = 0;
    }

    answer[0] = 1;

    Node[] nodes = new Node[n];
    for(int i=0; i<n; i++) {
      nodes[i] = null;
    }

    // making tree
    while(!full(nodes)) {
      int u = stdIn.nextInt();
      int v = stdIn.nextInt();
      int w = stdIn.nextInt();

      if(nodes[u-1] == null) {
        Node node = new Node(u);
        nodes[u-1] = node;
      }

      if(nodes[v-1] == null) {
        Node node = new Node(u);
        nodes[v-1] = node;
      }

      Edge edge = new Edge(v,w);
      nodes[u-1].edges.add(edge);

      edge = new Edge(u,w);
      nodes[v-1].edges.add(edge);
    }

    //
    for(int i = 0; i < n; i++) {
      int u = nodes[i].id;
      for(int j = 0; j < nodes[i].size(); j++) {
        int v = nodes[i].edges.get(j).to;
        int w = nodes[i].edges.get(j).weight;
        if(w%2 == 0) {
          if(answer[u-1] == 1) {
            answer[v-1] = 1;
          }
        }
      }
    }

    for(int i=0; i<n; i++) {
      System.out.println(answer[i]);
    }
  }
}