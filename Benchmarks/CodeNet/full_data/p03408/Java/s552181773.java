import java.util.*;

public class Main {
  public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    Map<String, Integer> map = new HashMap<String, Integer>();

    for(int i = 0; i < N; i++){
      String tmp = sc.next();
      if(map.containsKey(tmp)){
        map.put(tmp, map.get(tmp) + 1);
      } else {
        map.put(tmp, 1);
      }
    }

    int M = sc.nextInt();
    for(int i = 0; i < M; i++) {
      String tmp = sc.next();
      if(map.containsKey(tmp)){
        map.put(tmp, map.get(tmp) - 1);
      } else {
        map.put(tmp, 0);
      }
    }

    List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());

    Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

      public int compare(Map.Entry<String, Integer> l1, Map.Entry<String, Integer> l2){
        return l2.getValue().compareTo(l1.getValue());
      }
    });

      System.out.println(Math.max(list.get(0).getValue(),0));
    }
  }
