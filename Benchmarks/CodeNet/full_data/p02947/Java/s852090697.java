
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<String, Long> map = new HashMap<String, Long>();

    for (int i = 0; i < n; i++) {
      String in = sc.next();
      char[] chars = in.toCharArray();
      Arrays.sort(chars);
      String s = new String(chars);

      Long p = map.get(s);
      if (p == null) {
        map.put(s, 1L);
      } else {
        map.put(s, p + 1);
      }
    }

    long cnt = 0;
    for (Map.Entry<String, Long> entry : map.entrySet()) {
      long i = entry.getValue();
      if (i > 1) {
        // valueC2
        cnt += (i * (i - 1)) / 2;
      }
    }
    System.out.println(cnt);
  }
}
