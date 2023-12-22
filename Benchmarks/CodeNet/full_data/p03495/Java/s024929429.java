import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int K = sc.nextInt();
    
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      int v = 1;
      if (map.containsKey(a)) {
        v = map.get(a);
        v++;
      }
      map.put(a,v);
    }

    sc.close();

    // 降順に並び替え
    List<Map.Entry<Integer, Integer>> list_entries = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        
    Collections.sort(list_entries, new Comparator<Map.Entry<Integer, Integer>>() {
      public int compare(Map.Entry<Integer, Integer> obj1, Map.Entry<Integer, Integer> obj2) {
        return obj2.getValue().compareTo(obj1.getValue());
      }
    });

    int count = 0;
    int result = 0;

    for (Map.Entry<Integer, Integer> map_ : list_entries) {
      if (count == K){
        result += map_.getValue();
      } else {
        count++;
      }
    }

    System.out.println(result);

  }

}