import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();

    List<String> strList = new ArrayList<String>();

    for (int i = 0; i < n; i++) {
      String str = sc.next();
      boolean inserted = false;
      for (int j = 0; j < strList.size(); j++) {
        if (str.compareTo(strList.get(j)) < 0) {
          strList.add(j, str);
          inserted = true;
          break;
        }
      }
      if (!inserted) {
        strList.add(str);
      }
    }

    for (String s : strList) {
      System.out.print(s);
    }
  }
}
