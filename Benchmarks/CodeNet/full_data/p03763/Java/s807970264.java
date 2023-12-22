import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

//@Slf4j
public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // System.out.println(first);
    TreeMap<Integer, TreeMap<String, Integer>> stringMapMap = new TreeMap<>();
    for (int i = 0; i < n; i++) {
      TreeMap<String, Integer> stringMap = createStringTreeMap();
      stringMapMap.put(i, stringMap);
    }
//    log.info("finish reading");
    HashMap<String, List<Integer>> strListMap = new HashMap<>();
    for (TreeMap<String, Integer> stringMap : stringMapMap.values()) {
      for (String s : stringMap.keySet()) {
        if (strListMap.get(s) == null) {
          List<Integer> strList = new ArrayList<>();
          strList.add(stringMap.get(s));
          strListMap.put(s, strList);
        } else {
          strListMap.get(s).add(stringMap.get(s));
        }
      }
    } ;
    strListMap.entrySet().stream().filter((entry) -> entry.getValue().size() == n)
        .forEach(entry -> {
//          System.out.println(entry.getKey() + " : " + Collections.min(entry.getValue()));

          int repeatNum = Collections.min(entry.getValue());
           for(int i = 0; i < repeatNum ; i++) {
             System.out.print(entry.getKey());
           }
        });
    // stringMapMap.entrySet().stream().



  }

  private static TreeMap<String, Integer> createStringTreeMap() {
    TreeMap<String, Integer> stringMap = new TreeMap<>();
    Scanner sc = new Scanner(System.in);
    String Si = sc.next();
    for (char c : Si.toLowerCase().toCharArray()) {
      String s = String.valueOf(c);
      if (stringMap.containsKey(s)) {
        stringMap.put(s, stringMap.get(s) + 1);
      } else {
        stringMap.put(s, 1);

      }
    }
    return stringMap;
  }

}
