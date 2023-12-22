import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());

    node graph[] = new node[N + 1];
    for (int i = 0; i < N + 1; i++) {
      graph[i] = new node();
    }

    for (int i = 0; i < N - 1 + M; i++) {
      int ai = Integer.parseInt(sc.next());
      int bi = Integer.parseInt(sc.next());

      graph[bi].addParent(ai);
    }

    for (int i = 1; i < N + 1; i++) {
      graph[i].getLank(graph);
    }

    for (int i = 1; i < N + 1; i++) {
      graph[i].setParent(graph);
    }

    for (int i = 1; i < N + 1; i++) {
      System.out.println(graph[i].parent);
    }

  }
}

class node {
  ArrayList<Integer> pList;
  int parent;
  int lank;

  public node() {
    pList = new ArrayList<>();
    parent = -1;
    lank = -1;
  }

  public void addParent(int p) {
    pList.add(p);
  }

  public int getLank(node[] graph) {
    if (lank >= 0) {
      return lank;
    } else if (pList.isEmpty()) {
      parent = 0;
      lank = 0;
      return lank;
    } else if (pList.size() == 1) {
      parent = pList.get(0);
      lank = graph[parent].getLank(graph) + 1;
      return lank;
    } else {
      for (int i = 0; i < pList.size(); i++) {
        lank = Math.max(graph[pList.get(i)].getLank(graph) + 1, lank);
      }
      return lank;
    }
  }

  public void setParent(node[] graph) {
    if (parent >= 0) {
      return;
    } else {
      for (int i = 0; i < pList.size(); i++) {
        if (graph[pList.get(i)].parent < 0) {
          graph[pList.get(i)].setParent(graph);
        }
        if (graph[pList.get(i)].getLank(graph) == lank - 1) {
          parent = pList.get(i);
          return;
        }
      }
    }
  }

}