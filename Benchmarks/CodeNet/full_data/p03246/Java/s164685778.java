import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    Map<Integer, Integer> oMap = new HashMap<>();
    Map<Integer, Integer> eMap = new HashMap<>();

    for (int i = 0; i < N; i++) {
      int v = Integer.parseInt(sc.next());
      if (i % 2 == 0) {
        oMap.merge(v, 1, Integer::sum);
      } else {
        eMap.merge(v, 1, Integer::sum);
      }
    }

    List<Entry<Integer, Integer>> list_entries_o = new ArrayList<Entry<Integer, Integer>>(oMap.entrySet());
    Collections.sort(list_entries_o, new Comparator<Entry<Integer, Integer>>() {
      //compareを使用して値を比較する
      public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
        //降順
        return obj2.getValue().compareTo(obj1.getValue());
      }
    });

    List<Entry<Integer, Integer>> list_entries_e = new ArrayList<Entry<Integer, Integer>>(eMap.entrySet());
    Collections.sort(list_entries_e, new Comparator<Entry<Integer, Integer>>() {
      //compareを使用して値を比較する
      public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
        //降順
        return obj2.getValue().compareTo(obj1.getValue());
      }
    });

    int ans = 0;
    if (!list_entries_o.get(0).getKey().equals(list_entries_e.get(0).getKey())) {
      ans = N - list_entries_o.get(0).getValue() - list_entries_e.get(0).getValue();
    } else {
      int e = 0, o = 0;
      if (eMap.size() > 1) {
        e = list_entries_e.get(1).getValue();
      }
      if (oMap.size() > 1) {
        o = list_entries_o.get(1).getValue();
      }
      ans = Math.min(N - list_entries_o.get(0).getValue() - e, N - o - list_entries_e.get(0).getValue());
    }
    System.out.println(ans);
  }
}