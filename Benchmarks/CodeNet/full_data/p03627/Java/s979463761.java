import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    TreeMap<String, Integer> items = new TreeMap<>();

    for (int i = 0; i < N; i++) {
      String barData = sc.next();
      if (items.containsKey(barData)) {
        int count = items.get(barData);
        items.put(barData, count++);
      } else {
        items.put(barData, 1);
      }
    }
    sc.close();
    int result = 0;
    int temp = 0;

    Map<String, Integer> desc = items.descendingMap();

    for (String key : desc.keySet()) {
      int count = desc.get(key);
      int value = Integer.parseInt(key);
      if (result > 0 || count <= 1) {
        return;
      } else if (count > 1 && count < 4) {
        if (temp == 0) {
          temp = value;
        } else {
          result = value * temp;
        }
      } else {
        result = value * value;
      }

    }

    // 出力
    System.out.println(result);
  }
}