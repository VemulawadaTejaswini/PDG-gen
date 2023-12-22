import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<Integer, Integer> even = new HashMap<>();
    Map<Integer, Integer> odd = new HashMap<>();
    for (int i = 0; i < n; i++) {
      int v = sc.nextInt();
      if (i % 2 == 0) {
        even.put(v, even.getOrDefault(v, 0) + 1);
      } else {
        odd.put(v, odd.getOrDefault(v, 0) + 1);
      }
    }
    
    int changeEven = minOperation(even, odd);
    int changeOdd = minOperation(odd, even);
    
    System.out.println(Math.min(changeEven, changeOdd));
  }
  
  private static int minOperation(Map<Integer, Integer> a, Map<Integer, Integer> b) {

    // most occurrence in A
    int max = 0;
    int aSize = 0;
    List<Integer> mostOccurrenceA = new ArrayList<>();
    for (Map.Entry<Integer, Integer> ent : a.entrySet()) {
      int v = ent.getKey();
      int c = ent.getValue();
      aSize += c;
      if (max <= c) {
        mostOccurrenceA.add(v);
        max = c;
      }
    }
    int changeCountInA = aSize - max;
    
    // most occurrence in B execpt A
    max = 0;
    int bSize = 0;
    for (int mostA : mostOccurrenceA) {
      for (Map.Entry<Integer, Integer> ent : b.entrySet()) {
        int v = ent.getKey();
        int c = ent.getValue();
        bSize += c;
        if (v == mostA) {
          continue;
        }
        if (max < c) {
          max = c;
        }
      }
    }
    int changeCountInB = bSize - max;
    
    return changeCountInA + changeCountInB;
  }
}