import java.util.*;
import java.io.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());
    int[] P = new int[M];
    int[] Y = new int[M];

    HashMap<Integer, Set<Integer>> map = new HashMap<>();

    for (int i = 0; i < M; i++) {
      P[i] = Integer.parseInt(sc.next());
      Y[i] = Integer.parseInt(sc.next());
      if(map.containsKey(P[i])) {
        Set<Integer> treeSet = map.get(P[i]);
        treeSet.add(Y[i]);
        map.put(P[i], treeSet);
      } else {
        Set<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(Y[i]);
        map.put(P[i], treeSet);
      }
    }

    sc.close();

    PrintWriter out = new PrintWriter(System.out);

    for (int i = 0; i < M; i++) {
      Set<Integer> treeSet = map.get(P[i]);
      int j = 1;
      for (Integer value : treeSet) {
        if (value == Y[i]) {
          break;
        } else {
          j++;
        }
      }
      out.println(String.format("%06d", P[i]) + String.format("%06d", j));
    }

    out.flush();

  }

}