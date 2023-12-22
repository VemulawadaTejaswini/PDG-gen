import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    TreeMap<String, Integer> h = new TreeMap<String, Integer>();
    for (int i = 0; i < N; i++) {
      String s = sc.next();
      h.put(s, h.getOrDefault(s, 0)+1);
    }

    PriorityQueue<Map.Entry<String, Integer>> q = new PriorityQueue(h.size(), new Comparator<Map.Entry<String, Integer>>() {
      public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
        if(e1.getValue() > e2.getValue()) {
            return -1;
        } else if(e2.getValue() > e1.getValue()) {
            return 1;
        } else {
            return 0;
        }
      }
    });
  
    for (Map.Entry<String, Integer> e : h.entrySet()) {
      q.add(e);
    }

    Map.Entry<String, Integer> e = q.poll();
    int maxCount = e.getValue();
    System.out.println(e.getKey());
    while (true) {
      e = q.poll();
      if (e.getValue() != maxCount) {
        break;
      }
      System.out.println(e.getKey());
    }
  }
}
