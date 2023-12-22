import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    // 入力リスト
    // 頭文字別の人数
    // 2種類以下だったら、NG
    // 3種類以上のとき、nC3 ×複数人数×・・・

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    Map<String, List<String>> nmap = new HashMap<String, List<String>>();
    for (int i = 0; i < n; i++) {
      String name = sc.next();
      String ch = name.substring(0, 1);
      if (ch.equals("M") || ch.equals("A") || ch.equals("R") || ch.equals("C") || ch.equals("H")) {
        if (nmap.get(ch) != null) {
          List<String> l = (List) nmap.get(ch);
          boolean isMatch = false;
          for (String a : l) {
            if (a.equals(name)) {
              isMatch = true;
              break;
            }
          }
          if (!isMatch) {
            l.add(name);
            nmap.put(ch, l);
          }
        } else {
          List<String> l = new ArrayList<String>();
          l.add(name);
          nmap.put(ch, l);
        }
      }
    }
/*
    System.out.println("end");
    for (Map.Entry<String, List<String>> entry : nmap.entrySet()) {
      System.out.println(entry.getKey());
      System.out.println(entry.getValue());
    }
*/
    // nC3
    int size = nmap.size();

    if (size > 2) {
      int combi = size * (size - 1) * (size - 2) / 6;

      int oneCount = 0;
      for (Map.Entry<String, List<String>> entry : nmap.entrySet()) {
        if (entry.getValue().size() > 1) {
          combi = combi * entry.getValue().size();
        } else {
          oneCount++;
        }
      }
      if (oneCount > 2) {
        combi = combi - (oneCount * (oneCount - 1) * (oneCount - 2) / 6);
      }
      System.out.println(combi);
    } else {
      System.out.println(0);
    }
  }
}