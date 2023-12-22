import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    HashMap<Integer, Integer> oddMap = new HashMap<>();
    HashMap<Integer, Integer> evenMap = new HashMap<>();

    for (int i = 0; i < N; i++) {
      int v = scn.nextInt();
      if (i % 2 == 0) {
        if (!evenMap.containsKey(v)) {
          evenMap.put(v, 1);
        } else {
          evenMap.put(v, evenMap.get(v) + 1);
        }
      } else {
        if (!oddMap.containsKey(v)) {
          oddMap.put(v, 1);
        } else {
          oddMap.put(v, oddMap.get(v) + 1);
        }
      }
    }

    ArrayList<Map.Entry<Integer, Integer>> evenMapList = new ArrayList<>(evenMap.entrySet());
    Collections.sort(evenMapList, new Comparator<Map.Entry<Integer, Integer>>() {
      public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
        return (e1.getValue() < e2.getValue()) ? 1 : -1;
      }
    });

    ArrayList<Map.Entry<Integer, Integer>> oddMapList = new ArrayList<>(oddMap.entrySet());
    Collections.sort(oddMapList, new Comparator<Map.Entry<Integer, Integer>>() {
      public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
        return (e1.getValue() < e2.getValue()) ? 1 : -1;
      }
    });

    int mostFrequent = evenMapList.get(0).getKey();
    evenMapList.get(0).setValue(0);
    long ans = 0L;
    for (Map.Entry<Integer, Integer> entry : evenMapList) {
      ans += entry.getValue();
    }

    for (Map.Entry<Integer, Integer> entry : oddMapList) {
      if (entry.getKey() != mostFrequent) {
        entry.setValue(0);
        break;
      }
    }

    for (Map.Entry<Integer, Integer> entry : oddMapList) {
      ans += entry.getValue();
    }

    System.out.println(ans);
  }

}
