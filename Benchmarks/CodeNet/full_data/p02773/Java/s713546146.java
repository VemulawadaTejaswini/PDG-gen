import java.io.*;
import java.util.*;

class Main {
  static class Pair {
    String s;
    int n;

    public Pair(String s, int n) {
      this.s = s; this.n = n;
    }

    public String toString() {
      return s + " " + n;
    }
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int N = in.nextInt();
    in.nextLine();
    Map<String, Integer> map = new HashMap();

    for (int i = 0; i < N; i++) {
      String s = in.nextLine();
      map.merge(s, 1, Integer::sum);
    }

    List<Pair> pairs = new ArrayList();
    for (String s : map.keySet()) {
      pairs.add(new Pair(s, map.get(s)));
    }
    Collections.sort(pairs, (p1, p2) -> {
      if (p1.n - p2.n != 0) return p2.n - p1.n;
      else return p1.s.compareTo(p2.s);
    });
    int n = pairs.get(0).n;
    for (int i = 0; i < pairs.size(); i++) {
      if (pairs.get(i).n == n) System.out.println(pairs.get(i).s);
    }
  }
}